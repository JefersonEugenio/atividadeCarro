import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int acao;
        boolean loop = true;

        System.out.println("Qual marca do carro: ");
        String marca = entrada.next();
        System.out.println("Qual modelo do carro: ");
        String modelo = entrada.next();
        System.out.println("Qual ano do carro: ");
        int ano = entrada.nextInt();

        System.out.println("--------------------------------------------------");

        Carro carro = new Carro(marca, modelo, ano);

        while (loop) {
            System.out.println("Sua velocidade está " + carro.velocidadeAtual + "Km/h");
            System.out.println("--------------------------------------------------");
            System.out.println("Você quer fazer(ação):");
            System.out.println("1: FREAR  2: ACELERAR  3: FIM(IMPRIMIR)");
            acao = entrada.nextInt();
            switch (acao) {
                case 1:
                    if (carro.velocidadeAtual > 0) {
                        carro.frear();
                    } else if (carro.velocidadeAtual == 0) {
                        System.out.println("Sua velocidade está PARADO");
                    } else {
                        System.out.println("INVALIDO");
                    }
                    break;
                case 2:
                    if (carro.velocidadeAtual < 220) {
                        carro.acelerar();
                    } else if (carro.velocidadeAtual == 220) {
                        System.out.println("Sua velocidade está MAXIMO acelerado");
                    } else {
                        System.out.println("INVALIDO");
                    }
                    break;
                case 3:
                    System.out.println("--------------------------------------------------");
                    System.out.println("MARCA: " + carro.marca);
                    System.out.println("MODELO: " + carro.modelo);
                    System.out.println("ANO DE FABRICAÇÃO: " + carro.anoFabricado);
                    System.out.println("SUA VELOCIDADE ESTÁ " + carro.velocidadeAtual + "Km/h");
                    loop = false;
                    break;
                default:
                    System.out.println("OPCAO INVALIDO, SOMENTE (1) FREAR (2) ACELERAR (3) FIM (IMPRIMIR)");
                    break;
            }
            System.out.println("--------------------------------------------------");
        }
    }
}