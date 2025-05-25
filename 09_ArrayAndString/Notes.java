// Array and string

// in java there is no pointer concept
// array is a collection of similar type of data

// array is a collection of similar and multiple type of data
// array objects are stored in  The heap memory 
// Heap opject are not onctinous 
// dynamic memory allocation to the place in the heap memory
// the new keyword is used to create a new object in the heap memory
//try to declare an array assigning the size , you will not get any error but you will get a runtime error
// string is a reference type datatype , now array of string pointing towards indivisual string object in java . so if nothing is assigned to the array of string then it will be null.
// String arr1[] = new String[10];
// System.out.println(arr[0]);       =====>> it will give null  exception





// Arrays and Strings in Java 🚀

// Java doesn't support pointers like C/C++.
// But it uses references – kind of like a "safe pointer".

// ✅ Arrays = Collection of similar data types (NOT multiple data types)
// ❌ Wrong: "array is a collection of similar and multiple type of data"

// Arrays in Java are **objects**, and all objects are stored in **heap memory**.
// Heap memory isn’t necessarily contiguous like in C, but the array itself is a continuous block.

// Arrays use **dynamic memory allocation**, which means size is set at runtime using `new` keyword.
// Example:
int[] arr = new int[5]; // allocates space for 5 integers in heap

// Note: Declaring an array with a size won’t throw an error,
// but accessing an element that hasn't been initialized will return the default value.
// For objects, that's `null`. For primitives like int, it's `0`.

// Let's play with a String array 🎯
String[] arr1 = new String[10];
System.out.println(arr1[0]); // Output: null (NOT an exception)

// But... if you try to access arr1[10], boom 💥
// You'll get: ArrayIndexOutOfBoundsException

// TL;DR:
// - Arrays = same data type only
// - Stored in heap
// - Default values: 0 for int, null for String/objects
// - Use `new` to create arrays
// - Don’t go out of bounds, or Java will throw hands 🙃

