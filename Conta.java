public class Conta {
    private int numero;
    private String banco;
    private String agencia;
    private int saldo;
    private int limite;

    public int getNumero () {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }



    public String getBanco () {
        return this.banco;
    }
    
    public void setBanco(String banco) {
        this.banco = banco;
    }



    public String getAgencia () {
        return this.agencia;
    }
    
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }



    public int getSaldo () {
        return this.saldo;
    }
    
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


    public int getLimite () {
        return this.limite;
    }
    
    public void setLimite(int limite) {
        this.limite = limite;
    }

}


