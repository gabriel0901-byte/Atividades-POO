class Pessoa {
    String nome;
    int idade;
    double altura;
    double peso;
    String profissao;


    public Pessoa(String nome, int idade, double altura, double peso, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.profissao = profissao;
    }

    public void apresentar() {
        System.out.println("Olá! Meu nome é " + this.nome + ", tenho " + this.idade + " anos e trabalho como " + this.profissao);
    }

    public void fazerAniversario() {
        this.idade++;
        System.out.println("Parabéns! " + this.nome + " agora tem " + this.idade + " anos");
    }


    public void calcularIMC() {
        double imc = this.peso / (this.altura * this.altura);
        System.out.printf("O IMC de " + this.nome + " é " + imc + "%n");
    }
}

public class atividade02  {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana Silva", 28, 1.65, 60.0, "Desenvolvedora");

        Pessoa p2 = new Pessoa("Carlos Eduardo", 35, 1.80, 85.5, "Engenheiro");

        System.out.println("--- PESSOA 1 ---");
        p1.apresentar();
        p1.calcularIMC();
        p1.fazerAniversario();

        System.out.println("--- Pessoa 2 ---");
        p2.apresentar();
        p2.calcularIMC();
        p2.fazerAniversario();
    }
}