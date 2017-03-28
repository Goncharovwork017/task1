package nc.task1.faculty;

import nc.task1.faculty.entities.Course;
import nc.task1.faculty.exception.MyException;
import nc.task1.faculty.logic.Actions;
import nc.task1.faculty.logic.Manager;
import nc.task1.faculty.runner.tools.FileWorker;
import nc.task1.faculty.runner.tools.Menu;
import nc.task1.faculty.runner.validations.Validations;

import java.util.Scanner;

/**
 * Created by ivan on 20.03.2017.
 */
public class Runner {


    public static void main(String[] args) {
     try{
         Menu.menu();
     }catch (MyException var2){
         System.out.println(var2.getMessage());
        }


    }


}
