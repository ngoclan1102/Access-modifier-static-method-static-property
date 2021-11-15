public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student student1 = new Student(1111,"Hoang");
        Student student2 = new Student(2222,"Khanh");
        Student student3 = new Student(3333,"Nam");

        student1.display();
        student2.display();
        student3.display();
    }
}
