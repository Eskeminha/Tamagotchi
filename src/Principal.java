/*
    Algoritmos e Programação: Fundamentos
    Prof. Mateus Raeder
    Tarefa | Desafio do Módulo 3
    Aluno: Anderson Koefender.

    Classe Principal
        Esta Classe possui alguns métodos, cujos quais serão esmiuçados abaixo, assim como esta é a classe do Main.

    Esta classe possui os seguintes métodos, por ordem alfabética:
        void Main                               : Método principal e inicial do aplicativo.
        void limpaTela()                        : Limpa a tela do console.
        void logicaEntediado(Tamagotchi object) : Método que recebe um objeto e opera a lógica de Entediado.
        void logicaFome(Tamagotchi object)      : Método que recebe um objeto e opera a lógica de Fome.
        void logicaSono(Tamagotchi object)      : Método que recebe um objeto e opera a lógica de Sono.
        void pausaDramatica(int milliseconds)   : Pausa DRAMATICAMENTE o código pela quantidade de milisegundos
                                                  no parâmetro. Foi criada para não embolotar o código com os try/catch.

 */

import java.awt.*;
import java.net.URI;
import java.util.Random;
import java.util.Scanner;

public class Principal {
    /*
        Já que os métodos além do main em Java podem ser feitos em qualquer local do arquivo,
        fiz todos depois do main.
     */

    // Inicializa o objeto Mensagens msg, com escopo da classe inteira.
    static Mensagens msg = new Mensagens();

    // Inicializa demais objetos e variáveis que serão usados no código.
    static final String ANSI_BOLD = "\u001B[1m";
    static final String ANSI_BOLD_RESET = "\u001B[0m";
    static final String ANSI_ITALIC = "\033[3m";
    static final String ANSI_ITALIC_RESET = "\033[0m";
    static Scanner scanner = new Scanner(System.in); // Usada apenas para o pressione Enter. Poderia ter usado o Teclado, mas quis variar um pouco.

