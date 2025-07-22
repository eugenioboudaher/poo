package desafioPOO1;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private static int nextID = 0;
    Cliente cliente;
    int id;

    List<Item> items = new ArrayList<>();

    public Compra(Cliente cliente) {
        this.id = nextID;
        nextID++;
        this.cliente = cliente;
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item " + item.name + " adcicionado com sucesso");
    }

    @Override
    public String toString() {
        return "Compra ID: " + id + ", Cliente: " + cliente.name + ", Itens: " + items.size();
    }

    public double totalPurchase() {
        double total = 0;

        for (Item i : items) {
            total += i.price * i.quantitiy;
        }

        return total;
    }
}
