import entidades.Cuenta;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cuenta c = new Cuenta();
        c.depositar(100);
        System.out.println(c.saldo);

    }
}