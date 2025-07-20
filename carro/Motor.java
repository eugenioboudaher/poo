package carro;

public class Motor {
    int fatorAceleracao = 1;
    boolean ligado = false;

    public double getRotacoes() {
        return fatorAceleracao * 3000;
    }

    
}
