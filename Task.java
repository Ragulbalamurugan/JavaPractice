public class Task {

public static void main(String[] args){

    Pen pen  = new Pen();
       pen.brand = "reyolds";
       pen.color = "white";
       pen.price = 20;
       pen.isBluePen = true;

    System.out.println(pen);


  }
}


 class Pen {
    String brand ;
    int price;
    String color;
    boolean isBluePen ;

public String toString(){
return "Brand= " + brand + "; Color= " + color + "; Price= " + price;

  }
}

