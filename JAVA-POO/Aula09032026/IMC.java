public class IMC {
    public static void main(String[] args) {
        double peso = 200.0;
        double altura = 1.75; 

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35 && imc < 39.99) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III");
        }

        System.out.printf("O IMC e: %.2f%n", imc);
    }
}
