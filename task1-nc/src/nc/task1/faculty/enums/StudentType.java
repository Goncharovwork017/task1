package nc.task1.faculty.enums;

/**
 * Created by ivan on 20.03.2017.
 */
public enum StudentType {
    FULLTIME, EVENTIME, DISTTIME;


    public String getStudentType() {
        switch (this) {
            case FULLTIME:
                return "Дневное обучение";
            case EVENTIME:
                return "Вечерное обучение";
            case DISTTIME:
                return "Дистационное обучение";

        }
        return "не указал";
    }
}
