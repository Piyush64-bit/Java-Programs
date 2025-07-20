
import java.util.HashSet;

// #setinterface setdemo

// > the setinterface(java.util.set) represents a collection with no duplicates
// > ex- Hashset(Unorderd), Treeset(sorted)


public class setDemo{
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet();

        numbers.add(10);
        numbers.add(30);
        numbers.add(10);

        System.out.println("conatians 20?" + numbers.contains(20));
        for(Integer num: numbers) {
            System.out.println("Numbers: " + num);
        }
        numbers.remove(10);
        System.out.println("Size after removal: " + numbers.size());
    }
}