package model;

public class Funcionario {
    // Identificador único do funcionário (PK)
    private Integer id;
    // Chave estrangeira para a empresa onde o funcionário trabalha
    private Integer idEmpresa;
    // Chave estrangeira para a função/cargo do funcionário
    private Integer idFuncao;
    private String nome;
    private String sobrenome;
    private String cpf;
    private Double salario;
    private String dataAdmissao;

    // Construtor com todos os atributos
    public Funcionario(Integer id, Integer idEmpresa, Integer idFuncao, String nome,
                       String sobrenome, String cpf, Double salario, String dataAdmissao) {
        this.id = id;
        this.idEmpresa = idEmpresa;
        this.idFuncao = idFuncao;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    // Getters
    public Integer getId() { return id; }
    public Integer getIdEmpresa() { return idEmpresa; }
    public Integer getIdFuncao() { return idFuncao; }
    public String getNome() { return nome; }
    public String getSobrenome() { return sobrenome; }
    public String getCpf() { return cpf; }
    public Double getSalario() { return salario; }
    public String getDataAdmissao() { return dataAdmissao; }
}
