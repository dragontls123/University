/**
 Class for the purchase of one kind of item, such as 3 oranges.
 Prices are set supermarket style, such as 5 for $1.25.
*/
public class Purchase
{
   private String name; //��ǰ �̸� ����
   private int count; // ��ǰ ����
   private double price; // ��ǰ ������ ����
   private int numberBought; // ���� ���� ����
   private double totalCost; // �� ����
   
   public void setName(String newName)// �̸� �Է�
   {
      name = newName;
   }
   
   public void setPrice(int newCount, double newPrice)// ��ǰ ������ ���� �Է�
   {
      count = newCount;
      price = newPrice;
      
   }
   
   public void setNumberBought(int newNumberBought)// ���� ���� �Է�
   {
      numberBought = newNumberBought;
   }
   
   public void writeOutput()//����Լ�
   {
      System.out.println("name: " + name);
      System.out.println(count +" for $ " + price);
      System.out.println("number: " + numberBought);
   }
   
   public double getTotalCost()//�����ؾ� �� ���� ���
   {
      return (double)((price/count) * numberBought); 
   }
   
   
   
   

}