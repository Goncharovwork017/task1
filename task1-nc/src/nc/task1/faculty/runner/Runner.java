package nc.task1.faculty.runner;

import nc.task1.faculty.entity.Course;
import nc.task1.faculty.enums.TeacherType;
import nc.task1.faculty.logic.Actions;
import nc.task1.faculty.logic.Manager;
import nc.task1.faculty.runner.tools.FileWorker;
import nc.task1.faculty.runner.validations.Validations;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ivan on 20.03.2017.
 */
public class Runner {
    private static String filiNameOut = "D://output.txt";
    private static String fileName = "D://output.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        Course course = new Course();
        Manager manager = new Manager();
        int key = 0;
        int countHuman;
        int countTeacher;
        String teacher;


        while (true)

        {
            System.out.println("1 - Создать Курс и записать в файл \n"
                    + "2 - Сортировка по возрасту \n"
                    + "3 - Общий возраст людей \n"
                   // + "4 - Поиск по ... \n"

                    +" 4 - Вывод из файла");

            switch (Validations.inputNumber()) {
                case 1: {
                    System.out.println("Введите количество людей на курс");
                    countHuman = Validations.inputNumber();

                    manager.createCourse(course, countHuman);
                    System.out.println(course);
                    FileWorker.write(filiNameOut, String.valueOf(course));
                    break;
                }
                case 2: {
                    System.out.println("Сортировка: ");
                    Actions.humanSortByAge(course.getHumanList());
                    System.out.println(course.getHumanList());
                    break;
                }
                case 3:
                {
                    System.out.println("Общий возраст людей: " + manager.calculateTotalAgeHuman(course.getHumanList()));
                    break;
                }
              //  case 4: {
                   // System.out.println("Введите критерии препода");
                  //  for (TeacherType teacherType : TeacherType.values()) {
                   //     System.out.print(teacherType.name() + " \n");
                   //// }

                 //   teacher = Validations.inputString();
                  //  System.out.println("нашло группу по преподу: ");
                    // System.out.print(Actions.findGroupByTeacher(
                    //  System.out.print(Actions.findGroupByTeacher(teacher.toUpperCase(), course.getTeacherList()));
                    //   teacher.toUpperCase(), course.getTeacherList()) +"\n");

                   // break;

             //   }
                case 4:{
                    System.out.println("вывод на экран из файла");
                    String textFromFile = FileWorker.read(fileName);
                    System.out.println(textFromFile);
                }
            }
        }
    }


}
