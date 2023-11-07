package Desafio5;

public class Drivetrain {
    
double velEsquerda;
double velDireita;

    public Drivetrain(double velEsquerda, double velDireita){
        this.velDireita = velDireita;
        this.velEsquerda = velEsquerda;
    }


    public void tankDrive(double velEsquerda, double velDireita){
        System.out.println("A velocidade do motor Esquerdo é " + velEsquerda + " e a do motor direito é " + velEsquerda );
    }

}
