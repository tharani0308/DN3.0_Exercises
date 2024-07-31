public class WebApp implements Observer {
    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Web App Notification: Stock " + stockName + " price updated to $" + stockPrice);
    }
}
