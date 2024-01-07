package javaOOPsProject2;

public class ShapeTester {
    public static void main(String[] args) {
        Circle cir = new Circle();
        double cirArea = cir.calculateArea(8);
        double cirPerimeter = cir.calculatePerimeter(8);
        System.out.println("The Area of the Circle is : "+ cirArea);
        System.out.println("The circumference of the circle is : "+ cirPerimeter);

        Square sqr= new Square();
        double sqrArea= sqr.calculateArea(15);
        double sqrPerimeter=sqr.calculatePerimeter(15);
        System.out.println("The Area of a Square is : "+sqrArea);
        System.out.println("The perimeter of a square is : "+sqrPerimeter);
    }
}