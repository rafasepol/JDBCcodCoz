package model;

public class NotaFiscalXML {
    // Identificador único da nota fiscal (PK)
    private Integer id;
    // Chave estrangeira para a empresa que emitiu a nota
    private Integer idEmpresa;
    private String numeroNota;
    private String dataEmissao;
    private String arquivoXml;

    // Construtor
    public NotaFiscalXML(Integer id, Integer idEmpresa, String numeroNota, String dataEmissao, String arquivoXml) {
        this.id = id;
        this.idEmpresa = idEmpresa;
        this.numeroNota = numeroNota;
        this.dataEmissao = dataEmissao;
        this.arquivoXml = arquivoXml;
    }

    // Getters
    public Integer getId() { return id; }
    public Integer getIdEmpresa() { return idEmpresa; }
    public String getNumeroNota() { return numeroNota; }
    public String getDataEmissao() { return dataEmissao; }
    public String getArquivoXml() { return arquivoXml; }
}
