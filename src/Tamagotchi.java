/*
        Algoritmos e Programação: Fundamentos
        Prof. Mateus Raeder
        Tarefa | Desafio do Módulo 3
        Aluno: Anderson Koefender.

        Classe Tamagotchi
            Possui todas as informações (atributos) e métodos necessários para um Tamagotchi,
            como construtores, métodos de acesso e métodos auxiliares para o desenvolvimento do trabalho.

        Esta classe possui os seguintes métodos (os getters e setters estão na ordem dos atributos e os demais
        métodos estão na ordem alfabética.

            Tamagotchi()                : Construtor. Recebe os dados iniciais do Tamagotchi
                                              (Nome, Nome do Treinador, idade, peso, e um objeto mensagens).
            string getNome()            : Retorna o nome do Tamagotchi.
            int getIdade()              : Retorna a idade em dias do Tamagotchi.
            int getPeso()               : Retorna o peso do Tamagotchi.
            void setPeso()              : Seta o peso do Tamagotchi.
            int getVezesAcordado()      : Retorna quantas vezes o Tamagotchi está acordado sem dormir.
            boolean isFome()            : Retorna se o Tamagotchi está com fome.
            void isFome(boolean isFome) : Seta se o Tamagotchi está com fome.
            getNomeDoTreinador()        : Retorna o nome do Treinador.
            aumentaVezesAcordado()      : Adiciona um dia a mais acordado.
            aumentaIdade()              : Acrescenta um dia na vida do Tamagotchi.
            comer(int x)                : Método para alimentar o Tamagotchi. Parametros: 1. Comer muito, 2. Comer pouco, 3. Não comer
            dormir()                    : Método para fazer o Tamagotchi dormir.
            exercitar(int x)            : Método para fazer o Tamagotchi exercitar. Parametros: 1. Caminhar, 2. Correr
            imprimeDados()              : Imprime os dados do Tamagotchi.
            resetaVezesAcordado()       : Reseta a sequência de dias acordado.
     */

public class Tamagotchi {


    // Atributos principais da classe
    private String nome;
    private int idade, peso, vezesAcordado = 0;
    private boolean isFome, isMuitaFome;

    // Atributos do conteúdo extra
    private String nomeDoTreinador; // poderia ser feita uma classe treinador mais tarde para haver possibilidade de mais de um treinador, assim como vincular multiplos Tamagotchis aos mesmos.
    static Mensagens msg; // Atributo estático para garantir que a mesma instância da Classe Mensagens seja usada em todos os métodos.

    // Construtor
    // Destaca-se que o construtor recebe um objeto Mensagens msg, para garantir que está se usando a
    // mesma instancia da Classe Principal, evitando assim a criação de novas instâncias desnecessárias,
    // e garantindo que as mensagens tenham a mesma velocidade, controladas globalmente.
    public Tamagotchi(String nome, String nomeDoTreinador, int idade, int peso, Mensagens msg) {
        this.nome = nome;
        this.nomeDoTreinador = nomeDoTreinador;
        this.idade = idade;
        this.peso = peso;
        this.msg = msg;
    }

    // Getters e Setters dos atributos . Os únicos com Setters são o peso e o isFome, pois os outros são controlados
    // pelos métodos da classe, ou apenas pelo construtor, pois alguns atributos não precisam ser alterados.
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public int getPeso() {
        return this.peso;
    }
    public void setPeso(int peso, boolean aumenta) { // o boolean serve para dizer se aumenta o peso ou não.
        if (aumenta) {
            this.peso += peso;
        } else {
            this.peso -= peso;
        }
    }
    public int getVezesAcordado() {
        return this.vezesAcordado;
    }
    public boolean isFome() {
        return this.isFome;
    }
    public void isFome(boolean isFome) {
        this.isFome = isFome;
    }
    public boolean isMuitaFome() {
        return this.isMuitaFome;
    }
    public void isMuitaFome(boolean isMuitaFome) {
        this.isMuitaFome = isMuitaFome;
    }
    public String getNomeDoTreinador() {
        return this.nomeDoTreinador;
    }

    // Método para aumentar a quantidade de dias acordado
    public void aumentaVezesAcordado() {
        vezesAcordado++;
        //aumentaIdade();
    }

    // Método para aumentar a idade do Tamagotchi (em dias)
    public void aumentaIdade() {
        idade++;
    }

