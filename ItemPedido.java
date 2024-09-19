public class ItemPedido {
    private ItemMenu itemMenu;
    private int quantidade;

    public ItemPedido(ItemMenu itemMenu, int quantidade) {
        this.itemMenu = itemMenu;
        this.quantidade = quantidade;
    }

    public ItemMenu getItemMenu() {
        return itemMenu;
    }

    public int getQuantidade() {
        return quantidade;
    }
}