public class Juros {
    public static void main(String[] args) {
        double capital = 1000.0;
        double taxaJuros = 0.5; 
        int tempo = 100; 

        double jurosSimples = (capital * taxaJuros) / tempo;
        
        System.out.println("Juros Simples: " + jurosSimples);
        
    }
}
