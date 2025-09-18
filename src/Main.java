import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        System.out.println("This is an app that gives you the multiplication table of any number");
        System.out.print("Enter a number: ");

        int num = scanner.nextInt();  // Read user input

        System.out.printf("Multiplication Table for %d :", num);

        // Loop from 1 to 10 to print the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }

        scanner.close();
        }
    }