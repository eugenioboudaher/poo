package desafioPOO1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String name;
    int age;

    List<Compra> compras = new ArrayList<>();

    public Cliente (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void addPurchase(Compra compra) {
        compras.add(compra);
        System.out.println("Compra " + compra + " adicionado com sucesso");
    }

    public void showPurchases() {
        for (Compra c : compras) {
            System.out.println(c.toString());
        }
    }
}
