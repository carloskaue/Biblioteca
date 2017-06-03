import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by carlos on 03/06/17.
 */
public class ListaLivros {
    private ArrayList<Livro> listaLivro;

    public ListaLivros() {
        listaLivro = new ArrayList<Livro> ( );
    }

    public void addLivro(Livro livro) {
        listaLivro.add ( livro );
        livro.setCodigo (listaLivro.size ());
    }

    public Livro getLivro(int indice) {
        return listaLivro.get ( indice );
    }

    public int size() {
        return listaLivro.size ( );
    }

    public void ordenaNomeAZ() {
        Collections.sort ( listaLivro );
    }

    public void ordenaId() {
        Collections.sort ( listaLivro, new Comparator<Livro> ( ) {
            public int compare(Livro l1, Livro l2) {
                return l1.getCodigoString ().compareTo (l2.getCodigoString ());
            }
        } );
    }

}
