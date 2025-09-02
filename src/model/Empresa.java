package model;

public class Empresa {
    // Identificador único da empresa (PK)
    private Integer id;
    // Chave estrangeira para o endereço da empresa
    private Integer idEndereco;
    private String nome;
    private String cnpj;

    // Construtor
    public Empresa(Integer id, Integer idEndereco, String nome, String cnpj) {
        this.id = id;
        this.idEndereco = idEndereco;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    // Getters
    public Integer getId() { return id; }
    public Integer getIdEndereco() { return idEndereco; }
    public String getNome() { return nome; }
    public String getCnpj() { return cnpj; }
}
