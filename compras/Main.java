package compras;

public class Main {
    public static void main(String[] args) {
        Compras c1 = new Compras("Eugenio");
        c1.addItem(new Item("Caneta", 2, 3));
        c1.addItem(new Item("Borracha", 3, 2));
        c1.addItem(new Item("Régua", 1, 7));

       System.out.println(c1.toString()); 
       c1.showList();
    }
}
