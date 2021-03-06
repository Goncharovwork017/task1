package nc.task1.faculty.logic;

import nc.task1.faculty.entities.Course;
import nc.task1.faculty.factory.GroupFactory;
import nc.task1.faculty.factory.HumanFactory;
import nc.task1.faculty.entities.human.Human;
import nc.task1.faculty.entities.human.Teacher;
import nc.task1.faculty.exception.MyException;

import java.util.Calendar;
import java.util.*;

/**
 * Created by ivan on 20.03.2017.
 */
public class Manager {
    public static int getCurrentYear()
    {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        calendar.setTime(new Date());
        return calendar.get(Calendar.YEAR);
    }

    public Course createCourse(Course course, int countHuman) throws MyException{
        List<Human> humans = new ArrayList<>();
        Set<Teacher> teachers = new HashSet<>();
        teachers.add(GroupFactory.createTeacher());

        for(int i = 0; i < countHuman; i++){
            humans.add(HumanFactory.createHuman());
        }
        course.setHumanList(humans);
        course.setGroup(GroupFactory.createGroup());
        course.setTeacherList(teachers);
        return course;
    }

    public int calculateTotalAgeHuman(List<Human> humans){
        int totalAge = 0;
        for(Human human : humans){

            totalAge += getCurrentYear() - human.getDateOfBirth();
        }
        return totalAge;
    }






}
