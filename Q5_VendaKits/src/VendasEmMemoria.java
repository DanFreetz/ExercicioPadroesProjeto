import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class VendasEmMemoria implements VendasFachada {
    private List<Vendido> produtos; 

    public VendasEmMemoria() {
        produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Caneta", 1.55));
        produtos.add(new Produto(2, "Borracha", 1.15));
        produtos.add(new Produto(3, "Caderno", 32.99));
    }

   @Override
    public void registrarVenda(Venda umaVenda, int codigoProduto, int quantidade) {
        Vendido prod = produtos.stream().filter(p -> p.getId() == codigoProduto).findFirst().get();
        umaVenda.registrarVenda(prod, quantidade);
    }

    @Override
    public List<Vendido> buscarProdutos() {
        return Collections.unmodifiableList(produtos);
    }
	
	@Override
	public Venda iniciarVenda() {
		return new Venda(LocalDateTime.now());
	}

	@Override
	public String emitirComprovante(Venda umaVenda) {
		return umaVenda.emitirComprovante();
	}

}
