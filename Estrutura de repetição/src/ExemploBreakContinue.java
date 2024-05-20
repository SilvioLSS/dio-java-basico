public class ExemploBreakContinue{

    public static void main (String [] args) {
        for(int numero = 1; numero <=22; numero ++){
            if(numero==13){
                System.out.println("12+1");
                continue;
            }
            System.out.println(numero);
        }
    }
}