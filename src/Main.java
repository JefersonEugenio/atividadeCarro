import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int acao;

        System.out.println("Qual marca do carro: ");
        String marca = entrada.next();
        System.out.println("Qual modelo do carro: ");
        String modelo = entrada.next();
        System.out.println("Qual ano do carro: ");
        int ano = entrada.nextInt();

        System.out.println("--------------------------------------------------");

        Carro carro = new Carro(marca, modelo, ano);

        while (true) {
            System.out.println("Sua velocidade está " + carro.velocidadeAtual + "Km/h");
            System.out.println("--------------------------------------------------");
            if (0 < carro.velocidadeAtual || 220 > carro.velocidadeAtual) {
                System.out.println("Você quer fazer(ação):");
                System.out.println("1: FREAR  2: ACELERAR  3: FIM(IMPRIMIR)");
                acao = entrada.nextInt();
                if (acao == 1) {
                    carro.frear();
                } else if (acao == 2) {
                    carro.acelerar();
                } else if (acao == 3) {
                    break;
                }
            } else {
                System.out.println("VELOCIDADE INVALIDO!");
                break;
            }
            System.out.println("--------------------------------------------------");
        }
        System.out.println("--------------------------------------------------");
        System.out.println("MARCA: " + carro.marca);
        System.out.println("MODELO: " + carro.modelo);
        System.out.println("ANO DE FABRICAÇÃO: " + carro.anoFabricado);
        System.out.println("SUA VELOCIDADE ESTÁ " + carro.velocidadeAtual + "Km/h");
    }
}