package nc.task1.faculty.entity;

import nc.task1.faculty.entity.group.Group;
import nc.task1.faculty.entity.human.Human;
import nc.task1.faculty.entity.human.Teacher;
import nc.task1.faculty.enums.TeacherType;

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
    // и класс teacher

   // private List<Group> gr = new ArrayList<>();
  //  private Set<Group> groupList = new HashSet<>();
   // private TeacherType teacherType;
    private Group group;

    public Course() {
    }
//////////////////////////////////////////////////////////////
  //  public List<Group> getGr() {
    //    return gr;
   // }

    //public void setGr(List<Group> gr) {
    //    this.gr = gr;
    //}

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
        return "Курсы:{" +
                "Группа=" + group +"\n" +
                "Список людей=" + humanList +
                "Преподаватель=" +teacherList +
                '}';
    }
}
