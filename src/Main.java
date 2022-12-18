public class Main {
    public static void main(String[] args) {
        Girl alice = new Girl("Alice");
        Word word1 = new Word("Jury", true);
        Word word2 = new Word("Branch", false);
        alice.speak(word1);
        alice.speak(word2);
        Girl anna = new Girl("Anna");
        anna.speak(word1);
        Jury jury = new Jury("Jury", 10);
        Jury jury1 = new Jury("Jury", 120);
        jury.getJurorQualifications();
        jury1.getJurorQualifications();
        Branch branch = new Branch("branch", 1);
        jury.sitOnTheBranch(branch);
        jury1.sitOnTheBranch(branch);
        Slate slate = new Slate("slate", false);
        jury.writingOnTheSlate(slate);

    }
}