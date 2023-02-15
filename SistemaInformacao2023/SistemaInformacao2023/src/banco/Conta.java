/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author tulio
 */
public class Conta {

    String cliente;// atributos ou variáveis de instância
    double saldo;
    double limite;
    
    public void deposita(double saldo){ // método
        this.saldo = this.saldo +saldo;
        System.out.println("Deposito efetuado com sucesso!\n");
        //this.saldo +=saldo ( para sacar );
    }
    
    public boolean saca(double saldo){ // método para sacar
        if(this.saldo>=saldo){
            this.saldo = this.saldo - saldo;
            System.out.println("Saque realizdo com sucesso!\n");
            return true;
        }// fim if
        else
            System.out.println("Saldo insuficiente!\n");
            return false; 
    
        
    }//saldo
    
}
