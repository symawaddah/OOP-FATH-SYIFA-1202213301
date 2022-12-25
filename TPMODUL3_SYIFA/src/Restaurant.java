public class Restaurant implements Runnable {

    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    @Override
    public void run() {
        while (true){
            makeFood();
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        } 
    }

    public void setWaitingForPickup(boolean waitingForPickup){
        this.waitingForPickup = waitingForPickup;
    }

    public static int getFoodNumber(){
        return foodNumber;
    }

    private void makeFood() {
        synchronized(Restaurant.lock){
            // check if waitingForPickup is true so call method lock.wait() to lock for thread
            // so process not to continue before waiter deliver food
            if (this.waitingForPickup){
                try{
                    System.out.println("Restaurant : Waiting for the waiter to delivery the food");
                    Restaurant.lock.wait(); 
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

            }
            // to inform another thread about another food is ready to deliver
            waitingForPickup = true;
            System.out.println("Restaurant : Making food number "+ foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant : Telling the waiter to get the food\n");
        }
    }

    public static Object getLock(){
        return lock;
    }
}