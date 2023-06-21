package entidades;
//cuenta:
//    saldo
//    agencia
//    numero
//    titular
public class Cuenta {
    public double saldo;
    public int agencia;
    public int numero;
    public Cliente titular;

    public Cuenta(double saldo, int agencia, int numero, Cliente titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
    public boolean retirar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean transferir(double valor, Cuenta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }

}
