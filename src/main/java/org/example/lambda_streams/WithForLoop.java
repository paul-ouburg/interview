package org.example.lambda_streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WithForLoop {
    public static void main(String[] args) {

        List<String> items = List.of("appel", "banaan", "avocado", "kers", "ananas", "braam");
        List<String> filteredItems = filterAndSortItemsStartingWithA(items);

        System.out.println(filteredItems);
    }

    public static List<String> filterAndSortItemsStartingWithA(List<String> items) {
        List<String> filteredItems = new ArrayList<>();

        for (String item : items) {
            if (item.startsWith("a")) {
                filteredItems.add(item);
            }
        }
        Collections.sort(filteredItems);
        return filteredItems;
    }
}