    // O método comer vai operar de acordo com o valor inteiro informado.
    //      1. Comer muito (Aumenta 5kg e precisa dormir).
    //      2. Comer pouco (Normal, aumenta 1kg).
    //      3. Não comer (Perde 2kg).
    public void comer(int x) {
        if (x == 1) {
            setPeso(5, true);
            msg.imprimeLore(getNome() + " comeu MUITO !");
            msg.imprimeLore(msg.getMensagemAleatoria("comida-grande"));
            msg.imprimeLore(getNome() + " ganhou 5 kg e agora precisa dormir. ZZZzzzzZZZZzz");
            resetaVezesAcordado();
            dormir();
        } else if (x == 2) {
            setPeso(1, true);
            msg.imprimeLore(getNome() + " se alimentou normalmente e ganhou 1kg.");
            msg.imprimeLore(msg.getMensagemAleatoria("comida-normal"));
        } else {
            setPeso(2, false);
            msg.imprimeLore(getNome() + " não se alimentou e perdeu 2kg.");
            msg.imprimeLore(msg.getMensagemAleatoria("comida-sem"));
        }
    }

    // O método vai ser chamado quando:
    //      1. O Usuário selecionar a opção de dormir.
    //      2. O Tamagotchi comer muito.
    // Obs.: Não será chamado quando ele desmaiar (ficar 5x acordado),
    // pois é tratado no resetaDiasAcordado pela lógica do main (onde é verificado quantos dias está acordado).
    public void dormir() {
        System.out.println(getNome() + " dormiu.");
        msg.imprimeLore(msg.getMensagemAleatoria("sono-bom"));
        aumentaIdade();
    }

    // O método vai ser chamado pelos métodos do Principal.
    // Possui como parâmetro duas opções, de acordo com as que são exibidas ao usuários.
    // Por isto, o parâmetro é um inteiro que significa:
    //      1. Caminhar 10 minutos (AUTOMATICAMENTE emagrece 1kg e fica com fome)
    //      2. Correr 10 minutos (AUTOMATICAMENTE emagrece 4kg e come muito)
    public void exercitar(int x) {
        // Caminhar
        if (x == 1) {
            msg.imprimeLore(getNome() + " caminhou por 10 minutos e emagreceu 1kg.");
            msg.imprimeLore(msg.getMensagemAleatoria("caminhada"));
            msg.imprimeLore(getNome() + " está com fome.");
            setPeso(1, false);
            isFome(true);
        } else { // Correr
            msg.imprimeLore(getNome() + " correu por 10 minutos e emagreceu 4kg !");
            msg.imprimeLore(msg.getMensagemAleatoria("corrida"));
            msg.imprimeLore(getNome() + " estava faminto em razão do exercício !");
            setPeso(4, false);
            isMuitaFome(true);
        }
    }

    // Método para imprimir os dados do Tamagotchi durante o jogo.
    // Não foi usado o System.out.println, pois, por mais que não haja delay,
    // a forma exibida caracter por caracter ainda dá um breve movimento ao texto.
    public void imprimeDados() {
        // Imprime os dados do Tamagotchi
        msg.imprimeLoreRapido("\n------------------------------STATUS--------------------------------\n");
        msg.imprimeLoreRapido("                             Status atual\n");
        msg.imprimeLoreRapido("      Nome: " + nome + "  - Treinador: " + nomeDoTreinador);
        msg.imprimeLoreRapido("      Dias: " + idade + "  - Peso: " + peso);
        msg.imprimeLoreRapido("      Vezes Acordado: " + vezesAcordado);
        System.out.println();
        // Imprime a imagem do Tamagotchi de acordo com o peso
        if (idade >= 15 || peso > 20 || peso < 1) {
            msg.imprimeLoreRapido(msg.getTamagochiAscii(5));
        } else if (peso > 0 && peso <= 5) {
            msg.imprimeLoreRapido(msg.getTamagochiAscii(1));
        } else if (peso > 5 && peso <= 10){
            msg.imprimeLoreRapido(msg.getTamagochiAscii(2));
        } else if (peso > 10 && peso <= 15){
            msg.imprimeLoreRapido(msg.getTamagochiAscii(3));
        } else if (peso > 15 && peso <= 20){
            msg.imprimeLoreRapido(msg.getTamagochiAscii(4));
        } else {
            System.out.println("Erro na exibição do Tamagotchi."); // Nunca acontecerá.
        }
        msg.imprimeLoreRapido("----------------------------------------------------------------------");
    }

    // Método para resetar a quantidade de dias acordado
    public void resetaVezesAcordado() {
        vezesAcordado = 0;
    }
}