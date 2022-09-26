import generic.GenericType;
import generic.Jean;
import generic.Pants;

public class GenericApplication {

    private static <T> void setAndGetBox(T t, String boxName) {
        GenericType<T> box = new GenericType<>();
        box.set(t);
        System.out.println("In " + boxName + " : " + box.get() + " (" + box.get().getClass() + ")");
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Let's boxing Objects");

        int intExample = 4;
        String boxName = "intBox";
        setAndGetBox(intExample, boxName);

        byte byteExample = 64;
        boxName = "byteBox";
        setAndGetBox(byteExample, boxName);

        String stringExample = "Bag";
        boxName = "StringBox";
        setAndGetBox(stringExample, boxName);

        Jean jeanExample = new Jean();
        boxName = "JeanBox";
        setAndGetBox(jeanExample, boxName);

        Jean jeanExample2 = new Jean();
        boxName = "JeanBox2";
        setAndGetBox(jeanExample2, boxName);

        Pants jeanExample3 = new Jean();
        boxName = "PantsBox";
        setAndGetBox(jeanExample3, boxName);

    }

}
