package nc.task1.faculty.enums;

/**
 * Created by ivan on 20.03.2017.
 */
public enum ClassTimeType {
    H22, H28, H48;

    public String getClassTimeType() {
        switch (this) {
            case H22:
                return "22 академических часа";
            case H28:
                return "28 академических часов";
            case H48:
                return "48 академических часов";

        }

        return null;
    }

}
