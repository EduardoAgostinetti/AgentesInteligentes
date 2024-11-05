public class Filme {
    private String nome;
    private String genero;
    private int ano;
    private String atorPrincipal; // Novo atributo

    public Filme(String nome, String genero, int ano, String atorPrincipal) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.atorPrincipal = atorPrincipal; // Inicializa o novo atributo
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getAno() {
        return ano;
    }

    public String getAtorPrincipal() {
        return atorPrincipal; // Método para obter o ator principal
    }
}
