package aula2.ex2;

import java.util.ArrayList;

public class Banco {

    private ArrayList<Conta> contas;

    public boolean ciarConta(){
        return true;
    }
    public boolean excluirConta(){
        return  true;
    }
    public boolean deposito(){
        return true;
    }
    public Double emitirSaldo(){
        return null;
    }
    public String emitirExtrato(){
        return "Emissao de extrato";
    }

    public boolean transEntreContas(){
        return true;
    }
}
