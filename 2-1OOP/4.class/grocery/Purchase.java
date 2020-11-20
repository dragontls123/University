/**
 Class for the purchase of one kind of item, such as 3 oranges.
 Prices are set supermarket style, such as 5 for $1.25.
*/
public class Purchase
{
   private String name; //상품 이름 변수
   private int count; // 상품 갯수
   private double price; // 상품 갯수당 가격
   private int numberBought; // 구매 물건 갯수
   private double totalCost; // 총 가격
   
   public void setName(String newName)// 이름 입력
   {
      name = newName;
   }
   
   public void setPrice(int newCount, double newPrice)// 상품 갯수와 가격 입력
   {
      count = newCount;
      price = newPrice;
      
   }
   
   public void setNumberBought(int newNumberBought)// 구매 갯수 입력
   {
      numberBought = newNumberBought;
   }
   
   public void writeOutput()//출력함수
   {
      System.out.println("name: " + name);
      System.out.println(count +" for $ " + price);
      System.out.println("number: " + numberBought);
   }
   
   public double getTotalCost()//지불해야 할 가격 출력
   {
      return (double)((price/count) * numberBought); 
   }
   
   
   
   

}