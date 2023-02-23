public class Carro {
    String marca, modelo;
    int anoFabricado, velocidadeAtual = 100;

    public Carro (String marca, String modelo, int anoFabricado){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricado = anoFabricado;
    }

    public void acelerar() {
        velocidadeAtual += 10;
    }

    public void frear() {
        velocidadeAtual -= 10;
    }

}
