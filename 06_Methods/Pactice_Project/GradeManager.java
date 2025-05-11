public class GradeManager {

    // Method to calculate average from a double array
    public static double calculateAverage(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    // Method to generate a grade report
    public static String generateReport(String name, double grade) {
        String letterGrade;
        if (grade >= 90) {
            letterGrade = "A";
        } else if (grade >= 80) {
            letterGrade = "B";
        } else if (grade >= 70) {
            letterGrade = "C";
        } else if (grade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        return "Student: " + name + " | Average Grade: " + grade + " | Grade: " + letterGrade;
    }

    public static void main(String[] args) {
        // Sample data
        String[] studentNames = {"Piyush", "Aditi", "Rahul"};
        int[][] testScores = {
            {85, 90}, // Piyush
            {78, 82}, // Aditi
            {92, 88}  // Rahul
        };
        double[] grades = new double[studentNames.length]; // Final grades (average of two test scores)

        // Calculate average grade for each student
        for (int i = 0; i < testScores.length; i++) {
            double avg = (testScores[i][0] + testScores[i][1]) / 2.0;
            grades[i] = avg;
        }

        // Print all reports
        System.out.println("📄 Student Grade Report:");
        System.out.println("-----------------------------");

        for (int i = 0; i < studentNames.length; i++) {
            String report = generateReport(studentNames[i], grades[i]);
            System.out.println(report);
        }

        // Calculate and print overall average
        double overallAvg = calculateAverage(grades);
        System.out.println("\n📊 Overall Average Grade: " + overallAvg);
    }
}
