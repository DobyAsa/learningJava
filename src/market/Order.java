package market;

import java.util.Date;

public class Order {
    private String ID;
    private User user;
    private OrderItem[] items;
    private Date createTime;
    private String receiver;
    private String address;
    private String phone;
    private String status;
    public double computePrice(){
        double totalPrice = 0;
        if (items.length != 0){
            for (OrderItem item : items){
                totalPrice += item.computePrice();
            }
        }
        return totalPrice;
    }
}
