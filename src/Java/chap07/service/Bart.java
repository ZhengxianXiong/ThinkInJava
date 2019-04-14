package chap07.service;

public class Bart extends Homer {
    MilHouse doh(MilHouse mil) {
        System.out.println("doh(MilHouse)");
        return mil;
    }

    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1.0f);
        b.doh(new MilHouse());
        b.doh('c');
    }
}

class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }

    float doh(float f) {
        System.out.println("doh(char)");
        return 1.0f;
    }
}

class MilHouse {

}

