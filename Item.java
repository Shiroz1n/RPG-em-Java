public class Item {
    private String nome;
    private String tipo;

    public Item(String nome, String tipo) {
        this.nome = nome;
        this.tipo= tipo;
    }
  

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    // getters and setters
    // ...
}