import org.junit.Assert;
import org.junit.Test;

public class TestConcessionariaFacade {

    @Test
    public void testRealizarCompra() {
        ConcessionariaFacade concessionaria = new ConcessionariaFacade();
        boolean resultado = concessionaria.realizarCompra("Modelo X", "111.111.111-11", 100000.0);
        Assert.assertTrue(resultado);
    }

    @Test
    public void testRealizarCompraSemCredito() {
        ConcessionariaFacade concessionaria = new ConcessionariaFacade();
        boolean resultado = concessionaria.realizarCompra("Modelo X", "222.222.222-22", 100000.0);
        Assert.assertTrue(resultado);
    }

    @Test
    public void testRealizarCompraSemEstoque() {
        ConcessionariaFacade concessionaria = new ConcessionariaFacade();
        boolean resultado = concessionaria.realizarCompra("Modelo Y", "111.111.111-11", 100000.0);
        Assert.assertTrue(resultado);
    }

}
