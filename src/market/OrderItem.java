package market;

public class OrderItem {
    private Product product;
    private int quantity;
    public OrderItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }
    public double computePrice(){
        return this.quantity * this.product.getPrice();
    }
}
