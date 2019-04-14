package chap08.service;

import chap08.dto.*;

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind w = new Wind();
        tune(w);
        Brass b = new Brass();
        tune(b);
        Stringed s = new Stringed();
        tune(s);
        System.out.println(w instanceof Instrument);
    }
}
