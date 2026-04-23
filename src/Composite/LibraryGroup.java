package Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryGroup implements LibraryItem {

    private List<LibraryItem> items = new ArrayList<>();

    public LibraryGroup(LibraryItem... items) {
        this.items.addAll(Arrays.asList(items));
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    @Override
    public void checkout() {
        for (LibraryItem item : items) {
            item.checkout();
        }
    }

    @Override
    public void returnItem() {
        for (LibraryItem item : items) {
            item.returnItem();
        }
    }
}