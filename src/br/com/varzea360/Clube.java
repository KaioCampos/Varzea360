package br.com.varzea360;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Clube {
    private int id;
    private String nome;
    private String abreviacao;
    private LocalDate dataFundacao;
    private String cidade;
    private DonoDoClube dono;
    private List<Jogador> elenco;

    public Clube(int id, String nome, String abreviacao, LocalDate dataFundacao, String cidade, DonoDoClube dono){
        this.id = id;
        this.nome = nome;
        this.abreviacao = abreviacao;
        this.dataFundacao = dataFundacao;
        this.cidade = cidade;
        this.dono = dono;
        this.elenco = new ArrayList<>(); //inicia a lista vazia para evitar erros ao adicionar jogadores
    }

    public void adicionarJogador(Jogador jogador){
        this.elenco.add(jogador);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(LocalDate dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public DonoDoClube getDono() {
        return dono;
    }

    public void setDono(DonoDoClube dono) {
        this.dono = dono;
    }

    public List<Jogador> getElenco() {
        return elenco;
    }
}
