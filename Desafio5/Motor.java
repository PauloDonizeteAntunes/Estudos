package Desafio5;

public class Motor {
    private double velocidade = 0;
    
    public Motor(double velocidade){
      this.velocidade = velocidade;
    }

    public void setVelocidade(double setvelocidade){
    this.velocidade = setvelocidade;
    }

    public double getVelocidade(){
      return this.velocidade;  
    }

}
