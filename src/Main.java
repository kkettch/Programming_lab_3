public class Main {
    public static void main(String[] args) {

        Jury jury = new Jury("Jury", 10);
        Slate slate = new Slate("slate", 3);
        jury.writingOnTheSlate(slate);

    }
}