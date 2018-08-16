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
class Calculadora {

    public List<Proposta> calcular(float salario, float valorDoEmprestimo) {
        ArrayList<Proposta> propostas = new ArrayList<>();

        if (salario <= 1000) {
            /* Proposta p1 = new Proposta();
        p1.setTotal(2 * valorDoEmprestimo);
        p1.setNumeroParcelas(2);
//        p1.setValorParcela(800);
        propostas.add(p1);
        
             */
            propostas.add(new Proposta(2 * valorDoEmprestimo, 2));
            propostas.add(new Proposta(2 * valorDoEmprestimo, 3));
            else if(valorEmprestimo <= 5000){
       proposta.add(new Proposta(1.3f * valorDoEmprestimo, 2) );
       
       proposta.add(new Proposta(1.5f * valorDoEmprestimo, 4) );
       
       proposta.add(new Proposta(1.5f * valorDoEmprestimo, 10) );
               }else
            {
       proposta.add(new Proposta(1.1f * valorDoEmprestimo, 2) );
       proposta.add(new Proposta(1.3f * valorDoEmprestimo, 4) );
       proposta.add(new Proposta(1.3f * valorDoEmprestimo, 10) );
       proposta.add(new Proposta(1.4f * valorDoEmprestimo, 20) );
                    
                    
                    }
        }
        Proposta p2 = new Proposta();
        p2.setTotal(2 * valorDoEmprestimo);
        p2.setNumeroParcelas(3);
        //      p2.setValorParcela(533.33f);
        propostas.add(p2);
        else {
        //segundo caso de teste
        
        Proposta p1 = new Proposta();
        p2.setTotal(1.1f * valorDoEmprestimo);
        p2.setNumeroParcelas(2);
  //      p2.setValorParcela(533.33f);
        propostas.add(p2);
         
        Proposta p2 = new Proposta();
        p2.setTotal(1.1f * valorDoEmprestimo);
        p2.setNumeroParcelas(2);
  //      p2.setValorParcela(533.33f);
        propostas.add(p2);
        
        Proposta p3 = new Proposta();
        p2.setTotal(1.1f * valorDoEmprestimo);
        p2.setNumeroParcelas(2);
  //      p2.setValorParcela(533.33f);
        propostas.add(p2);
        
                
                }

        return propostas;
    }
}
