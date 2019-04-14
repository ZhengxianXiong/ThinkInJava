package chap12.dto;


public class DivisorIsZeroException extends RuntimeException {
    private String msg = "除数不能为零！";

    public DivisorIsZeroException() {
        System.out.println(this.msg);
    }

    public DivisorIsZeroException(String msg) {
        this.msg = msg;
        System.out.println(this.msg);
    }
}
