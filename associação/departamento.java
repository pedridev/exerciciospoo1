package associação;

import java.util.List;

public class departamento {
    private String nome;
    private List<funcionarios> listaDeFuncionarios;

    public departamento(String nome, List<funcionarios> listaDeFuncionarios) {
        this.nome = nome;
        this.listaDeFuncionarios = listaDeFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<funcionarios> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    public void setListaDeFuncionarios(List<funcionarios> listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }
    public void mostrarFuncionarios(){
        System.out.println("Departamento de " + nome);
        listaDeFuncionarios.forEach(funcionarios -> System.out.println(funcionarios));
    }
}
