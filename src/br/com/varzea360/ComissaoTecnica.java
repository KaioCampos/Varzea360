package br.com.varzea360;
import java.time.LocalDate;

public class ComissaoTecnica extends Usuario{
    private String cpf;
    private String nome;
    private LocalDate dataNasc;
    private String nacionalidade;
    private String telefone;
    private String email;
    private String endereco;


    public ComissaoTecnica(int id, String nome, String email, String senha, String cpf, String nome,
            LocalDate dataNasc, String nacionalidade, String telefone, String email2, String endereco) {
        super(id, nome, email, senha);
        this.cpf = cpf;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.nacionalidade = nacionalidade;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }


    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public LocalDate getDataNasc() {
        return dataNasc;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public String getEndereco() {
        return endereco;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    
    
}
