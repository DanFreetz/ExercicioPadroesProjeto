public class ItemDeVenda {
    private Vendido item; 
    private int quantidade;

    public ItemDeVenda(Vendido item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }

    public Vendido getItem() {
        return item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getSubTotal() {
        return item.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return String.format("%d %s %d x %.2f = %.2f%n", item.getId(), item.getNome(), quantidade, item.getPreco(), getSubTotal());
    }
}