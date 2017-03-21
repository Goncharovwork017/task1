package nc.task1.faculty.logic;

import nc.task1.faculty.entity.Course;
import nc.task1.faculty.entity.factory.GroupFactory;
import nc.task1.faculty.entity.factory.HumanFactory;
import nc.task1.faculty.entity.group.Group;
import nc.task1.faculty.entity.human.Human;
import nc.task1.faculty.entity.human.Teacher;

import java.util.*;

/**
 * Created by ivan on 20.03.2017.
 */
public class Manager {
    public static int getCurrentYear()
    {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        return calendar.get(java.util.Calendar.YEAR);
    }
    /*
    public Course createTeacher(Course course, int countTeacher){
        Set<Teacher> teachers = new HashSet<>();
        for(int i =0; i < countTeacher ; i++){
            teachers.add(GroupFactory.createTeacher());
        }
        course.setTeacherList(teachers);
        return course;
    }
*/




    public Course createCourse(Course course, int countHuman){
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
