import java.util.ArrayList;

public class Jury extends AliveCreature {
    static ArrayList<String> capacity = new ArrayList<String>();
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
        if (capacity.size() == branch.capacity) {
            System.out.println("Мест на скамейке больше нет!");
        } else {
            capacity.add(this.name);
            System.out.println(this.name + " is sitting on the " + branch.name);
        }
    }

    void writingOnTheSlate(Slate slate) {
        if (!slate.flag) {
            System.out.println(this.name + " is writing on an empty " + slate.name);
            slate.flag = true;
        } else {
            System.out.println(this.name + " writes on a " + slate.name + " on which something has already been written");
        }
    }
}
