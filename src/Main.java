public class Main {
    public static void main(String[] args) {

        Girl alice = new Girl("Alice");
        alice.getEmotion();

        Word word = new Word("Jury", true);
        alice.speak(word);

        Jury jury1 = new Jury("John", 100);
        Jury jury2 = new Jury("Jessica", 150);
        Branch branch = new Branch("branch", 1);
        Slate slate = new Slate("slate", 2);

        jury1.sitOnTheBranch(branch);
        jury2.sitOnTheBranch(branch);

        jury1.writingOnTheSlate(slate);
    }
}