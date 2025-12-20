import java.util.Objects;

public class Actor extends Person{
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public Actor(Person person, int height) {
        super(person.getName(), person.getSurname(), person.getGender());
        this.height = height;
    }

    @Override
    public String toString() {
        return "Actor{" + super.toString() +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false; // Проверяем имя, фамилию, пол через Person
        Actor actor = (Actor) o;
        return height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }
}
