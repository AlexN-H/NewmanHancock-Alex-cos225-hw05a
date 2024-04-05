public class CustomerOrder {
    public String name;
    public String date;
    public int quantity;

    public CustomerOrder(){
        this.name = null;
        this.date = null;
        this.quantity = 0;
    }
    public CustomerOrder(String name, String date, int quantity){
        this.name = name;
        this.date = date;
        this.quantity = quantity;
    }

    public void shipProduct(){
        if(quantity > 0 ){
            quantity --;
        }else{
            quantity = 0;
        }
    }

    public int getQuantity(){
        return quantity;
    }
}