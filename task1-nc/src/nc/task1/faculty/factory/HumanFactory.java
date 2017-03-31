package nc.task1.faculty.factory;

import nc.task1.faculty.entities.human.Employee;
import nc.task1.faculty.entities.human.Human;
import nc.task1.faculty.entities.human.Student;
import nc.task1.faculty.enums.*;
import nc.task1.faculty.exception.MyException;

import java.util.*;

/**
 * Created by ivan on 20.03.2017.
 */
public class HumanFactory {

    public static int GC(int start, int end) {
        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(1990, 1999);
        gc.set(gc.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static Human createHuman() throws MyException {
        Random random = new Random();
        String s = "Ошибка рандома";

        String[] desc = {"Good","Bad","Very good","Very bad"};
        List<String> freeDesc = null;
        for (int i = 0; i < 100; i++) {
            if (freeDesc == null || freeDesc.size() == 0) {
                freeDesc = new ArrayList<>(Arrays.asList(desc));
            }
        }
        String descsName = freeDesc.remove(random.nextInt(freeDesc.size()));


        String[] marks = {"'A'","'B'","'C'","'F'","'D'","'E'"};
        List<String> freeMarks = null;
        for (int i = 0; i < 100; i++) {
            if (freeMarks == null || freeMarks.size() == 0) {
                freeMarks = new ArrayList<>(Arrays.asList(marks));
            }
        }
        String marksName = freeMarks.remove(random.nextInt(freeMarks.size()));

        String[] names = {"Иван", "Илья", "Василий", "Ирина", "Ульяна", "Светлана"};
        List<String> freeNames = null;
        for (int i = 0; i < 100; i++) {
            if (freeNames == null || freeNames.size() == 0) {
                freeNames = new ArrayList<>(Arrays.asList(names));
            }
        }
        String HumanName = freeNames.remove(random.nextInt(freeNames.size()));

        switch (random.nextInt(2)) {
            case 0:
                return new Student(
                        HumanName,
                        GC(1980, 1999),
                        StudentType.values()[(new Random().nextInt(StudentType.values().length))],
                        marksName,
                        descsName);
            case 1:
                return new Employee(
                        HumanName,
                        GC(1970, 1990),
                        EmployeeType.values()[(new Random().nextInt(EmployeeType.values().length))]

                );
            default:
               return createHuman();

        }

    }






}

