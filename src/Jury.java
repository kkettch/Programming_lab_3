import java.util.ArrayList;

public class Jury extends AliveCreature {
    static ArrayList<String> capacity_branch = new ArrayList<>();
    static ArrayList<String> capacity_slate = new ArrayList<>();
    private static int i = 0;
    Jury(String name, int iq_level) {
        super(name, iq_level);
    }

    void getJurorQualifications() {
        if (this.iq_level >= 120) {
            System.out.println(this.name + " has an iq-level " + this.iq_level + ". He is a good Jury");
        } else {
            System.out.println(this.name + " has an iq-level " + this.iq_level + ". He is a bad Jury");
        }
    }

    void sitOnTheBranch(Branch branch) {
        if (capacity_branch.size() == branch.capacity) {
            System.out.println("Мест на скамейке больше нет!");
        } else {
            capacity_branch.add(this.name);
            System.out.println(this.name + " is sitting on the " + branch.name);
        }
    }

    void writingOnTheSlate(Slate slate) {
        if (capacity_slate.size() == slate.max_amount_of_writings) {
            System.out.println("На доске больше негде писать! Сотрите что-нибудь с доски");
        } else {
            capacity_slate.add(String.valueOf(++i));
            System.out.println("Присяжный написал на доске. Можно написать еще " + (slate.max_amount_of_writings - capacity_slate.size()) + " раз(-а)");
        }
    }

    void erasingFromTheSlate(Slate slate) {
        if (capacity_slate.size() == 0) {
            System.out.println("Что вы хотите стереть с доски, на которой ничего не написано? Так не получится");
        } else {
            capacity_slate.remove(capacity_slate.size() - 1);
            System.out.println("Вы стерли одну запись. На доске осталось место еще для " + (slate.max_amount_of_writings - capacity_slate.size()) + " записи(-ей)");
        }

    }
}
