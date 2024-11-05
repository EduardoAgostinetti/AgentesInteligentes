import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
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
                    // Recomendação de filmes
                    List<Filme> filmesFiltrados = recomendarFilmesPorGenero(listaDeFilmes, genero);
                    // Permitir que o usuário selecione um filme
                    escolherFilme(filmesFiltrados, scanner);
                } else {
                    System.out.println("Gênero inválido. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número ou 'quit' para sair.");
            }
        }
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
                // Voltar ao menu de gêneros
                return;
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

    public static void addFilmes(List<Filme> listaDeFilmes) {
        // Adicionando filmes por gênero

        // Ação
        listaDeFilmes.add(new Filme("Mad Max: Estrada da Fúria", "Ação", 2015, "Tom Hardy"));
        listaDeFilmes.add(new Filme("Vingadores: Ultimato", "Ação", 2019, "Robert Downey Jr."));
        listaDeFilmes.add(new Filme("O Homem de Ferro", "Ação", 2008, "Robert Downey Jr."));
        listaDeFilmes.add(new Filme("Deadpool", "Ação", 2016, "Ryan Reynolds"));
        listaDeFilmes.add(new Filme("John Wick", "Ação", 2014, "Keanu Reeves"));
        listaDeFilmes.add(new Filme("Mad Max 2: A Caçada Continua", "Ação", 1981, "Mel Gibson"));
        listaDeFilmes.add(new Filme("Os Mercenários", "Ação", 2010, "Sylvester Stallone"));
        listaDeFilmes.add(new Filme("Missão: Impossível", "Ação", 1996, "Tom Cruise"));
        listaDeFilmes.add(new Filme("Duro de Matar", "Ação", 1988, "Bruce Willis"));
        listaDeFilmes.add(new Filme("Gladiador", "Ação", 2000, "Russell Crowe"));
        listaDeFilmes.add(new Filme("O Exterminador do Futuro", "Ação", 1984, "Arnold Schwarzenegger"));
        listaDeFilmes.add(new Filme("Os Vingadores", "Ação", 2012, "Chris Evans"));
        listaDeFilmes.add(new Filme("Jurassic World", "Ação", 2015, "Chris Pratt"));
        listaDeFilmes.add(new Filme("Kingsman: Serviço Secreto", "Ação", 2014, "Taron Egerton"));
        listaDeFilmes.add(new Filme("A Batalha dos 5 Exércitos", "Ação", 2014, "Martin Freeman"));
        listaDeFilmes.add(new Filme("Bourne: A Supremacia", "Ação", 2004, "Matt Damon"));

        // Animação
        listaDeFilmes.add(new Filme("O Rei Leão", "Animação", 1994, "Matthew Broderick"));
        listaDeFilmes.add(new Filme("Toy Story", "Animação", 1995, "Tom Hanks"));
        listaDeFilmes.add(new Filme("Procurando Nemo", "Animação", 2003, "Albert Brooks"));
        listaDeFilmes.add(new Filme("Coco", "Animação", 2017, "Anthony Gonzalez"));
        listaDeFilmes.add(new Filme("Shrek", "Animação", 2001, "Mike Myers"));
        listaDeFilmes.add(new Filme("Os Incríveis", "Animação", 2004, "Craig T. Nelson"));
        listaDeFilmes.add(new Filme("Os Croods", "Animação", 2013, "Nicolas Cage"));
        listaDeFilmes.add(new Filme("Zootopia", "Animação", 2016, "Ginnifer Goodwin"));
        listaDeFilmes.add(new Filme("A Bela e a Fera", "Animação", 1991, "Paige O'Hara"));
        listaDeFilmes.add(new Filme("Aladdin", "Animação", 1992, "Scott Weinger"));
        listaDeFilmes.add(new Filme("A Era do Gelo", "Animação", 2002, "Ray Romano"));
        listaDeFilmes.add(new Filme("Moana", "Animação", 2016, "Auli'i Cravalho"));
        listaDeFilmes.add(new Filme("Ratatouille", "Animação", 2007, "Patton Oswalt"));
        listaDeFilmes.add(new Filme("Valente", "Animação", 2012, "Kelly Macdonald"));
        listaDeFilmes.add(new Filme("Divertida Mente", "Animação", 2015, "Amy Poehler"));
        listaDeFilmes.add(new Filme("O Corcunda de Notre Dame", "Animação", 1996, "Tom Hulce"));

        // Drama
        listaDeFilmes.add(new Filme("Forrest Gump", "Drama", 1994, "Tom Hanks"));
        listaDeFilmes.add(new Filme("O Poderoso Chefão", "Drama", 1972, "Marlon Brando"));
        listaDeFilmes.add(new Filme("Cidadão Kane", "Drama", 1941, "Orson Welles"));
        listaDeFilmes.add(new Filme("A Lista de Schindler", "Drama", 1993, "Liam Neeson"));
        listaDeFilmes.add(new Filme("O Pianista", "Drama", 2002, "Adrien Brody"));
        listaDeFilmes.add(new Filme("Braveheart", "Drama", 1995, "Mel Gibson"));
        listaDeFilmes.add(new Filme("O Curioso Caso de Benjamin Button", "Drama", 2008, "Brad Pitt"));
        listaDeFilmes.add(new Filme("Menina de Ouro", "Drama", 2004, "Hilary Swank"));
        listaDeFilmes.add(new Filme("O Vôo", "Drama", 2012, "Denzel Washington"));
        listaDeFilmes.add(new Filme("Um Sonho de Liberdade", "Drama", 1994, "Tim Robbins"));
        listaDeFilmes.add(new Filme("A Forma da Água", "Drama", 2017, "Sally Hawkins"));
        listaDeFilmes.add(new Filme("Intocáveis", "Drama", 2011, "François Cluzet"));
        listaDeFilmes.add(new Filme("Sociedade dos Poetas Mortos", "Drama", 1989, "Robin Williams"));
        listaDeFilmes.add(new Filme("A Rede Social", "Drama", 2010, "Jesse Eisenberg"));
        listaDeFilmes.add(new Filme("As Vantagens de Ser Invisível", "Drama", 2012, "Logan Lerman"));
        listaDeFilmes.add(new Filme("A Espera de Um Milagre", "Drama", 1999, "Tom Hanks"));
        listaDeFilmes.add(new Filme("A Teoria de Tudo", "Drama", 2014, "Eddie Redmayne"));
        listaDeFilmes.add(new Filme("Trainspotting", "Drama", 1996, "Ewan McGregor"));
        listaDeFilmes.add(new Filme("Histórias Cruzadas", "Drama", 2011, "Viola Davis"));
        listaDeFilmes.add(new Filme("O Lobo de Wall Street", "Drama", 2013, "Leonardo DiCaprio"));

        // Ficção Científica
        listaDeFilmes.add(new Filme("A Matrix", "Ficção Científica", 1999, "Keanu Reeves"));
        listaDeFilmes.add(new Filme("Blade Runner", "Ficção Científica", 1982, "Harrison Ford"));
        listaDeFilmes.add(new Filme("Star Wars: Episódio IV - Uma Nova Esperança", "Ficção Científica", 1977, "Mark Hamill"));
        listaDeFilmes.add(new Filme("Inception", "Ficção Científica", 2010, "Leonardo DiCaprio"));
        listaDeFilmes.add(new Filme("Ex Machina", "Ficção Científica", 2014, "Domhnall Gleeson"));
        listaDeFilmes.add(new Filme("Elysium", "Ficção Científica", 2013, "Matt Damon"));
        listaDeFilmes.add(new Filme("Interstellar", "Ficção Científica", 2014, "Matthew McConaughey"));
        listaDeFilmes.add(new Filme("Mad Max: Estrada da Fúria", "Ficção Científica", 2015, "Tom Hardy"));
        listaDeFilmes.add(new Filme("Gattaca", "Ficção Científica", 1997, "Ethan Hawke"));
        listaDeFilmes.add(new Filme("O Hospedeiro", "Ficção Científica", 2006, "Song Kang-ho"));
        listaDeFilmes.add(new Filme("Minority Report", "Ficção Científica", 2002, "Tom Cruise"));
        listaDeFilmes.add(new Filme("A Chegada", "Ficção Científica", 2016, "Amy Adams"));
        listaDeFilmes.add(new Filme("2001: Uma Odisseia no Espaço", "Ficção Científica", 1968, "Keir Dullea"));
        listaDeFilmes.add(new Filme("Os Suspeitos", "Ficção Científica", 1995, "Kevin Spacey"));
        listaDeFilmes.add(new Filme("O Hospedeiro", "Ficção Científica", 2006, "Song Kang-ho"));
        listaDeFilmes.add(new Filme("A.I. - Inteligência Artificial", "Ficção Científica", 2001, "Haley Joel Osment"));

        // Comédia
        listaDeFilmes.add(new Filme("Pulp Fiction", "Comédia", 1994, "John Travolta"));
        listaDeFilmes.add(new Filme("O Grande Lebowski", "Comédia", 1998, "Jeff Bridges"));
        listaDeFilmes.add(new Filme("Os Caça-Fantasmas", "Comédia", 1984, "Bill Murray"));
        listaDeFilmes.add(new Filme("O Fabuloso Destino de Amélie Poulain", "Comédia", 2001, "Audrey Tautou"));
        listaDeFilmes.add(new Filme("Uma Noite no Museu", "Comédia", 2006, "Ben Stiller"));
        listaDeFilmes.add(new Filme("Se Beber, Não Case!", "Comédia", 2009, "Bradley Cooper"));
        listaDeFilmes.add(new Filme("A Perseguição", "Comédia", 1996, "Martin Lawrence"));
        listaDeFilmes.add(new Filme("As Branquelas", "Comédia", 2004, "Marlon Wayans"));
        listaDeFilmes.add(new Filme("O Virgem de 40 Anos", "Comédia", 2005, "Steve Carell"));
        listaDeFilmes.add(new Filme("Um Príncipe em Nova York", "Comédia", 1988, "Eddie Murphy"));
        listaDeFilmes.add(new Filme("O Mentiroso", "Comédia", 1997, "Jim Carrey"));
        listaDeFilmes.add(new Filme("Como Perder um Homem em 10 Dias", "Comédia", 2003, "Kate Hudson"));
        listaDeFilmes.add(new Filme("A Morte Lhe Cai Bem", "Comédia", 1992, "Meryl Streep"));
        listaDeFilmes.add(new Filme("A Família Addams", "Comédia", 1991, "Anjelica Huston"));
        listaDeFilmes.add(new Filme("Os Estagiários", "Comédia", 2013, "Owen Wilson"));
        listaDeFilmes.add(new Filme("A Primeira Noite de um Homem", "Comédia", 1967, "Dustin Hoffman"));

        // Terror
        listaDeFilmes.add(new Filme("O Silêncio dos Inocentes", "Terror", 1991, "Jodie Foster"));
        listaDeFilmes.add(new Filme("O Exorcista", "Terror", 1973, "Linda Blair"));
        listaDeFilmes.add(new Filme("Tubarão", "Terror", 1975, "Roy Scheider"));
        listaDeFilmes.add(new Filme("A Noite dos Mortos-Vivos", "Terror", 1968, "Duane Jones"));
        listaDeFilmes.add(new Filme("O Labirinto", "Terror", 2006, "Ivana Baquero"));
        listaDeFilmes.add(new Filme("Atividade Paranormal", "Terror", 2007, "Katie Featherston"));
        listaDeFilmes.add(new Filme("Halloween", "Terror", 1978, "Jamie Lee Curtis"));
        listaDeFilmes.add(new Filme("O Chamado", "Terror", 2002, "Naomi Watts"));
        listaDeFilmes.add(new Filme("Hereditário", "Terror", 2018, "Toni Collette"));
        listaDeFilmes.add(new Filme("It: A Coisa", "Terror", 2017, "Bill Skarsgård"));
        listaDeFilmes.add(new Filme("O Que Fazemos nas Sombras", "Terror", 2014, "Jemaine Clement"));
        listaDeFilmes.add(new Filme("Corra!", "Terror", 2017, "Daniel Kaluuya"));
        listaDeFilmes.add(new Filme("A Noite dos Mortos-Vivos", "Terror", 1968, "Duane Jones"));
        listaDeFilmes.add(new Filme("Anabelle", "Terror", 2014, "Annabelle Wallis"));
        listaDeFilmes.add(new Filme("O Olho do Mal", "Terror", 2018, "Chloe Grace Moretz"));
        listaDeFilmes.add(new Filme("A Morte Te Paga", "Terror", 2017, "Jessica Rothe"));

        // Comédia Romântica
        listaDeFilmes.add(new Filme("10 Coisas que Eu Odeio em Você", "Comédia Romântica", 1999, "Heath Ledger"));
        listaDeFilmes.add(new Filme("A Proposta", "Comédia Romântica", 2009, "Sandra Bullock"));
        listaDeFilmes.add(new Filme("A Verdade Nua e Crua", "Comédia Romântica", 2009, "Katherine Heigl"));
        listaDeFilmes.add(new Filme("Amizade Colorida", "Comédia Romântica", 2011, "Justin Timberlake"));
        listaDeFilmes.add(new Filme("O Melhor Amigo da Noiva", "Comédia Romântica", 2008, "Josh Duhamel"));
        listaDeFilmes.add(new Filme("De Repente 30", "Comédia Romântica", 2004, "Jennifer Garner"));
        listaDeFilmes.add(new Filme("Simplesmente Acontece", "Comédia Romântica", 2014, "Lily Collins"));
        listaDeFilmes.add(new Filme("Como Perder um Homem em 10 Dias", "Comédia Romântica", 2003, "Kate Hudson"));
        listaDeFilmes.add(new Filme("O Casamento do Meu Melhor Amigo", "Comédia Romântica", 1997, "Julia Roberts"));
        listaDeFilmes.add(new Filme("Ela é o Cara", "Comédia Romântica", 2006, "Amanda Bynes"));
        listaDeFilmes.add(new Filme("As Patricinhas de Beverly Hills", "Comédia Romântica", 1995, "Alicia Silverstone"));
        listaDeFilmes.add(new Filme("O Diário da Princesa", "Comédia Romântica", 2001, "Anne Hathaway"));
        listaDeFilmes.add(new Filme("Um Lugar Chamado Notting Hill", "Comédia Romântica", 1999, "Hugh Grant"));
        listaDeFilmes.add(new Filme("Ligeiramente Grávidos", "Comédia Romântica", 2007, "Seth Rogen"));
        listaDeFilmes.add(new Filme("O Amor e Outros Desastres", "Comédia Romântica", 2006, "Brittany Murphy"));
        listaDeFilmes.add(new Filme("A Caverna", "Comédia Romântica", 2014, "Ruben Fleischer"));

        // Crime
        listaDeFilmes.add(new Filme("Os Bons Companheiros", "Crime", 1990, "Ray Liotta"));
        listaDeFilmes.add(new Filme("Os Infiltrados", "Crime", 2006, "Leonardo DiCaprio"));
        listaDeFilmes.add(new Filme("Pulp Fiction", "Crime", 1994, "John Travolta"));
        listaDeFilmes.add(new Filme("Clube da Luta", "Crime", 1999, "Brad Pitt"));
        listaDeFilmes.add(new Filme("O Lobo de Wall Street", "Crime", 2013, "Leonardo DiCaprio"));
        listaDeFilmes.add(new Filme("Scarface", "Crime", 1983, "Al Pacino"));
        listaDeFilmes.add(new Filme("O Poderoso Chefão", "Crime", 1972, "Marlon Brando"));
        listaDeFilmes.add(new Filme("Cidade de Deus", "Crime", 2002, "Alexandre Rodrigues"));
        listaDeFilmes.add(new Filme("Um Tira da Pesada", "Crime", 1984, "Eddie Murphy"));
        listaDeFilmes.add(new Filme("Prenda-me se For Capaz", "Crime", 2002, "Leonardo DiCaprio"));
        listaDeFilmes.add(new Filme("Nascido para Matar", "Crime", 1987, "Matthew Modine"));
        listaDeFilmes.add(new Filme("A Origem", "Crime", 2010, "Leonardo DiCaprio"));
        listaDeFilmes.add(new Filme("O Franco Atirador", "Crime", 1978, "Robert De Niro"));
        listaDeFilmes.add(new Filme("O Exterminador do Futuro", "Crime", 1984, "Arnold Schwarzenegger"));
        listaDeFilmes.add(new Filme("Chinatown", "Crime", 1974, "Jack Nicholson"));

        // Fantasia
        listaDeFilmes.add(new Filme("O Senhor dos Anéis: A Sociedade do Anel", "Fantasia", 2001, "Elijah Wood"));
        listaDeFilmes.add(new Filme("Harry Potter e a Pedra Filosofal", "Fantasia", 2001, "Daniel Radcliffe"));
        listaDeFilmes.add(new Filme("A Origem", "Fantasia", 2010, "Leonardo DiCaprio"));
        listaDeFilmes.add(new Filme("A Forma da Água", "Fantasia", 2017, "Sally Hawkins"));
        listaDeFilmes.add(new Filme("Alice no País das Maravilhas", "Fantasia", 2010, "Mia Wasikowska"));
        listaDeFilmes.add(new Filme("O Labirinto do Fauno", "Fantasia", 2006, "Ivana Baquero"));
        listaDeFilmes.add(new Filme("O Rei Leão", "Fantasia", 1994, "Matthew Broderick"));
        listaDeFilmes.add(new Filme("Matilda", "Fantasia", 1996, "Mara Wilson"));
        listaDeFilmes.add(new Filme("O Fabuloso Destino de Amélie Poulain", "Fantasia", 2001, "Audrey Tautou"));
        listaDeFilmes.add(new Filme("O Gigante de Ferro", "Fantasia", 1999, "Eli Marienthal"));
        listaDeFilmes.add(new Filme("A Bússola de Ouro", "Fantasia", 2007, "Nicole Kidman"));
        listaDeFilmes.add(new Filme("As Crônicas de Nárnia: O Leão, a Feiticeira e o Guarda-Roupa", "Fantasia", 2005, "Georgie Henley"));
        listaDeFilmes.add(new Filme("Como Treinar o Seu Dragão", "Fantasia", 2010, "Jay Baruchel"));
        listaDeFilmes.add(new Filme("O Estranho Mundo de Jack", "Fantasia", 1993, "Danny Elfman"));
        listaDeFilmes.add(new Filme("Percy Jackson e o Ladrão de Raios", "Fantasia", 2010, "Logan Lerman"));

        // Ficção Científica
        listaDeFilmes.add(new Filme("A Matrix", "Ficção Científica", 1999, "Keanu Reeves"));
        listaDeFilmes.add(new Filme("Blade Runner", "Ficção Científica", 1982, "Harrison Ford"));
        listaDeFilmes.add(new Filme("Donnie Darko", "Ficção Científica", 2001, "Jake Gyllenhaal"));
        listaDeFilmes.add(new Filme("Star Wars: Episódio IV - Uma Nova Esperança", "Ficção Científica", 1977, "Mark Hamill"));
        listaDeFilmes.add(new Filme("Ex Machina", "Ficção Científica", 2014, "Alicia Vikander"));
        listaDeFilmes.add(new Filme("Gattaca", "Ficção Científica", 1997, "Ethan Hawke"));
        listaDeFilmes.add(new Filme("Interestelar", "Ficção Científica", 2014, "Matthew McConaughey"));
        listaDeFilmes.add(new Filme("Elysium", "Ficção Científica", 2013, "Matt Damon"));
        listaDeFilmes.add(new Filme("A Chegada", "Ficção Científica", 2016, "Amy Adams"));
        listaDeFilmes.add(new Filme("O Livro de Eli", "Ficção Científica", 2010, "Denzel Washington"));
        listaDeFilmes.add(new Filme("O Hospedeiro", "Ficção Científica", 2006, "Bae Doona"));
        listaDeFilmes.add(new Filme("O Hospedeiro", "Ficção Científica", 2006, "Bae Doona"));
        listaDeFilmes.add(new Filme("O Sorriso da Mona Lisa", "Ficção Científica", 2003, "Julia Roberts"));
        listaDeFilmes.add(new Filme("Jogos Vorazes", "Ficção Científica", 2012, "Jennifer Lawrence"));
        listaDeFilmes.add(new Filme("Transformers", "Ficção Científica", 2007, "Shia LaBeouf"));

        // Ação
        listaDeFilmes.add(new Filme("Mad Max: Estrada da Fúria", "Ação", 2015, "Tom Hardy"));
        listaDeFilmes.add(new Filme("Os Vingadores", "Ação", 2012, "Robert Downey Jr."));
        listaDeFilmes.add(new Filme("John Wick", "Ação", 2014, "Keanu Reeves"));
        listaDeFilmes.add(new Filme("Die Hard", "Ação", 1988, "Bruce Willis"));
        listaDeFilmes.add(new Filme("Gladiador", "Ação", 2000, "Russell Crowe"));
        listaDeFilmes.add(new Filme("Duro de Matar", "Ação", 1988, "Bruce Willis"));
        listaDeFilmes.add(new Filme("Mad Max 2: A Caçada Continua", "Ação", 1981, "Mel Gibson"));
        listaDeFilmes.add(new Filme("Vingadores: Ultimato", "Ação", 2019, "Robert Downey Jr."));
        listaDeFilmes.add(new Filme("Jurassic World", "Ação", 2015, "Chris Pratt"));
        listaDeFilmes.add(new Filme("Transformers", "Ação", 2007, "Shia LaBeouf"));
        listaDeFilmes.add(new Filme("O Exterminador do Futuro", "Ação", 1984, "Arnold Schwarzenegger"));
        listaDeFilmes.add(new Filme("Missão Impossível: Protocolo Fantasma", "Ação", 2011, "Tom Cruise"));
        listaDeFilmes.add(new Filme("A Origem", "Ação", 2010, "Leonardo DiCaprio"));
        listaDeFilmes.add(new Filme("Kingsman: Serviço Secreto", "Ação", 2014, "Taron Egerton"));
        listaDeFilmes.add(new Filme("O Resgate do Soldado Ryan", "Ação", 1998, "Tom Hanks"));

        // Animação
        listaDeFilmes.add(new Filme("Toy Story", "Animação", 1995, "Tom Hanks"));
        listaDeFilmes.add(new Filme("O Rei Leão", "Animação", 1994, "Matthew Broderick"));
        listaDeFilmes.add(new Filme("Procurando Nemo", "Animação", 2003, "Albert Brooks"));
        listaDeFilmes.add(new Filme("Madagascar", "Animação", 2005, "Ben Stiller"));
        listaDeFilmes.add(new Filme("Coco", "Animação", 2017, "Anthony Gonzalez"));
        listaDeFilmes.add(new Filme("Os Incríveis", "Animação", 2004, "Craig T. Nelson"));
        listaDeFilmes.add(new Filme("Divertida Mente", "Animação", 2015, "Amy Poehler"));
        listaDeFilmes.add(new Filme("Shrek", "Animação", 2001, "Mike Myers"));
        listaDeFilmes.add(new Filme("Os Croods", "Animação", 2013, "Nicolas Cage"));
        listaDeFilmes.add(new Filme("Como Treinar o Seu Dragão", "Animação", 2010, "Jay Baruchel"));
        listaDeFilmes.add(new Filme("Zootopia", "Animação", 2016, "Ginnifer Goodwin"));
        listaDeFilmes.add(new Filme("A Era do Gelo", "Animação", 2002, "Ray Romano"));
        listaDeFilmes.add(new Filme("Valente", "Animação", 2012, "Kelly Macdonald"));
        listaDeFilmes.add(new Filme("A Pequena Sereia", "Animação", 1989, "Jodi Benson"));
        listaDeFilmes.add(new Filme("Hotel Transylvania", "Animação", 2012, "Adam Sandler"));

        // Drama
        listaDeFilmes.add(new Filme("Forrest Gump", "Drama", 1994, "Tom Hanks"));
        listaDeFilmes.add(new Filme("Cidadão Kane", "Drama", 1941, "Orson Welles"));
        listaDeFilmes.add(new Filme("A Lista de Schindler", "Drama", 1993, "Liam Neeson"));
        listaDeFilmes.add(new Filme("O Pianista", "Drama", 2002, "Adrien Brody"));
        listaDeFilmes.add(new Filme("O Curioso Caso de Benjamin Button", "Drama", 2008, "Brad Pitt"));
        listaDeFilmes.add(new Filme("Menina de Ouro", "Drama", 2004, "Hilary Swank"));
        listaDeFilmes.add(new Filme("Um Sonho de Liberdade", "Drama", 1994, "Tim Robbins"));
        listaDeFilmes.add(new Filme("A Rede Social", "Drama", 2010, "Jesse Eisenberg"));
        listaDeFilmes.add(new Filme("Intocáveis", "Drama", 2011, "François Cluzet"));
        listaDeFilmes.add(new Filme("A Estrada", "Drama", 2009, "Viggo Mortensen"));
        listaDeFilmes.add(new Filme("Clube da Luta", "Drama", 1999, "Brad Pitt"));
        listaDeFilmes.add(new Filme("As Vantagens de Ser Invisível", "Drama", 2012, "Logan Lerman"));
        listaDeFilmes.add(new Filme("Cisne Negro", "Drama", 2010, "Natalie Portman"));
        listaDeFilmes.add(new Filme("O Vôo", "Drama", 2012, "Denzel Washington"));
        listaDeFilmes.add(new Filme("O Labirinto do Fauno", "Drama", 2006, "Ivana Baquero"));

        // Biografia
        listaDeFilmes.add(new Filme("O Lobo de Wall Street", "Biografia", 2013, "Leonardo DiCaprio"));
        listaDeFilmes.add(new Filme("A Rede Social", "Biografia", 2010, "Jesse Eisenberg"));
        listaDeFilmes.add(new Filme("A Teoria de Tudo", "Biografia", 2014, "Eddie Redmayne"));
        listaDeFilmes.add(new Filme("Uma Mente Brilhante", "Biografia", 2001, "Russell Crowe"));
        listaDeFilmes.add(new Filme("O Jogo da Imitação", "Biografia", 2014, "Benedict Cumberbatch"));
        listaDeFilmes.add(new Filme("Bohemian Rhapsody", "Biografia", 2018, "Rami Malek"));
        listaDeFilmes.add(new Filme("Steve Jobs", "Biografia", 2015, "Michael Fassbender"));
        listaDeFilmes.add(new Filme("Rocketman", "Biografia", 2019, "Taron Egerton"));
        listaDeFilmes.add(new Filme("Selma", "Biografia", 2014, "David Oyelowo"));
        listaDeFilmes.add(new Filme("Walk the Line", "Biografia", 2005, "Joaquin Phoenix"));
        listaDeFilmes.add(new Filme("Frida", "Biografia", 2002, "Salma Hayek"));
        listaDeFilmes.add(new Filme("Ray", "Biografia", 2004, "Jamie Foxx"));
        listaDeFilmes.add(new Filme("Joy: O Nome do Sucesso", "Biografia", 2015, "Jennifer Lawrence"));
        listaDeFilmes.add(new Filme("O Homem que Mudou o Jogo", "Biografia", 2011, "Brad Pitt"));
        listaDeFilmes.add(new Filme("A Conquista da Honra", "Biografia", 2006, "Ryan Phillippe"));

        // Documentário
        listaDeFilmes.add(new Filme("A Inconvenient Truth", "Documentário", 2006, "Al Gore"));
        listaDeFilmes.add(new Filme("O Atentado de 11 de Setembro", "Documentário", 2006, "Vários"));
        listaDeFilmes.add(new Filme("13th", "Documentário", 2016, "Ava DuVernay"));
        listaDeFilmes.add(new Filme("Jiro Dreams of Sushi", "Documentário", 2011, "Jiro Ono"));
        listaDeFilmes.add(new Filme("O Que é o Que É?", "Documentário", 2018, "Vários"));
        listaDeFilmes.add(new Filme("Won't You Be My Neighbor?", "Documentário", 2018, "Fred Rogers"));
        listaDeFilmes.add(new Filme("The Act of Killing", "Documentário", 2012, "Vários"));
        listaDeFilmes.add(new Filme("American Factory", "Documentário", 2019, "Vários"));
        listaDeFilmes.add(new Filme("O Dilema das Redes", "Documentário", 2020, "Vários"));
        listaDeFilmes.add(new Filme("The Social Dilemma", "Documentário", 2020, "Vários"));
        listaDeFilmes.add(new Filme("A História do Documentário", "Documentário", 2021, "Vários"));
        listaDeFilmes.add(new Filme("O Maravilhoso Mundo de Mickey Mouse", "Documentário", 2020, "Vários"));
        listaDeFilmes.add(new Filme("My Octopus Teacher", "Documentário", 2020, "Craig Foster"));
        listaDeFilmes.add(new Filme("Searching for Sugar Man", "Documentário", 2012, "Malik Bendjelloul"));
        listaDeFilmes.add(new Filme("Exit Through the Gift Shop", "Documentário", 2010, "Banksy"));

        // Terror
        listaDeFilmes.add(new Filme("O Exorcista", "Terror", 1973, "Linda Blair"));
        listaDeFilmes.add(new Filme("A Noite dos Mortos-Vivos", "Terror", 1968, "Duane Jones"));
        listaDeFilmes.add(new Filme("O Iluminado", "Terror", 1980, "Jack Nicholson"));
        listaDeFilmes.add(new Filme("Psycho", "Terror", 1960, "Anthony Perkins"));
        listaDeFilmes.add(new Filme("Halloween", "Terror", 1978, "Jamie Lee Curtis"));
        listaDeFilmes.add(new Filme("A Bruxa", "Terror", 2015, "Anya Taylor-Joy"));
        listaDeFilmes.add(new Filme("Hereditário", "Terror", 2018, "Toni Collette"));
        listaDeFilmes.add(new Filme("Corra!", "Terror", 2017, "Daniel Kaluuya"));
        listaDeFilmes.add(new Filme("A Entidade", "Terror", 2012, "Ethan Hawke"));
        listaDeFilmes.add(new Filme("A Freira", "Terror", 2018, "Demián Bichir"));
        listaDeFilmes.add(new Filme("Invocação do Mal", "Terror", 2013, "Vera Farmiga"));
        listaDeFilmes.add(new Filme("O chamado", "Terror", 2002, "Naomi Watts"));
        listaDeFilmes.add(new Filme("Um Lugar Silencioso", "Terror", 2018, "Emily Blunt"));
        listaDeFilmes.add(new Filme("O Babadook", "Terror", 2014, "Essie Davis"));
        listaDeFilmes.add(new Filme("A Estrada", "Terror", 2009, "Viggo Mortensen"));
    }

    public static List<Filme> recomendarFilmesPorGenero(List<Filme> listaDeFilmes, String genero) {
        List<Filme> filmesFiltrados = new ArrayList<>();
        Random random = new Random();

        // Filtrando filmes pelo gênero
        for (Filme filme : listaDeFilmes) {
            if (filme.getGenero().equalsIgnoreCase(genero)) {
                filmesFiltrados.add(filme);
            }
        }

        // Se houver filmes filtrados, selecionar até 10 aleatórios
        List<Filme> filmesRecomendados = new ArrayList<>();
        if (!filmesFiltrados.isEmpty()) {
            int quantidadeParaRecomendar = Math.min(filmesFiltrados.size(), 10);
            while (filmesRecomendados.size() < quantidadeParaRecomendar) {
                Filme filmeAleatorio = filmesFiltrados.get(random.nextInt(filmesFiltrados.size()));
                // Evitar duplicatas
                if (!filmesRecomendados.contains(filmeAleatorio)) {
                    filmesRecomendados.add(filmeAleatorio);
                }
            }
        } else {
            System.out.println("Não há filmes no gênero \"" + genero + "\".");
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
