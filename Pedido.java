import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private Garcom garcom;
    private List<ItemPedido> itens;
    private double total;

    public Pedido(Cliente cliente, Garcom garcom) {
        this.cliente = cliente;
        this.garcom = garcom;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido itemPedido) {
        itens.add(itemPedido);
    }

    public void calcularTotal() {
        total = 0;
        for (ItemPedido itemPedido : itens) {
            total += itemPedido.getItemMenu().getPreco() * itemPedido.getQuantidade();
        }
    }

    public double getTotal() {
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Garcom getGarcom() {
        return garcom;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void exibirPedido() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Garçom: " + garcom.getNome());
        System.out.println("Itens do Pedido:");
        for (ItemPedido itemPedido : itens) {
            System.out.println("- " + itemPedido.getItemMenu().getNome() + " x" + itemPedido.getQuantidade() + " - Preço: " + itemPedido.getItemMenu().getPreco());
        }
        System.out.println("Total do Pedido: " + total);
    }
}