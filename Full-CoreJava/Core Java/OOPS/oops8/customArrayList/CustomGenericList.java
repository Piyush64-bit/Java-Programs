package OOPS.oops8.customArrayList;

import java.util.ArrayList;

public class CustomGenericList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    // S-1- you will get the error while using the T as the bytecode during the compile time is not able to differentiate that what it T here . In the oracle docs its clearly mention that you cant create the instancss of the type parameters
    // For this - use the Object type in the java

    public CustomGenericList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T item) {
        if (isFull()) {
            resize();
        }
        data[size++] = item;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        @SuppressWarnings("unchecked")
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index) {
        @SuppressWarnings("unchecked")
        T item = (T) data[index];
        return item;
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

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

        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(45);
        mylist.remove(0);
        // mylist.get(0);
        mylist.add(99);
        mylist.set(0, 6789);
        System.out.println(mylist.get(0));
        System.out.println(mylist.size());
        System.out.println(mylist.isEmpty());

        // Use of the non-generic custom list class
        CustommArrayList mynewlist = new CustommArrayList();
        mynewlist.add(3);
        mynewlist.add(5);
        mynewlist.add(8);
        System.out.println(mynewlist);

        // ✅ Now using our truly generic list
        CustomGenericList<Integer> list2 = new CustomGenericList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        System.out.println(list2);
        System.out.println("Removed: " + list2.remove());
        System.out.println("After removal: " + list2);
    }
}
