package associação;

public class carro {
    //atributo do tipo motor
    private motor motor;

    public carro(associação.motor motor) {
        this.motor = motor;
    }

    public associação.motor getMotor() {
        return motor;
    }

    public void setMotor(associação.motor motor) {
        this.motor = motor;
    }

    public carro(int cavalos) {
        this.motor = new motor(cavalos);
    }

    public void mostrarCavalos() {
        System.out.println("Carro com motor de " + motor.getCavalos() + " cavalos");
    }


}
