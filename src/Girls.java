public class Girls extends AliveCreature implements Speakable{

    Girls(String name) {
        super(name);
    }

    @Override
    public void speak() {
        if (this.name.equals("Alice")) {
            System.out.println(this.name + " said: Вряд ли много найдется девочек в моем возрасте, а то и старше, которые слыхали такое слово и знают, что оно значит");
        } else {
            System.out.println(this.name + " said: Я не знаю такие сложные слова, которые знает Алиса");
        }
    }



}
