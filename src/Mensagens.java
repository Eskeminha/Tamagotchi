/*
        Algoritmos e Programação: Fundamentos
        Prof. Mateus Raeder
        Tarefa | Desafio do Módulo 3
        Aluno: Anderson Koefender.

        Classe Mensagens
            Esta Classe tem a função de servir como central das mensagens.
            Ela serve como satélite para determinar a velocidade dos textos na origem.
            Também serve como acervo CONSTANTE de mensagens para que o jogo não fique repetitivo.

        Esta classe possui os seguintes métodos:
            int getVelocidadeTexto()                    : Retorna a velocidade do texto definida pelo player.
            void setVelocidadeTexto                     : Seta a velocidade do texto definida pelo player.
            String getMensagemAleatoria(String tipo)    : Retorna uma mensagem aleatória de acordo com o contexto informado
                                                               no parâmetor tipo.
            void imprimeLore(String texto)              : Imprime o texto de forma lenta, caracter por caracter.
            void imprimeLoreRapido(String texto)        : Imprime o texto de forma rápida, caracter por caracter.
            void imprimeLogo()                          : Imprime o logo do jogo.
            void imprimeMorreu()                        : Imprime a mensagem de morte do Tamagotchi.
            void imprimeLogoEskeminha()                 : Imprime o logo do jogo com o nome do autor.
            String getNukeAscii()                       : Retorna a imagem de uma explosão nuclear.
            String getTamagochiAscii(int size)          : Retorna a imagem de um Tamagotchi de acordo com o tamanho do int.
     */

import java.util.Random;

public class Mensagens {

    private int velocidadeTexto = 30;
    private ASCII ascii = new ASCII();

    // Cria um array de Strings para informar mensagens diferentes quando o Tamagotchi morre.
    // Em respeito às novas gerações, a variável se refere à expressão "Vai de Duguduum" (som da JBL quando desliga).
    private static final String[] mensagensDeDugugumm = {
            "A saudade eterniza a presença de quem se foi. Com o tempo, essa dor se aquieta, se\n" +
                    " transforma em silêncio que espera pelos braços da vida um dia reencontrar. - (Padre Fábio de Melo)",
            "Aqueles que amamos nunca morrem, apenas partem antes de nós. - (Desconhecido)",
            "Aqueles que amamos nunca partem de dentro de nós, mesmo que a morte os leve para longe” (Desconhecido)",
            "Os meus sentimentos pela sua perda. Que o sofrimento seja breve e quem partiu\n" +
                    "encontre paz na eternidade. - (Desconhecido)",
            "Quando há amor, a morte não consegue separar totalmente duas pessoas e quem parte\n" +
                    "continua vivendo na memória de quem fica. - (Desconhecido)",
            "Viva seu luto, chore, sofra. Mas saiba que você nunca estará sozinho em sua dor.\n" +
                    "Eu estou aqui para lhe ajudar. Conte comigo. - (Desconhecido)",
            "Perder alguém que amamos é uma dor inexplicável, é como se o nosso coração sofresse\n" +
                    "um abalo repentino. Por isso, quero expressar meus sinceros pêsames pela sua perda. - (Desconhecido)",
            "A saudade do ser querido, passará. Os dias de dificuldades, passarão.\n" +
                    "Passarão também os dias de amargura e solidão. - (Emmanuel e Chico Xavier)",
            "Luto é o tempo necessário para a mente entender a dor de perda que o coração já sente. - (Desconhecido)",
            "O luto por quem amamos é sempre eterno, assim como as saudades e as\n" +
                    "lembranças de tudo que compartilhamos. Força nesse momento. - (Desconhecido)",
            "O cultivo do amor será sempre o melhor tributo que podemos prestar\n" +
                    "àqueles que já não se encontram fisicamente entre nós. - (Desconhecido)",
            "Você nunca teve um amigo assim, nem mesmo o Gênio da Lâmpada foi tanto para Alladin.",
    };

    // Mensagens para serem exibidas quando o Tamagotchi explode.
    public static final String[] mensagensDeExplosao = {
            "Pedaços caem do céu. Hoje o sol apareceu. Não se trata do fim da aventura humana na Terra.\n" +
                    "Não é o final da odisséia terrestre. Banda Eva não tocará hoje. Mas o som que você ouviu,\n" +
                    "é o som do seu companheiro explodindo de tanto comer.",
            "Não é ano novo, mas seu companheiro explodiu de tanto comer.",
            "4th July Brazil - Starring: Seu companheiro explodindo de tanto comer.",
            "KABOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOM !!! !!! !!!",
            "É um raio? Um trovão? NÃO !! É uma explosão!!! De tanto comer...",
            "Será que seu companheiro comeu pólvora? Pois explodiu de tanto comer.",
            "Uma nova estrela nasce com a explosão do seu companheiro."
    };

