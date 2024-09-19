public class Main {
    public static void main(String[] args) {
        // Cadastro de clientes
        Cliente cliente1 = new Cliente("Filipe Silva", "123-456-7890");

        // Cadastro de garçons
        Garcom garcom1 = new Garcom("Vinicius");

        // Cadastro de itens do menu
        ItemMenu item1 = new ItemMenu("Pizza Margherita", "Pizza com molho, mussarela e manjericão", 25.00);
        ItemMenu item2 = new ItemMenu("Suco de Laranja", "Suco natural de laranja", 8.50);

        // Criação de um pedido
        Pedido pedido1 = new Pedido(cliente1, garcom1);

        // Adicionando itens ao pedido
        ItemPedido itemPedido1 = new ItemPedido(item1, 2); // 2 pizzas
        ItemPedido itemPedido2 = new ItemPedido(item2, 3); // 3 sucos

        pedido1.adicionarItem(itemPedido1);
        pedido1.adicionarItem(itemPedido2);

        // Calculando o total do pedido
        pedido1.calcularTotal();

        // Exibindo detalhes do pedido
        pedido1.exibirPedido();
    }
}
