package conta;

import java.util.Scanner;

/**
 * @author GEsquivel
 */
public class ContaBanco {

    public int numAccount;
    private String accountType;
    private int agency;
    private String owner;
    private int balance;
    private String status;
    private boolean statusAccount;
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isStatusAccount() {
        return statusAccount;
    }

    public void setStatusAccount(boolean statusAccount) {
        this.statusAccount = statusAccount;
    }

    public ContaBanco() {
        Scanner Terminal = new Scanner(System.in);
            System.out.print("Digite o número da conta: ");
            setNumAccount(Terminal.nextInt());  // Reading user input (account number)

            System.out.print("Digite o número da agência: ");
            setAgency(Terminal.nextInt());
            while(true){
                System.out.print("Qual o tipo da Conta ? (CC ou CP) ");
                String input = Terminal.next().toLowerCase();  // Converte a entrada para minúsculas
                if (input.equals("cc") || input.equals("cp")) {
                    // Converting input back to upper case if needed
                    setAccountType(input.toUpperCase());
                    break; // EXIT TO VALID LOOP
                }
                System.out.println("Valor inválido! Digite CP ou CC");
            }

            System.out.print("Digite o nome do titular: ");
            setOwner(Terminal.next());

            System.out.print("Qual seu deposito inicial?(R$) ");
            setBalance(Terminal.nextInt());

            System.out.print("Digite o CPF do titular: ");
            setCpf(Terminal.next());

            System.out.print("Deseja abrir a conta? (true ou false)");
            setStatusAccount(Terminal.nextBoolean());

            this.getStatus();

        }




    public int getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
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

    public String getStatus() {
        if (statusAccount){
            System.out.println("Conta criada com sucesso!");
            System.out.println("Número da conta : " + this.getNumAccount());
            System.out.println("Número da agencia : " + this.getAgency());
            System.out.println("Tipo de conta : " + this.getAccountType());
            System.out.println("Nome do proprietário : " + this.getOwner());
            System.out.println("Saldo atual : " + "R$" + this.getBalance());
            return status;

        }return "conta inativa";
    }

    public void setStatus(String status) {
        this.status = status;
    }
}