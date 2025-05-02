public class Whileloop {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("using while");
        while (count <= 3) {
            System.out.println("count: " + count);
            count++; // Fixed undefined variable
        }
        System.out.println("using do-while"); // Fixed typo
        count = 1; // Fixed typo in variable name
        do { 
            System.out.println("count: " + count);
            count++;
        } while (count <= 3); // Added missing semicolon
    } 
 }