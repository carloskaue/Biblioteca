/**
 * Created by carlos on 03/06/17.
 */
public class Livro implements Comparable<Livro> {
    private String nome;
    private String autor;
    private int codigo;
    private double valor;
    private int idEmprestimo = -1;

    public Livro(){super();}
    public Livro(String nome, String autor)
    {
        super();
        this.nome = nome;
        this.autor = autor;
    }

    public void setNome(String nome){ this.nome = nome;}
    public String getNome(){return nome;}

    public void setAutor(String autor){ this.autor = autor;}
    public String getAutor(){return autor;}

    public void setValor(double valor){ this.valor = valor;}
    public String getValor(){return ("R$"+valor);}

    public  void setCodigo(int codigo){this.codigo = codigo;}
    public  int getCodigo(){return codigo;}
    public  String  getCodigoString(){return Integer.toString (codigo);}

    public  void setIdEmprestimo(int idEmprestimo){ this.idEmprestimo = idEmprestimo;}
    public int getIdEmprestimo(){return idEmprestimo;}
    public String getIdEmprestimoToString()
    {
        if(idEmprestimo == -1) return "Disponível";
        else return Integer.toString ((idEmprestimo+1));
    }

    public String toString() {
        return nome;
    }

    public int compareTo(Livro l) {
        return this.nome.compareToIgnoreCase ( l.nome );
        // usando metodo compareToIgnoreCase da classe String
    }


}