    // Mensagens para serem exibidas quando o Tamagotchi morre por desnutrição.
    public static final String[] mensagensDeDesnutricao = {
            "Se o conselho tutelar soubesse. Tu já eras neste momento caro treinador.",
            "Jejum é considerado saudável por alguns, a inanicação não.",
            "Foi neste momento, que seu companheiro descobriu que a sua noção era igual ao peso dele.",
            "Seu companheiro não comeu nada. E nem está de dieta. Agora se foi.",
            "Para uns, uma barra de cereal é pouco, para outros, seria infinitamente mais do que recebem."
    };

    // Mensagens para serem exibidas quando o Tamagotchi come normalmente.
    public static final String[] mensagensDeComidasNormais = {
            "Seu companheiro comeu uma sopa de ervas daninhas. Que coisa, não?",
            "Seu companheiro comeu um grão de arroz. Alimentou-se normalmente.",
            "Seu companheiro adorou se deliciar com meio milho. Incrível como pode ficar satisfeito com tão pouco.",
            "O alimento do momento foi uma barra de cereal. Orgulho da nutri.",
            "Seu companheiro comeu um churrascão ! Mas era um pingo d'oro.",
            "Nada como comer o que restou na geladeira ! Seu companheiro acabou de comer um cubo de gelo,\n" +
                    "pois a geladeira está vazia.",
            "De grão em grão, seu companheiro comeu um grão.",
            "Seu companheiro comeu um banquete, mas era só um banquete de ração de peixe beta."
    };

    // Mensagens para serem exibidas quando o Tamagotchi come muito.
    public static final String[] mensagensDeComidasMaiores = {
            "Se teve um dia que a barriga saiu da miséria, foi hoje.",
            "Seu companheiro comeu um churrascão, de verdade dessa vez !",
            "Hoje seu companheiro meteu o pé na jaca.",
            "Seu companheiro acordou pensando, quem come muito, come bem e o pensamento virou realidade.",
            "É Hogwarts no natal que chama ? Seu companheiro comeu um banquete!",
            "Avise o nutricionista, seu companheiro comeu um banquete de verdade.",
            "Corram para as colinas, seu companheiro comeu um banquete de verdade.",
            "Chame a polícia, pois deve ser crime a quantidade de comida que seu companheiro comeu.",
            "Sabe aquele pedreiro que come por 3? Seu companheiro comeu por 10."
    };

    // Mensagens para serem exibidas quando o Tamagotchi fica sem comer.
    public static final String[] mensagensDeComidaSemComer = {
            "Seu companheiro não comeu nada. E nem está de dieta.",
            "A vida é difícil quando não nos alimentamos. - Seu companheiro.",
            "Seu companheiro queria pastel de vento, comeu, mas não tinha pastelina.",
            "Se carboidrato engorda, seu companheiro come descarboidrato.",
            "Seu companheiro amou não comer nada. (Contém ironia)",
            "Sem alimento todo mundo vive, mas vive com fome.",
            "Nada como alimento espacial, vácuo."
    };

    // Mensagens para serem exibidas quando o Tamagotchi vai caminhar.
    public static final String[] mensagensDeCaminhada = {
            "Nada como um cooper matinal, nem que seja de noite.",
            "Caminhar fez bem ao seu companheiro, ar puro e saúde.",
            "Hoje seu companheiro caminhou tanto que seus pés estão pedindo asilo político!",
            "Caminhar: a arte de mover o corpo o suficiente para justificar aquela sobremesa deliciosa depois!",
            "Caminhar é como uma montanha-russa sem emoção: só sobe, desce e às vezes enjoa!",
            "Caminhar é como um carro sem gasolina: não vai a lugar nenhum!",
            "Seu companheiro afirmou: Caminhar é uma ótima desculpa para usar roupas esportivas e fingir que estou indo para a academia!"
    };

    // Mensagens para serem exibidas quando o Tamagotchi corre.
    public static final String[] mensagensDeCorrida = {
            "Correr: a atividade onde o destino sempre parece estar um passo à frente, literalmente!",
            "Correr é como fazer um piquenique com os músculos: você pode até se divertir,\n" +
                    "mas vai doer no dia seguinte!",
            "Correr é como ter uma discussão com o vento: você pode até achar que está ganhando,\n" +
                    "mas no final, ele sempre sopra na sua cara!",
            "Seu companheiro descobriu que correr é o único momento em que ele pode realmente \n" +
                    "competir contra si mesmo e, na maioria das vezes, perder miseravelmente!",
            "A estrategia do seu companheiro é infalível! Ele começa devagar e diminui o ritmo a partir daí!",
            "Seu companheiro teve uma epifania! Correr é a única atividade em que chegar ao final\n" +
                    "é motivo de celebração, mesmo que pareça mais uma fuga desesperada"
    };

