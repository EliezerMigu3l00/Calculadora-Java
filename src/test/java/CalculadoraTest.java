import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void deveSomarCorretamenteDoisNumerosInteiros() {
        //Arrange
        int valorA = 2;
        int valorB = 2;
        int valorEsperado = 4;
        Calculadora calculadora = new Calculadora();
        //Act
        int valorCalculado = calculadora.somar(valorA, valorB);
        //Assert
        Assert.assertEquals(valorEsperado,valorCalculado, 0.01);
    }
    @Test
    public void deveSubitrairCorretamenteDoisNumerosInteiros() {
        //Arrange
        int valorA = 5;
        int valorB = 2;
        int valorEsperado = 3;
        Calculadora calculadora = new Calculadora();
        //Act
        int valorCalculado = calculadora.subitrair(valorA, valorB);
        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }
    @Test
    public void deveDividirCorretamenteDoisNumerosInteiros() {
        //Arrange
        int valorA = 10;
        int valorB = 2;
        int valorEsperado = 5;
        Calculadora calculadora = new Calculadora();
        //Act
        int valorCalculado = calculadora.dividir(valorA, valorB);
        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }
    @Test
    public void deveSubtrairCorretamenteQuandoOsNumerosForemDePontoFlutuante() {
        //Arrange
        double valorA = 12.5;
        double valorB = 2;
        double valorEsperado = 6.25;
        Calculadora calculadora = new Calculadora();
        //Act
        double valorCalculado = calculadora.divisaoNumerosFlutuantes(valorA, valorB);
        //Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }
}
