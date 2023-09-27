import java.util.Scanner;

public class Combate {
    private Heroi heroi;
    private Personagem inimigo;

    public void Combater(Heroi heroi, Personagem inimigo) {
        this.heroi = heroi;
        this.inimigo = inimigo;

        Scanner leitor = new Scanner(System.in);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Um inimigo se aproximou! Prepare-se para a batalha!");
        System.out.println("Inimigo: " + inimigo.getNome());
        System.out.println();

        while (inimigo.getVida() > 0) {
            System.out.println();
            System.out.println("Você está no modo combate. O que deseja fazer? ");
            System.out.println("Vida atual do Inimigo: " + inimigo.getVida());
            System.out.println();
            System.out.println("(1. Atacar, 2. Curar)");

            String opcao = leitor.next();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            switch (opcao) {
                case "1":
                    Thread threadAtaque = new Thread(() -> {
                        escolherPoder();
                    });
                    threadAtaque.start();
                    try {
                        threadAtaque.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case "2":
                    heroi.curar(heroi);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private void escolherPoder() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha o poder que deseja usar:");
        System.out.println("1. Raio Ecológico");
        System.out.println("2. Fúria Renovável");
        System.out.println("3. Faísca Ecológica");
        System.out.println("4. Onda Limpa (Especial)");


        int poderEscolhido = leitor.nextInt();

        switch (poderEscolhido) {
            case 1:
                heroi.atacarComPoder1(inimigo);
                inimigo.receberDano(heroi.getPoder1());

                inimigo.atacar(heroi);
                heroi.receberDano(inimigo.getDano());
                break;
            case 2:
                heroi.atacarComPoder2(inimigo);
                inimigo.receberDano(heroi.getPoder2());

                inimigo.atacar(heroi);
                heroi.receberDano(inimigo.getDano());
                break;
            case 3:
                heroi.atacarComPoder3(inimigo);
                inimigo.receberDano(heroi.getPoder3());

                inimigo.atacar(heroi);
                heroi.receberDano(inimigo.getDano());
                break;
            case 4:
                heroi.atacarEspecial(inimigo);
                inimigo.receberDano(heroi.getPoderEspecial());

                inimigo.atacar(heroi);
                heroi.receberDano(inimigo.getDano());
                break;
            default:
                System.out.println("Poder inválido!");
                break;
        }
    }
}
