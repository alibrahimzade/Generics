package atl;

public class Box <T>{
    private T num;

    public Box(T num) {
        this.num = num;
    }

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }
}
