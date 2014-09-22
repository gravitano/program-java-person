package app;

import app.models.Person;
import java.util.Scanner;

/**
 * @author Gravitano
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.print("Please enter your name : ");

        String name = getScanner().next();

        System.out.print("Please enter your age : ");

        int age = getScanner().nextInt();

        Person orang = new Person(name, age);

        System.out.println("Hello " + orang.getName() + ", your age is " + orang.getAge() + " years old.");
    }

    /*
     * Mengambil scanner instance.
     * 
     * @return Scanner
     */
    public static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
