package calculadora;

import calculadora.CalculadoraSalarioTDD;
import calculadora.Funcionario;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraSalarioTDDTest {

    private CalculadoraSalarioTDD calculadora;

    public CalculadoraSalarioTDDTest() {
        calculadora = new CalculadoraSalarioTDD();
    }

    @Test
    public void salarioMaiorIgual3000Desenvolvedor() {
        assertEquals(20, calculadora.calculoDeDesconto(new Funcionario("DESENVOLVEDOR", 3000.00f)));
    }

}