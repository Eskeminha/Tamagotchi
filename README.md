# Tamagotchi

<img src="https://github.com/Eskeminha/Tamagotchi/blob/bd4ddab27e3338f705c98507d88cdb356b1c966a/TamagotchiLogo.jpg" alt="Tamagotchi Logo" width="300">

Este é um aplicativo criado para simular a vida de um Tamagotchi digital, conforme as funcionalidades exigidas na Tarefa de Algoritmos e Programação: Fundamentos, do Prof. Dr. Mateus Raeder. Esta é a versão do jogo que eu fiz, com base nas referidas características e ações necessárias para a tarefa.

## Funcionalidades
O Tamagotchi tem as seguintes características e ações disponíveis:

##Características:

- Nome
- Idade
- Peso
- Nome do Treinador

## Ações:
1. Sentir sono: O Tamagotchi pode sentir sono, e o usuário pode escolher entre deixá-lo dormir ou permanecer acordado. Se ele permanecer acordado 5 vezes seguidas, dormirá automaticamente. Ao dormir, sua idade aumenta em 1 dia. Ele morre quando atinge 15 dias.

2. Sentir fome: O Tamagotchi pode sentir fome, e o usuário pode escolher entre comer muito, comer pouco ou não comer. Comer pouco é o padrão, aumentando 1 quilo a cada vez. Comer muito aumenta 5 quilos e o faz dormir. Não comer emagrece 2 quilos a cada vez. Se ultrapassar 20 quilos, explode; se chegar a zero quilos, morre de desnutrição.

3. Ficar entediado: O Tamagotchi pode ficar entediado, e o usuário pode escolher entre correr por 10 minutos ou caminhar por 10 minutos. Correr emagrece 4 quilos e o faz comer muito. Caminhar emagrece 1 quilo e o deixa com fome.

## Escolha dos desejos:
Os desejos do Tamagotchi acontecem aleatoriamente, utilizando o método Math.random() para sortear entre os valores desejados.

## Como funciona:
O programa simula a vida completa do Tamagotchi, começando com 0 dias e 1 quilo. Após cada ação realizada pelo usuário, o estado do Tamagotchi é exibido.

Divirta-se cuidando do seu Tamagotchi digital! 🐾
