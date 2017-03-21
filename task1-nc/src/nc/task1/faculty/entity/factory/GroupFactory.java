package nc.task1.faculty.entity.factory;

import nc.task1.faculty.entity.group.Group;
import nc.task1.faculty.entity.human.Human;
import nc.task1.faculty.entity.human.Teacher;
import nc.task1.faculty.enums.ClassTimeType;
import nc.task1.faculty.enums.CourseType;
import nc.task1.faculty.enums.GroupType;
import nc.task1.faculty.enums.TeacherType;
import sun.misc.GC;

import java.util.*;

/**
 * Created by ivan on 20.03.2017.
 */
public class GroupFactory {
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


    public static Teacher createTeacher() {
        Random random = new Random();
        String[] names = {"Петров", "Сидоров", "Яшин", "Князев", "Ильев", "Горбач"};
        List<String> freeNames = null;
        for (int i = 0; i < 100; i++) {
            if (freeNames == null || freeNames.size() == 0) {
                freeNames = new ArrayList<>(Arrays.asList(names));
            }
        }
        String TeacherName = freeNames.remove(random.nextInt(freeNames.size()));


        return new Teacher(
                TeacherName,
                GC(1950,1980),
                TeacherType.values()[(new Random().nextInt(TeacherType.values().length))]);
    }





    public static Group createGroup(){
        Random random = new Random();
        return new Group(
                GroupType.values()[(new Random().nextInt(GroupType.values().length))],
                CourseType.values()[(new Random().nextInt(CourseType.values().length))],

                ClassTimeType.values()[(new Random().nextInt(ClassTimeType.values().length))],
                TeacherType.values()[(new Random().nextInt(TeacherType.values().length))]);


    }
}
