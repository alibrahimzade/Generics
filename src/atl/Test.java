package atl;

public class Test{
    static <Thing extends Number> void foo(Thing[] t){
        for (Thing a:t) {
            System.out.print(a);
        }
    }

    public static void mai() {
        Integer [] integers = {1,2,3,4,5};
        foo(integers);
    }
    public  <Thing> Thing getF(Thing [] arr){
        return  arr[0];
    }

    public static void main(String[] args) {
        String [] arr ={"a","b","c"};
        Integer [] a = {2,3,4,5,6};
        Test.foo(a);
    }

}
