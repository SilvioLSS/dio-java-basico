public class ContaPoupaca extends Conta{
    public void imprimirExtrato(){
        System.out.println("=== Extrato conta poupança ===");
        super.imprimirInfoComuns();
    }
}