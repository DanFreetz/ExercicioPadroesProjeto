import java.util.ArrayList;
import java.util.List;

public class KitProduto implements Vendido {
    private int id;
    private String nome;
    private List<Vendido> itensDoKit = new ArrayList<>();
    private double desconto; 

    public KitProduto(int id, String nome, double desconto) {
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
    }

    public void adicionar(Vendido item) {
        itensDoKit.add(item);
    }

    @Override
    public int getId() { return id; }

    @Override
    public String getNome() {
        return nome + " (Kit)";
    }

    @Override
    public double getPreco() {
        double soma = itensDoKit.stream().mapToDouble(Vendido::getPreco).sum();
        return soma * (1 - desconto);
    }
}