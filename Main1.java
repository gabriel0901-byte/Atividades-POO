package Associações;
class Comodo {
    private String nome;

    public Comodo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Casa {
    private String endereco;
    private Comodo comodo;
    private Pessoa morador;

    public Casa(String endereco, String nomeComodo) {
        this.endereco = endereco;
        this.comodo = new Comodo(nomeComodo); 
    }

    public void adicionarMorador(Pessoa pessoa) {
        this.morador = pessoa;
    }

    public void exibirInformacoes() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Cômodo: " + comodo.getNome());
        System.out.println("Morador: " + morador.getNome());
        System.out.println();
    }
}

public class Main1 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gabriel");
        Casa casa1 = new Casa("Varjota, em frente a igreja", "Quarto");
        casa1.adicionarMorador(p1);
        casa1.exibirInformacoes();
    }
}