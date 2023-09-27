
public class Boss2 extends Personagem {
    String nome="Serpente de Gás";
    String descricao="Uma nuvem de gás tóxico em forma de cobra que tem inteligência própria";
    //Antes da batalha a cobra ira fazer 3 perguntas ao personagem principal relacionadas ao meio ambiente
    private int vida=15;
    
    private int dano=10;
    private double armadura;
    
       
        
    
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

