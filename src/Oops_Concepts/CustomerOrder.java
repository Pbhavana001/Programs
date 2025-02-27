package Oops_Concepts;

public class CustomerOrder {
    private int oderId;
    private String customerName;
    private int orderAmount;
    public CustomerOrder(int Id , String name ,int Amount){
        this.oderId=Id;
        this.customerName=name;
        this.orderAmount=Amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getOderId() {
        return oderId;
    }

    public int getOrderAmount() {
        return orderAmount;
    }
    public void details(){
        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer OrderID :" + oderId);
        System.out.println("Customer requested Amount : " + orderAmount);
    }
    public void totalAmount(){
        System.out.println("Total amount with taxes : " + orderAmount+5);
    }
}
class OnlineOrder extends CustomerOrder{
    private String deliveryAddress;
    private int trackingNumber;
    public OnlineOrder(int Id , String name ,int Amount,String Address,int number){
        super(Id,name,Amount);
    }
    public int getTrackingNumber() {
        return trackingNumber;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public void details(){
        super.details();
        System.out.println("Tracking Number : " + trackingNumber);
        System.out.println("Deliver Address : " + deliveryAddress);
    }
}
class CustomerMain{
    public void main(String[] args){
CustomerOrder order=new CustomerOrder(1,"Bhavana",2000);
OnlineOrder online=new OnlineOrder(2,"Praneesh",1000,"8300W 124th overlandpark kansas",5);
        System.out.println("Customer Customer");
        order.details();
        order.totalAmount();
        System.out.println("----------------------------");
        System.out.println(" ");
        System.out.println("Online Customer");
        online.details();

    }
        }
