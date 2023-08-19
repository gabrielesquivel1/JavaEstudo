package AulaPoo;


public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("O modelo é "+ this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("A ponta é " + String.format("%.2f", this.ponta).replace(",", "."));
        System.out.println("A carga atual é: " + this.carga);
        System.out.println("está tampada ? " + this.tampada);
    }

    public void rabiscar(){
        if(this.tampada == true){

            System.out.println("Erro - Não posso rabiscar");
        }
        else {
            System.out.println("Estou rabiscando");
        }



    }

    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }
}
