public class App {
    public static void main(String[] args) {
        VendasEmMemoria proc = new VendasEmMemoria();
        
        Vendido p1 = new Produto(1, "Caneta", 1.50);
        Vendido p2 = new Produto(2, "Caderno", 20.00);

        KitProduto kitEscolar = new KitProduto(100, "Combo Volta às Aulas", 0.10);
        kitEscolar.adicionar(p1);
        kitEscolar.adicionar(p2);

        Venda venda = proc.iniciarVenda();
        
        venda.registrarVenda(kitEscolar, 1); 
        
        System.out.println(venda.emitirComprovante());
    }
}