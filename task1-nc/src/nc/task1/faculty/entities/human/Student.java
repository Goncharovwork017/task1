package nc.task1.faculty.entities.human;

import nc.task1.faculty.enums.StudentType;

import java.io.Serializable;

/**
 * Created by ivan on 20.03.2017.
 */
public class Student extends Human implements Serializable {

    private StudentType type;
    private String mark;
    private String desc;

    private static int numberObjects;




    public Student() {
     super();

    }



    public Student(String name, int DateOfBirth) {
        super(name, DateOfBirth);
    }

    public Student(String name, int DateOfBirth, StudentType type, String mark, String desc) {
        super(name, DateOfBirth);
        this.type = type;
        this.mark = mark;
        this.desc = desc;
    }

    public StudentType getType() {
        return type;
    }

    public void setType(StudentType type) {
        this.type = type;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Студент: " +
                "Форма обучения= " + this.getType().getStudentType() +
                ", Имя= '" + this.getName() + '\'' +
                ", Год рождения= " + this.getDateOfBirth() +
                ", Балл=" + this.getMark()+
                ", Отзыв=" + this.getDesc()+
                ", numberObjects =" +numberObjects +
              //  ", teacher=" + this.getTeacherType() +
                ' ' + "\n";
    }
}
