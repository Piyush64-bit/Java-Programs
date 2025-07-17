package OOPS.oops6;

public class ObjectClass implements Cloneable {

    int value;


    //constructor of the class
    public ObjectClass(int value) {
        this.value = value;
    }

    // it gives a number representation of an object
    @Override
    public int hashCode() {
        // Return hash code based on 'value' field
        // return Integer.hashCode(value);
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // Check for reference equality
        if (this == obj) return true;

        // Check for null and class type
        if (obj == null || getClass() != obj.getClass()) return false;

        // Type cast and compare values
        ObjectClass that = (ObjectClass) obj;
        return this.value == that.value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Call super.clone() and return
        return super.clone();
    }

    // to string we have already covered
    @Override
    public String toString() {
        // Return custom string representation
        return "ObjectClass{value=" + value + "}";
    }

    // this one is for the garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called for: " + this);
        super.finalize();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectClass obj1 = new ObjectClass(34); 
        ObjectClass obj2 = new ObjectClass(34); 
        ObjectClass obj3 = (ObjectClass) obj1.clone();

        System.out.println("HashCode: " + obj1.hashCode());
        System.out.println("Equals: " + obj1.equals(obj2));
        System.out.println("Clone: " + obj3);
        System.out.println("ToString: " + obj1);

        obj1 = null;
        obj2 = null;
        obj3 = null;

        // Request garbage collection (no guarantee it will run immediately)
        System.gc();

        // Give GC time to potentially invoke finalize (not reliable)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


//hashcode is not the address like c++ , instead its just the random integer value