public abstract class AliveCreature implements EmotionalInfluencable {

    protected String name;
    protected Emotion emotion = Emotion.normal;
    protected int iq_level;

    AliveCreature(String name) {
        this.name = name;
    }

    AliveCreature(String name , int iq_level) {
        this.name = name;
        this.iq_level = iq_level;
    }

    @Override
    public void setEmotion() {
        if (this.name.equals("Alice")) {
            this.emotion = Emotion.pride;
        } else if (iq_level < 100 && getClass().getSimpleName().equals("Girl")) {
            this.emotion = Emotion.sad;
        } else if (iq_level > 120) {
            this.emotion = Emotion.thoughtful;
        }
    }

    @Override
    public void getEmotion() {
        setEmotion();
        System.out.println(this.name + " has an emotion: " + this.emotion);
    }
}
