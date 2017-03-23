package nc.task1.faculty.runner.tools;

import nc.task1.faculty.exception.MyException;

import java.io.*;

/**
 * Created by ivan on 21.03.2017.
 */
public class FileWorker {

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
                System.out.println(e);
            }


        } catch (IOException e) {
            System.out.println(e);
        }
return sb.toString();

    }
}
