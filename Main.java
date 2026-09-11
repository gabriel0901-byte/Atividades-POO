class Processador{
    String modelo;
    
    public Processador(String modelo) {
        this.modelo = modelo;   
    }
    public String getmodelo() {
        return this.modelo;         
    }
}
class MemoriaRAM {
    int capacidadeGB;
    
    public MemoriaRAM(int capacidadeGB) {
        this.capacidadeGB = capacidadeGB;
    }
    public int getcapacidadeGB(){
        return this.capacidadeGB;
    }
}

class Computador{
    String fabricante;
    Processador modelo;
    MemoriaRAM capacidadeGB;

    public Computador(String fabricante, Processador modelo, MemoriaRAM capacidade) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.capacidadeGB = capacidade;
    }
    public void exibirEspecificacoes() {
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Processador: " + modelo.getmodelo());
        System.out.println("Memória RAM: " + capacidadeGB.getcapacidadeGB() + "GB");
    }

} 
public class Main {
    public static void main(String[] args) {
        Processador proc = new Processador("Intel i7");
        MemoriaRAM ram = new MemoriaRAM(16);
        Computador pc = new Computador("Dell", proc, ram);
        pc.exibirEspecificacoes();
    }
}