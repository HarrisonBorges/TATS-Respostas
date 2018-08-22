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

    @Test
    public void salarioMaiorIgual2000DBA() {
        assertEquals(25, calculadora.calculoDeDesconto(new Funcionario("DBA", 2000.00f)));
    }

    @Test
    public void salarioMenor2000DBA() {
        assertEquals(15, calculadora.calculoDeDesconto(new Funcionario("DBA", 1900.00f)));
    }

    @Test
    public void salarioMaiorIgual2000Testador() {
        assertEquals(25, calculadora.calculoDeDesconto(new Funcionario("TESTADOR", 2000.00f)));
    }

    @Test
    public void salarioMenor2000Testador() {
        assertEquals(15, calculadora.calculoDeDesconto(new Funcionario("TESTADOR", 1800.00f)));
    }

    @Test
    public void salarioTestador() {
        assertEquals(467.50f, calculadora.calculoDoSalario(new Funcionario("TESTADOR", 550.00f)), 0.0000001);
    }

    @Test
    public void salarioMaiorIgual5000Gerente() {
        assertEquals(30, calculadora.calculoDeDesconto(new Funcionario("GERENTE", 5000.00f)));
    }

    @Test
    public void salarioMenor5000Gerente() {
        assertEquals(20, calculadora.calculoDeDesconto(new Funcionario("GERENTE", 4000.00f)));
    }

    @Test
    public void salarioGerente() {
        assertEquals(2000.00f, calculadora.calculoDoSalario(new Funcionario("GERENTE", 2500.00f)), 0.0000001);
    }
}
