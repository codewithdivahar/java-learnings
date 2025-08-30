import java.util.Scanner;

public class StringConcat {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        System.out.println(conc(firstName,lastName));
    }

    public static String conc(String fname, String lname){
        return fname.concat(lname);
    }
}
