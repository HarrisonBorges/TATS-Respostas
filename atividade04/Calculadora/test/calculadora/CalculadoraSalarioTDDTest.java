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

    @Test
    public void salarioMenor3000Desenvolvedor() {
        assertEquals(10, calculadora.calculoDeDesconto(new Funcionario("DESENVOLVEDOR", 1500.00f)));
    }

    @Test
    public void salarioDesenvolvedor() {
        assertEquals(4000.00f, calculadora.calculoDoSalario(new Funcionario("DESENVOLVEDOR", 5000.00f)), 0.0000001);
    }

}
