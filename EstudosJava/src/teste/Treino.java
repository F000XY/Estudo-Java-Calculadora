package teste;
import java.util.Scanner;

public class Treino {
    public Treino() {
        System.out.println("Vamos calcular algumas operações: ");
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int c, int d) {
        return c - d;
    }

    public static int multiplicacao(int e, int f) {
        return e * f;
    }

    public static float divisao(float g, float h) {
        return g / h;
    }

    public static int potencia(int i, int j) {
        return (int) Math.pow(i, j);
    }

    public static void contaSoma() {
        System.out.println("Digite dois valores para somar: ");
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        System.out.println("A soma de " + a + " + " + b + " = " + soma(a, b));
    }

    public static void contaSubtracao() {
        System.out.println("Digite dois valores para subtrair: ");
        Scanner leitor = new Scanner(System.in);
        int c = leitor.nextInt();
        int d = leitor.nextInt();
        System.out.println("A subtracao de " + c + " - " + d + " = " + subtracao(c, d));
    }

    public static void contaMultiplicacao() {
        System.out.println("Digite dois valores para multiplicar: ");
        Scanner leitor = new Scanner(System.in);
        int e = leitor.nextInt();
        int f = leitor.nextInt();
        System.out.println("A multiplicacao de " + e + " * " + f + " = " + multiplicacao(e, f));
    }

    public static void contaDivisao() {
        System.out.println("Digite dois valores para dividir: ");
        Scanner leitor = new Scanner(System.in);
        float g = leitor.nextFloat();
        float h = leitor.nextFloat();
        System.out.println("A divisao de " + g + " / " + h + " = " + divisao(g, h));
    }

    public static void contaPotencia() {
        System.out.println("Digite dois valores para elevar: ");
        Scanner leitor = new Scanner(System.in);
        int i = leitor.nextInt();
        int j = leitor.nextInt();
        System.out.println("A potencia de " + i + " ^ " + j + " = " + potencia(i, j));
    }

    public static void menuContas() {
        while (true) {
            System.out.println("Bem vindo ao menu de contas: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Divisao");
            System.out.println("4 - Multiplicacao");
            System.out.println("5 - Potencia");
            System.out.println("6 - Sair");

            Scanner leitor = new Scanner(System.in);
            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    contaSoma();
                    break;
                case 2:
                    contaSubtracao();
                    break;
                case 3:
                    contaDivisao();
                    break;
                case 4:
                    contaMultiplicacao();
                    break;
                case 5:
                    contaPotencia();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao inválida!");

            }
        }
    }
    public static void main(String[] args)
    {
        new Treino();
        menuContas();
    }
}