    /*
        Método Main.
            Código principal.

     */
    public static void main(String[] args) {
        
        // Variáveis do Main
        String nomeDoTreinador = "";
        Random aleatorio = new Random();



        /*
            O aplicativo possui diversos textos, razões pelas quais foi adicionada lógica de velocidade dos mesmos.

            Quando iniciado, a primeira coisa exibida ao player é para que escolha a velocidade e forma dos textos,
            o que é aplicado em TODO o app.
         */
        limpaTela();

        // Alerta sobre UTF-8
        msg.imprimeLoreRapido("Antes de começar, certifique-se de que o seu terminal está configurado para UTF-8.");
        msg.imprimeLoreRapido("Caso contrário, os caracteres especiais não serão exibidos corretamente.");
        msg.imprimeLoreRapido(ANSI_BOLD + ANSI_ITALIC + "As imagens podem não aparecer ou aparecer de forma incorreta caso você tenha uma configuração diferente." + ANSI_ITALIC_RESET + ANSI_BOLD_RESET);
        msg.imprimeLoreRapido(ANSI_BOLD + ANSI_ITALIC + "De toda forma, isto não afetará o funcionamento do aplicativo, mas a experiência visual será prejudicada." + ANSI_ITALIC_RESET + ANSI_BOLD_RESET);
        msg.imprimeLoreRapido("Para configurar o terminal para UTF-8, feche o aplicativo (Ctrl + C) e utilize o comando: chcp 65001\n");
        System.out.print(ANSI_ITALIC + "Pressione Enter para continuar..." + ANSI_ITALIC_RESET);
        String input = scanner.nextLine(); // Aguarda o Enter.


        // Escolha da velocidade do texto.
        while (true) {
            msg.imprimeLore("\nPor favor, escolha a velocidade do texto.\n" +
                    "1- LoreMode: On (FULL EXPERIENCE " + ANSI_ITALIC + "com opcional de música" + ANSI_ITALIC_RESET + ") \n" +
                    "2- Médio (Velocidade atual) \n" +
                    "3- Sem delongas (Com pausas, mas sem texto animado.).");
            System.out.print("Opção desejada: ");
            int velocidade = Teclado.leInt();
            if (velocidade == 1) {
                msg.setVelocidadeTexto(70);
                msg.imprimeLore("LoreMode: ON. FULL EXPERIENCE Activated. GG !");
                msg.imprimeLore("Agora você terá a experiência completa do aplicativo.");
                msg.imprimeLore("Você gostaria de ouvir a música tema do Tamagotchi via YouTube? (Será aberto numa aba do seu navegador padrão) (S/N)");
                String resposta = Teclado.leString();
                if (resposta.equalsIgnoreCase("s")) {
                    try {
                        Desktop desktop = Desktop.getDesktop();
                        System.out.println("Abrindo no seu navegador padrão... pule os ads, aguardarei. :)");
                        pausaDramatica(2000);
                        desktop.browse(new URI("https://www.youtube.com/watch?v=aIZyefhCccQ&t=1"));
                        System.out.print(ANSI_ITALIC + "Pressione Enter para continuar..." + ANSI_ITALIC_RESET);
                        input = scanner.nextLine(); // Aguarda o Enter.
                    } catch (Exception e) {
                        System.err.println("Failed to open URL: ");
                        e.printStackTrace();
                    }
                }
                msg.imprimeLore("Iniciando o app...");
                break;
            } else if(velocidade == 2) {
                msg.imprimeLore("Velocidade média ativada. Aproveite a jornada !");
                msg.imprimeLore("Iniciando...");
                break;
            } else if (velocidade == 3) {
                msg.setVelocidadeTexto(0);
                msg.imprimeLore("Textos super rápidos e sem emoção alguma ativados. :(");
                msg.imprimeLore("Iniciando...");
                break;
            } else {
                msg.imprimeLore("Opção inválida. Tente novamente.");
            }
        }

        limpaTela();


        // Loop inicial para determinar o nome do player.
        // Decidi que seria melhor assim do que criar um if/else para todo o código e lógica principal,
        //  o que aumentaria a identação.
        while (true) {
            // Início da grande jornada.
            // Mensagem de boas-vindas e escolha do nome baseada no melhor game de todos os tempos, Pokemon Blue do GBC.
            msg.imprimeLore("\nSeja bem vindo ao Eskeminha RakuRaku DinoKun 2024 Power REMASTERED v. 3.4 REV 10.87.\n" +
                    "Agradeço muito por dedicar o seu tempo para INVESTIR na qualidade de vida que este aplicativo lhe trará.");
            pausaDramatica(1000);

            msg.imprimeLore("\nAntes de mais nada, como você se chama mesmo?");
            msg.imprimeLore("1. Ash");
            msg.imprimeLore("2. Blue");
            msg.imprimeLore("3. Outro");
            System.out.print("Opção: ");
            int opcaoNome = Teclado.leInt();

            // Verifica a opção escolhida.
            if (opcaoNome == 1) {
                nomeDoTreinador = "Ash";
                break;
            } else if (opcaoNome == 2) {
                nomeDoTreinador = "Blue";
                break;
            } else if (opcaoNome == 3) {
                System.out.print("\nPor favor, insira seu nome: ");
                nomeDoTreinador = Teclado.leString();
                break;
            } else {
                msg.imprimeLore("Opção inválida. Tente novamente.");
                pausaDramatica(2000);
            }
        }

        limpaTela();


        // Determinado o nome do Treinador,inicia-se a introdução do Tamagotchi.
        // Texto de introdução ao mundo do Tamagotchi.
        msg.imprimeLore("\nCerto! Então o seu nome é " + nomeDoTreinador + "!\n");
        msg.imprimeLoreRapido(msg.getTamagochiAscii(1));
        msg.imprimeLore("""
                Este é o seu Tamagotchi, será o seu companheiro de vida.\

                Enquanto ele durar.
                ...""");
        pausaDramatica(2000);
        msg.imprimeLore("Seu Tamagotchi irá dividir com você alegrias, tristezas e momentos inesquecíveis !!" +
                "\nA menos que você se esqueça dele.\n...");
        // Pausa Dramática (De acordo com Hollywood, deve durar de 3 a 5 segundos...)
        pausaDramatica(4000);
        //Continua...
        msg.imprimeLore("Neste caso, o fim será TERRÍVEL e solitário para ele.");
        pausaDramatica(200);
        msg.imprimeLore("...");
        pausaDramatica(2000);
        msg.imprimeLore("Bom, como é o nome deste seu grande amigo e companheiro?" +
                ANSI_ITALIC + "\nDICA: Escolha um nome inesquecível, isso lhe ajudará a lembrar dele!" + ANSI_ITALIC_RESET);

        // Requisita o nome do Buddy.
        System.out.print("\nNome do seu Tamagotchi: ");
        String nomeInicial = Teclado.leString();

        // Se não for inserido nada, o app seta Tamagotchi como padrão.
        if (nomeInicial.equals(""))
            nomeInicial = "Tamagotchi";

        if (nomeInicial.equalsIgnoreCase(nomeDoTreinador)) {
            msg.imprimeLore("UAU ! Vocês são tão próximos que até possuem o mesmo nome ! Que incrível !");
        }

        // Inicia o grande companheiro desta jornada!
        Tamagotchi buddy = new Tamagotchi(nomeInicial, nomeDoTreinador, 0, 1, msg);

        msg.imprimeLore("Seu Tamagotchi se chama " + buddy.getNome() +
                " e está pronto para começar a sua jornada !");

        // Inicia o loop do jogo
        while (true){
            limpaTela();
            if (buddy.getPeso() > 20) { // Se tiver mais de 20 kg, explode.
                msg.imprimeLoreRapido(msg.getNukeAscii());
                msg.imprimeLore(msg.getMensagemAleatoria("explodiu"));
                pausaDramatica(2000);
                buddy.imprimeDados();
                msg.imprimeMorreu();
                break;
            } else if (buddy.getPeso() <= 0) {
                // Se tiver 0 ou menos KG morre.
                buddy.imprimeDados();
                msg.imprimeMorreu();
                msg.imprimeLore("O seu melhor amigo " + buddy.getNome() +
                        " acaba de morrer pois estava magro demais.");
                msg.imprimeLore(msg.getMensagemAleatoria("desnutricao"));
                break;
            } else if (buddy.getIdade() >= 15) {
                // Se tiver 15 dias ou mais (impossível), morre.
                buddy.imprimeDados();
                msg.imprimeMorreu();
                msg.imprimeLore("O seu melhor amigo " + buddy.getNome() +
                    ", viveu uma vida longa, feliz e próspera, mas infelizmente, acaba de morrer em razão da idade.");
                break;
            } else if(buddy.isFome()) {
                // Verifica se tem fome (Lógica existente por causa da caminhada).
                buddy.imprimeDados();
                logicaFome(buddy);
                buddy.isFome(false);
            } else if(buddy.isMuitaFome()) {
                // Verifica se tem muita fome (Lógica existente por causa da corrida).
                buddy.imprimeDados();
                buddy.comer(1);
                buddy.isMuitaFome(false);
            } else if (buddy.isSono()) {
                // Verifica se está com sono. Vai dormir porque no exercício ele manda dormir, e não questionar ao player.
                buddy.imprimeDados();
                msg.imprimeLore(buddy.getNome() + " está com sono por comer demais e foi dormir. ZZZzzzzZZZZzz");
                buddy.dormir();
                buddy.resetaVezesAcordado();
                buddy.isSono(false);
            } else {
                // Joga a sorte pra ver qual a treta do dia
                int valor = aleatorio.nextInt(3) + 1;

                // Adicionado para exibir dados sempre que ocorrer o loop.
                buddy.imprimeDados();
                pausaDramatica(1000);

                // Determina o que vai acontecer de acordo com o valor aleatório e chama o método específico (enviando o objeto).
                // ( 1 - Sono, 2 - Fome, 3 - Entediado)
                switch (valor) {
                    case 1:
                        if(buddy.getVezesAcordado() == 5) {
                            // Verifica se o Tamagotchi está a mais de 5 vezes sem dormir para determinar se o mesmo desmaia de sono ou não.
                            // Se chegar em 6 ou mais (impossível) dias, ele vai dormir automaticamente, resetar a contagem da sequência de dias acordado e passar o dia.
                            msg.imprimeLore(buddy.getNome() + " está exausto, pois deixou de dormir " + buddy.getVezesAcordado() + " vezes seguidas!");
                            msg.imprimeLore("Desta forma, ele desmaiou e caiu no sono.");
                            msg.imprimeLore(msg.getMensagemAleatoria("sono-ruim"));
                            buddy.resetaVezesAcordado();
                            buddy.aumentaIdade();
                        } else {
                            logicaSono(buddy);
                        }
                        break;
                    case 2:
                        logicaFome(buddy);
                        break;
                    case 3:
                        logicaEntediado(buddy);
                        break;
                }
            }
        }
        // Mensagem final.
        msg.imprimeLore(msg.getMensagemAleatoria("le-fin"));
        msg.imprimeLore(buddy.getNomeDoTreinador() + ", obrigado por fazer da vida de " + buddy.getNome() + " uma experiência inesquecível.");
        pausaDramatica(15000);

        //  Créditos finais.
        limpaTela();
        System.out.println();
        msg.imprimeLore("Nossa equipe de desenvolvimento de uma pessoa só agradece muito por usar nosso aplicativo.\n" +
                "Esperamos que tenha se divertido e que tenha tido uma experiência incrível com o seu Tamagotchi.\n" +
                "Se você gostou, compartilhe com seus amigos e familiares e se quiser, acesse o GitHub do desenvolvedor!");
        msg.imprimeLore("Até a próxima aventura " + buddy.getNomeDoTreinador() + " !");
        System.out.println();
        msg.imprimeLogoEskeminha();
        msg.imprimeLore(ANSI_ITALIC +"Obs.: Este projeto somente estará disponível após a data de entrega do desafio." + ANSI_ITALIC_RESET);
        pausaDramatica(10000);
    }