    // Mensagens para serem exibidas quando o Tamagotchi dorme por opção do usuário.
    public static final String[] mensagensDeSonoBom = {
            "Seu companheiro dormiu como um anjo.",
            "ZZZzzzzZZZZzz",
            "Seu companheiro dormiu como um bebê.",
            "O descanso fez bem ao seu companheiro."
    };

    // Mensagens para serem exibidas quando o Tamagotchi dorme obrigatoriamente após 5 vezes acordado.
    public static final String[] mensagensDeSonoRuim = {
            "Nada como descanso pós-desmaio. - Seu companheiro.",
            "Seu companheiro dormiu como um tronco.",
            "Dormir depois de manter-se acordado por 5 vezes é um privilégio. - Seu companheiro.",
            "Tem pedras que dormem mais vezes que seu companheiro.",
            "Seu companheiro dormiu como um bebê, depois de se sentir como um bebê que não dorme.",
            "Nada como um sono revigorante, pena que foi induzido por desmaio.",
            "Nada como dormir compulsoriamente. - Seu companheiro."
    };

    // Métodos imprimir dos textos em Ascii
    public void imprimeLogo(){
        System.out.println(ascii.getAsciiLogo());
    }
    public void imprimeMorreu(){
        imprimeLoreRapido("\n" + ascii.getAsciiMorreu() + "\n");
    }
    public void imprimeLogoEskeminha() {
        imprimeLoreRapido(ascii.getAsciiLogoEskeminha());
    }
    public String getNukeAscii(){
        return ascii.getAsciiNuke();
    }
    public String getTamagochiAscii(int size){
        return ascii.getAsciiTamagochi(size);
    }

    // Métodos get e set para a velocidade do texto.
    public int getVelocidadeTexto() {
        return velocidadeTexto;
    }
    public void setVelocidadeTexto(int velocidadeTexto) {
        this.velocidadeTexto = velocidadeTexto;
    }

    // Método para retornar uma mensagem aleatória de acordo com o contexto informado no parâmetro tipo.
    public static String getMensagemAleatoria(String tipo) {
        Random random = new Random();
        if (tipo.equals("explodiu")) {
            int index = random.nextInt(mensagensDeExplosao.length);
            return mensagensDeExplosao[index];
        } else if (tipo.equals("desnutricao")){
            int index = random.nextInt(mensagensDeDesnutricao.length);
            return mensagensDeDesnutricao[index];
        } else if (tipo.equals("le-fin")) {
            int index = random.nextInt(mensagensDeDugugumm.length);
            return mensagensDeDugugumm[index];
        } else if (tipo.equals("comida-normal")){
            int index = random.nextInt(mensagensDeComidasNormais.length);
            return mensagensDeComidasNormais[index];
        } else if (tipo.equals("comida-grande")){
            int index = random.nextInt(mensagensDeComidasMaiores.length);
            return mensagensDeComidasMaiores[index];
        } else if (tipo.equals("comida-sem")) {
            int index = random.nextInt(mensagensDeComidaSemComer.length);
            return mensagensDeComidaSemComer[index];
        } else if (tipo.equals("caminhada")) {
            int index = random.nextInt(mensagensDeCaminhada.length);
            return mensagensDeCaminhada[index];
        } else if (tipo.equals("corrida")) {
            int index = random.nextInt(mensagensDeCorrida.length);
            return mensagensDeCorrida[index];
        } else if (tipo.equals("sono-bom")) {
            int index = random.nextInt(mensagensDeSonoBom.length);
            return mensagensDeSonoBom[index];
        } else if (tipo.equals("sono-ruim")) {
            int index = random.nextInt(mensagensDeSonoRuim.length);
            return mensagensDeSonoRuim[index];
        } else
            return ""; // nunca vai ocorrer.
    }

    // Método para imprimir o texto de forma mais legal. ~60-80ms = SNES
    // Para fazer o texto ser gerado letra à letra, com aspecto de uma conversa, foi feito este método.
    // Ele vai considerar o valor setado na primeira iteração com o usuario quando o app é inicializado.
    // Mesmo setado em 0, o texto vai ser gerado pelo for, pois alem de ser praticamente instantânea a exibição,
    // ainda fica um certo "movimento" visual comparado a apenas System.out.println.
    public void imprimeLore(String texto) {
        try {
            for (int i = 0; i < texto.length(); i++) {
                System.out.print(texto.charAt(i));
                System.out.flush();
                Thread.sleep(getVelocidadeTexto());
            }
            System.out.println();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }

    // Método para imprimir o texto mais rápido (chamado para evitar ficar repetindo as linhas de acelera e diminui velocidade.
    public void imprimeLoreRapido(String texto) {
        int velocidadeAtual = getVelocidadeTexto();
        setVelocidadeTexto(2);
        imprimeLore(texto);
        setVelocidadeTexto(velocidadeAtual);
    }
}