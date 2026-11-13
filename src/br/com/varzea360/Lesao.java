package br.com.varzea360;

public class Lesao {

    private int id;
    private String gravidade;
    private String tipo;
    private String parteCorpo;
    private String descricao;
    private LocalDate data;
    private LocalDate retornoPrevisto;
    private String status;
    private boolean duranteJogo;

    public Lesao(int id, String gravidade, String tipo, String parteCorpo, String descricao, LocalDate data,
            LocalDate retornoPrevisto, String status, boolean duranteJogo) {
        this.id = id;
        this.gravidade = gravidade;
        this.tipo = tipo;
        this.parteCorpo = parteCorpo;
        this.descricao = descricao;
        this.data = data;
        this.retornoPrevisto = retornoPrevisto;
        this.status = status;
        this.duranteJogo = duranteJogo;
    }

    public int getId() {
        return id;
    }

    public String getGravidade() {
        return gravidade;
    }

    public String getTipo() {
        return tipo;
    }

    public String getParteCorpo() {
        return parteCorpo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalDate getRetornoPrevisto() {
        return retornoPrevisto;
    }

    public String getStatus() {
        return status;
    }

    public boolean isDuranteJogo() {
        return duranteJogo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setParteCorpo(String parteCorpo) {
        this.parteCorpo = parteCorpo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setRetornoPrevisto(LocalDate retornoPrevisto) {
        this.retornoPrevisto = retornoPrevisto;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDuranteJogo(boolean duranteJogo) {
        this.duranteJogo = duranteJogo;
    }


}

