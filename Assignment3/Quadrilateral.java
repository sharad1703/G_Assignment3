public class Quadrilateral {
private point p1;
private point p2;
private point p3;
private point p4;

public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
    p1 = new point(x1, y1);
    p2 = new point(x2, y2);
    p3 = new point(x3, y3);
    p4 = new point(x4, y4);
}

    public point getP1() {
        return p1;
    }
    public point getP2() {
        return p2;
    }
    public point getP3() {
        return p3;
    }

    public point getP4() {
        return p4;
    }

    public String getCoordinatesAsString(){
        return p1 + "," + p2 + "," + p3  + "," + p4 + ".";
    }

    @Override
    public String toString() {
        return "QUadrilateral:" + getCoordinatesAsString();
    }


}
