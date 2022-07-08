public class Decorator_Pattern_Demo {
    public static void main(String[] args) {

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}