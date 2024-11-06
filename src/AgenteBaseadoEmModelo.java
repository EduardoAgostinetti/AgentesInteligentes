import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class AgenteBaseadoEmModelo {

    private static final Map<String, List<Filme>> historicoDeRecomendacoesPorGenero = new HashMap<>();

    public static void startAgenteBaseadoEmModelo() {
        Scanner scanner = new Scanner(System.in);
        List<Filme> listaDeFilmes = new ArrayList<>();
        addFilmes(listaDeFilmes);

        while (true) {
            System.out.println("Escolha um gênero para receber recomendações de filmes:");
            System.out.println("1 - Drama");
            System.out.println("2 - Terror");
            System.out.println("3 - Ação");
            System.out.println("4 - Comédia");
            System.out.println("5 - Fantasia");
            System.out.println("6 - Ficção Científica");
            System.out.println("7 - Crime");
            System.out.println("8 - Animação");
            System.out.println("Digite 'quit' para sair.");

            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            int generoEscolhido;
            try {
                generoEscolhido = Integer.parseInt(input);
                String genero = obterGeneroPorNumero(generoEscolhido);
                if (genero != null) {
                    List<Filme> filmesFiltrados = recomendarFilmesPorGenero(listaDeFilmes, genero);
                    escolherFilme(filmesFiltrados, scanner);
                } else {
                    System.out.println("Gênero inválido. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número ou 'quit' para sair.");
            }
        }
    }

    public static void addFilmes(List<Filme> listaDeFilmes) {
        listaDeFilmes.add(new Filme("O Pianista", "Drama", 2002, "Adrien Brody"));
        listaDeFilmes.add(new Filme("Forrest Gump", "Drama", 1994, "Tom Hanks"));
        listaDeFilmes.add(new Filme("Clube da Luta", "Drama", 1999, "Brad Pitt"));
        listaDeFilmes.add(new Filme("A Lista de Schindler", "Drama", 1993, "Liam Neeson"));
        listaDeFilmes.add(new Filme("A Teoria de Tudo", "Drama", 2014, "Eddie Redmayne"));
        listaDeFilmes.add(new Filme("O Lado Bom da Vida", "Drama", 2012, "Bradley Cooper"));
        listaDeFilmes.add(new Filme("O Poderoso Chefão", "Drama", 1972, "Marlon Brando"));
        listaDeFilmes.add(new Filme("O Vingador do Futuro", "Drama", 1990, "Arnold Schwarzenegger"));
        listaDeFilmes.add(new Filme("12 Anos de Escravidão", "Drama", 2013, "Chiwetel Ejiofor"));
        listaDeFilmes.add(new Filme("Menina de Ouro", "Drama", 2004, "Hilary Swank"));

        listaDeFilmes.add(new Filme("O Exorcista", "Terror", 1973, "Linda Blair"));
        listaDeFilmes.add(new Filme("O Iluminado", "Terror", 1980, "Jack Nicholson"));
        listaDeFilmes.add(new Filme("Atividade Paranormal", "Terror", 2007, "Katie Featherston"));
        listaDeFilmes.add(new Filme("Invocação do Mal", "Terror", 2013, "Vera Farmiga"));
        listaDeFilmes.add(new Filme("Hereditary", "Terror", 2018, "Toni Collette"));
        listaDeFilmes.add(new Filme("O Sexto Sentido", "Terror", 1999, "Bruce Willis"));
        listaDeFilmes.add(new Filme("A Noite dos Mortos Vivos", "Terror", 1968, "Duane Jones"));
        listaDeFilmes.add(new Filme("Psicose", "Terror", 1960, "Anthony Perkins"));
        listaDeFilmes.add(new Filme("A Bruxa", "Terror", 2015, "Anya Taylor-Joy"));
        listaDeFilmes.add(new Filme("Midsommar", "Terror", 2019, "Florence Pugh"));


        listaDeFilmes.add(new Filme("Mad Max: Estrada da Fúria", "Ação", 2015, "Tom Hardy"));
        listaDeFilmes.add(new Filme("Vingadores: Ultimato", "Ação", 2019, "Robert Downey Jr."));
        listaDeFilmes.add(new Filme("John Wick", "Ação", 2014, "Keanu Reeves"));
        listaDeFilmes.add(new Filme("Duro de Matar", "Ação", 1988, "Bruce Willis"));
        listaDeFilmes.add(new Filme("Matrix", "Ação", 1999, "Keanu Reeves"));
        listaDeFilmes.add(new Filme("Gladiador", "Ação", 2000, "Russell Crowe"));
        listaDeFilmes.add(new Filme("Batman: O Cavaleiro das Trevas", "Ação", 2008, "Christian Bale"));
        listaDeFilmes.add(new Filme("Os Incríveis", "Ação", 2004, "Craig T. Nelson"));
        listaDeFilmes.add(new Filme("Homem de Ferro", "Ação", 2008, "Robert Downey Jr."));
        listaDeFilmes.add(new Filme("O Exterminador do Futuro 2", "Ação", 1991, "Arnold Schwarzenegger"));

        listaDeFilmes.add(new Filme("Se Beber, Não Case!", "Comédia", 2009, "Bradley Cooper"));
        listaDeFilmes.add(new Filme("O Grande Lebowski", "Comédia", 1998, "Jeff Bridges"));
        listaDeFilmes.add(new Filme("Superbad - É Hoje", "Comédia", 2007, "Jonah Hill"));
        listaDeFilmes.add(new Filme("Apertem os Cintos... O Piloto Sumiu", "Comédia", 1980, "Robert Hays"));
        listaDeFilmes.add(new Filme("As Branquelas", "Comédia", 2004, "Marlon Wayans"));
        listaDeFilmes.add(new Filme("O Máskara", "Comédia", 1994, "Jim Carrey"));
        listaDeFilmes.add(new Filme("Ted", "Comédia", 2012, "Mark Wahlberg"));
        listaDeFilmes.add(new Filme("Um Príncipe em Nova York", "Comédia", 1988, "Eddie Murphy"));
        listaDeFilmes.add(new Filme("A Vida de Brian", "Comédia", 1979, "Graham Chapman"));
        listaDeFilmes.add(new Filme("Todo Mundo em Pânico", "Comédia", 2000, "Anna Faris"));

        listaDeFilmes.add(new Filme("O Senhor dos Anéis: A Sociedade do Anel", "Fantasia", 2001, "Elijah Wood"));
        listaDeFilmes.add(new Filme("Harry Potter e a Pedra Filosofal", "Fantasia", 2001, "Daniel Radcliffe"));
        listaDeFilmes.add(new Filme("O Mágico de Oz", "Fantasia", 1939, "Judy Garland"));
        listaDeFilmes.add(new Filme("Alice no País das Maravilhas", "Fantasia", 2010, "Johnny Depp"));
        listaDeFilmes.add(new Filme("Pantera Negra", "Fantasia", 2018, "Chadwick Boseman"));
        listaDeFilmes.add(new Filme("O Labirinto do Fauno", "Fantasia", 2006, "Ivana Baquero"));
        listaDeFilmes.add(new Filme("Stardust - O Mistério da Estrela", "Fantasia", 2007, "Claire Danes"));
        listaDeFilmes.add(new Filme("O Hobbit: Uma Jornada Inesperada", "Fantasia", 2012, "Martin Freeman"));
        listaDeFilmes.add(new Filme("Dumbo", "Fantasia", 2019, "Colin Farrell"));
        listaDeFilmes.add(new Filme("Eragon", "Fantasia", 2006, "Ed Speleers"));

        listaDeFilmes.add(new Filme("Blade Runner", "Ficção Científica", 1982, "Harrison Ford"));
        listaDeFilmes.add(new Filme("Interstellar", "Ficção Científica", 2014, "Matthew McConaughey"));
        listaDeFilmes.add(new Filme("2001: Uma Odisseia no Espaço", "Ficção Científica", 1968, "Keir Dullea"));
        listaDeFilmes.add(new Filme("O Exterminador do Futuro", "Ficção Científica", 1984, "Arnold Schwarzenegger"));
        listaDeFilmes.add(new Filme("De Volta para o Futuro", "Ficção Científica", 1985, "Michael J. Fox"));
        listaDeFilmes.add(new Filme("A Origem", "Ficção Científica", 2010, "Leonardo DiCaprio"));
        listaDeFilmes.add(new Filme("Star Wars: Uma Nova Esperança", "Ficção Científica", 1977, "Mark Hamill"));
        listaDeFilmes.add(new Filme("Elysium", "Ficção Científica", 2013, "Matt Damon"));
        listaDeFilmes.add(new Filme("The Matrix Revolutions", "Ficção Científica", 2003, "Keanu Reeves"));
        listaDeFilmes.add(new Filme("Gattaca - A Experiência Genética", "Ficção Científica", 1997, "Ethan Hawke"));

        listaDeFilmes.add(new Filme("O Poderoso Chefão", "Crime", 1972, "Marlon Brando"));
        listaDeFilmes.add(new Filme("Pulp Fiction: Tempo de Violência", "Crime", 1994, "John Travolta"));
        listaDeFilmes.add(new Filme("Os Bons Companheiros", "Crime", 1990, "Robert De Niro"));
        listaDeFilmes.add(new Filme("O Lobo de Wall Street", "Crime", 2013, "Leonardo DiCaprio"));
        listaDeFilmes.add(new Filme("Scarface", "Crime", 1983, "Al Pacino"));
        listaDeFilmes.add(new Filme("Seven: Os Sete Crimes Capitais", "Crime", 1995, "Brad Pitt"));
        listaDeFilmes.add(new Filme("Casino", "Crime", 1995, "Robert De Niro"));
        listaDeFilmes.add(new Filme("Os Infiltrados", "Crime", 2006, "Leonardo DiCaprio"));
        listaDeFilmes.add(new Filme("O Grande Lebowski", "Crime", 1998, "Jeff Bridges"));
        listaDeFilmes.add(new Filme("A Origem", "Crime", 2010, "Leonardo DiCaprio"));

        listaDeFilmes.add(new Filme("Toy Story", "Animação", 1995, "Tom Hanks"));
        listaDeFilmes.add(new Filme("O Rei Leão", "Animação", 1994, "Matthew Broderick"));
        listaDeFilmes.add(new Filme("Procurando Nemo", "Animação", 2003, "Albert Brooks"));
        listaDeFilmes.add(new Filme("Shrek", "Animação", 2001, "Mike Myers"));
        listaDeFilmes.add(new Filme("Os Incríveis", "Animação", 2004, "Craig T. Nelson"));
        listaDeFilmes.add(new Filme("Up - Altas Aventuras", "Animação", 2009, "Ed Asner"));
        listaDeFilmes.add(new Filme("Frozen: Uma Aventura Congelante", "Animação", 2013, "Idina Menzel"));
        listaDeFilmes.add(new Filme("Vingadores: Ultimato", "Animação", 2019, "Robert Downey Jr."));
        listaDeFilmes.add(new Filme("Moana: Um Mar de Aventuras", "Animação", 2016, "Auli'i Cravalho"));
        listaDeFilmes.add(new Filme("Divertida Mente", "Animação", 2015, "Amy Poehler"));

    }

    public static void escolherFilme(List<Filme> filmesFiltrados, Scanner scanner) {
        if (filmesFiltrados.isEmpty()) {
            return; // Nenhum filme disponível
        }

        System.out.println("Digite o número do filme que você gostaria de escolher ou '0' para voltar ao menu de gêneros:");
        for (int i = 0; i < filmesFiltrados.size(); i++) {
            System.out.println((i + 1) + " - " + filmesFiltrados.get(i).getNome());
        }

        String input = scanner.nextLine();
        try {
            int escolha = Integer.parseInt(input);
            if (escolha == 0) {
                return; // Voltar ao menu de gêneros
            } else if (escolha > 0 && escolha <= filmesFiltrados.size()) {
                Filme filmeEscolhido = filmesFiltrados.get(escolha - 1);
                System.out.println("Você escolheu o filme: " + filmeEscolhido.getNome());
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, insira um número.");
        }
    }

    public static List<Filme> recomendarFilmesPorGenero(List<Filme> listaDeFilmes, String genero) {
        List<Filme> filmesFiltrados = new ArrayList<>();
        Random random = new Random();

        // Inicializa o histórico do gênero se ainda não existir
        historicoDeRecomendacoesPorGenero.putIfAbsent(genero, new ArrayList<>());

        // Filtrando filmes pelo gênero e removendo os já recomendados
        for (Filme filme : listaDeFilmes) {
            if (filme.getGenero().equalsIgnoreCase(genero) &&
                    !historicoDeRecomendacoesPorGenero.get(genero).contains(filme)) {
                filmesFiltrados.add(filme);
            }
        }

        // Se todos os filmes já foram recomendados, reinicia o histórico para o gênero
        if (filmesFiltrados.isEmpty()) {
            System.out.println("Todos os filmes do gênero \"" + genero + "\" já foram recomendados. Reiniciando ciclo.");
            historicoDeRecomendacoesPorGenero.get(genero).clear();
            for (Filme filme : listaDeFilmes) {
                if (filme.getGenero().equalsIgnoreCase(genero)) {
                    filmesFiltrados.add(filme);
                }
            }
        }

        // Seleciona até 10 filmes aleatórios da lista filtrada
        List<Filme> filmesRecomendados = new ArrayList<>();
        int quantidadeParaRecomendar = Math.min(filmesFiltrados.size(), 5);
        while (filmesRecomendados.size() < quantidadeParaRecomendar) {
            Filme filmeAleatorio = filmesFiltrados.get(random.nextInt(filmesFiltrados.size()));
            if (!filmesRecomendados.contains(filmeAleatorio)) {
                filmesRecomendados.add(filmeAleatorio);
                historicoDeRecomendacoesPorGenero.get(genero).add(filmeAleatorio); // Adiciona ao histórico do gênero
            }
        }

        return filmesRecomendados;
    }

    public static String obterGeneroPorNumero(int numero) {
        switch (numero) {
            case 1: return "Drama";
            case 2: return "Terror";
            case 3: return "Ação";
            case 4: return "Comédia";
            case 5: return "Fantasia";
            case 6: return "Ficção Científica";
            case 7: return "Crime";
            case 8: return "Animação";
            default: return null; // Gênero inválido
        }
    }
}
