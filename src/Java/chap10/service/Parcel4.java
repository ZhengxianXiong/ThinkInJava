package chap10.service;

import chap10.dto.Contents;
import chap10.dto.Destination;

public class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }

    /**
     * 匿名内部类
     *
     * @return
     */
    public Contents t11() {
        return new Contents() {
            private int i = 11;

            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
    }
}
