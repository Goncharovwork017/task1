package nc.task1.faculty.runner.validations;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ivan on 20.03.2017.
 */
public final class Validations {
    public static Scanner input = new Scanner(System.in);
    public static int inputNumber(){
        int number = -1;
        while(number < 0){
            try {
                input = new Scanner(System.in);
                number = input.nextInt();
                if(number >= 0){
                    return number;
                }
                else{
                    System.out.println("Параметр не может быть отрицательным. Повторите ввод..");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Неверный формат. Повторите ввод..");
                continue;
            }
        }
        return 0;
    }

    public static String inputString(){
        input = new Scanner(System.in);
        return input.next();
    }










}
