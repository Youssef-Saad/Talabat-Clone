package talabat;

public class orderHistory {

    String Date;
    String Name;
    int Quantity;
    double TotalPrice;

    public orderHistory(String Date, String Name, int Quantity, double TotalPrice) {
        this.Date = Date;
        this.Name = Name;
        this.Quantity = Quantity;
        this.TotalPrice = TotalPrice;
    }

    public void displayHistory() {
        System.out.println("Date: " + Date);
        System.out.println("Name: " + Name);
        System.out.println("Quantity: " + Quantity);
        System.out.println("Total Price" + TotalPrice);
        System.out.println("---------------------------");
        System.out.println("---------------------------");
    }
}
