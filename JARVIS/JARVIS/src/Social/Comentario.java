package Social;

public class Comentario {
private String texto;
private Usuario usuario;
private String data;

    public Comentario(String texto, Usuario usuario, String data) {
        this.texto = texto;
        this.usuario = usuario;
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
