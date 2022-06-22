package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    static Map<Furniture, Integer> map = new HashMap<>();

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        map.put(Furniture.CHAIR, 0);
        map.put(Furniture.TABLE, 0);
        map.put(Furniture.COUCH, 0);
        
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        if (map.containsKey(type)) {
            map.put(type, map.get(type) + furnitureCount);
        } else {
            map.put(type, furnitureCount);
        }
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        HashMap<Furniture, Integer> ordered = new HashMap<>();
        for (Furniture type : map.keySet())  {
            if (map.get(type) > 0) {
                ordered.put(type, map.get(type));
            }
        }
        return ordered;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        float sum = 0.0f;
        for (Furniture type : map.keySet())  {
            sum = sum + (map.get(type) * type.cost());
        }
        return sum;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        return map.get(type);
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        System.out.println(map.get(type));
        return map.get(type) * type.cost();
    }

    public int getTotalOrderQuantity() {
        int sum = 0;
        for (Furniture type : map.keySet())  {
            sum = sum + map.get(type);
        }
        return sum;
    }
}