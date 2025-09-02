package model;

public class Produto {
    // Identificador único do produto (PK)
    private Integer id;
    // Chave estrangeira para unidade de medida do produto
    private Integer idUnidadeMedida;
    private String nome;
    private Double preco;
    private Double estoqueMinimo;

    // Construtor
    public Produto(Integer id, Integer idUnidadeMedida, String nome, Double preco, Double estoqueMinimo) {
        this.id = id;
        this.idUnidadeMedida = idUnidadeMedida;
        this.nome = nome;
        this.preco = preco;
        this.estoqueMinimo = estoqueMinimo;
    }

    // Getters
    public Integer getId() { return id; }
    public Integer getIdUnidadeMedida() { return idUnidadeMedida; }
    public String getNome() { return nome; }
    public Double getPreco() { return preco; }
    public Double getEstoqueMinimo() { return estoqueMinimo; }
}
