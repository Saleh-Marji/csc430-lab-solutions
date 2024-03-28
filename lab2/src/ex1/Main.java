package ex1;

import ex1.language.Java;
import ex1.os.Linux;
import ex1.os.OS;
import ex1.os.Windows;

/**
 * In this exercise we will use the bridge design pattern to solve the problem of adding a new platform for each language,
 * and we'll use the flyweight design pattern to solve the problem of creating a single object of each type
 */
public class Main {
    public static void main(String[] args) {
        Java java = new Java(OS.get(Windows.class));
        java.execute("System.out.println(\"Hello world\");");
    }
}
