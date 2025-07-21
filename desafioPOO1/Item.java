package desafioPOO1;

public class Item {
    String name;
    int quantitiy;
    double price;

    public Item(String name, int quantitiy, double price) {
        this.name = name;
        this.quantitiy = quantitiy;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item: " + name + ", Qtd: " + quantitiy + ", Preço: " + price;
    }

}
