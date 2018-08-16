package financiamento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Harrison
 */

public class Proposta {

    Proposta() {

    }

    Proposta(float pTotal, int pNumeroParcelas) {
        this.total = pTotal;
        this.numeroParcelas = pNumeroParcelas;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @return the numeroParcelas
     */
    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    /**
     * @param numeroParcelas the numeroParcelas to set
     */
    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    /**
     * @return the valorParcelas
     */
    public float getValorParcelas() {
        return total / numeroParcelas;
    }

    private float total;
    private int numeroParcelas;
    private float valorParcelas;
}
