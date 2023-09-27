import java.util.ArrayList;
import java.util.List;

public class Mochila {
    private List<Item> itens;

    public Mochila() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    
    public boolean temItem(String nomeItem) {
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nomeItem)) {
                return true;
            }
        }
        return false;
    }

    public void removerItem(Item item) {
        this.itens.remove(item);
    }
   
   
    public void listarItens() {
        for (Item item : itens) {
        System.out.println("itens: "+item.getNome());
    
    }

    
   


}
    public Item[] getItens() {
        return null;
    }

    // getters and setters
    // ...
}