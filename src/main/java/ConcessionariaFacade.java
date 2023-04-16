public class ConcessionariaFacade {

    private Estoque estoque;
    private Financeiro financeiro;

    public ConcessionariaFacade() {
        estoque = new Estoque();
        financeiro = new Financeiro();
    }

    public boolean realizarCompra(String modeloCarro, String cpfCliente, double valor) {
        if (estoque.verificarDisponibilidade(modeloCarro) && financeiro.verificarCredito(cpfCliente, valor)) {
            estoque.reservarCarro(modeloCarro);
            financeiro.efetuarPagamento(cpfCliente, valor);
            return true;
        }
        return false;
    }

}
