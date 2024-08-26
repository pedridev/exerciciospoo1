package associação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class principal {
    public static void main (String [] args) {
    carro polo = new carro(440);
    polo.mostrarCavalos();

    funcionarios Joao = new funcionarios("João");
    funcionarios Joana = new funcionarios("Joana");
    funcionarios Mateus = new funcionarios("Mateus");
        List<funcionarios> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(Joana);
        listaDeFuncionarios.add(Joao);
        listaDeFuncionarios.add(Mateus);

        departamento ti = new departamento("TI", listaDeFuncionarios);
        ti.mostrarFuncionarios();

        departamento marketing = new departamento ("Marketing", Collections.emptyList());
        marketing.mostrarFuncionarios();
    }
}
