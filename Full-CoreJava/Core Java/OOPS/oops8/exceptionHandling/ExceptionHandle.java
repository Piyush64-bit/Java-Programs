package OOPS.oops8.exceptionHandling;

public class ExceptionHandle {
    // Error is non recoverable, program cant handle an error 
    // Exception is something that prevents the normal flow of the program - like /0 or something
    //Java there's a class called (Throwable) which handles all the expcetions >> throwable has 2 subcategories one is expcetion and other is error
    // Exeception category is further of 2 types - checked and unchecked 
    //Checked exception happens at the compile time - try to opening a file which does not exist thats an example
    // Unchecked expetion are not detected by the compiler, for ex- the arithmatic exception (/0)
    //in try-catch it simply means try all these things, and if anything happens bad, then exception is there 
    // finally keyword means ,this will happen no matter what
    // in the divide method, we used the inbuilt arithmatic expression that shows 
    //you can be using the multiple expressions below - like arithmatic , normal exception but the more stricter ones have to be called at the top not at the bottom

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        //fancy way to write
        // int c = a/b;
        // more prettier apporach is  using the try catch block
        try{
            // int c = a/b;
            divide(a,b);
            // created the myexception file and using it here , myException constructor calls the super that itself calls the main constructor
            String name = "Mukesh";
            if(name.equals("Laksh")){
             throw new MyException("name is Laksh yadav");
            }
           

        }
        catch(MatchException e){
            System.out.println(e.getMessage());
        }
         catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("normal exception");
        }
        
        finally{
            System.out.println("It will always be exceuted");
        }

       

    }

     // creating a divide method 
    static int divide (int a ,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please do not divide by zero");
        } 
        return a/b;
    }
}
