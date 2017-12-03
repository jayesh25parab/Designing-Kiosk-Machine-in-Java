
/**
 *Class Kiosk having attributes Customer object, LuckyDipGenerator object and remaining balance of Customer (remainingBalance)
 * 
 * @author Jayesh Parab 
 * @version V1 23/08/2015
 */
import java.util.Scanner;
public class Kiosk
{
    /**
     * Attributes of class Kiosk
     */
    private Customer newCustomer;
    private LuckyDipGenerator randomNumber;
    private int remainingBalance;
   
    /**
     * Default Constructor for objects of class Kiosk
     */
    public Kiosk()
    {
        newCustomer = new Customer();
        randomNumber = new LuckyDipGenerator();
        remainingBalance = 0;
    }
    
    /**
     * Method used to buy more credits
     */
    public void buyCredit()
    {
        if (newCustomer.getCustomerName().length() == 0)
             System.out.println("Please create Order first");
        else
        {
             Scanner console = new Scanner (System.in);
             int newCredit = 0;
             System.out.print("Buy some more credit: $");
             newCredit = console.nextInt();
             remainingBalance = remainingBalance + newCredit;
             System.out.println("New Balance is : $" + remainingBalance);
        }
    }
    
    /**
     * Method used to create a new order
     */
    public void createOrder()
    {
        Scanner console = new Scanner (System.in);
        String newName = "";
        System.out.print("Enter your name please:");
        newName = console.nextLine();
        if (newName.length() == 0 || newName.trim().equals(""))
            System.out.println("Please enter valid name. Customer name should not be null or empty");
        else
        {
            newCustomer.setCustomerName(newName);
            System.out.print("Buy some credits please: $");
            remainingBalance = console.nextInt(); 
            if (remainingBalance < 0)
                System.out.println("Credit cannot be less than zero"); 
        }
    }
    
    /**
     * Method used to collect an order
     */
    public void collectOrder()
    {
        if (newCustomer.getCustomerName().length() == 0)
            System.out.println("Please create Order first");
        else
        {
            System.out.println("Customer " + newCustomer.getCustomerName() + " has purchased these items:");
            System.out.println(newCustomer.getItemsPurchased());
            System.out.println("worth a total of $" + newCustomer.getItemsTotalCost());
            System.out.println("Credit Balance: " + remainingBalance);
            System.out.println("Thank you for shopping with us. Please collect your goods (and your balance) at the front desk.");
            resetOrder();
        }
    }
    
    /**
     * Method used to display Sub Menu of Items that can be purchased
     */
    public void displayItemMenu()
    {
        System.out.println("These are the items available for sale today:");
        System.out.println("---------------------------------------------");
        System.out.println("(1)PEN, worth $10");
        System.out.println("(2)BOOK, worth $20");
        System.out.println("(3)DVD, worth $30");
        System.out.println("(4)MOUSE, worth $40");
        System.out.println("(5)KEYBOARD, worth $50");
        System.out.println("(6)Let me pick a random item for you!!!");
        System.out.print("Pick a number between 1-6 :");
    }
    
    /**
     * Method used to display Main Menu
     */
    public void displayMenu()
    {
        System.out.println("Welcome to My Fantastic Kiosk");
        System.out.println("=============================");
        System.out.println("(1)Create A New Order");
        System.out.println("(2)Buy More Credit");
        System.out.println("(3)Purchase An Item");
        System.out.println("(4)What I Have Ordered So Far");
        System.out.println("(5)Collect My Order");
        System.out.println("(6)Display Help");
        System.out.println("(7)Leave Kiosk");
        System.out.print("Choose an option :");
    }
    
    /**
     * Method used to get an order
     */
    public void getOrder()
    {
        if (newCustomer.getCustomerName().length() == 0)
            System.out.println("Please create Order first");
        else
        {
            System.out.println("Customer " + newCustomer.getCustomerName() + " has purchased these items:");
            System.out.println(newCustomer.getItemsPurchased());
            System.out.println("worth a total of $" + newCustomer.getItemsTotalCost());
            System.out.println("Credit Balance: " + remainingBalance);
        }
    }
    
