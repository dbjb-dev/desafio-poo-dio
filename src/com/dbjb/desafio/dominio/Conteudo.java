package com.dbjb.desafio.dominio;

import java.time.format.DateTimeFormatter;

public abstract class Conteudo
{
    protected static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descricao)
    {
        this.descricao = descricao;
    }

    public abstract double calcularXP();
}
