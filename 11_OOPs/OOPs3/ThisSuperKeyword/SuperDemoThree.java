// class Payment{
//     double amount;
//     //making the constructor for the Payment class 
//     Payment(double amount){
//         this.amount = amount;
//         System.out.println("Payment created for the amount :"+ amount);
//     }
//     //creatinf the pay method
//     void pay(){
//         System.out.println("Processing generic payment...");
//     }
// };

// //Creating a child class now
// class CrediCardPayment extends Payment{
//     String cardNumber;

//     //creating the constructor for this
//     CrediCardPayment(double amount, String cardNumber){
//       super(amount);
//       this.cardNumber = cardNumber;
//     }
//     // overriding the pay method
//     @Override
//     void pay(){
//         super.pay();
//         System.out.println("Processing credit card payment with card :"+ cardNumber);
//     }
// }

// public class SuperDemoThree{
//     public static void main(String[] args) {
//         CrediCardPayment ccp = new CrediCardPayment(1000,"1234-5678-9876-5432");
//         ccp.pay();
//         Payment payone = new Payment(500);
//         payone.pay();
//     }
// }