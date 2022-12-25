public class Waiters implements Runnable {
    // atribute
    private final int order_Qty;
    private final int customer_ID;
    static int foodPrice = 25000;

    // constructor
    public Waiters(int order_Qty, int customer_ID){
        this.order_Qty = order_Qty;
        this.customer_ID = customer_ID;
    }

    @Override
    public void run() {
        // isi dgn perulangan  while class ini n call getFood()
        // buat try-catch dgn ngisi Thread.sleep >> default erorr message
        while(true){
            makeFood();
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        } 
    }
    public void orderInfo(){
System.out.println("==========================================================");
        
        System.out.println("Customer ID     : "+this.customer_ID);
        System.out.println("Number of food  : "+this.order_Qty);
        System.out.println("Total Price     : "+ this.order_Qty*foodPrice);

System.out.println("=========================================================="); 
    }

    // method void makeFood() dgn logika Threading dgn sync(lock)
    public void makeFood(){
        synchronized(Restaurant.getLock()){
            System.out.println("Waiter  : Food is ready to delivery");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickup(false);

            // check if value of get makeFood form Restaurant class is equal to orderQty
            // if same, call method orderInfo() to print order info and exit the program
            if(Restaurant.getFoodNumber() == this.order_Qty + 1){
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter  : Tell the restaurant to make another food\n");

        }
    }
}