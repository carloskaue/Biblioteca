import java.util.Collections;

/**
 * Created by carlos on 03/06/17.
 */
public class Colega implements Comparable<Colega>{
    private String nome;
    private int codigo;
    private String telefone;

    public  Colega(){super();}
    public Colega(String nome,String telefone)
    {
        super();
        this. telefone = telefone;
        this.nome = nome;
    }
    public void setNome(String nome){ this.nome = nome;}
    public String getNome(){return nome;}

    public void setTelefone(String telefone){ this.telefone = telefone;}
    public String getTelefone(){return telefone;}

    public  void setCodigo(int codigo){this.codigo = codigo;}
    public  int getCodigo(){return  codigo;}
    public  String  getCodigoString(){return Integer.toString (codigo);}

    public int compareTo(Colega c) {
        return this.nome.compareToIgnoreCase ( c.nome );
        // usando metodo compareToIgnoreCase da classe String
    }

    public String toString() {
        return nome;
    }
}
