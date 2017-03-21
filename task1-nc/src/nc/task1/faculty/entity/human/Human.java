package nc.task1.faculty.entity.human;

import nc.task1.faculty.enums.TeacherType;

import java.io.Serializable;

/**
 * Created by ivan on 20.03.2017.
 */
public abstract class Human implements Serializable {
    private String name;
    //private double age = Math.random()*7+3;
    private int DateOfBirth;


    //boolean isMale = random.nextBoolean();
    //String sex = (isMale) ? "Мужской" : "Женский";
   // private TeacherType teacherType;


    public Human() {
    }

    public Human(String name, int DateOfBirth) {
        this.name = name;
        this.DateOfBirth = DateOfBirth;
        //this.teacherType = teacherType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

   // public TeacherType getTeacherType() {
     //   return teacherType;
    //}

   // public void setTeacherType(TeacherType teacherType) {
   //     this.teacherType = teacherType;
  //  }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", DateOfBirth=" + this.getDateOfBirth() +
               // ", teacherType=" + teacherType +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (DateOfBirth != human.DateOfBirth) return false;
        return name != null ? name.equals(human.name) : human.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + DateOfBirth;
        return result;
    }
}
