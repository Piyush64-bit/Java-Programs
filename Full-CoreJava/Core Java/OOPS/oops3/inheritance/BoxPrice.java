package OOPS.oops3.inheritance;

public class BoxPrice extends BoxWeight {
    double cost;

    BoxPrice(){
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost){
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost){
        //this method is created later on and no side is defined so make a constructor at the BoxWeight and define the side over there
        super(side, weight);
        this.cost = cost;
    }

    public static void main(String[] args) {
        
    }
}
