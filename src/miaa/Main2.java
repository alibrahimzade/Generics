package miaa;

public class Main2 {
    public static void main(String[] args) {
        MyGenericsClass<Integer,String> mg = new MyGenericsClass<>(1,"2");
        System.out.println(mg.getValue());
    }
}
