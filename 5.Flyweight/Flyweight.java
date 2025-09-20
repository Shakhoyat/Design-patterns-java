// FLYWEIGHT: Shares common data to save memory

import java.util.HashMap;
import java.util.Map;

// Flyweight interface
interface Tree {
    void display(int x, int y);
}

// Concrete flyweight
class TreeType implements Tree {
    private String name;
    private String color;

    public TreeType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void display(int x, int y) {
        System.out.println(name + " tree (" + color + ") at (" + x + "," + y + ")");
    }
}

// Flyweight factory
class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color) {
        String key = name + color;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(name, color));
            System.out.println("Creating new tree type: " + key);
        }
        return treeTypes.get(key);
    }

    public static int getCreatedTreeTypes() {
        return treeTypes.size();
    }
}

// Usage
class FlyweightDemo {
    public static void main(String[] args) {
        // Create many trees but only few types
        Tree oak1 = TreeFactory.getTreeType("Oak", "Green");
        Tree oak2 = TreeFactory.getTreeType("Oak", "Green");
        Tree pine1 = TreeFactory.getTreeType("Pine", "Dark Green");

        oak1.display(10, 20);
        oak2.display(30, 40); // Reuses same oak type
        pine1.display(50, 60);

        System.out.println("Total tree types created: " + TreeFactory.getCreatedTreeTypes());
    }
}