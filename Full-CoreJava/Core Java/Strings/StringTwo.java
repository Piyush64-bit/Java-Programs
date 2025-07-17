package Strings;

import java.util.Arrays;

public  class StringTwo  {
     public static void main(String[] args) {
        System.out.println(56);
        System.out.println("Kunal");
        System.out.println(new int[] {1,2,3,4});
        // for exceuting everycommand in the println > it is calling the "return Integer.toString method"
        // if it is null object, print null otherwise print the toString
        // Everytime i use println or pass something to it >> it calles the .value > then with conditional operator checks wether the obj is null if it's not null >> obj.toString
        // in the above one, when you try to print an array like this, the response you re seeing in the console is the textual respresentation of an object
        // To avoid this, we tell java that no need of your default toString when i have my own (Arrrays.toString()) >> this is called function/methood overriding >> now you will see a nice representation of your array
        System.out.println(Arrays.toString(new int[] {1,2,3,4}));
     }
}
