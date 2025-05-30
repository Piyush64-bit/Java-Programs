
public class StringIntro {

    public static void main(String[] args) {
        int str[] = {2, 3, 4, 5, 19}
        int a = 10;
        String name = "LAksh Yadav";
        System.out.println(name);
        String b = "ALksh";
        b = "Yadav"
        System.out.println(b);
    }
}

// // ✅ 1. Everything that starts with a capital letter is usually a Class in Java
// // Examples: String, Scanner, ArrayList, Integer, etc.


// // ✅ 2. Syntax for creating a String object
// String name = "Kunal"; // Datatype referenceVariable = object;


// // ✅ 3. Important Concepts in String Manipulation:
// // a. String Pool
// // b. Immutability
// // c. == vs .equals()


// // ✅ a. String Pool
// // The String pool is a special area in heap memory where Java stores string literals.
// // If two strings have the same value, they will point to the same object in the pool.

// String a = "Kunal";
// String b = "Kunal";

// System.out.println(a == b); // true → both point to the same object in the string pool


// // BUT if you use 'new String()', a new object is created even if the value is the same:

// String c = new String("Kunal");

// System.out.println(a == c);        // false → different memory location
// System.out.println(a.equals(c));   // true  → same value


// // ✅ b. Immutability
// // Strings in Java are immutable. You can't change the original string object.
// // Any operation that modifies a string actually creates a **new** string object.

// String str = "Hello";
// str = str + " World";

// System.out.println(str); // Output: Hello World

// // Original "Hello" string still exists in memory (if not garbage collected).


// // ✅ c. == vs .equals()
// // == checks if two references point to the same object in memory.
// // .equals() checks if two objects have the same value/content.

// String x = "Java";
// String y = "Java";
// String z = new String("Java");

// System.out.println(x == y);       // true → both from string pool
// System.out.println(x == z);       // false → z is a new object
// System.out.println(x.equals(z));  // true → same content


// // ✅ TL;DR (Cheat Sheet)
// // - Use .equals() to compare string values.
// // - Avoid using 'new String()' unless necessary.
// // - Strings are immutable, use StringBuilder for heavy string manipulation.
// // - String pool saves memory by avoiding duplicate literals.
