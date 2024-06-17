# Tamagotchi

<img src="https://github.com/Eskeminha/Tamagotchi/blob/bd4ddab27e3338f705c98507d88cdb356b1c966a/TamagotchiLogo.jpg" alt="Tamagotchi Logo" width="300">

This is an application created to simulate the life of a digital Tamagotchi, according to the functionalities required in the Algorithms and Programming Task: Fundamentals, by Prof. Dr. Mateus Raeder. This is the version of the game that I created, based on the mentioned characteristics and actions required for the task.

##Features
The Tamagotchi has the following characteristics and actions available:

### Characteristics:

- Name
- Age
- Weight
- Trainer's Name

## Actions:
Feel sleepy: The Tamagotchi can feel sleepy, and the user can choose between letting it sleep or keeping it awake. If it stays awake 5 times in a row, it will automatically fall asleep. When it sleeps, its age increases by 1 day. It dies when it reaches 15 days old.

Feel hungry: The Tamagotchi can feel hungry, and the user can choose between eating a lot, eating a little, or not eating. Eating a little is the default, increasing its weight by 1 kilogram each time. Eating a lot increases 5 kilograms and makes it fall asleep. Not eating makes it lose 2 kilograms each time. If it exceeds 20 kilograms, it explodes; if it reaches zero kilograms, it dies from malnutrition.

Get bored: The Tamagotchi can get bored, and the user can choose between running for 10 minutes or walking for 10 minutes. Running reduces weight by 4 kilograms and makes it eat a lot. Walking reduces weight by 1 kilogram and leaves it hungry.

Wishes selection:
The Tamagotchi's wishes occur randomly, using the Math.random() method to select from desired values.

## How it works:
The program simulates the complete life of the Tamagotchi, starting with 0 days and 1 kilogram. After each action performed by the user, the state of the Tamagotchi is displayed.

Enjoy taking care of your digital Tamagotchi! 🐾
