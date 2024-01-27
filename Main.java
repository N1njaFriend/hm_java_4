import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        printBox(getFruitBox());
    }

    public static Box<Fruit> getFruitBox() {
        Box<Fruit> fruitBox = new Box<>(new ArrayList<>());
        fruitBox.add(new Apple());
        fruitBox.add(new Orange());
        return fruitBox;
    }

    public static void printBox(Box<? extends Fruit> box) {
        for (Fruit fruit : box.getItemsList()) {
            System.out.println(fruit);
        }
    }
}