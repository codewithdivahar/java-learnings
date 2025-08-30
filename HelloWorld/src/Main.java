//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
* public - Access modifiers (public, private, protected)
* class - class in JAVA is container for functions
* void - Return Type of a function
* main() - This is main function, every JAVA program has this main function, main function will always be static
* Class Name should always be PascalNamingConvention
* functions or Methods are always typed in camelCaseNamingConvention
* When a function belongs to a class it is called method of the class
* ** int number - int > datatype | number - variable name
* int number >> Declaration of the variable "number"
* int number = 5; >> Initialization of the variable "number"
* */


/*
* DATATYPES
* Primitive Datatypes and Reference Data Types
*
* Primitive Datatypes
* byte, int, short, long, float, double, char, boolean
* */

import java.util.Scanner;

/*
 * Scanner scanner = new Scanner(System.in)
 * scanner.nextInt() - Gets Integer number from user
 * scanner.next() - Gets String from user
 *
 * Write a program to concat 2 strings from the user input and display as "Divahar Baskaran"
 * string 1 firstname
 * string 2 lastname
 *
 * result = first name and lastname
 * print(result)
 *
 * create a class called StringConcat
 * Then inside main, write the program
 *
 *
 * */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int res = add(number1, number2);
        System.out.println(res);
    }

    public static int add(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }
}

