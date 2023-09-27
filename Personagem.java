


abstract public class Personagem    { 
    private int vida;
    private String nome;
    private int dano;
    private int velocidade;


    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public abstract int curar(Personagem personagem);

    //denfender na questão de tomar menos dano

    public abstract int uparDeLevel();

    public abstract void receberDano(int dano);

    public abstract void atacar(Personagem inimigo);

    public void perderVida(int ataque) {
    }


    
    }


