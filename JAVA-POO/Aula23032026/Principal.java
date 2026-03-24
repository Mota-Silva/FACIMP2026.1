import java.text.ParseException;

public class Principal {

    public static void main(String[] args) throws ParseException {
        Imposto imposto1 = new Imposto("Mikael", 6000.0, 0.0, 1000.0, 10.);
        imposto1.calcularAumento();

        imposto1.exibirInformacoes();
    }
}

