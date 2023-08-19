package Conta;


public class Terminal {


    public static void main(String[] args) throws Exception {
      ContaBanco c1 = new ContaBanco();
      Person titularConta1 = c1.getTitular();
      System.out.println("Dados do titular da conta 1:");
      System.out.println("Nome: " + titularConta1.getName());
      System.out.println("CPF: " + titularConta1.getCpf());     

      }

    

}

