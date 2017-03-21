package nc.task1.faculty.entity.group;

import nc.task1.faculty.enums.ClassTimeType;
import nc.task1.faculty.enums.CourseType;
import nc.task1.faculty.enums.GroupType;
import nc.task1.faculty.enums.TeacherType;

/**
 * Created by ivan on 20.03.2017.
 */
public class Group {

    private GroupType name;
    private CourseType courseType;
    private ClassTimeType classTimeType;
    private TeacherType teacherType;

    public Group() {
    }

    public Group(GroupType name, CourseType courseType, ClassTimeType classTimeType, TeacherType teacherType) {
        this.name = name;
        this.courseType = courseType;
        this.classTimeType = classTimeType;
        this.teacherType = teacherType;
    }

    public TeacherType getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(TeacherType teacherType) {
        this.teacherType = teacherType;
    }

    public GroupType getName() {
        return name;
    }

    public void setName(GroupType name) {
        this.name = name;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public ClassTimeType getClassTimeType() {
        return classTimeType;
    }

    public void setClassTimeType(ClassTimeType classTimeType) {
        this.classTimeType = classTimeType;
    }

    @Override
    public String toString() {
        return "{" +
                "Дисциплина= " + this.getName().getGroupType() +
                ", Состояние="  + this.getCourseType().getGroupTimeType() +
                ", Продолжительность= " + this.getClassTimeType().getClassTimeType() +
                //", Преподаватель группы= " + this.getTeacherType().getTeacherType() +
                '}';
    }
}
