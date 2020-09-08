package Model;

public class Cosmeticos extends Produto{

    private String marca;
    private String tipoProduto;
    private String descricao;
    private Double desconto;

    public Cosmeticos(Integer codigo, Double preco, Integer unidade, String marca, String tipoProduto, String descricao, Double desconto) {
        super(codigo, preco, unidade);
        this.marca = marca;
        this.tipoProduto = tipoProduto;
        this.descricao = descricao;
        this.desconto = desconto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
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
        return "Comesticos{" +
                "Marca='" + marca + '\'' +
                ", Produto='" + tipoProduto + '\'' +
                ", Descrição='" + descricao + '\'' +
                ", Desconto=" + desconto +
                "} " + super.toString() + "Valor real=" + valorDesconto();
    }
}
