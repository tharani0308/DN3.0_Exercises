public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Create a stock market instance
        StockMarket stockMarket = new StockMarket("AAPL", 150.00);

        // Create observer instances
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Update stock price and notify observers
        stockMarket.setStockPrice(155.00);

        // Update stock price and notify observers
        stockMarket.setStockPrice(160.00);
    }
}
