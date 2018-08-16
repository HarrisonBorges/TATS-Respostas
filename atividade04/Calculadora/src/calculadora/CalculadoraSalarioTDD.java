/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Harrison
 */
public class CalculadoraSalarioTDD {
    
    public int calcDesconto(Funcionario funcionario) {

        int valorDoDesconto = 0;
        switch (funcionario.getFuncao()) {
            case "DESENVOLVEDOR":
                valorDoDesconto = descontoDoDesenvolvedor(funcionario);
                break;
            case "DBA":
                valorDoDesconto = descontoDoDBA(funcionario);
                break;
            case "TESTADOR":
                valorDoDesconto = descontoDoTestador(funcionario);
                break;
            case "GERENTE":
                valorDoDesconto = descontoDoGerente(funcionario);
                break;
        }
        return valorDoDesconto;
    }
  
}
