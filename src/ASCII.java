/*
        Algoritmos e Programação: Fundamentos
        Prof. Mateus Raeder
        Tarefa | Desafio do Módulo 3
        Aluno: Anderson Koefender.

        Classe ASCII
            Esta classe possui os métodos para imprimir os logos e imagens ASCII do jogo Tamagotchi.

        Esta classe possui os seguintes métodos:
                String getAsciiLogo()                  : Imprime o logo do jogo Tamagotchi.
                String getAsciiLogoEskeminha()         : Imprime o logo do jogo Tamagotchi com o nome do desenvolvedor.
                String getAsciiMorreu()                : Imprime a imagem ASCII de um Tamagotchi morto.
                String getAsciiNuke()                  : Imprime a imagem ASCII de uma explosão nuclear.
                String getAsciiTamagochi(int size)     : Imprime a imagem ASCII de um Tamagotchi de acordo com o tamanho.
 */

public class ASCII {
    public static String getAsciiLogo() {
        StringBuilder asciiArt = new StringBuilder();
        asciiArt.append("  _______                                _       _     _ \n");
        asciiArt.append(" |__   __|                              | |     | |   (_)\n");
        asciiArt.append("    | | __ _ _ __ ___   __ _  __ _  ___ | |_ ___| |__  _ \n");
        asciiArt.append("    | |/ _` | '_ ` _ \\ / _` |/ _` |/ _ \\| __/ __| '_ \\| |\n");
        asciiArt.append("    | | (_| | | | | | | (_| | (_| | (_) | || (__| | | | |\n");
        asciiArt.append("    |_|\\__,_|_| |_| |_|\\__,_|\\__, |\\___/ \\__\\___|_| |_|_|\n");
        asciiArt.append("     Made by Eskeminha.       __/ |     2024             \n");
        asciiArt.append("     Computer Science        |___/      UNISINOS         \n");
        return asciiArt.toString();
    }
    public static String getAsciiLogoEskeminha() {
        StringBuilder asciiArt = new StringBuilder();
        asciiArt.append("███████╗███████╗██╗  ██╗███████╗███╗   ███╗██╗███╗   ██╗██╗  ██╗ █████╗ \n");
        asciiArt.append("██╔════╝██╔════╝██║ ██╔╝██╔════╝████╗ ████║██║████╗  ██║██║  ██║██╔══██╗\n");
        asciiArt.append("█████╗  ███████╗█████╔╝ █████╗  ██╔████╔██║██║██╔██╗ ██║███████║███████║\n");
        asciiArt.append("██╔══╝  ╚════██║██╔═██╗ ██╔══╝  ██║╚██╔╝██║██║██║╚██╗██║██╔══██║██╔══██║\n");
        asciiArt.append("███████╗███████║██║  ██╗███████╗██║ ╚═╝ ██║██║██║ ╚████║██║  ██║██║  ██║\n");
        asciiArt.append("╚══════╝╚══════╝╚═╝  ╚═╝╚══════╝╚═╝     ╚═╝╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═╝  ╚═╝\n");
        asciiArt.append("       https://github.com/Eskeminha                     Since 1987.     \n");
        return asciiArt.toString();
    }
    public static String getAsciiMorreu() {
        StringBuilder asciiArt = new StringBuilder();
        asciiArt.append(" ███▄ ▄███▓ ▒█████   ██▀███   ██▀███  ▓█████  █    ██                \n");
        asciiArt.append("▓██▒▀█▀ ██▒▒██▒  ██▒▓██ ▒ ██▒▓██ ▒ ██▒▓█   ▀  ██  ▓██▒               \n");
        asciiArt.append("▓██    ▓██░▒██░  ██▒▓██ ░▄█ ▒▓██ ░▄█ ▒▒███   ▓██  ▒██░               \n");
        asciiArt.append("▒██    ▒██ ▒██   ██░▒██▀▀█▄  ▒██▀▀█▄  ▒▓█  ▄ ▓▓█  ░██░               \n");
        asciiArt.append("▒██▒   ░██▒░ ████▓▒░░██▓ ▒██▒░██▓ ▒██▒░▒████▒▒▒█████▓  ██▓  ██▓  ██▓ \n");
        asciiArt.append("░ ▒░   ░  ░░ ▒░▒░▒░ ░ ▒▓ ░▒▓░░ ▒▓ ░▒▓░░░ ▒░ ░░▒▓▒ ▒ ▒  ▒▓▒  ▒▓▒  ▒▓▒ \n");
        asciiArt.append("░  ░      ░  ░ ▒ ▒░   ░▒ ░ ▒░  ░▒ ░ ▒░ ░ ░  ░░░▒░ ░ ░  ░▒   ░▒   ░▒  \n");
        asciiArt.append("░      ░   ░ ░ ░ ▒    ░░   ░   ░░   ░    ░    ░░░ ░ ░  ░    ░    ░   \n");
        asciiArt.append("       ░       ░ ░     ░        ░        ░  ░   ░       ░    ░    ░  \n");
        asciiArt.append("                                                        ░    ░    ░  \n");
        return asciiArt.toString();
    }
    public static String getAsciiNuke() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠤⠴⠾⠋⠉⠛⢾⡏⠙⠿⠦⠤⢤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⢶⣿⠉⢀⣀⡠⠆⠀⠀⠀⠀⠀⠀⠀⢤⣀⣀⠈⢹⣦⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⠁⢋⡙⠁⠀⡝⠀⠀⠀⠀⣀⡸⠋⠁⠀⠀⠹⡀⠀⠈⠈⠆⢹⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣿⣁⡡⣴⡏⠀⠀⠀⢀⠀⢧⣀⠄⠀⠀⠀⣀⣰⠆⢀⠁⠀⠀⢈⣶⡤⣀⢹⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠀⣠⢴⠟⢁⡝⠀⠁⠀⠃⠉⠀⠀⠘⣯⠀⡀⠾⣤⣄⣠⢤⠾⠄⠀⣸⠖⠀⠀⠈⠀⠃⠀⠀⠹⡄⠙⣶⢤⡀⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⣠⠾⡇⠈⣀⡞⠀⠀⠀⠀⡀⠀⢀⣠⣄⣇⠀⣳⠴⠃⠀⠀⠀⠣⢴⠉⣰⣇⣀⣀⠀⠀⡄⠀⠀⠀⢹⣄⡘⠈⡷⣦⠀⠀⠀⠀\n");
        sb.append("⠀⢠⠞⠉⢻⡄⠀⠀⠈⠙⠀⠀⠀⠀⠙⣶⣏⣤⣤⠟⠉⠁⠀⠀⠀⠀⠀⠀⠀⠉⠙⢦⣱⣌⣷⠊⠀⠀⠀⠀⠈⠁⠀⠀⠀⡝⠉⠻⣄⠀\n");
        sb.append("⣴⠛⢀⡠⢼⡇⠀⠀⢀⡄⠀⢀⣀⡽⠚⠁⠀⠀⠀⢠⡀⢠⣀⠠⣔⢁⡀⠀⣄⠀⡄⠀⠀⠀⠈⠑⠺⣄⡀⠀⠠⡀⠀⠀⢠⡧⠄⠀⠘⢧\n");
        sb.append("⣿⡶⠋⠀⠀⠈⣠⣈⣩⠗⠒⠋⠀⠀⠀⠀⣀⣠⣆⡼⣷⣞⠛⠻⡉⠉⡟⠒⡛⣶⠧⣀⣀⣀⠀⠀⠀⠀⠈⠓⠺⢏⣉⣠⠋⠀⠀⠀⢢⣸\n");
        sb.append("⣿⠇⠐⠤⠤⠖⠁⣿⣀⣀⠀⠀⠀⠀⠀⠉⠁⠈⠉⠙⠛⢿⣷⡄⢣⡼⠀⣾⣿⠧⠒⠓⠚⠛⠉⠀⠀⠀⠀⠀⢀⣀⣾⡉⠓⠤⡤⠄⠸⢿\n");
        sb.append("⠹⣆⣤⠀⠀⠠⠀⠈⠓⠈⠓⠤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⢸⠀⢸⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠒⠁⠰⠃⠀⠠⠀⠀⢀⣀⠞\n");
        sb.append("⠀⠀⠉⠓⢲⣄⡈⢀⣠⠀⠀⠀⡸⠶⠂⠀⠀⢀⠀⠀⠤⠞⢻⡇⠀⠀⢘⡟⠑⠤⠄⠀⢀⠀⠀⠐⠲⢿⡀⠀⠀⢤⣀⢈⣀⡴⠖⠋⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠈⠉⠉⠙⠓⠒⣾⣁⣀⣴⠀⣀⠙⢧⠂⢀⣆⣀⣷⣤⣀⣾⣇⣀⡆⠀⢢⠛⢁⠀⢰⣀⣀⣹⠒⠒⠛⠉⠉⠉⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠈⠉⠉⠛⠉⠙⠉⠀⠀⣿⡟⣿⣿⠀⠀⠈⠉⠉⠙⠋⠉⠉⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⢻⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⣾⣿⣿⠁⠀⢹⡛⣟⡶⢤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠛⢯⣽⡟⢿⣿⠛⠿⠳⠞⠻⣿⠻⣆⢽⠟⣶⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠃⠲⠯⠴⣦⣼⣷⣤⣤⣶⣤⣩⡧⠽⠷⠐⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⡇⠀⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣄⡀⢀⣀⣠⡾⡿⢡⢐⠻⣿⣄⣀⡀⠀⣀⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⢴⡏⠁⠀⠝⠉⣡⠟⣰⠃⢸⣿⠀⣷⠙⢧⡉⠻⡅⠀⠙⡷⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡟⠀⠈⣿⢄⡴⠞⠻⣄⣰⣡⠤⣞⣸⡤⢬⣧⣀⡿⠛⠦⣤⣶⡃⠀⢹⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠀⠀⢀⣴⣶⡿⠃⠉⢺⠁⠙⠒⠀⠀⣠⡉⠀⠉⠚⠉⠉⠑⠈⠀⠈⣧⠀⠀⠒⠋⠀⡹⠋⠀⢻⡶⠶⡄⠀⠀⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠀⣠⣾⣿⣇⠁⢈⡦⠀⡍⠋⠁⡀⠸⡋⠀⠀⠀⢘⠏⠉⡏⠀⠀⠀⢉⡷⠀⡌⠉⠋⡇⠠⣏⠈⢁⣦⣿⣦⠀⠀⠀⠀⠀⠀\n");
        sb.append("⠀⠀⠀⠀⠀⠀⠉⣁⠀⠉⠉⠉⠙⠛⠛⠒⠚⠳⠤⢼⣤⣠⠤⣮⣠⣤⣼⠦⢤⣤⣿⠤⠾⠓⠒⠛⢓⠛⠉⠉⠉⠀⠈⠉⠀⠀⠀⠀⠀⠀\n");
        return sb.toString();
    }
    public static String getAsciiTamagochi(int size){
        if (size == 1){ // 0-5kg Pequeno
            return "                 /\\_/\\  \n" +
                   "                ( o.o ) \n" +
                   "                 > ^ <  \n";
        } else if (size == 2) { // 6-10kg Médio
            return "               /\\_____/\\  \n" +
                   "              (   o.o   ) \n" +
                   "               >   ^   <  \n";
        } else if (size == 3) { // 11-15kg Grande
            return "              /\\_______/\\  \n" +
                   "             (   o . o   ) \n" +
                   "              >    ^    <  \n";
        } else if (size == 4) { // 16-20kg Gigante
            return "              /\\_________/\\  \n" +
                   "             (   o  .  o   ) \n" +
                   "              >>    ^    <<  \n";
        } else if (size == 5) { // Maior que 20 Morto
            return "                 ,-=-.     \n" +
                   "                /  +  \\  \n" +
                   "                | ~~~ |   \n" +
                   "                |R.I.P|   \n" +
                   "                |_____|  \n";
        } else {
            return "Tamanho inválido";
        }
    }
}
