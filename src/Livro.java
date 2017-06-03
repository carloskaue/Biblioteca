/**
 * Created by carlos on 03/06/17.
 */
public class Livro {
    private String nome;
    private String autor;
    private int codigo;
    private String telefone;
    private double valor;

    public void setNome(String nome){ this.nome = nome;}
    public String getNome(){return nome;}

    public void setAutor(String autor){ this.autor = autor;}
    public String getAutor(){return autor;}

    public void setTelefone(String telefone){ this.telefone = telefone;}
    public String getTelefone(){return telefone;}

    public void setValor(double valor){ this.valor = valor;}
    public String getValor(){return ("R$"+valor);}

    public  void setCodigo(int codigo){this.codigo = codigo;}
    public  int getCodigo(){return  codigo;}
}
