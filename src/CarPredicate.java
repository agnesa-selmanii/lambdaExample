public interface CarPredicate {
    boolean test(Car car);

    default void test2(){
        //method body
    }
}
