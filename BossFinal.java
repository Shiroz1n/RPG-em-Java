
import java.util.ArrayList;

public class BossFinal extends Personagem  {
private int vida=100;
private String nome;
private int dano=44;

   
    

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getVida() {
    return vida;
}

public void setVida(int vida) {
    this.vida = vida;
}

//atacar vilao
public void atacar(Heroi heroi){
    int ataque= this.dano;

    heroi.perderVida(ataque);
    
}

public void perderVida(int ataque){
    this.vida-=ataque;
    System.out.println(this.nome + " perde " + ataque + " pontos de vida!");
    if(this.vida<0){
        System.out.println(this.nome + " foi derrotado!");

    }
}

//mochila
public void pegarItem(String item){
    ArrayList<String> mochila= new ArrayList<>();
    mochila.add(item);
}



    @Override
    public int uparDeLevel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'uparDeLevel'");
    }

    @Override
    public int curar(Personagem roit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'curar'");
    }

    

    public void receberDano(int dano) {
        this.vida = this.vida- dano;
        if (this.vida <= 0) {
           System.out.println(this.nome + " foi derrotado.");
        }
     }

    @Override
    public void atacar(Personagem inimigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atacar'");
    }
  
    
}
