package OOPS.oops3.intro;

public class InheritanceTwo {
    public static void main(String[] args) {
        InheritanceOne box = new InheritanceOne();
        System.out.println(box.l+ " "+ box.w+" "+box.h);
        InheritanceOne box2 = new InheritanceOne(4);
        System.out.println(box2.l+ " "+ box2.w+" "+box2.h);
        InheritanceOne box3 = new InheritanceOne(4.5,5.6,7.7);
        System.out.println(box3.l+ " "+ box3.w+" "+box3.h);
      
    }
}