    /**
     * Method used to help customer regarding how Kiosk work
     */
    public void provideCustomerHelp()
    {
        System.out.println("Please create a order first other options will not work until order is created.");
        System.out.println("While creating order enter name and amount to be created.");
        System.out.println("After creating order you can buy more credit (Option 2), purchase item (Option 3), know what you have ordered (Option 4),");
        System.out.println("collect order (Option 5), ask help or leave kiosk (Option 6).");
        System.out.println("While purchasing new item you can choose options from 1 to 6."); 
    }

    /**
     * Method used to choose valid item from item list
     */
    public void purchaseCorrectItem (String itemName, int itemCost)
    {
         int newItemCost = itemCost;
         String newItemPurchased = itemName;
         if (remainingBalance >= itemCost)
         {
             System.out.println("You have bought a " + newItemPurchased + ", worth $" + newItemCost);
             remainingBalance = remainingBalance - newItemCost;
             System.out.println("Your new credit balance is now $" + remainingBalance);
             newCustomer.setItemsPurchased(newItemPurchased);
             newCustomer.setItemsTotalCost(newItemCost);
         }
         else
         {
             System.out.println("Sorry, you do not have enough credit to purchase this item!");
             System.out.println("Credit Balance: $" + remainingBalance + ", " + "Item Cost: $" + newItemCost);
         }
    }
    
    /**
     * Method used to purchase an item
     */
    public void purchaseItem()
    {
        if (newCustomer.getCustomerName().length() == 0)
            System.out.println("Please create Order first");
        else
        {
            Scanner console = new Scanner (System.in);
            int choiceNumber = 0;
            displayItemMenu();
            choiceNumber = console.nextInt();
            if (choiceNumber < 1 || choiceNumber > 6)
                System.out.println("Error: your choice must be between 1-6");
            switch (choiceNumber)
            {
                case 1 :
                        purchaseCorrectItem("PEN", 10);
                        break;
                case 2 :
                        purchaseCorrectItem("BOOK", 20);
                        break;
                case 3 :
                        purchaseCorrectItem("DVD", 30);
                        break;
                case 4 :
                        purchaseCorrectItem("MOUSE", 40);
                        break;
                case 5 :
                        purchaseCorrectItem("KEYBOARD", 50);
                        break;
                case 6 :
                        randomNumber.setLuckyNumber(5);
                        switch (randomNumber.getLuckyNumber())
                        {
                            case 1 :
                                    purchaseCorrectItem("PEN", 10);
                                    break;
                            case 2 :
                                    purchaseCorrectItem("BOOK", 20);
                                    break;
                            case 3 :
                                    purchaseCorrectItem("DVD", 30);
                                    break;
                            case 4 :
                                    purchaseCorrectItem("MOUSE", 40);
                                    break;
                            case 5 :
                                    purchaseCorrectItem("KEYBOARD", 50);
                                    break;
                        }
            }
        }
    }
    
    /**
     * Method used to purchase an item
     */
    public void resetOrder()
    {
       String newName = "";
       remainingBalance = 0;
       newCustomer.setCustomerName(newName);
    }
                     
    /**
     * Main Method to execute Kiosk
     */
    public void runKiosk()
    {
        int customerOption = 0;
        Scanner console = new Scanner(System.in);
        boolean notExitMenu = true;
        
        while (notExitMenu == true)
        {
            displayMenu ();
            customerOption = console.nextInt();
            if (customerOption < 1 || customerOption > 7)
                System.out.println("Choose a number between 1 and 7 !!");
            if (customerOption == 7)
                notExitMenu = false;
            switch (customerOption) 
            {
                case 1 :
                        createOrder();
                        break;
                case 2 :
                        buyCredit();
                        break;
                case 3 :
                        purchaseItem();
                        break;
                case 4 :
                        getOrder();
                        break;
                case 5 :
                        collectOrder();
                        break;
                case 6 : 
                        provideCustomerHelp();
                        break;
            }
        }
        
    }    
}
