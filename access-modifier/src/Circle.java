public class Circle {
    private double radius;
    private String color;

     Circle(double r) {
        radius = r;
        color = "red";
    }

     Circle(){

    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return  3.14 * radius * radius;
    }

    void display() {
        System.out.println("radius = " + getRadius() + "\n" + "area = " + getArea() + "\n" + "color = " + color);
    }
}
