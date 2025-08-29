class iOS {
    public void startApp() {
        System.out.println("iOS: Starting the app...");
    }
    public void increaseVolume() {
        System.out.println("iOS: Increasing the volume...");
    }
    public void shutdown() {
        System.out.println("iOS: Shutting down...");
    }
    public static void main(String[] args) {
        iOS myDevice = new iOS();
        myDevice.startApp();
        myDevice.increaseVolume();
        myDevice.shutdown();
    }
}
