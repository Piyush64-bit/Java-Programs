import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("alice");
        students.add("bob");
        students.add("Jasmine");

        System.out.println("First student: " + students.get(0));

        students.set(1, "Baba");

        for (String myStudent : students) {
            System.out.println("Student: " + myStudent);
        }

        System.out.println("Size before removal: " + students.size());

        students.remove(2);

        System.out.println("Size after removal: " + students.size());
    }
}
