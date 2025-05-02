
public class NestedDemo {

    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;
        if (age >= 18) {
            if (hasID) {
                System.out.println("Elegible to vote");
            } else {
                System.out.println("Need ID to Vote");
            }
        } else {
            System.out.println("Can't Vote");
        }
    }

};
