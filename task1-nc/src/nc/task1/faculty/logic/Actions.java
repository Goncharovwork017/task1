package nc.task1.faculty.logic;

import nc.task1.faculty.entities.group.Group;
import nc.task1.faculty.entities.human.Human;
import nc.task1.faculty.enums.TeacherType;

import java.util.*;

/**
 * Created by ivan on 20.03.2017.
 */
public class Actions {

    public static void humanSortByAge(List<Human> humans) {
        Collections.sort(humans, (o1, o2) -> Double.compare(o1.getDateOfBirth(), o2.getDateOfBirth()));
    }

}
