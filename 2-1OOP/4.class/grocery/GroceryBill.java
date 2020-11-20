/**
 Uses Purchase class, Display 4.11, to calculate the cost of several items
    priced at "so many for so much," e.g., 5 for a dollar.

 Note: this program uses type double for money values and
 */
public class GroceryBill
{
    public static void main(String[] args)
    {
        double totalCost = 0;
        Purchase item = new Purchase();

        item.setName("Oranges");
        item.setPrice(10, 2.99);
        item.setNumberBought(24);
        item.writeOutput();
        System.out.println("Subtotal: $" + item.getTotalCost());
        totalCost = totalCost + item.getTotalCost();

        item.setName("Eggs");
        item.setPrice(12, 1.69);
        item.setNumberBought(36);
        item.writeOutput();
        System.out.println("Subtotal: $" + item.getTotalCost());
        totalCost = totalCost + item.getTotalCost();

        item.setName("Apples");
        item.setPrice(3, 1.00);
        item.setNumberBought(20);
        item.writeOutput();
        System.out.println("Subtotal: $" + item.getTotalCost());
        totalCost = totalCost + item.getTotalCost();

        item.setName("Watermelons");
        item.setPrice(1, 4.39);
        item.setNumberBought(2);
        item.writeOutput();
        System.out.println("Subtotal: $" + item.getTotalCost());
        totalCost = totalCost + item.getTotalCost();

        item.setName("Bagels");
        item.setPrice(6, 3.50);
        item.setNumberBought(12);
        item.writeOutput();
        System.out.println("Subtotal: $" + item.getTotalCost());
        totalCost = totalCost + item.getTotalCost();

        System.out.println();
        System.out.println("Total: $" + totalCost);
    }
}