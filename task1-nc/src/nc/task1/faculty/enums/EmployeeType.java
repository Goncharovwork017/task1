package nc.task1.faculty.enums;

/**
 * Created by ivan on 20.03.2017.
 */
public enum EmployeeType {
    EDUTYPE, MILITTYPE, HEALTYPE;

    public String getEmployeeType() {
        switch (this) {
            case EDUTYPE:
                return "Образование";
            case MILITTYPE:
                return "Военное дело";
            case HEALTYPE:
                return "Здравохранение";

        }
        return "безработный";
    }
}
