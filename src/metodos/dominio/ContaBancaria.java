package metodos.dominio;

public class ContaBancaria {
    public double saldo = 1000.0;

       public boolean temSaldoSuficiente(double valorSaque){
        if (valorSaque <= saldo && valorSaque > 0) {
            return true;
        }else{
            return false;
        }
       }
       public String realizarSaque(double valorSaque){
        if (temSaldoSuficiente(valorSaque)) {
            saldo -= valorSaque;
            return "Saque aprovado! Novo saldo: " + saldo;
        }else{
            return "Saque negado. Saldo insuficiente ou valor inválido.";
        }
       }

}
