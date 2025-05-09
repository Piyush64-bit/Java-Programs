public class StringDemo {
    public static void main(String[] args) {
        String text = "groot Academy";

        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("First Character: " + text.charAt(0));

        String other = "Groot Academy";
        System.out.println("Equals: " + text.equals(other));
        String other2 = "Bodacious IT HUB";
        System.out.println("Equals: " + text.equals(other2));
    }
};
