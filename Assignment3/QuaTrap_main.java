public class QuaTrap_main {
    public static void main(String[] args) {
        Quadrilateral q1 = new Quadrilateral(2,4,6,3,3,7,1,5);
        Trapezoid t1 = new Trapezoid(2.2, 2,4,6,3,3,7,1,5 );

        System.out.printf("Quadrilateral: %s\n", q1.getCoordinatesAsString());
        System.out.printf("Trapezoid: %s, Height: %.2f, Area: %.2f\n", t1.getCoordinatesAsString(), t1.getHeight(), t1.getArea());

    }
}
