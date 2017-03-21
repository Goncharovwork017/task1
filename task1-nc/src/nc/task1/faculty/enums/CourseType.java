package nc.task1.faculty.enums;

/**
 * Created by ivan on 21.03.2017.
 */
public enum CourseType {

    STARTED, GOON, ENDED;

    public String getGroupTimeType() {
        switch (this) {
            case STARTED:
                return "Начинаются";
            case GOON:
                return "Уже идут";
            case ENDED:
                return "Закончились";

        }

        return null;
    }
}
