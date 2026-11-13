package br.com.varzea360;
import java.time.LocalDate;

public class Competicao {
    private int id;
    private String formato;
    private double premiacao;
    private String nome;
    private String abreviacao;
    private String tipo;
    private int temporada;
    private String organizador;
    private LocalDate dataInicio;
    private LocalDate dataFim;


    
    public Competicao(int id, String formato, double premiacao, String nome, String abreviacao, String tipo,
            int temporada, String organizador, LocalDate dataInicio, LocalDate dataFim) {
        this.id = id;
        this.formato = formato;
        this.premiacao = premiacao;
        this.nome = nome;
        this.abreviacao = abreviacao;
        this.tipo = tipo;
        this.temporada = temporada;
        this.organizador = organizador;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    


    public int getId() {
        return id;
    }

    public String getFormato() {
        return formato;
    }

    public double getPremiacao() {
        return premiacao;
    }

    public String getNome() {
        return nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public String getTipo() {
        return tipo;
    }

    public int getTemporada() {
        return temporada;
    }

    public String getOrganizador() {
        return organizador;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setPremiacao(double premiacao) {
        this.premiacao = premiacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    
}   
