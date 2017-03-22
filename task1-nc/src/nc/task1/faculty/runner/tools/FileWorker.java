package nc.task1.faculty.runner.tools;

import nc.task1.faculty.exception.MyException;

import java.io.*;

/**
 * Created by ivan on 21.03.2017.
 */
public class FileWorker {
    /*
        public static void write(String filiNameOut, String sb) throws MyException {
            //Определяем файл
            File file = new File(filiNameOut);

            try {
                //проверяем, что если файл не существует то создаем его
                if(!file.exists()){
                    file.createNewFile();
                }

                //PrintWriter обеспечит возможности записи в файл
                PrintWriter out = new PrintWriter(file.getAbsoluteFile());

                try {
                    //Записываем текст в файл
                    out.print(sb);
                } finally {
                    //После чего мы должны закрыть файл
                    //Иначе файл не запишется
                    out.close();
                }
            } catch(IOException e) {
                throw new RuntimeException(e);
            }
        }
        */
    public static void write(String filiNameOut, String sb) throws MyException {
        File file = new File(filiNameOut);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }


            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(sb + "\n");

            bufferWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    public static String read(String fileName) throws MyException {
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);
        String s;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try {
                BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
                try {

                    while ((s = in.readLine()) != null) {
                        sb.append(s);
                        sb.append("\n");
                    }
                } finally {
                    in.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
/*
public static String delete(String fileNameDelete) throws MyException{
    File file = new File(fileNameDelete);
    try {
        FileWriter fstream1 = new FileWriter(fileNameDelete);// конструктор с одним параметром - для перезаписи
        BufferedWriter out1 = new BufferedWriter(fstream1); //  создаём буферезированный поток
        out1.write(""); // очищаем, перезаписав поверх пустую строку
        out1.close(); // закрываем
    } catch (Exception e)
    {System.err.println("Error in file cleaning: " + e.getMessage());
    }

    return file.toString();

}
*/return sb.toString();

    }
}