    /*
        Entediado   -> Precisa exercitar, para isso:
                    -> Correr 10 minutos (AUTOMATICAMENTE emagrece 4kg e come muito)
                    -> Caminhar 10 minutos (AUTOMATICAMENTE emagrece 1kg e fica com fome)
    */
    private static void logicaEntediado(Tamagotchi buddy) {
        while (true) {
            msg.imprimeLore("RAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAWRRRRRRRRRR !!!!\n...");
            pausaDramatica(3000);
            msg.imprimeLore("Você ouviu um grito ensurdecedor...");
            msg.imprimeLore("Parece que " + buddy.getNome() + " está entediado.");
            msg.imprimeLore("Você precisa escolher entre: " +
                    "\n1. " + buddy.getNome() + " caminhará por 10 minutos. " +
                    "\n2. " + buddy.getNome() + " correrá por 10 minutos.");
            msg.imprimeLore("Qual é a sua decisão? ");
            int resposta = Teclado.leInt();
            if (resposta == 1){
                buddy.exercitar(1);
                break;
            } else if (resposta == 2) {
                buddy.exercitar(2);
                break;
            }
            else
                msg.imprimeLore("Opção inválida. Tente novamente.\n");
        }
    }

    /*
        Fome    -> Comer Muito (Aumenta 5kg e precisa dormir logo)
                -> Comer pouco (Normal, aumenta 1kg)
                -> Não comer (perde 2kg)
        DETALHES:
                -> Se ultrapassar 20kg, ele EXPLODE. Implementado antes do case.
                -> Se chegar a 0kg, ele fica DESNUTRIDO e MORRE.. Implementado antes do case.
    */

