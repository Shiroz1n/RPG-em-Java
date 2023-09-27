
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import java.util.Scanner;

public class Heroi extends Personagem {
public Heroi heroi;
private String nome;
private String genero;
private int velocidade=1;
public Mochila mochila;
String lerTentar;
Historia historia;
Item item;
double armadura=3;
private int sementesDaVida=20;
private int contadorSementesDaVida=1;
private int level=1;
private int poder1=4;
private int vida=100;

private int poder2=5;
private int poder3=6;
private int poderEspecial=9;




Scanner leitor = new Scanner(System.in);

public int getPoderEspecial() {
    return poderEspecial;
}

public void setPoderEspecial(int poderEspecial) {
    this.poderEspecial = poderEspecial;
}

public int getPoder1() {
    return poder1;
}

public void setPoder1(int poder1) {
    this.poder1 = poder1;
}

public int getPoder2() {
    return poder2;
}

public void setPoder2(int poder2) {
    this.poder2 = poder2;
}

public int getPoder3() {
    return poder3;
}

public void setPoder3(int poder3) {
    this.poder3 = poder3;
}






    public Heroi() {
        
        mochila = new Mochila();
    }



public int getLevel() {
    return level;
}

public void setLevel(int level) {
    this.level = level;
}



public int getVelocidade() {
    return velocidade;
}

public void setVelocidade(int velocidade) {
    this.velocidade = velocidade;
}


public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getGenero() {
    return genero;
}

public void setGenero(String genero) {
    this.genero = genero;
}

public int getVida() {
    return vida;
}

public void setVida(int vida) {
    this.vida = vida;
}





//pegar item e colocar na mochila --- consertar dps 
public void pegarItem(Item item){
    mochila.adicionarItem(item);
}






@Override
public int curar(Personagem heroi){
  while(true){
    Scanner leitorcura= new Scanner(System.in);
    System.out.println("Deseja-se curar? [S=Sim /N=Não]= ");
    System.out.println("Quantidades de Sementes da Vida: "+contadorSementesDaVida);
    String resposta=leitorcura.nextLine();
    if(contadorSementesDaVida==0){
        System.out.println("Você não possui mais sementes da vida para se curar! ");
        System.out.println("Vida atual: "+heroi.getVida());
        break;
    }

    if(resposta.equals("N") || resposta.equals("n")){
        System.out.println("Não quis se curar!");
        break;
}

  
    if(resposta.equals("S")|| resposta.equals("s")){
    
    if(vida==100){
        System.out.println("Você não pode se curar pois está com a vida cheia!");
        vida=100;
        break;
    }else if(vida+sementesDaVida>100){
            System.out.println("Você se curou!");
            vida=100;
            contadorSementesDaVida-=1;
            System.out.println("Vida atual: "+getVida());

            break;

        }else if(vida<100){
            System.out.println("Você se curou!");
            vida+=sementesDaVida;
            contadorSementesDaVida-=1;

            System.out.println("Vida atual: "+getVida());
            break;
        }
  
}
  
}
return vida;
}


//escolher o nome do heroi
public void escolherNome(){
    System.out.print("Digite o seu nick: ");
    String leitorNome=leitor.next();
    setNome(leitorNome);
    System.out.println("Nome: " +getNome());







}

// escolher genero
public void escolherGenero(){

    System.out.print("Digite o seu gênero [M=Masculino] || [F=Feminino]: ");
    String leitorGenero=leitor.nextLine();
     
    if(leitorGenero.equals("M") || leitorGenero.equals("m")){
        setGenero("Masculino");
    
    }else if(leitorGenero.equals("F") || leitorGenero.equals("f")){
    setGenero("Feminino");;
    }
    
}


//atacar vilao com poder1
public void atacarComPoder1(Personagem inimigo){
    int ataque= this.poder1;
    System.out.println(this.nome + " ataca " + inimigo.getNome() + " com força " + this.poder1 + "!");
    inimigo.perderVida(ataque);
    
//atacar vilao com poder2

}
public void atacarComPoder2(Personagem inimigo){
    int ataque= this.poder2;
    System.out.println(this.nome + " ataca " + inimigo.getNome() + " com força " + this.poder2 + "!");
    inimigo.perderVida(ataque);
    
//atacar vilao com poder3

}
public void atacarComPoder3(Personagem inimigo){
    int ataque= this.poder3;
    System.out.println(this.nome + " ataca " + inimigo.getNome() + " com força " + this.poder3 + "!");
    inimigo.perderVida(ataque);
    

}

public void atacarEspecial(Personagem inimigo){
    int ataque= this.poderEspecial;
    System.out.println(this.nome + " ataca " + inimigo.getNome() + " com força " + this.poder3 + "!");
    inimigo.perderVida(ataque);
    

}


//heroi perdendo vida
public void perderVida(int ataque){
    this.vida-=ataque;
    System.out.println(this.nome + " perde " + ataque + " pontos de vida!");
    if(this.vida<0){
        System.out.println(this.nome + " foi derrotado!");

    }
}





//UPAR DE NIVEL

public int uparDeLevel() {
   level+=1;
   return level;
    
}

public int uparPoder1() {
    this.poder1+=1;
    return level;
    
 }

public int uparPoder2() {
    this.poder2+=1;
    return level;
    
 }

 public int uparPoder3() {
    this.poder3+=1;
    return level;
    
 }
 public int uparPoderEspecial() {
    this.poderEspecial+=1;
    return level;
    
 }






@Override
public void receberDano(int dano) {
   
    double resistencia= dano*(armadura/100);
    double danoFinal= dano-resistencia; 
    this.vida-=danoFinal;
}


//CONDIÇÕES DO HEROI
public void statusdoHeroi(){
    System.out.println("Nome: "+getNome());
    System.out.println("Genêro:"+getGenero());
    System.out.println("Vida: "+getVida());
    System.out.println("Poções de cura: 3");
}


//DICAS PARA O HEROI
public void dicas(){
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    System.out.println("Digite a plavra (!Status) para saber das suas condições de saúde e habilidades");
    System.out.println("Digite a palavra (!Mochila) para saber de seus itens nela");

    System.out.println("Digite a palavra (!Atacar)");
    System.out.println("Digite a palavra (!Curar)");
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    

    while(true){
        System.out.println("O que você deseja?: ");
        String leitorDicas= leitor.next();
        if(leitorDicas.equals("!status")){
            statusdoHeroi();
            break;
        }if(leitorDicas.equals("!curar")){
            curar(heroi);
            break;
        }else{
            System.out.println("Palavra incorreta, digite novamente: ");
        }
    }

    

    }



public void ação(){
    System.out.println(" o que deseja fazer?: ");
    String leitorAção=leitor.next().toLowerCase();
        switch(leitorAção){
        case "!dicas":
        dicas();
        break;
        
    }
}

public void receberItem(Item item) {
        mochila.adicionarItem(item);
        System.out.println("O herói recebeu o item: " + item.getNome());
    }
    
    public boolean temItem(String nomeItem) {
        return mochila.temItem(nomeItem);
    }

    @Override
    public void atacar(Personagem inimigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atacar'");
    }

    public String getnome() {
        return null;
    }
}