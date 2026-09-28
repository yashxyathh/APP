public class hospital {
    private static class HospitalTask extends Thread {
        private final String activity;

        HospitalTask(String name, int priority, String activity) {
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
                    Thread.sleep(300);
                } catch (InterruptedException exception) {
                    interrupt();
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread emergencyAlert = new HospitalTask("EmergencyAlert", Thread.MAX_PRIORITY,
                "checking critical patient alerts");
        Thread vitalMonitor = new HospitalTask("VitalMonitor", Thread.NORM_PRIORITY,
                "checking vital signs");
        Thread reportGenerator = new HospitalTask("ReportGenerator", Thread.MIN_PRIORITY,
                "preparing routine reports");

        emergencyAlert.start();
        vitalMonitor.start();
        reportGenerator.start();

        emergencyAlert.join();
        vitalMonitor.join();
        reportGenerator.join();
        System.out.println("Hospital monitoring tasks completed.");
    }
}