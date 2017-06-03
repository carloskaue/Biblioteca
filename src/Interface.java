
public class Interface {
    private static ListadeColegas meusColgas;
    private static  ListaLivros meusLivros;

    public Interface()
    {
        Colega c1 = new Colega ( "Fulano", "12345678");
        Colega c2 = new Colega ( "Dagoberto", "159753");
        Colega c3 = new Colega ( "Anacleto", "123478900");
        Colega c4 = new Colega ( "Ediberto", "123");
        Colega c5 = new Colega ( "Beltrano", "123456780");
        Colega c6 = new Colega ( "Cilano", "987654");


        meusColgas.addColega(c1);
        meusColgas.addColega(c2);
        meusColgas.addColega(c3);
        meusColgas.addColega(c4);
        meusColgas.addColega(c5);
        meusColgas.addColega(c6);

        Livro l1 = new Livro ("Senhor dos Aneis: A Sociedade do Anel", " J. R. R. Tolkien");
        Livro l2 = new Livro ("Senhor dos Aneis: As Duas Torres", " J. R. R. Tolkien");
        Livro l3 = new Livro ("Senhor dos Aneis: O Retorno do Rei", " J. R. R. Tolkien");

        Livro l4 = new Livro ("Guerra do Velho", "Jonh Scalzi");
        Livro l5 = new Livro ("Ciclo das Trevas II: A Lança do deserto", "Peter V. Brentt");
        Livro l6 = new Livro ("Ciclo das Trevas I: O Protegido", "Peter V. Brentt");

        meusLivros.addLivro (l1);
        meusLivros.addLivro (l2);
        meusLivros.addLivro (l3);
        meusLivros.addLivro (l4);
        meusLivros.addLivro (l5);
        meusLivros.addLivro (l6);

    }

    public void listaTodosOsLivros() {
        String nome = "Nome";
        String autor = "Autor";
        String id = "ID";
        String situacao = "Situação";

        System.out.printf ( "%50s %20s %10s %20s\n", nome, autor, id, situacao );
        for (int i = 0; i < meusLivros.size ( ); i++) {

            int situacaoEmprestimo = meusLivros.getLivro (i).getIdEmprestimo ();

            if (situacaoEmprestimo != (-1)) {
                situacao = meusColgas.getColega (situacaoEmprestimo).getNome ();
            } else {
                situacao = "Disponivel";
            }
            Livro c = meusLivros.getLivro ( i );
            System.out.printf ( "%50s %20s %10d %20s\n",
                    c.getNome ( ),  c.getAutor ( ),  c.getCodigo ( ) , situacao);
        }
    }

    public void listaTodosOsColegas() {
        String nome = "Nome";
        String telefone = "Telefone";
        String id = "ID";

        System.out.printf ( "%50s %20s %10s\n", nome, telefone, id );
        for (int i = 0; i < meusColgas.size ( ); i++) {
            Colega c = meusColgas.getColega ( i );
            System.out.printf ( "%50s %20s %10d\n",
                    c.getNome ( ),  c.getTelefone ( ),  c.getCodigo ( ) );
        }
    }

    public String exibirMenu() {
        return ("\n\nMenu Biblioteca:\n" +
                "0 - Sair:\n" +
                "1 - Cadastro de Colega:\n" +
                "1 - Cadastro de Livro:\n" +
                "2 - Cosultar Colega:\n" +
                "3 - Cosultar Livro:\n" +
                "4 - Emprestar Livro:\n" +
                "5 - Devolver Livro\n" +
                "6 - Listar Livros"
        );
    }
}
