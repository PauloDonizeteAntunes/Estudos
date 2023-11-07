package Desafio5;

public class Main {
    public static void main(String[] args) {

        Double vel = 0.0;

        Robo robo1 = new Robo("robo 1 ");
        Motor velocidadeMotor = new Motor(0);

        velocidadeMotor.setVelocidade(1.0);
        vel = velocidadeMotor.getVelocidade();


        if(vel == 1.0){

        Drivetrain velocidadeDriveTrain = new Drivetrain(vel,vel);
        velocidadeDriveTrain.tankDrive(vel,vel);
        robo1.andarFrente();
        }

        
    }
}
