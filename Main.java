public class Main {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Filipe Silva", "123-456-7890");

        Garcom garcom1 = new Garcom("Vinicius");

        ItemMenu item1 = new ItemMenu("Pizza Margherita", "Pizza com molho, mussarela e manjericão", 25.00);
        ItemMenu item2 = new ItemMenu("Suco de Laranja", "Suco natural de laranja", 8.50);

        Pedido pedido1 = new Pedido(cliente1, garcom1);

        ItemPedido itemPedido1 = new ItemPedido(item1, 2); 
        ItemPedido itemPedido2 = new ItemPedido(item2, 3); 

        pedido1.adicionarItem(itemPedido1);
        pedido1.adicionarItem(itemPedido2);

        pedido1.calcularTotal();

        pedido1.exibirPedido();
    }
}
