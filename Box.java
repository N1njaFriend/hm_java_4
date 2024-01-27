import java.util.List;

public class Box<T extends Fruit> {
    private List<T> itemsList;

    public Box(List<T> itemsList) {
        this.itemsList = itemsList;
    }

    public void add(T item) {
        itemsList.add(item);
    }

    public List<T> getItemsList() {
        return itemsList;
    }
}