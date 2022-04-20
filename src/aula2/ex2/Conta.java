package aula2.ex2;

import java.util.ArrayList;

public class Conta {
    private String numero;
    private Double saldo;
    private boolean status;
    private double limite;
    private ArrayList<Movimentacao> movimentacoes;

    public final Double saque(Double valorSaque){
        if(valorSaque<saldo && valorSaque<limite) {
            return this.saldo - valorSaque;
        }
        return null;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ArrayList<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(ArrayList<Movimentacao> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }
}
