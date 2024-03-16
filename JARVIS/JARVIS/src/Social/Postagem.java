package Social;

import java.util.ArrayList;

public class Postagem {
    private String texto;
    private String dataPostagem;
    private Integer curtidas;
    private ArrayList<Comentario> comentarios;

    public Postagem(String texto, String dataPostagem, Integer curtidas, ArrayList<Comentario> comentarios) {
        this.texto = texto;
        this.dataPostagem = dataPostagem;
        this.curtidas = curtidas;
        this.comentarios = comentarios;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(String dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    public void curtir(){
        this.curtidas = this.curtidas + 1;
    }
}
