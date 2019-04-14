package chap08.dto;

public class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Stringed.play()");
    }
}
