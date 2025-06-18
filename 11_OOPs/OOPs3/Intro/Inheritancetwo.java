public class Inheritancetwo {
    public static void main(String[] args) {
        Inheritanceone box = new Inheritanceone();
        System.out.println(box.l + " " + box.w + " " + box.h);

        Inheritanceone box2 = new Inheritanceone(4);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);

        Inheritanceone box3 = new Inheritanceone(4.5, 5.5, 6.5);
        System.out.println(box3.l + " " + box3.w + " " + box3.h );

        
    }
}
