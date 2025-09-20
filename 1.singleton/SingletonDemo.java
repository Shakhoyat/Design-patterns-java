// SINGLETON: Only one instance exists
class MySingleton {
    private static MySingleton instance;

    private MySingleton() {
    } // Private constructor

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
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
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();

        System.out.println("Same instance? " + (s1 == s2)); // true
        s1.showMessage();
    }
}