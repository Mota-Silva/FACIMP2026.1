public class Imposto {
    public String nome;
    public double salarioBruto;
    public double salarioLiquido;
    public double imposto;
    public double aumento;

    public Imposto(String nome, double salarioBruto, double salarioLiquido, double imposto, double aumento) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
        this.salarioLiquido = salarioLiquido;
        this.aumento = aumento;
    }

    public void calcularAumento() {
        this.salarioLiquido = this.salarioBruto - this.imposto + (this.salarioBruto / this.aumento);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário Bruto: " + this.salarioBruto);
        System.out.println("Imposto: " + this.imposto);
        System.out.println("Salário Líquido: " + this.salarioLiquido);
        System.out.println("Aumento: " + this.aumento);
    }

}