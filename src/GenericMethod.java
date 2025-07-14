public class GenericMethod {
    public <N, S, A> void printThree(N arg1, S arg2, A arg3) {
        System.out.println("Arg 1: " + arg1);
        System.out.println("Arg 2: " + arg2);
        System.out.println("Arg 3: " + arg3);
    }
}
