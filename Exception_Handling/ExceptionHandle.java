package Exception_Handling;

public class ExceptionHandle {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        // fancy approch
        // int c = a/b;

        // optimize approch -> using tru-catch

        try{
            divide (a, b);
            String name = "Mukesh";
            if(name.equals("Piyush")) {
                throw new MyException("name is Piyush");
            }
        }

        catch(MyException e){
            System.out.println(e.getMessage);
        }
        catch(ArithmaticException e) {
            System.out.println(e.getMessage);
        }
        catch(Exception e) {
            System.out.println("Normal Exception");
        }
        final {
            System.out.println("it will always be executed");
        }

        // creating a divide method

        Static int divide (int a, int b) throws ArithmeticException {
            if(b == 0) {
                throw new ArithmeticException ("please do not divide by zero");
            }
            return a/b;
        }
    }
}

// error is non recoverable in java, program cant handle an error.
// exception is somthing that prevents the normal flow of the program - like I/O or somthing.
// In Java, there's a class called "throwable" which is the parent class of all exceptions and errors.

// Exceptions ---> category ----> Error
// Checked || Unchecked Exceptions

// Checked Exceptions: 1) Happens at compile time
// 2) for ex- try to open an file which does not exist.
// 3) for this, we use tyr-catch block, to try all the things, and if something bad happens, we catch is there.
// 4) In the divide method, we used inbuilt "Arithmatic Exception"
// 5) These exceptions are not defaulted by the compiler, for ex- arithmatic, normal exceptions, etc. But the more strictly ones have to be called at the top and not at the bottom.
// 6) created, the myException file, and using it here, my Exception considers calls the super that itself calls the main constructor.
