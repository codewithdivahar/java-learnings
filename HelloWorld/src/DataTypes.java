public class DataTypes {
    static void main(String[] args) {
        // Primitive Types
        byte age = 30;
        short number = 10000;
        int number2 = 1923423423;
        long number3 = 2342342342134123123L;
        final float pi = 3.14f;
        double decimalValue = 34.090808;
        char hello = 'A';

        System.out.println(age);
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(pi);
        System.out.println(decimalValue);
        System.out.println(hello);

        // Reference Types
        String name = "Divahar";
        Student student = new Student();
        student.printAge();
        student.printName();

    }
}

class Student {
    String name = "Keerthi";
    int age = 20;

    void printName() {
        System.out.println(name);
    }
    void printAge() {
        System.out.println(age);
    }
}
