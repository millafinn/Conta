public class Conta1 {
    private int numero;
    private String dono;
    private double saldo;
    private double limite;

    void setNumero(int numero){
        this.numero=numero;
    }

    int getNumero(){
        return(numero);
    }

    void setDono(String dono){
        this.dono=dono;
    }

    String getDono(){
        return(dono);
    }

    void setSaldo(double saldo){
        this.saldo=saldo;
    }
    double getSaldo(){
        return(saldo);
    }

    void setLimite(double limite){
        this.limite=limite;
    }
    double getLimite(){
        return(limite);
    }

    void depositar(double valor){
        saldo=saldo+valor;
    }

    boolean sacar(double valor){
        if( valor > saldo){
            return(false);
        }
        saldo=saldo-valor;
        return(true);
    }

    void printCliente(){
        System.out.println(dono);
        System.out.println(numero);
        System.out.println(saldo);
    }
}
