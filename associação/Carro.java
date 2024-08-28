package associação;

public class Carro {
    //atributo do tipo motor
    private Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Carro(int cavalos) {
        this.motor = new Motor(cavalos);
    }

    public void mostrarCavalos() {
        System.out.println("Carro com motor de " + motor.getCavalos() + " cavalos");
    }


}
