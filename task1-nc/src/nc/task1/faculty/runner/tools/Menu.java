package nc.task1.faculty.runner.tools;

import nc.task1.faculty.entities.Course;
import nc.task1.faculty.exception.MyException;
import nc.task1.faculty.logic.Actions;
import nc.task1.faculty.logic.Manager;
import nc.task1.faculty.runner.validations.Validations;

/**
 * Created by ivan on 22.03.2017.
 */
public class Menu {
    private static String filiNameOut = "D://output.txt";
    private static String fileName = "D://output.txt";
    private static String fileNameDelete = "D://output.txt";


    public static Course course = new Course();
    public static Manager manager = new Manager();



    public Menu() throws MyException {
    }
    public static void menu() throws MyException {
        int countHuman;

        while (true)

        {
            System.out.println("1 - Создать Курс и записать в файл \n"
                    + "2 - Сортировка по возрасту \n"
                    + "3 - Общий возраст людей \n"
                    + "4 - Вывод из файла \n");


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
                case 3: {
                    System.out.println("Общий возраст людей: " + manager.calculateTotalAgeHuman(course.getHumanList()));
                    break;
                }

                case 4: {
                    System.out.println("=========================================================");
                    String textFromFile = FileWorker.read(fileName);
                    System.out.println(textFromFile);
                }

            }

        }

    }

}
