package OOPS.oops8.customArrayList;

import java.util.ArrayList;

public class CustommArrayList {

    //S-2- Creation of our custom array list
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;    //also working as the index value 

    //  S-3- creation of the constructor method
    public CustommArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    // S-4- declaring the variables in the privte and accessing them in the public
    // S-5- creating all the things below - resize, length, remove and everything
    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        //copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    // Added toString method for proper output display
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {

        // S-1- This is the array list initialization and also using its predefined methods, can we create an array list on our own which is fully customized
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(45);
        mylist.remove(0);
        // mylist.get(0); // would throw exception here since list is empty after remove
        mylist.add(99);
        mylist.set(0, 6789);
        System.out.println(mylist.get(0));
        System.out.println(mylist.size());
        System.out.println(mylist.isEmpty());

        // S-6- Now calling the newly created custom array list 
        CustommArrayList mynewlist = new CustommArrayList();
        mynewlist.add(3);
        mynewlist.add(5);
        mynewlist.add(8);
        System.out.println(mynewlist);

        //S-7- in the below example,you cant add string while using the Integer in the code, if you do you will get an error, this is called genereics in java 
        ArrayList <Integer> list2 = new ArrayList<>();
        // list2.add("string");

        //S-8- Drawbacks of my custom arraylist
        //  >> First of all this custom list was for the integers only, for the string and others have to create a new one
        // >> Seconfly, there's no type safety, like i want to define a boolean list, then only booleans can be storing nothing else.
        

    }
}
