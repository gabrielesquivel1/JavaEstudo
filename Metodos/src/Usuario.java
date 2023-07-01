public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar (); //ligando TV
        smartTv.diminuirVolume(); //Diminuindo volume
        smartTv.aumentarVolume(); //Aumentando volume
        smartTv.diminuirVolume(); //Diminuindo volume
        smartTv.diminuirVolume(); //Diminuindo volume
        
        smartTv.aumentarCanal(); // Aumentando canal
        smartTv.diminuirCanal(); // Diminuindo canal
        smartTv.mudarCanal(15); //Definindo canal
        System.out.println("TV Ligada ? " + smartTv.ligada); //Mostrar novo status
 //Mostrar novo volume






    }
}
