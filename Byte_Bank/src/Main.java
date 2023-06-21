import entidades.Cliente;
import entidades.Cuenta;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cuenta c = new Cuenta();
        c.depositar(100);
        System.out.println(c.saldo);

        Cuenta c2 = new Cuenta();
        Cliente cliente = new Cliente();
        cliente.nombre = "Fulano";
        c2.titular = cliente;
        c2.depositar(100);
        System.out.println(c2.saldo);

    }
}