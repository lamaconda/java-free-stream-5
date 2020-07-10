package by.bntu.fitr.poisit.lytkina;

public class Order {
    public String ownerName;
    public String productName;
    public int quantity;
    public boolean isDelivered;

    public void deliver(){
        System.out.println("delivering...");
    }

}
