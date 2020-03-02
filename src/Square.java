public class Square {
    public static final int SIDES = 4;
    public static int sideLength;

    //Constructor default
    public Square() { }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getArea() {
        int mathPow = (int) Math.pow(sideLength, 2);
        int area = mathPow;
        return area;
    }

    //@Deprecated--nu mai este folosit
    public int getPerimeter() {
        int perimeter = SIDES * sideLength;
        return perimeter;
    }

    public double getDiagonal() {
        int mathPow = 2 * (int) (Math.pow(sideLength, 2));
        double diagonal =Math.sqrt(mathPow);
        return diagonal;
    }
}