    private static void logicaFome(Tamagotchi buddy) {
        while (true) {
            msg.imprimeLore("Nossa ! " + buddy.getNome() + " está com fome !");
            msg.imprimeLore("Saco vazio não para em pé! Você possui três opções:");
            msg.imprimeLore("1. Comer muito. \n2. Comer pouco. (Normal)\n3. Não comer.");
            msg.imprimeLore("Qual é a sua decisão? ");
            int resposta = Teclado.leInt();
            if (resposta == 1) {
                buddy.comer(1);
                break;
            }
            else if (resposta == 2) {
                buddy.comer(2);
                break;
            } else if (resposta == 3) {
                buddy.comer(3);
                break;
            }
            else
                msg.imprimeLore("Opção inválida. Tente novamente.\n");
        }
    }

    // Sono -> opcoes são dormir() ou aumentaDiaAcordado(). Lógica dos 5 dias já implementada acima.
    private static void logicaSono(Tamagotchi buddy) {
        while (true) {
            msg.imprimeLore("\nMuito bem, parece que o " + buddy.getNome() + " está com sono !");
            msg.imprimeLore("Você tem duas opções: \n1. Fazê-lo dormir. \n2. Mantê-lo acordado.");
            msg.imprimeLore("Qual é a sua decisão? ");
            int resposta = Teclado.leInt();
            if (resposta == 1) {
                buddy.dormir();
                break;
            }
            else if (resposta == 2) {
                buddy.aumentaVezesAcordado();
                break;
            }
            else
                msg.imprimeLore("Opção inválida. Tente novamente.");
        }
    }

    // Método criado para não embolotar o código
    // Foi criado para ser usado em pausas dramáticas, ou momentos de espera ao usuário,
    // com a intenção de dar um aspecto menos robótico ao jogo.
    public static void pausaDramatica(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void limpaTela() {
        msg.imprimeLore("\n...\n");
        pausaDramatica(3000);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        msg.imprimeLogo();
    }
}