class Personagem {
    String nome;
    int vida;
    int nivel;

    public Personagem(String nome, int vida, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
    }

    public void sofrerDano(int quantidadeDano) {
        this.vida -= quantidadeDano;
        
        if (this.vida <= 0) {
            this.vida = 0;
            System.out.println(this.nome + " foi derrotado!");
        } else {
            System.out.println(this.nome + " sofreu " + quantidadeDano + " de dano. Vida restante: " + this.vida);
        }
    }
}

public class teste {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Radagon", 10, 15);

        p1.sofrerDano(5);  
        p1.sofrerDano(10); 
    }
}