package _11_java_collection_framework._product;

import java.util.Comparator;

public class SortPriceName implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() - o2.getPrice() == 0) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return o1.getPrice() - o2.getPrice();
        }
    }
}
