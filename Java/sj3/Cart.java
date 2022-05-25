import java.util.LinkedList;

public class Cart {
    String name;
    LinkedList<Item> itemArray = new LinkedList<Item>();

    public Cart(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCart(String itemName, int itemPrice, int itemCount) {
        boolean notIn = true;

        for (int i = 0; i < itemArray.size(); i++) {
            if (itemArray.get(i).getName().equals(itemName)) {
                itemArray.get(i).setCount(itemArray.get(i).getCount() + itemCount);
                notIn = false;
            }
        }

        if (notIn)
            itemArray.add(new Item(itemName, itemPrice, itemCount));
    }

    public void updateCart(String itemName, int itemCount) {
        for (int i = 0; i < itemArray.size(); i++) {
            if (itemArray.get(i).getName().equals(itemName)) {
                itemArray.get(i).setCount(itemArray.get(i).getCount() + itemCount);
            }
        }
    }

    public void removeCart(String itemName) {
        for (int i = 0; i < itemArray.size(); i++) {
            if (itemArray.get(i).getName().equals(itemName)) {
                itemArray.remove(i);
            }
        }
    }

    public void emptyCart() {
        itemArray.clear();
    }

    public void printItems() {
        System.out.println("--------------------");
        if (itemArray.isEmpty())
            System.out.println("상품이 존재하지 않습니다.");
        for (int i = 0; i < itemArray.size(); i++) {
            System.out.println( "\n" +
                "\n상품 이름 : " + itemArray.get(i).getName() + 
                "\n상품 가격 : " + itemArray.get(i).getPrice() + 
                "\n상품 수량 : " + itemArray.get(i).getCount());
        }
    }
}
