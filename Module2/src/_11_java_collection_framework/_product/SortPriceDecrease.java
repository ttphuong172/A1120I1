package _11_java_collection_framework._product;

import java.util.Comparator;

public class SortPriceDecrease implements Comparator <Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice()-o1.getPrice();
    }
}
