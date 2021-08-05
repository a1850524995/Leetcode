package template;

public class Test {
    public static void main(String[] args) {
        Generic<Integer> genericInt = new Generic<>(123);
        Generic<Number> numberGeneric = new Generic<>(145);
        showvalue(genericInt);

    }
    public static void showvalue(Generic <? extends Number> generator){
        System.out.println(generator.getKey());
    }
}
