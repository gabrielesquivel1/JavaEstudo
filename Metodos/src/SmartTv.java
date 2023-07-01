public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void aumentarCanal(){

        canal++;
        System.out.println("Canal Atual: " + canal);
    }
    public void diminuirCanal(){

        canal--;
        return;
    }
    public void mudarCanal(int novoCanal){

        canal = novoCanal;
        System.out.println("Canal Atual: " + canal);
    }

    public void aumentarVolume(){

        volume++;

        System.out.println("Volume Atual : " + volume); //Exibindo volume atual
    }

    public void diminuirVolume(){

        volume--;
        System.out.println("Volume Atual : " + volume); //Exibindo volume atual
    }
    
    public void ligar(){
            ligada = true;
    }

}
