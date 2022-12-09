import java.util.Objects;

public class Branch {
    protected String name;
    int capacity;
    Branch (String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return capacity == branch.capacity && Objects.equals(name, branch.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
