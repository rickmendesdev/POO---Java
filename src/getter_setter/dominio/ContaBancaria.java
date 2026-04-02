package getter_setter.dominio;

public class ContaBancaria {
    private int numeroDaConta;
    private String nomeTitular;
    private double saldo;

    public boolean sacar(double saque){

        if (saque > this.saldo ) {
            System.out.println("Saldo insuficiente");
            return false;

        } else{
             this.saldo -= saque;
             return true;
        }

    } 

    public boolean depositar(double deposito){
        if (deposito > 0) {
            this.saldo += deposito;
            return true;
        }else{
            System.out.println("Deposite um valor maior que 0");
            return false;
        }
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    
    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public double getSaldo() {
        return saldo;
    }
   
    

    
}
