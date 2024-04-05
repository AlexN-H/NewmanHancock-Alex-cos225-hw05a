public class OrderQueue {
    private LinkedQueue<CustomerOrder> orderQueue;
    public int stock;
    public int size; 

    public OrderQueue(){
        this.orderQueue = new LinkedQueue<>();
        this.stock = 0;
    }

    public OrderQueue(int intialStock){
        this.orderQueue = new LinkedQueue<>();
        this.stock = intialStock;
    }

    public void addOrder(String name, String date, int quantity){
        CustomerOrder order = new CustomerOrder( name, date, quantity);
        orderQueue.enqueue(order);
    }
    public void addStock(int newstock){
        stock += newstock;
    }
    public void fulfillOrder(){
        if(!orderQueue.isEmpty() && stock > 0){
            CustomerOrder customerOrder = orderQueue.getFront();
            customerOrder.shipProduct();
            stock--;
            if(customerOrder.getQuantity() == 0){
                orderQueue.dequeue();
            }
        }
    }
    public void sellStock(){
        while(!orderQueue.isEmpty() && stock > 0){
            fulfillOrder();
        }
    }
    public String toString(){
        if(!orderQueue.isEmpty()){
            return "" + orderQueue.getFront().getQuantity();
         }else{
            return "order queue is empty";
        }
    }
}
