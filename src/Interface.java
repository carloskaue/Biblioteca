import java.util.Scanner;

public class Interface {
    private  ListadeColegas meusColgas;
    private  ListaLivros meusLivros;
    Scanner teclado = new Scanner ( System.in );

    public Interface()
    {
        meusColgas = new ListadeColegas ();
        meusLivros = new ListaLivros ();
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

    public void listaTodosOsLivrosAZ() {
        meusLivros.ordenaNomeAZ ();
        String nome = "Nome";
        String autor = "Autor";
        String id = "ID";
        String situacao = "Situação";
        System.out.printf ( "%50s %20s %10s %20s\n", nome, autor, id, situacao );
        for(int i = 0; i < meusLivros.size (); i++){
            Livro c = meusLivros.getLivro ( i );
            System.out.printf ( "%50s %20s %10d %20s\n",
                    c.getNome ( ),  c.getAutor ( ),  c.getCodigo ( ) , c.getIdEmprestimoToString ());
        }

    }
    public void listaTodosOsLivrosId() {
        meusLivros.ordenarId ();
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
    public void listaTodosOsColegasAZ() {
        meusColgas.ordenaNomeAZ ();
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
    public void listaTodosOsColegasId() {
        meusColgas.ordenarId ();
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

    public void exibirMenu() {
        System.out.println ("\n\nMenu Biblioteca:\n" +
                "0 - Sair:\n" +
                "1 - Cadastro de Colega:\n" +
                "2 - Cadastro de Livro:\n" +
                "3 - Cosultar Colega:\n" +
                "4 - Cosultar Livro:\n" +
                "5 - Emprestar Livro:\n" +
                "6 - Devolver Livro\n" +
                "7 - Listar Livros"
        );
    }


    void MenuLista(int i) {
        switch (i) {
            case 0: {// 0 - Sair
                System.out.println ( "Saindo..." );
            }
            break;
            case 1: {// 1 - Cadastro de Colega:
                cadastroDeColega();
            }
            break;
            case 2: {// 2 - Cadastro de Livro
                cadastroDeLivros ();
            }
            break;
            case 3: {// 3 - Cosultar Colega
                consultarColega();
            }
            break;
            case 4: {// 4 - Cosultar Livro
                consultarLivro();
            }
            break;
            case 5: {// 5 - Emprestar Livro
                emprestimoDeLivro();
            }
            break;
            case 6: {// 6 - Devolver Livro
                devolverLivro();

            }break;
            case 7: {// 7 - Listar Livros
                listaTodosOsLivrosAZ();

            }
            break;
            default: {
                System.out.println ( "Opção Invalida" );
            }
        }

    }



    private void consultarColega() {
        meusColgas.ordenarId ();
        boolean flag = false;
        System.out.print ( "\nNome: " );
        String str = teclado.nextLine ( );
        for (int i = 0; i < meusColgas.size ( ); i++) {
            if(this.meusColgas.getColega (i).getNome ().toUpperCase ().contains  (str.toUpperCase ()))
            {
                flag = true;
                System.out.println ( "\nNome: " + meusColgas.getColega (i).getNome ()+
                        "\nTelefone: " + meusColgas.getColega (i).getTelefone () +
                        "\nID: "+ meusColgas.getColega (i).getCodigo () +
                        "\nNumeros de Livros emprestados: " + meusColgas.getColega (i).getNumLivros ()
                );
            }

        }
        if(flag == false)
        {
            System.out.println ("Contato não encontrado");
        }
    }
    private void consultarLivro()  {
        meusLivros.ordenarId ();

        boolean flag = false;
        System.out.print ( "\nNome do livro: " );
        String str = teclado.nextLine ( );
        for (int i = 0; i < meusLivros.size ( ); i++) {
            if(this.meusLivros.getLivro (i).getNome ().toUpperCase ().contains (str.toUpperCase ()))
            {
                flag = true;
                System.out.print ( "\nNome: " + meusLivros.getLivro (i).getNome ()  + "\n" +
                        "Autor: " + meusLivros.getLivro (i).getAutor () + "\n" +
                        "Valor: "  + meusLivros.getLivro (i).getValor () + "\n" +
                        "ID: " +  meusLivros.getLivro (i).getCodigo () + "\n" +
                        "Situação:"    );
                if( (meusLivros.getLivro (i).getIdEmprestimo ()) >  0) System.out.println (meusColgas.getColega ((meusLivros.getLivro (i).getIdEmprestimo ())));
                else System.out.println (meusLivros.getLivro (i).getIdEmprestimoToString ());

            }
        }
        if(flag == false)
        {
            System.out.println ("Livro não encontrado");
        }




    }

    private void cadastroDeColega() {
        Colega c = new Colega ();
        System.out.print ( "\nNome: " );
        c.setNome ( teclado.nextLine ( ) );
        System.out.print ( "\nTelefone Celular:" );
        c.setTelefone ( teclado.nextLine ( ) );
        meusColgas.addColega (c);
    }
    private void cadastroDeLivros() {
        Livro l = new Livro ();
        System.out.print ("\nNome: " );
        l.setNome (teclado.nextLine ( )  );
        System.out.print("\nAutor: " );
        l.setAutor (teclado.nextLine ( ) );
        meusLivros.addLivro (l);
    }

    private void emprestimoDeLivro()
    {
        boolean flag  = false;
        int indiceLivro;
        int indiceColega;

        System.out.println ("Qual o livro a ser emprestado?");
        String str = teclado.nextLine ();
        System.out.println ("\n Livro:");
        for (int i = 0; i < meusLivros.size ( ); i++) {
            if(this.meusLivros.getLivro (i).getNome ().toUpperCase ().contains (str.toUpperCase ()))
            {
                System.out.print ( "\n" +
                        "Nome: "     + meusLivros.getLivro (i).getNome ()                   + "\n" +
                        "Autor: "    + meusLivros.getLivro (i).getAutor ()                  + "\n" +
                        "Valor: "    + meusLivros.getLivro (i).getValor ()                  + "\n" +
                        "ID: "       + meusLivros.getLivro (i).getCodigo ()                 + "\n" +
                        "Situação: ");
                if( (meusLivros.getLivro (i).getIdEmprestimo ()) >  0) System.out.println (meusColgas.getColega ((meusLivros.getLivro (i).getIdEmprestimo ())));
                else System.out.println (meusLivros.getLivro (i).getIdEmprestimoToString ());

                flag = true;
            }
        }
        if(!flag) {System.out.println ("Livro não encontrado"); return;}

        System.out.println ("Id do Livro a ser emprestado?");
        indiceLivro = teclado.nextInt ();
        teclado.nextLine ();
        if(meusLivros.getLivro (indiceLivro-1).getIdEmprestimo () != -1)
        {
            System.out.println ("Livro não pode ser emprestado");
            return;
        }
        System.out.println ("Qual colega está emprestando?");
        str = teclado.nextLine ( );
        for (int i = 0; i < meusColgas.size ( ); i++) {
            if(this.meusColgas.getColega (i).getNome ().toUpperCase ().contains  (str.toUpperCase ()))
            {
                flag = true;
                System.out.println ( "\nNome: " + meusColgas.getColega (i).getNome ()+
                        "\nTelefone: " + meusColgas.getColega (i).getTelefone () +
                        "\n ID: "+ meusColgas.getColega (i).getCodigo ());
            }

        }
        if(flag == false) { System.out.println ("Contato não encontrado"); return; }
        System.out.println ("Id do colega?");
        indiceColega = teclado.nextInt ();
        teclado.nextLine ();

        meusLivros.ordenarId ();
        System.out.println ("Livro: " + meusLivros.getLivro ((indiceLivro-1))+ "\n" +
                        "Colega: " + meusColgas.getColega (indiceColega-1) + "\n");
        meusLivros.getLivro ((indiceLivro-1)).setIdEmprestimo (indiceColega-1);
        meusColgas.getColega (indiceColega - 1).increaseNumLivros ();


    }

    private void devolverLivro() {
        int indiceLivro;
        int indiceColega;

        System.out.println ("Qual o livro a ser emprestado?");
        String str = teclado.nextLine ();

        
    }
}
