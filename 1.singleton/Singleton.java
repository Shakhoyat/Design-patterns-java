// SINGLETON: Only one instance exists
class Singleton {
    private static Singleton instance;

    private Singleton() {
    } // Private constructor

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

// Usage
class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Same instance? " + (s1 == s2)); // true
        s1.showMessage();
    }
}