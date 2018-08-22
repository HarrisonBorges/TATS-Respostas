package calculadora;

public class Funcionario {

    private String nome;
    private String email;
    float salarioBase;
    String cargo;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public Funcionario(String cargo, float salarioBase) {
        this.cargo = cargo;
        this.salarioBase = salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String papel) {
        this.cargo = papel;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
}
