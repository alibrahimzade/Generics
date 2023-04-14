package V3;

public class Container <T>{
    private T object;

    public Container(T object) {
        this.object = object;
    }

    public T doItAndReturn(){
        System.out.println("I did something");
        return this.object;
    }
}
