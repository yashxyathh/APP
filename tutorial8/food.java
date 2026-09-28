public class food {
    private static class DeliveryTask extends Thread {
        private final String activity;

        DeliveryTask(String name, int priority, String activity) {
            super(name);
            this.activity = activity;
            setPriority(priority);
        }

        @Override
        public void run() {
            for (int step = 1; step <= 3; step++) {
                System.out.printf("Name: %s | Priority: %d | Activity: %s (step %d)%n",
                        getName(), getPriority(), activity, step);
                try {
                    Thread.sleep(250);
                } catch (InterruptedException exception) {
                    interrupt();
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread orderProcessing = new DeliveryTask("OrderProcessing", Thread.MAX_PRIORITY,
                "processing customer orders");
        Thread deliveryTracking = new DeliveryTask("DeliveryTracking", Thread.NORM_PRIORITY,
                "tracking delivery location");
        Thread notification = new DeliveryTask("Notification", Thread.MIN_PRIORITY,
                "sending order-status notification");

        orderProcessing.start();
        deliveryTracking.start();
        notification.start();

        orderProcessing.join();
        deliveryTracking.join();
        notification.join();
        System.out.println("All delivery tasks completed.");
    }
}