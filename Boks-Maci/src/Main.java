public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("a", 30,100,100,50);
        Fighter f2 = new Fighter("b", 10,100,85,50);

        Match match = new Match(f1,f2,85,100);
        match.run();
    }
}
