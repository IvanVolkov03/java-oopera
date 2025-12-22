public class Director extends Person{
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public Director(Person person, int numberOfShows) {
        super(person.getName(), person.getSurname(), person.getGender());
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Director{" + super.toString() +
                ", numberOfShows=" + numberOfShows +
                '}';
    }
}
