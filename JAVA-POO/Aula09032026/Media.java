public class Media {
    public static void main(String[] args) {
        double nota1 = 6.0;
        double nota2 = 6.0;
        double nota3 = 6.0;
        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else if (media >= 5.0 && media < 7.0) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }
        
         System.out.printf("A media e: %.2f%n", media);

    }
}
