public class UsePen {
  public static void main(String[] args){

     Pen pen1 = new Pen("Renolds", "blue", 45, true);
     System.out.println(pen1);
}
}




class Pen {
  private String brand;
  private String color;
  private int price;
  private boolean isGelPen;
    


   public Pen(String brand, String color, int price, boolean isGelPen){
      this.brand = brand;
      this.color = color;
      this.price = price;
      this.isGelPen = isGelPen;
   }
   
   public void setBrand(String brand){
     this.brand = brand;
   }
   public void setColor(String color){
      this.color = color;
  }
  public void setPrice(int price){
    this.price  =  price;
  }
  public void setIsGelPen(boolean isGelPen){
    this.isGelPen = isGelPen;
  }


  public String getBrand(){
     return brand;
  }
   public String getColor(){
     return  color;
  }
  public int getPrice(){ 
     return price;
  }
  public boolean getIsGelPen(){
    return isGelPen;
 }
  public String toString(){
    return "Brand= " + brand + ", Color= " + color + ", Price= " + price + ", IsGelPen= " + isGelPen ;
}
}


