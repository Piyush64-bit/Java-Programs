//generics in java
package OOPs.Generics;

public class new {

public void PrintList(List <?> mylist){
 for(Object item : mylist){
    System.out.println(item);
 }
}

public double sumList(List <? extends Number> mylist){
  double sum = 0.0 ;
  for(Number num :mylist){
    sum+= num.doubleValue();
  }
  return sum;
}

public class One {
    public static void main(String[] args) {
        
    }
}
}
