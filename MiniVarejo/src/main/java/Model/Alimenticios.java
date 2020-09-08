package Model;

public class Alimenticios extends Produto{

    private String marca;
    private String descricao;
    private Double desconto;

    public Alimenticios(Integer codigo, Double preco, Integer unidade, String marca, String descricao, Double desconto) {
        super(codigo, preco, unidade);
        this.marca = marca;
        this.descricao = descricao;
        this.desconto = desconto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double valorDesconto() {
        Double valor = 0.0;
        valor = getPreco() - (getPreco()*getDesconto());
        return valor;
    }

    @Override
    public String toString() {
        return "Alimenticios{" +
                "Marca='" + marca + '\'' +
                ", Descrição='" + descricao + '\'' +
                ", Desconto=" + desconto +
                "} " + super.toString() + "Valor real=" + valorDesconto();
    }

}
