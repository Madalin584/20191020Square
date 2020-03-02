public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(5);
        int area = square1.getArea();
        int perimter = square1.getPerimeter();
        double diagonal = square1.getDiagonal();
        System.out.println("Area of object " + square1.getClass().getName() + " with "+Square.sideLength+" side length = " + area);
        System.out.println("Perimeter of object " + square1.getClass().getName()+" with "+Square.sideLength  + " side length = " + perimter);
        System.out.println("Diagonal of object " + square1.getClass().getName() +" with "+Square.sideLength+ " side length = " + area);
    }
}
