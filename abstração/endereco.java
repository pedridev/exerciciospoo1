package abstração;

public abstract class endereco {
    private String rua;
    private String cidade;
    private String numero;
    private String estado;
    private String cep;

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public endereco(String numero, String rua, String cidade, String estado, String cep) {
        this.numero = numero;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public endereco() {
    }

    public endereco(String rua, String cidade, String estado, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    public void mostrarEndereco(){
        System.out.println("Endereço " + rua + ", " + cidade + ", " + numero + ", " + estado + ", " + cep);
    }
}
