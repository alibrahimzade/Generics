package miaa;

public class Main {
    public static void main(String[] args) {
        Integer [] intArray ={1,2,3,4,5};
        Double [] doubleArray={1.3,212.00,123.0};
        String [] stringArray ={"Alma","armud"};

        displayArr(intArray);
        displayArr(stringArray);
        displayArr(doubleArray);

//        System.out.println(getFirst(intArray));
    }

    public static <Thing> void displayArr(Thing[] arr){
        for (Thing a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    public static <Thing> Thing getFirst(Thing[] arr){
        return arr[0];
    }
}
