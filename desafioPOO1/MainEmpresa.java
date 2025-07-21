package desafioPOO1;

public class MainEmpresa {
    public static void main(String[] args) {
        

        // Criar 5 itens
        Item item1 = new Item("Notebook", 1, 3500.00);
        Item item2 = new Item("Mouse", 2, 80.00);
        Item item3 = new Item("Teclado", 1, 150.00);
        Item item4 = new Item("Monitor", 1, 900.00);
        Item item5 = new Item("Cadeira", 1, 700.00);

        // Criar 2 clientes
        Cliente cliente1 = new Cliente("Eugenio", 30);
        Cliente cliente2 = new Cliente("Lucas", 25);

        // Criar 3 compras
        Compra compra1 = new Compra( cliente1);
        compra1.addItem(item1);
        compra1.addItem(item2);

        Compra compra2 = new Compra(cliente1);
        compra2.addItem(item3);

        Compra compra3 = new Compra(cliente2);
        compra3.addItem(item4);
        compra3.addItem(item5);

        // Associar compras aos clientes
        cliente1.addPurchase(compra1);
        cliente1.addPurchase(compra2);
        cliente2.addPurchase(compra3);

        // Mostrar compras dos clientes
        System.out.println("\nCompras do cliente 1:");
        cliente1.showPurchases();

        System.out.println("\nCompras do cliente 2:");
        cliente2.showPurchases();
    }
}

