package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) throws Exception {

        createNewFile();
        numbersExceptionHandling();
        createNewFileRethrow();

    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(file);
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch(FileNotFoundException | InputMismatchException | ArrayStoreException   e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            fileReader.close();
        }

    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
       try {
           file.createNewFile();
       }
        catch (Exception e){
            System.out.println("Directory Does not Exists");
            e.printStackTrace();
        }

    }
    public static void createNewFileRethrow()throws Exception {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();

    }
}
