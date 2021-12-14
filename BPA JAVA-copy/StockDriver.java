import java.util.Scanner;

public class StockDriver
{
    public static Scanner sc = new Scanner(System.in);
    static int howMany = 0;
    public static Stocks[] stocks;
    
    public static void main(){
        System.out.println("How many stocks do you want to create?");
        try {howMany = sc.nextInt();} catch (Exception e) {System.out.println("That is an improper value. The program has been stopped.");}
        System.out.println();
        System.out.println("You entered: " + howMany);
        System.out.println();
        System.out.println("You will now enter in the company symbol, name and their share quantitiy. The price wil be randomly generated.");
        System.out.println();
        //intitializing
        stocks = new Stocks[howMany];
        for (int i = 0; i < howMany; i++){
            System.out.println("Please enter the three character symbol:");
            String stockSymbol = "";
            sc.nextLine();
            stockSymbol = sc.nextLine();
            if (stockSymbol.length() != 3){
            System.out.println("That is an improper value. The program has been stopped.");
            System.exit(0);
        }
            System.out.println();
            System.out.println("Please enter the company name:");
            String name = "";
            try {name = sc.nextLine();} catch (Exception e) {System.out.println("That is an improper value. The program has been stopped.");}
            System.out.println("Please enter the total shares:");
            int shares = 0;
            try {shares = sc.nextInt();} catch (Exception e) {System.out.println("That is an improper value. The program has been stopped.");}
            
            Stocks newStock = new Stocks(stockSymbol, name, shares); 
            stocks[i] = newStock;
            System.out.println();
        
        
        }
        System.out.println("Listed below is your current portfolio:");
        for (int i = 0; i < howMany; i++) {
            stocks[i].calculation();
            
        }
    }
}
