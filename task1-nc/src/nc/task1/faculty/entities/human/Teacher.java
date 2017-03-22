package nc.task1.faculty.entities.human;

import nc.task1.faculty.enums.TeacherType;

import java.io.Serializable;

/**
 * Created by ivan on 21.03.2017.
 */
public class Teacher extends Human implements Serializable {

    private TeacherType type;
    private static int numberObjects;
    public Teacher() {
        ++numberObjects;
    }

    public Teacher(String name, int DateOfBirth, TeacherType type) {
        super(name, DateOfBirth);
        this.type = type;
        numberObjects++;
    }

    public TeacherType getType() {
        return type;
    }

    public void setType(TeacherType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\n" +
                "Звание='" + type.getTeacherType() + '\'' +
                ", Фамилия= '" + this.getName() + '\'' +
                ", Год рождения= " + this.getDateOfBirth() +
                ", numberObjects=" +numberObjects +
                '}' +"\n" +"=========================================================";
    }
}
