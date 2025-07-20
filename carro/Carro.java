package carro;

public class Carro {
    
    Motor motor = new Motor();

    public void acelerar() {
        if (motor.getRotacoes() < 50000 && motor.ligado){
            motor.fatorAceleracao += 1;
            System.out.println(motor.fatorAceleracao);
            System.out.println("Giro: " + motor.getRotacoes());
        }
    }

    public void freiar() {
        if (motor.getRotacoes() > 0){
            motor.fatorAceleracao -= 1;
            System.out.println("Giro: " + motor.getRotacoes());
        }
    }

    public void ligar() {
        motor.ligado = true;
    }
    public void desligar() {
        motor.ligado = false;
    }
}
