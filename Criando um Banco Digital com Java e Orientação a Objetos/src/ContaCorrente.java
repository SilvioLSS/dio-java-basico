public class ContaCorrente extends Conta{
    public void imprimirExtrato(){
        System.out.println("=== Extrato conta corrente ===");
        super.imprimirInfoComuns();
    }

}
