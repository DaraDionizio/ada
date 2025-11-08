package estudosJava;

import java.time.LocalDate;

public class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataDeEntrega;
    private Boolean concluida;

    //Metodo Construtor
    public Tarefa(String titulo, String descricao, LocalDate dataDeEntrega){
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataDeEntrega = dataDeEntrega;
        this.concluida = false;
    }

    @Override // essêncial para acessar as variaveis e não o endereço de memoria delas.
    public String toString(){
        return "Tarefa: \n " +
                "titulo = " + titulo + "\n" +
                " descrição = " + descricao + "\n" +
                " dataEntrega = " + dataDeEntrega + "\n" +
                " concluida = " + concluida + "\n";
    }
/*
    @Override             --- string
public String toString() {
    return String.format(
        "Tarefa { título='%s', descrição='%s', dataEntrega=%s, concluída=%s }",
        titulo, descricao, dataDeEntrega, concluida
    );
}
*/

    //Métodos com Geters e Seters
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public LocalDate getDataDeEntrega (){
        return dataDeEntrega;
    }
    public void setDataDeEntrega(LocalDate dataDeEntrega){
        this.dataDeEntrega = dataDeEntrega;
    }
    public Boolean getConcluida(){
        return concluida;
    }
    public void setConcluida(Boolean concluida){
        this.concluida = concluida;
    }
}
