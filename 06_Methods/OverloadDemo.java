public class OverloadDemo {
    public static void main(String[] args) {
        System.out.println("Area of square: " + CalculateArea(5));
        System.out.println("Area of rectangle: " + CalculateArea(5, 4)); // Fixed typo in "rectangle"
    }

    public static int CalculateArea(int side) { // Fixed return type placement
        return side * side;
    }

    public static int CalculateArea(int length, int width) { // Fixed typos in parameter names and "punlic"
        return length * width;
    }
};