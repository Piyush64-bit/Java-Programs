public class Array {
    public static void main(String[] args) {
        int [] scores = new int [3];
        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 30;

        for ( int i = 0; i < scores.length; i++) {
            System.out.println("Score "+ (i+1) + " " + scores[i]);
        }
    }
}
