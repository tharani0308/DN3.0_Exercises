public class MobileApp implements Observer {
    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("Mobile App Notification: Stock " + stockName + " price updated to $" + stockPrice);
    }
}
