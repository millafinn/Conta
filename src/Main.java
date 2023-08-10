public class Main {
    public static void main(String[] args) {
        Conta1 cliente1= new Conta1();

        cliente1.setDono("Camila");
        cliente1.setLimite(0);
        cliente1.setNumero(12345);
        cliente1.setSaldo(1000);

        cliente1.printCliente();
        cliente1.sacar(500);
        cliente1.printCliente();
    }
}