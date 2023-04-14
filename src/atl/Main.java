package atl;

public class Main {
    public static void main(String[] args) {
        Box<Test> box = new Box<>(new Test());
        System.out.println(box.getNum().getF(new Integer[]{1}));

        Integer test = test(2.20);
        test2(new Box<>(2));
    }

    static void test2(Box< ? extends Number> num) { // extends yerine super yazanda Numberin parent clasina veya ozune(NUmber) aid parametr oture bilerik yeni Object class
    }

    static <A extends Number> int test(A a) {
        return a.intValue();
    }


}
