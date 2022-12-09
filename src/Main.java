public class Main {
    public static void main(String[] args) {
        Girls alice = new Girls("Alice");
        alice.getEmotion();
        alice.speak();
        Girls anna = new Girls("Anna");
        anna.speak();
        Jury jury = new Jury("Jury", 10);
        Jury jury1 = new Jury("Jury", 120);
        jury.getJurorQualifications();
        jury1.getJurorQualifications();
        Branch branch = new Branch("branch", 1);
        jury.sitOnTheBranch(branch);
        jury1.sitOnTheBranch(branch);
        Slate slate = new Slate("slate", true);
        jury.writingOnTheSlate(slate);
    }
}