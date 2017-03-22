package nc.task1.faculty.entities.human;

import nc.task1.faculty.enums.EmployeeType;

import java.io.Serializable;

/**
 * Created by ivan on 20.03.2017.
 */
public class Employee extends Human implements Serializable {

    private EmployeeType type;
    private String mark;
    private String desc;

    public Employee() {
        super();
    }

    public Employee(String name, int age, EmployeeType type) {
        super(name, age);
        this.type = type;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
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
        return "Работник: " +
                "Вид деятельности=" + this.getType().getEmployeeType() +
                ", Имя='" + this.getName() + '\'' +
                ", Год рождения=" + this.getDateOfBirth() +
                ", Балл=" + this.getMark()+
                ", Отзыв=" + this.getDesc()+
              //v  ", teacher=" + this.getTeacherType() +
                ' ' + "\n";
    }
}
