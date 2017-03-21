package nc.task1.faculty.entity.human;

import nc.task1.faculty.enums.TeacherType;

/**
 * Created by ivan on 21.03.2017.
 */
public class Teacher extends Human {

    private TeacherType type;

    public Teacher() {
        super();
    }

    public Teacher(String name, int DateOfBirth, TeacherType type) {
        super(name, DateOfBirth);
        this.type = type;
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
                '}';
    }
}
