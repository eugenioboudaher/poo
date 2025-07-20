package compras;

import java.util.ArrayList;
import java.util.List;

public class Compras {
    String cliente;
    List<Item> lista = new ArrayList<>();

    public void addItem(Item item) {
        this.lista.add(item);
    }

    public Compras (String cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        double total = 0;
        for (Item item : lista) {
            total += item.quantidade * item.preco;
        }
        return total;
    }

    @Override
        public String toString() {
            return String.format("Cliente: %s  Total: R$ %.2f", this.cliente, getTotal());
        }

        public void showList() {
            for (Item item : lista) {
                System.out.printf("Nome: %s - Preco %.2f - Quantidade: %d\n", item.nome, item.preco, item.quantidade);
            }
        }


}
