package associação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main (String [] args) {
    Carro polo = new Carro(440);
    polo.mostrarCavalos();

    Funcionarios Joao = new Funcionarios("João");
    Funcionarios Joana = new Funcionarios("Joana");
    Funcionarios Mateus = new Funcionarios("Mateus");
        List<Funcionarios> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(Joana);
        listaDeFuncionarios.add(Joao);
        listaDeFuncionarios.add(Mateus);

        Departamento ti = new Departamento("TI", listaDeFuncionarios);
        ti.mostrarFuncionarios();

        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.mostrarFuncionarios();
    }
}
