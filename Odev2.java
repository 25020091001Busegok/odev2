package odev2;

public class Odev2 {

    public static void main(String[] args) {

        Stock stock1 = new Stock("ORCL", "Oracle Corporation");

        stock1.previousClosingPrice = 34.5;
        stock1.currentPrice = 34.35;

        System.out.println("Symbol: " + stock1.symbol);
        System.out.println("Name: " + stock1.name);
        System.out.println("Previous Closing Price: " + stock1.previousClosingPrice);
        System.out.println("Current Price: " + stock1.currentPrice);
        System.out.println("Change Percent: " + stock1.getChangePercent() + "%");
    }
}
