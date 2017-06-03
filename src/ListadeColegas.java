/**
 * Created by carlos on 03/06/17.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListadeColegas {
    private ArrayList<Colega> listaColegas;

    public ListadeColegas() {
        listaColegas = new ArrayList<Colega> ( );
    }

    public void addColega(Colega contato) {
        listaColegas.add ( contato );
        contato.setCodigo ( listaColegas.size ());
    }

    public Colega getColega(int indice) {
        return listaColegas.get ( indice );
    }

    public int size() {
        return listaColegas.size ( );
    }

    public void ordenaNomeAZ() {
        Collections.sort ( listaColegas );
    }

    public void ordenarId() {
        Collections.sort (listaColegas, new Comparator<Colega> ( ) {
            @Override
            public int compare(Colega c1, Colega c2) {
                return c1.getCodigoString ().compareTo (c2.getCodigoString ());
            }
        });

    }



    public Colega getContato(int indice) {
        return listaColegas.get ( indice );
    }


}

