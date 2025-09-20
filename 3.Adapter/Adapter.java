// ADAPTER: Makes incompatible interfaces work together

// Old interface (what we have)
class OldPrinter {
    public void printOld(String text) {
        System.out.println("Old: " + text);
    }
}

// New interface (what we want)
interface NewPrinter {
    void printNew(String text);
}

// Adapter (makes old work with new)
class PrinterAdapter implements NewPrinter {
    private OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    public void printNew(String text) {
        oldPrinter.printOld(text); // Adapts the call
    }
}

// Usage
class AdapterDemo {
    public static void main(String[] args) {
        OldPrinter oldPrinter = new OldPrinter();
        NewPrinter adapter = new PrinterAdapter(oldPrinter);

        adapter.printNew("Hello World!"); // Uses old printer via adapter
    }
}