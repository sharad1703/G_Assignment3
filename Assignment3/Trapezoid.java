public class Trapezoid  extends Quadrilateral{
    double height;

    public Trapezoid(double height, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        double base1 = Math.sqrt(Math.pow(getP1().getX() - getP2().getX(), 2)) + Math.sqrt(Math.pow(getP1().getY() - getP2().getY(), 2));
        double base2 = Math.sqrt(Math.pow(getP3().getX() - getP4().getX(), 2)) + Math.sqrt(Math.pow(getP3().getY() - getP4().getY(), 2));
        return (base1 + base2) * height/2;
    }

    public double getSumofTwoSides(){
        return Math.sqrt(Math.pow(getP1().getX() - getP2().getX(), 2)) + Math.sqrt(Math.pow(getP1().getY() - getP2().getY(), 2)) + Math.sqrt(Math.pow(getP3().getX() - getP4().getX(), 2)) + Math.sqrt(Math.pow(getP3().getY() - getP4().getY(), 2));
    }

    @Override
    public String toString() {
        return "Trapezoid: " + getCoordinatesAsString() + ", height: " + height + ", Area: " + getArea();
    }
}
