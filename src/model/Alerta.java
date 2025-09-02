package model;

public class Alerta {
    // Identificador único do alerta (PK)
    private Integer id;
    // Chave estrangeira para o produto relacionado ao alerta
    private Integer idProduto;
    private String tipoAlerta;
    private String dataCriacao;
    private String status;

    // Construtor
    public Alerta(Integer id, Integer idProduto, String tipoAlerta, String dataCriacao, String status) {
        this.id = id;
        this.idProduto = idProduto;
        this.tipoAlerta = tipoAlerta;
        this.dataCriacao = dataCriacao;
        this.status = status;
    }

    // Getters
    public Integer getId() { return id; }
    public Integer getIdProduto() { return idProduto; }
    public String getTipoAlerta() { return tipoAlerta; }
    public String getDataCriacao() { return dataCriacao; }
    public String getStatus() { return status; }
}
