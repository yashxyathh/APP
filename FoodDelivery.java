    class OrderTask extends Thread {
        private String orderId;
        private String task;
        private int time;

        OrderTask(String orderId, String task, int time) {
            this.orderId = orderId;
            this.task = task;
            this.time = time;
        }
        @Override
        public void run() {
            System.out.println(orderId + " - " + task + " - Started");

            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println(orderId + " - " + task + " - Completed");
        }
    }

    public class FoodDelivery {
        public static void main(String[] args) {

            String orderId = "ORD1001";

            OrderTask restaurant =new OrderTask(orderId, "Restaurant Confirmation", 500);
            OrderTask payment =new OrderTask(orderId, "Payment Verification", 300);
            OrderTask delivery =new OrderTask(orderId, "Delivery Assignment", 700);

            restaurant.start();
            payment.start();
            delivery.start();

            try {
                restaurant.join();
                payment.join();
                delivery.join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Order Processing Completed");
        }
    }