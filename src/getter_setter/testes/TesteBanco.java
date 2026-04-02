package getter_setter.testes;

import getter_setter.dominio.ContaBancaria;

public class TesteBanco {
    public static void main(String[] args) {
        ContaBancaria contaBancaria01 = new ContaBancaria();
        contaBancaria01.setNomeTitular("Ye");
        contaBancaria01.depositar(1000.99);
        System.out.println(contaBancaria01.getSaldo());
        System.out.println(contaBancaria01.getNomeTitular());
    }
    
}
