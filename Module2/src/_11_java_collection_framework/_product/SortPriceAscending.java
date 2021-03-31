package _11_java_collection_framework._product;

import java.util.Comparator;

public class SortPriceAscending implements Comparator <Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice()-o2.getPrice();
    }
}
