package chap07.service;

public class Chess extends BoardGame {
    public Chess(int i) {
        super(i);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess c = new Chess(2);
    }
}

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame coonstructor");
    }
}

