public class Validador {
    private ValidadorStrategy strategy;

    public void setStrategy(ValidadorStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("A estratégia de validação não pode ser nula.");
        }
        this.strategy = strategy;
    }

    public boolean valida(String valor) {
        if (this.strategy == null) {
            throw new IllegalStateException("Nenhuma estratégia foi definida.");
        }
        return strategy.valida(valor);
    }
}