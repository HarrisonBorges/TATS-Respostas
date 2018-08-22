package calculadora;

public class CalculadoraSalarioTDD {

    public int calculoDeDesconto(Funcionario funcionario) {
        int desconto = 0;
        switch (funcionario.getCargo()) {
            case "DESENVOLVEDOR":
                desconto = descontoDesenvolvedor(funcionario);
                break;
            case "DBA":
                desconto = descontoDBA(funcionario);
                break;
            case "TESTADOR":
                desconto = descontoTestador(funcionario);
                break;
            case "GERENTE":
                desconto = descontoGerente(funcionario);
                break;
            default:
                System.out.println("CARGO INEXISTENTE!");
        }
        return desconto;
    }

    private int descontoDesenvolvedor(Funcionario funcionario) {
        if (funcionario.getSalarioBase() >= 3000.0) {
            return 20;
        }
        return 10;
    }

    private int descontoDBA(Funcionario funcionario) {
        if (funcionario.getSalarioBase() >= 2000.0) {
            return 25;
        }
        return 15;
    }

    private int descontoTestador(Funcionario funcionario) {
        if (funcionario.getSalarioBase() >= 2000.00) {
            return 25;
        }
        return 15;
    }

    private int descontoGerente(Funcionario funcionario) {
        if (funcionario.getSalarioBase() >= 5000.0) {
            return 30;
        }
        return 20;
    }

    public double calculoDoSalario(Funcionario funcionario) {
        return funcionario.salarioBase - funcionario.salarioBase * this.calculoDeDesconto(funcionario) / 100;
    }

}
