package Social;
import java.util.ArrayList;

public class Feed {
    private ArrayList<Postagem> publicacoes;

    public Feed(ArrayList<Postagem> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public ArrayList<Postagem> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(ArrayList<Postagem> publicacoes) {
        this.publicacoes = publicacoes;
    }
}
