
public class Boss1 extends Personagem {
    String nome="Garbodor";
    String descricao="Pilha de lixo gigante viva que se alimenta de mais lixo que se transforma em veneno dentro de seu corpo, é um trasher só que maior e bem mais forte.";
    private int vida=160;
    private int dano=20;
    private double armadura=10;
    
       
        
    
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
    
  
    
    
    
    
        @Override
        public void defender() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'defender'");
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
    
        
        @Override
        public void receberDano(int dano) {
            double resistencia= dano*(armadura/100);
        double danoFinal= dano-resistencia; 
        this.vida-=danoFinal;
            if (this.vida <= 0) {
               System.out.println(this.nome + " foi derrotado.");
            }
         }
    
    
        @Override
        public void atacar(Personagem heroi) {
            System.out.println(""+this.nome + " te atacou");

            int ataque= this.dano;
           heroi.receberDano(ataque);  
        }
    
      
      
        
    }
    

