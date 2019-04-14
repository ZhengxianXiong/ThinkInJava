package chap12.service;

import chap12.dto.DivisorIsZeroException;

public class Divisor {
    public static void main(String[] args) {
        try {
            throw new DivisorIsZeroException();
        } catch (DivisorIsZeroException d) {
            d.printStackTrace(System.out);
        }
    }
}
