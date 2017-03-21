package nc.task1.faculty.enums;

/**
 * Created by ivan on 20.03.2017.
 */
public enum GroupType {
    MATH, PROG, PHYS;


    public String getGroupType() {
        switch (this) {
            case MATH:
                return "Математика";
            case PROG:
                return "Программирование";
            case PHYS:
                return "Физика";

        }
        return null;
    }
}
