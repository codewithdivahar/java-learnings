import java.util.Scanner;

public class StringConcat {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        System.out.print("Enter last name: ");
        String lastName = scanner.next();
        System.out.println(conc(firstName,lastName));
    }

    public static String conc(String fname, String lname){
        return fname + " " + lname;
    }
}
