public class Student {
    public static void main(String[] args) {
        System.out.println("Name: " + StudentName("Piyush"));
        System.out.println("Age: " + StudentAge(21));
        System.out.println("Phone: " + StudentPhone(96602));
    }
    public static String StudentName(String name){
        return name;
    }
    public static int StudentAge(int age){
        return age;
    }
    public static int StudentPhone(int phone){
        return phone;
    }
};
