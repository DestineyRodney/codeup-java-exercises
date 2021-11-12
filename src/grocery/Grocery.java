package grocery;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class Grocery {

        public Map<Integer, String> groceryCategories;

    public Grocery() {
        this.groceryCategories = new HashMap<>(){{
            put(1, "Cereal");
            put(2, "Bakery");
            put(3, "Fruits");
            put(4, "Vegetables");
            put(5, "Meat");
        }};

        System.out.println(Arrays.asList(groceryCategories));
    }

    public static void main(String[] args) {

    }
}
