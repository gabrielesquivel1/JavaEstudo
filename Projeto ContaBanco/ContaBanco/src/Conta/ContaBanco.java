package Conta;
import java.util.Scanner;

public class ContaBanco {
    
    public int numAccount;
    private String accountType;
    private int agency;
    private String owner;
    private Person titular;
    private int balance;
    private String status;
    private boolean statusAccount;
    public ContaBanco() {
        try (Scanner Terminal = new Scanner(System.in)) {
            System.out.println("Digite o número da conta: ");
            numAccount = Terminal.nextInt(); // Reading user input (account number)
        
            System.out.println("Digite o número da agência: ");
            agency  = Terminal.nextInt();
        while(true){
            System.out.println("Qual o tipo da Conta ? (CC ou CP) ");
            accountType  = Terminal.next();
            if (accountType.equals("CC") ||accountType.equals("CP")){
              break; //EXIT VALID LOOP
            } 
              System.out.println("Valor inválido! Digite CP ou CC");
            }
        
            System.out.println("Digite o nome do titular: ");
            String owner  = Terminal.next();
        
            System.out.println("Qual seu deposito inicial?(R$) ");
            balance  = Terminal.nextInt();

            System.out.println("Digite o CPF do titular: ");
            String cpfTitular = Terminal.next();

            System.out.println("Deseja abrir a conta? (true ou false)");
            statusAccount = Terminal.nextBoolean();

            this.getstatus();

// Create an instance of Person with the provided information
            titular = new Person(owner, cpfTitular);
        }
        //this.numAccount = numAccount;
        //this.agency = agency;
        //this.accountType = accountType;
        //this.owner = owner;
        //this.balance = balance;
        //this.statusAccount = statusAccount;
    }
    
    public boolean getStatusConta() {
        return statusAccount;
    }
    

    public void setStatusAccount(boolean statusAccount) {
        this.statusAccount = statusAccount;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getnumAccount() {
        return numAccount;
    }
    public void setnumAccount(int numAccount) {
        this.numAccount = numAccount;
    }
    public String getaccountType() {
        return accountType;
    }
    public void setaccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getstatus() {
        if (statusAccount){ 
        System.out.println("Conta criada com sucesso!");
        System.out.println("Número da conta : " + this.getnumAccount());
        System.out.println("Número da agencia : " + this.getAgency());
        System.out.println("Tipo de conta : " + this.getaccountType());
        System.out.println("Nome do proprietário : " + this.getOwner());
        System.out.println("Saldo atual : " + "R$" + this.getBalance());
        
}return "conta inativa";
}

    public void setStatus(String status) {
        this.status = status;
    }
    public Person getTitular() {
        return titular;
    }

    public void setTitular(Person titular) {
        this.titular = titular;
}

}