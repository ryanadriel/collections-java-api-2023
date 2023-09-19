package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity){
        Item item = new Item(name, price, quantity);
        this.itemList.add(item);
    }

    public void removeItem(String name){
        List<Item> itemToRemove = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getName().equalsIgnoreCase(name)){
                itemToRemove.add(i);
            }
        }
        itemList.removeAll(itemToRemove);
    }

    public int getTotalItems() {
        return itemList.size();
    }

    public void getItems() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println("Seu carrinho tem o total de " + carrinhoDeCompras.getTotalItems() + " itens");

        carrinhoDeCompras.addItem("Cebola", 10.99, 9);
        carrinhoDeCompras.addItem("Tomate", 14.99, 7);
        carrinhoDeCompras.addItem("Feijão", 32.18, 5);
        carrinhoDeCompras.addItem("Carne de Sol", 32.99, 1);
        System.out.println("Seu carrinho tem o total de " + carrinhoDeCompras.getTotalItems() + " itens");

        carrinhoDeCompras.removeItem("Cebola");
        System.out.println("Seu carrinho tem o total de " + carrinhoDeCompras.getTotalItems() + " itens");

        carrinhoDeCompras.getItems();
    }
}
