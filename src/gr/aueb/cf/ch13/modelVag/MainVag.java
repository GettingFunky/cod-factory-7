package gr.aueb.cf.ch13.modelVag;

public class MainVag {

    public static void main(String[] args) {
        Point3DVag point1 = new Point3DVag(45, 56, 78);

        System.out.println(point1.getXYDistance());
        System.out.println(point1.getYZDistance());
        System.out.println(point1.getXZDistance());
        System.out.println(point1.getXYZDistance());

        System.out.println("\nExpected Results:");
        System.out.println("XY Distance: ~71.88");
        System.out.println("YZ Distance: ~95.99");
        System.out.println("XZ Distance: ~90.06");
        System.out.println("XYZ Distance: ~106.05");
    }
}
