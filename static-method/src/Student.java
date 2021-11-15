public class Student {
    private final int number;
    private final String name;
    private static String college = "BBDIT";

    Student(int num, String n) {
        number = num;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(number + "\t" + name + "\t" + college);
    }
}

