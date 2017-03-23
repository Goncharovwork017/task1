package nc.task1.faculty.entities;

import nc.task1.faculty.entities.group.Group;
import nc.task1.faculty.entities.human.Human;
import nc.task1.faculty.entities.human.Teacher;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ivan on 20.03.2017.
 */
public class Course {

    private List<Human> humanList = new ArrayList<>();
    // Добавить Teacherlist
    private Set<Teacher> teacherList = new HashSet<>();

    private Group group;

    public Course() {
    }

    public Set<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(Set<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
///////////////////////////////////////////////////////////////////
    public List<Human> getHumanList() {
        return humanList;
    }

    public void setHumanList(List<Human> humanList) {
        this.humanList = humanList;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Курс:{" +
                "Группа=" + group +"\n" +
                "Список людей=" + humanList +
                "Преподаватель=" +teacherList +
                '}';
    }
}
