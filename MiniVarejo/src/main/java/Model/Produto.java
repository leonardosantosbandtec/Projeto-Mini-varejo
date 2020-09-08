package Model;

public abstract class Produto implements Desconto{

    private Integer codigo;
    private Double preco;
    private Integer unidade;

    public Produto(Integer codigo, Double preco, Integer unidade) {
        this.codigo = codigo;
        this.preco = preco;
        this.unidade = unidade;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getUnidade() {
        return unidade;
    }

    public void setUnidade(Integer unidade) {
        this.unidade = unidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", preco=" + preco +
                ", unidade=" + unidade +
                '}';
    }
}
