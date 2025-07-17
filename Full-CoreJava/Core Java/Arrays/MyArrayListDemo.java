import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayListDemo {
    // 1. When you dont know , what will be the size of your array and simply telling java please handle my array size and its elements. There comes the array List in the game
    //2. It is similars to vectors in c++, in java it is a part of the collections framework
    // 3.Syntax : 
    // 4. Now, here Integer means , what is the type of the data you want to store in the list, so bascially these are the wrapper classes used in the OOPs. You can include primitives directly here, with wrapper classes <>

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(78);
        list.add(79);
        list.add(500);
        list.add(45555);
        list.add(767);
        list.add(786);
        list.add(786);
        list.add(786);
        list.add(786);
  
        // Add as many as you want, no fixed size of the array
        // 1.contains function , helps to find if you're searching for is contained in your list- output -true or false
        
        System.out.println(list.contains(34));
            // 2. list.set(index, the no. or elements new value)
            System.out.println(list.set(1,900 ));
            // 3. removing the particular element at a particular index
            System.out.println(list.remove(0));
            // 4. addding the new elements as an input to the list> getting the items at any index
            for(int i=0;i<5;i++){
                list.add(in.nextInt());
            }
            for(int i=0;i<5;i++){
               System.out.println(list.get(i)); ///pass index here
            }


        System.out.println(list);
    }
}


// Working of arraylist behind the sscens
// >> arr when you declared it is created in the stack and objects pointing towards the values as reference in the heap
// >>Size is actually fixed> now, when you fill the array to its capacity > a new arraylist is created with double the capacity and old elements copied to that > old one now is empty and gets destroyed
