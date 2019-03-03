package advanced;

public class InitilizationBlock {

    static {
        initialize();
        x=10;
    }

    private static int sum;
    private static boolean initialize;
    /*
    If default values are assigned for static variables , after block execution, value gets defaulted to initial value ;
    ie 0 in below case.
    If not given zero, after block execution, it stays at 10.
     */
    static int x=0;

    public static int getSum() {
        initialize();
        return sum;
    }

    private static void initialize() {

        if(!initialize){
            for(int i =0; i<10; i++) {
                sum += i;
            }
            initialize = true;
        }
    }


    public static void main(String[] args) {
        System.out.println( InitilizationBlock.getSum());
        System.out.println(InitilizationBlock.x);
    }
}
