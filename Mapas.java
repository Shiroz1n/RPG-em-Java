import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;

import javax.sound.midi.Soundbank;

public class Mapas extends Dialogos{
    private Heroi heroi;
    private Mob1 mob1;
    private Mob2 mob2;
    private Boss1 boss1;
    private Boss2 boss2;
    private BossFinal bossFinal; 
    private Mochila mochila;
    private Combate combate;



    boolean chavePega=false;
    boolean MáscaraDeGás=false;
    boolean MacacãoDeProteção=false;
    boolean AmplificadorSônico=false;

    
    
    
  
    public Mapas(){
        heroi = new Heroi();
        mob1= new Mob1();
        mob2= new Mob2();
        boss1= new Boss1();
        boss2 = new Boss2();
        bossFinal= new BossFinal();
        combate = new Combate();
        mochila= new Mochila();
    }

    public void script(){

        
        heroi.escolherNome();
        System.out.println("Vida atual: "+heroi.getVida());
        cenario1();
        }
       
        

    //CENARIO 1
    public void cenario1(){
    System.out.println("Laborstorio ");
    System.out.println("CENARIO 1");
    int x = 0;
     int y = 0;
    
    

     Scanner scanner = new Scanner(System.in);
     while (true) {
       
        if(x>3){
         
            System.out.println("NÃO HÁ NADA POR AQUI");
            x=3;
                
            System.out.printf("Coordenada atual: (%d,%d)\n", x,y);

          
        }else if(y>3){
            System.out.println("NÃO HÁ NADA POR AQUI");
             y=3;
             System.out.printf("Coordenada atual: (%d,%d)\n", x,y);

        }else if(x<0){
            x=0;
            System.out.println("NÃO HÁ NADA POR AQUI");
            System.out.printf("Coordenada atual: (%d,%d)\n", x,y);


        }else if(y<0){
            y=0;
            System.out.println("NÃO HÁ NADA POR AQUI");
            System.out.printf("Coordenada atual: (%d,%d)\n", x,y);


        }


         
        System.out.print("Digite a direção (norte, sul, leste ou oeste): ");
        System.out.println();
         String direcao = scanner.nextLine().toLowerCase();
         switch (direcao) {
             case "norte":
                 y++; // diminui a coordenada y em 1
                 break;
             case "sul":
                 y--; // aumenta a coordenada y em 1
                 break;
             case "leste":
                 x++; // aumenta a coordenada x em 1
                 break;
             case "oeste":
                 x--; // diminui a coordenada x em 1
                 break;
            case "curar":
            System.out.println("Curei");
            break;
             default:
                 System.out.println("Direção inválida!");
                 continue;
                 
         }


                  //EVENTOS DAS PROBABILIDADES DO HEROI ANDAR

         if(x==3 && y==3){
            System.out.println(fala70);
            Mob1 mob1_33_C1 = new Mob1();

            combate.Combater(heroi, mob1_33_C1);

            heroi.uparPoder1();
            heroi.uparPoder2();
            heroi.uparPoder3();
            heroi.uparPoderEspecial();
            heroi.uparDeLevel();
            System.out.println(fala71);

           if(chavePega==true){
            cenario2();

           }else{
            System.out.println("Bom... Você não tem nenhuma chave para abrir a porta, volte e procure por ela...");
            System.out.println("Provavelmente ela esteja próxima á coordenada (2,1) com diz esse bilhete");
           }
        

         }else if(x==0 && y==0){
            System.out.println(fala1);
            System.out.println(fala2);

          

         }else if(x==1 && y==0){
            System.out.printf( fala44 +"\n"+ x,y);

            

         }else if(x==1 && y==1){
            System.out.println(fala46);
        
        }else if(x==1 && y==2){
            System.out.println(fala45);
            if(chavePega==true){
                System.out.println("Você encontrou um item ( máscara de gás: aumenta consideravelmente  o nivel de sua armadura)"); 
                heroi.uparDeLevel();
                System.out.println(fala45);
    
               }
            System.out.println();
            System.out.println();
            

        }else if(x==1 && y==3){
            System.out.println(fala47);
            Mob1 mob1_13_C1 = new Mob1();

            combate.Combater(heroi, mob1_13_C1);

            

        }else if(x==0 && y==1){
            System.out.println(fala2);
            System.out.println(fala3);
            System.out.println();
            

        }else if(x==2 && y==1){
            System.out.println(fala7);
            Mob1 mob1_21_C1 = new Mob1();

            combate.Combater(heroi, mob1_21_C1);


        }else if(x==3 && y==1){
            System.out.println(fala8); 
            if (!chavePega) {
                System.out.println("Você encontrou uma chave!");

                Item chave = new Item("Chave", "chave");
                heroi.receberItem(chave);
                chavePega = true;
            }
            
        }else if(x==2 && y==2){
            System.out.println(fala10);
            combate.Combater(heroi, mob1);
            ///upando atributos do jogador
            heroi.uparPoder1();
            heroi.uparPoder2();
            heroi.uparPoder3();
            heroi.uparPoderEspecial();
            heroi.uparDeLevel();
            System.out.println(fala71);

        }else if(x==2 && y==0){
            System.out.println(fala10);
            Mob1 mob1_20_C1 = new Mob1();

            combate.Combater(heroi, mob1_20_C1);

        }else if(x==2 && y==3){
            System.out.println(fala48);

        }else if(x==0 && y==2){
            System.out.println(fala10);
            Mob1 mob1_02_C1 = new Mob1();
            combate.Combater(heroi, mob1_02_C1);

        }else if(x==3 && y==2){
            System.out.println(fala11);

        }else if(x==3 && y==0){
            System.out.println(fala12);

        }else if(x==0 && y==3){
            System.out.println(fala10);
            Mob1 mob1_03_C1 = new Mob1();
            combate.Combater(heroi, mob1_03_C1);
   
        }



        System.out.println();
         System.out.printf("Coordenada atual: (%d,%d)\n", x,y);
         System.out.println();
    }
}



//CENARIO 2
public void cenario2(){
    CenariosInterface c1 = new CenariosInterface();
    System.out.println("Ruas da cidade de Tokyo , Japão");
    System.out.println("");
    System.out.println("Cenario 2");
    int x = 0;
     int y = 0;

     Scanner scanner = new Scanner(System.in);
     while (true) {
       
        if(x>3){
         
            System.out.println("NÃO HÁ NADA POR AQUI");
            x=3;
                
            System.out.printf("Coordenada atual: (%d,%d)\n", x,y);

          
        }else if(y>3){
            System.out.println("NÃO HÁ NADA POR AQUI");
             y=3;
             System.out.printf("Coordenada atual: (%d,%d)\n", x,y);

        }else if(x<0){
            x=0;
            System.out.println("NÃO HÁ NADA POR AQUI");
            System.out.printf("Coordenada atual: (%d,%d)\n", x,y);


        }else if(y<0){
            y=0;
            System.out.println("NÃO HÁ NADA POR AQUI");
            System.out.printf("Coordenada atual: (%d,%d)\n", x,y);


        }
         
        System.out.print("Digite a direção (norte, sul, leste ou oeste): ");
        System.out.println();
         String direcao = scanner.nextLine().toLowerCase();
         switch (direcao) {
             case "norte":
                 y++; // diminui a coordenada y em 1
                 break;
             case "sul":
                 y--; // aumenta a coordenada y em 1
                 break;
             case "leste":
                 x++; // aumenta a coordenada x em 1
                 break;
             case "oeste":
                 x--; // diminui a coordenada x em 1
                 break;
             default:
                 System.out.println("Direção inválida!");
                 continue;
                 
         }

            //EVENTOS DAS PROBABILIDADES DO HEROI ANDAR

         if(x==0 && y==0){
            System.out.printf(fala13 +"\n"+ x,y );
            System.out.println(fala14);
// barulho da sirene da usina
            cenario3();

         }else if(x==1 && y==1){
            System.out.println(fala16);


        }else if(x==1 && y==0){
            System.out.println(fala15);
            Mob1 mob1_10_C2 = new Mob1();
            combate.Combater(heroi, mob1_10_C2);

        }
        
        else if(x==1 && y==2){
            System.out.println(fala10);
            Mob1 mob1_12_C2 = new Mob1();

            combate.Combater(heroi, mob1_12_C2);

        }else if(x==1 && y==3){
            System.out.println(fala10);
            Mob1 mob1_13_C2 = new Mob1();

            combate.Combater(heroi, mob1_13_C2);
            heroi.uparPoder1();
            heroi.uparPoder2();
            heroi.uparPoder3();
            heroi.uparPoderEspecial();
            heroi.uparDeLevel();
            System.out.println(fala71);


        }else if(x==0 && y==1){
            System.out.println(fala49);
          

        }else if(x==2 && y==1){
            System.out.println(fala12);
            System.out.println(fala10);
            combate.Combater(heroi, mob2);

        }else if(x==3 && y==1){
            System.out.println(fala10);
            combate.Combater(heroi, mob1); 
            
        }else if(x==2 && y==2){
            System.out.println(fala17);
            combate.Combater(heroi, mob1);

        }else if(x==2 && y==0){
            System.out.println(fala20);
            combate.Combater(heroi, mob1);

        }else if(x==2 && y==3){
            System.out.println(fala50);

        }else if(x==0 && y==2){
            System.out.println(fala20);
            combate.Combater(heroi, mob1);

        }else if(x==3 && y==2){
            System.out.println(fala51);
            System.out.println(fala52);
            System.out.println(fala53);
            if(MacacãoDeProteção==true){
                System.out.println("Você encontrou um item (Macacão de Proteção : aumenta consideravelmente a sua vida)"); 
                heroi.uparDeLevel();
                heroi.setVida(130);
                System.out.println("Vida atual: "+heroi.getVida());
                System.out.println(fala45);
    
               }
            

            heroi.uparPoder1();
            heroi.uparPoder2();
            heroi.uparPoder3();
            heroi.uparPoderEspecial();
            heroi.uparDeLevel();
            System.out.println(fala71);


        }else if(x==3 && y==0){
            System.out.println(fala10);
            combate.Combater(heroi, mob1);

        }else if(x==0 && y==3){
            System.out.println(fala22);
            combate.Combater(heroi, mob1);

        }else if(x==3 && y==3){
            combate.Combater(heroi, mob1);
            ///
            System.out.printf("você"+fala72);
            combate.Combater(heroi, boss1);

            heroi.uparPoder1();
            heroi.uparPoder2();
            heroi.uparPoder3();
            heroi.uparPoderEspecial();
            heroi.uparDeLevel();
            System.out.println(fala71);

                System.out.printf(fala19);
                cenario3();
    
    
            }

         System.out.printf("Coordenada atual: (%d,%d)\n", x,y);
         System.out.println();
    }
}




//CENARIO 3
public void cenario3(){
    CenariosInterface c1 = new CenariosInterface();
    System.out.println("Usina da Cidade de Toky , Japão ");
    System.out.println("Cenario 3");
    int x = 0;
     int y = 0;

     Scanner scanner = new Scanner(System.in);
     //entrada de dados para as questoes nas linhas do codigo 409 a 463
     Scanner questoes = new Scanner(System.in);
     while (true) {
       
        if(x>3){
         
            System.out.println("NÃO HÁ NADA POR AQUI");
            x=3;
                
            System.out.printf("Coordenada atual: (%d,%d)\n", x,y);

          
        }else if(y>3){
            System.out.println("NÃO HÁ NADA POR AQUI");
             y=3;
             System.out.printf("Coordenada atual: (%d,%d)\n", x,y);

        }else if(x<0){
            x=0;
            System.out.println("NÃO HÁ NADA POR AQUI");
            System.out.printf("Coordenada atual: (%d,%d)\n", x,y);


        }else if(y<0){
            y=0;
            System.out.println("NÃO HÁ NADA POR AQUI");
            System.out.printf("Coordenada atual: (%d,%d)\n", x,y);


        }
         
        System.out.print("Digite a direção (norte, sul, leste ou oeste): ");
        System.out.println();
         String direcao = scanner.nextLine().toLowerCase();
         switch (direcao) {
             case "norte":
                 y++; // diminui a coordenada y em 1
                 break;
             case "sul":
                 y--; // aumenta a coordenada y em 1
                 break;
             case "leste":
                 x++; // aumenta a coordenada x em 1
                 break;
             case "oeste":
                 x--; // diminui a coordenada x em 1
                 break;
             default:
                 System.out.println("Direção inválida!");
                 continue;
                 
         }
         

         //EVENTOS DAS PROBABILIDADES DO HEROI ANDAR
         if(x==0 && y==0){
            System.out.printf(fala25 +"\n"+ x,y);
           
            cenario3();

         }else if(x==1 && y==1){
            System.out.println(fala27);
            System.out.println(fala28);
            combate.Combater(heroi, mob1);


        }else if(x==1 && y==0){
            System.out.println(fala26);

        }
        
        else if(x==1 && y==2){
            System.out.println(fala54);
        

        }else if(x==1 && y==3){
            System.out.println(fala29);
            combate.Combater(heroi, mob1);
            heroi.uparPoder1();
            heroi.uparPoder2();
            heroi.uparPoder3();
            heroi.uparPoderEspecial();
            heroi.uparDeLevel();
            System.out.println(fala71);


        }else if(x==0 && y==1){
            System.out.println(fala55);
          

        }else if(x==2 && y==1){
            System.out.println(fala56);
            combate.Combater(heroi, mob2);
            heroi.uparPoder1();
            heroi.uparPoder2();
            heroi.uparPoder3();
            heroi.uparPoderEspecial();
            heroi.uparDeLevel();
            System.out.println(fala71);

         

        }else if(x==3 && y==1){
            System.out.println(fala57);
            combate.Combater(heroi, mob2); 
            
        }else if(x==2 && y==2){
            System.out.println(fala58);
            combate.Combater(heroi, mob2);


        }else if(x==2 && y==0){
            System.out.println(fala59);

        }else if(x==2 && y==3){
            System.out.println(fala59);
            if(AmplificadorSônico==true){
                System.out.println("Você encontrou um item (Amplificador Sônico :  aumenta mais 10 de dano no Poder 1)"); 
                heroi.uparDeLevel();
                System.out.println(fala45);
    
               }
            

        }else if(x==0 && y==2){
            System.out.println(fala60);

        }else if(x==3 && y==2){
            System.out.println(fala61);

        }else if(x==3 && y==0){
            System.out.println(fala10);
            combate.Combater(heroi, mob2);
            heroi.uparPoder1();
            heroi.uparPoder2();
            heroi.uparPoder3();
            heroi.uparPoderEspecial();
            heroi.uparDeLevel();
            System.out.println(fala71);


        }else if(x==0 && y==3){
            System.out.println(fala10);
            combate.Combater(heroi, mob2);

        }else if(x==3 && y==3){
            //printsr antes das perguntas

            System.out.printf("você"+ fala31);
            //printando pergunta

            System.out.println(pergunta1);
           /// colocar perguntas aqui

           

           
           pergunta1 = questoes.nextLine().toLowerCase();
           System.out.println("Sua resposta foi : " + pergunta1);
           ///resposta certa e a B
           //adicionaro metodo de atacar 
           if (pergunta1.equals("b")){

            System.out.println("resposta correta ");
        

           }
           else{
            System.out.println("Você errou ");

           }
           System.out.printf(fala32+"(%d,%d)\n", x,y);

           System.out.println(pergunta2);



           pergunta2 = questoes.nextLine().toLowerCase();
           System.out.println("Sua resposta foi : " + pergunta2);
           ///resposta certa e a C
           //adicionaro metodo de atacar
           if (pergunta1.equals("c")){

            System.out.println("resposta correta ");

        

           }
           else{
            System.out.println("Você errou ");


           }

           pergunta3 = questoes.nextLine().toLowerCase();
           if (pergunta3.equals("c")){

            System.out.println("resposta correta ");

        

           }
           else{
            System.out.println("Você errou ");

           System.out.println("Sua resposta foi : " + pergunta3);

           ///resposta certa e a E
           //adicionaro metodo de atacar 
           questoes.close();

           combate.Combater(heroi, mob2);
           combate.Combater(heroi, boss2);

           heroi.uparPoder1();
           heroi.uparPoder2();
           heroi.uparPoder3();
           heroi.uparPoderEspecial();
           heroi.uparDeLevel();
           System.out.println(fala71);

           System.out.println(fala68);
        
    
            }

         System.out.printf("Coordenada atual: (%d,%d)\n", x,y);
         System.out.println();
         cenario3();
        }
    }


}

public void cenario4(){
    System.out.println(" Dentro das instalações da Usina de Tokyo ");
    System.out.println("CENARIO 4");
    int x = 0;
     int y = 0;
     
     if(x>3){
         
        System.out.println("NÃO HÁ NADA POR AQUI");
        x=3;
            
        System.out.printf("Coordenada atual: (%d,%d)\n", x,y);

      
    }else if(y>3){
        System.out.println("NÃO HÁ NADA POR AQUI");
         y=3;
         System.out.printf("Coordenada atual: (%d,%d)\n", x,y);

    }else if(x<0){
        x=0;
        System.out.println("NÃO HÁ NADA POR AQUI");
        System.out.printf("Coordenada atual: (%d,%d)\n", x,y);


    }else if(y<0){
        y=0;
        System.out.println("NÃO HÁ NADA POR AQUI");
        System.out.printf("Coordenada atual: (%d,%d)\n", x,y);


    }
     
     


    System.out.printf("Coordenada atual: (%d,%d)\n", x,y);
     Scanner scanner = new Scanner(System.in);
     while (true) {
       

        System.out.print("Digite a direção (norte, sul, leste ou oeste): ");
         String direcao = scanner.nextLine().toLowerCase();
         switch (direcao) {
             case "norte":
                 y++; // diminui a coordenada y em 1
                 break;
             case "sul":
                 y--; // aumenta a coordenada y em 1
                 break;
             case "leste":
                 x++; // aumenta a coordenada x em 1
                 break;
             case "oeste":
                 x--; // diminui a coordenada x em 1
                 break;
             default:
                 System.out.println("Direção inválida!");
                 continue;
                 
         }

         if(x==0 && y==0){
            System.out.printf(fala33 +"\n"+ x,y);
           combate.Combater(heroi, mob1);

         }else if(x==1 && y==1){
            System.out.println(fala34);
            combate.Combater(heroi, mob2);
            heroi.uparPoder1();
            heroi.uparPoder2();
            heroi.uparPoder3();
            heroi.uparPoderEspecial();
            heroi.uparDeLevel();
            System.out.println(fala71);





        }else if(x==1 && y==0){
            System.out.println(fala62);
            combate.Combater(heroi, mob2);

        }
        
        else if(x==1 && y==2){
            System.out.println(fala63);


        }else if(x==1 && y==3){
            System.out.println(fala36);

        }else if(x==0 && y==1){
            System.out.println(fala64);
          

        }else if(x==2 && y==1){
            System.out.println(fala35);
            combate.Combater(heroi, mob2);
           

        }else if(x==3 && y==1){
            System.out.println(fala65); 
            combate.Combater(heroi, mob2);
            
        }else if(x==2 && y==2){
            System.out.println(fala10);
           combate.Combater(heroi, mob2);
           combate.Combater(heroi, mob1);
           heroi.uparPoder1();
           heroi.uparPoder2();
           heroi.uparPoder3();
           heroi.uparPoderEspecial();
           heroi.uparDeLevel();
           System.out.println(fala71);


        }else if(x==2 && y==0){
            System.out.println(fala35);
        

        }else if(x==2 && y==3){
            System.out.println(fala39);
            combate.Combater(heroi, mob1);

        }else if(x==0 && y==2){
            System.out.println(fala35);
           

        }else if(x==3 && y==2){
            System.out.println(fala66);
            combate.Combater(heroi, mob1);
            heroi.uparPoder1();
            heroi.uparPoder2();
            heroi.uparPoder3();
            heroi.uparPoderEspecial();
            heroi.uparDeLevel();
            System.out.println(fala71);


        }else if(x==3 && y==0){
            System.out.println(fala69);
            combate.Combater(heroi, mob2);

        }else if(x==0 && y==3){
            System.out.println(fala67);

        }else if(x==3 && y==3){
            /////
            System.out.printf("você"+ fala37);
            combate.Combater(heroi, mob1);
            combate.Combater(heroi, mob2);
            System.out.printf("você"+ fala37);

            heroi.uparPoder1();
            heroi.uparPoder2();
            heroi.uparPoder3();
            heroi.uparPoderEspecial();
            heroi.uparDeLevel();
            System.out.println(fala71);

            combate.Combater(heroi, bossFinal);
            //////
            System.out.printf(heroi.getnome()+ fala36);
            System.out.printf(heroi.getnome()+ fala40);
            System.out.printf(fala41+"(%d,%d)\n", x,y);
        }
         System.out.printf("Coordenada atual: (%d,%d)\n", x,y);
         System.out.println();
         cenario4();
    }
}
}