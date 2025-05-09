public class GradeManager {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob"};
        double[] grade = {85.5, 92.0};
        int[][] tests = {{80, 90}, {95, 89}}; 

        System.out.println("== Grade Memory ==");
        for (int i = 0; i < names.length; i++) {
            double avh = calculateAvg(tests[i]);
            String report = generateReport(names[i], grade[i]); // 👈 passed correct 2 arguments
            System.out.println(report);
            System.out.println("Test Avg: " + avh);
        }
    }

    public static double calculateAvg(int[] scores) {
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static String generateReport(String name, double grade) {
        String category = grade >= 90 ? "A" : grade >= 80 ? "B" : "C or below";
        return "Student: " + name + ", Grade: " + grade + ", Category: " + category;
    }
}
