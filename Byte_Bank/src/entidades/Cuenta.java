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
    public String titular;

    public void depositar(double valor){
        this.saldo += valor;
    }

}
