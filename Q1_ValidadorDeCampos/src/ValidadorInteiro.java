public class ValidadorInteiro implements ValidadorStrategy {
    @Override
    public boolean valida(String valor) {
        if (valor == null || valor.isEmpty()) return false;
        for (int i = 0; i < valor.length(); i++) {
            if (!Character.isDigit(valor.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}