public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmarTv smarTv = new SmarTv();

        System.out.println("TV ligada? "+ smarTv.ligada);
        System.out.println("Canal atual: "+ smarTv.canal);
        System.out.println("Volume atual: "+ smarTv.volume);

        smarTv.ligar();
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.diminuirVolume();
        smarTv.mudarCanal(55);
        System.out.println("Canal atual: "+ smarTv.canal);
        smarTv.aumentarCanal();
        smarTv.aumentarCanal();
        smarTv.aumentarCanal();
        smarTv.aumentarCanal();

        System.out.println("Novo Status -> TV ligada? "+ smarTv.ligada);
        System.out.println("Novo Status -> Volume atual: "+ smarTv.volume);
        System.out.println("Novo Status -> Canal atual: "+ smarTv.canal);
    }
}
