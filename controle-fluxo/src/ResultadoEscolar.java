public class ResultadoEscolar {
    // ENTENDENDO A ESTRUTURA CONDICIONAL JAVA
    public static void main(String[] args) {
        int nota = 4;

/*         if(nota >= 7)
        System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
        System.out.println("Prova de recuperação");

        else 
        System.out.println("Reprovado"); */

         String resultado = nota >= 7 ? "Aprovado" : nota <7 && nota >=5 ? "Prova Recuperação" : "Reprovado" ; // CONDIÇÃO TERNÁRIA
        System.out.println(resultado);

    }

}
