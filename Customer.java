/**
 * Class Customer with attribute customer name(customerName), items purchased(itemsPurchased) and total cost of items purchased(itemsTotalCost).
 * 
 * @author Jayesh Parab 
 * @version V1 (23/08/2015)
 */
public class Customer
{
 /**
  * Attributes of class Customer
  */
  private String customerName;
  private String itemsPurchased;
  private int itemsTotalCost;
  
  /**
   * Default Constructor for objects of class Customer
   */
  public Customer()
  {
      customerName = "";
      itemsPurchased = "";
      itemsTotalCost = 0;
  }
  
  /**
   * Parameterized Constructor for objects of class Customer
   */
  public Customer(String newCustomerName, String newItemsPurchased, int newItemsTotalCost)
  {
      customerName = newCustomerName;
      itemsPurchased = newItemsPurchased;
      itemsTotalCost = newItemsTotalCost; 
  }
  
  /**
   * Display Method of  Class Customer
   */
  public void displayInformation()
  {
      System.out.println("Customer Name: " + customerName);
      System.out.println("Items Purchased: " + itemsPurchased);
      System.out.println("Total Items Cost: " + itemsTotalCost);
  }
  
  /**
   * Method used to get customerName through parameter (Attribute of class Customer of type String)
   */
  public String getCustomerName()
  {
      return customerName;
  }
  
  /**
   * Method used to get itemPurchaseed through parameter (Attribute of class Customer of type String)
   */
  public String getItemsPurchased()
  {
      return itemsPurchased;
  }
  
  /**
   * Method used to get itemTotalCost through parameter (Attribute of class Customer of type int)
   */
  public int getItemsTotalCost()
  {
      return itemsTotalCost;
  }
  
  /**
   * Method used to set customerName (Attribute of class Customer of type String)
   */
  public void setCustomerName(String newCustomerName)
  {
      customerName = newCustomerName;
  }
   
  /**
   * Method used to set itemsPurchased (Attribute of class Customer of type String)
   */
  public void setItemsPurchased(String newItemsPurchased)
  {
      if (itemsPurchased.length() == 0)
          itemsPurchased = newItemsPurchased;
      else
          itemsPurchased = itemsPurchased + "," + newItemsPurchased;
  }
  
  /**
   * Method used to set itemsTotalCost (Attribute of class Customer of type int)
   */
  public void setItemsTotalCost(int newItemsTotalCost)
  {
      itemsTotalCost = itemsTotalCost + newItemsTotalCost;
  }
      
}
