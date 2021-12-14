import java.lang.Math;
public class Stocks
{
    // instance variables - replace the example below with your own
    static String symbol;
    static String name;
    static int share;
    static double randAmount;
    public Stocks(String stockSymbol, String stockName, int stockShares)
    {
        symbol = stockSymbol;
        name = stockName;
        share = stockShares;
        randAmount = Math.random() * 200.99;
    }
    public static void calculation() {
        System.out.println("Symbol: " + symbol + "| Company Name: " + name + "| Price: $" + randAmount + "| Total Shares: " + share + "| Total Value: $" + (randAmount * share));
        
        
    }
}
