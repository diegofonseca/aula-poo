package br.ulbra.poo;
// Classe publica Conta
public class Conta {
    private double saldo; // atributo privado    
    // método publico construtor da classe
    public Conta(double saldo) {
        this.saldo = saldo;
    }
    // método publico da classe
    public void deposita(double valor) {
        this.saldo += valor;
    }
    // método publico da classe
    public double getSaldo() {
        return this.saldo;
    }
}
