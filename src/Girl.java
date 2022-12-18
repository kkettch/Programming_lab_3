public class Girl extends AliveCreature implements Speakable{

    Girl(String name) {
        super(name);
    }

    @Override
    public void speak(Word word) {
        if (!this.name.equals("Alice")) {
            if (word.difficult) {
                System.out.println(this.name + " said: I don't know word '" + word.name + "'");
            } else {
                System.out.println(this.name + " said: I know word '" + word.name + "'");
            }
        } else {
            System.out.println(this.name + " said: I know all the words, including " + word.name);
        }
    }



}
