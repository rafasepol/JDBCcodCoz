package model;

public class ItemNotaFiscal {
    // Identificador único do item da nota (PK)
    private Integer id;

    // Chave estrangeira para a nota fiscal
    private Integer idNotaFiscalXml;
    // Chave estrangeira para o produto
    private Integer idProduto;
    private Double quantidade;
    private Double precoUnitario;

    // Construtor
    public ItemNotaFiscal(Integer id, Integer idNotaFiscalXml, Integer idProduto, Double quantidade, Double precoUnitario) {
        this.id = id;
        this.idNotaFiscalXml = idNotaFiscalXml;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // Getters
    public Integer getId() { return id; }
    public Integer getIdNotaFiscalXml() { return idNotaFiscalXml; }
    public Integer getIdProduto() { return idProduto; }
    public Double getQuantidade() { return quantidade; }
    public Double getPrecoUnitario() { return precoUnitario; }
}
