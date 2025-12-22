import java.util.ArrayList;

public class Ballet extends MusicalShow{
    private Person choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                  Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Ballet(Show show, Person musicAuthor, String librettoText, Person choreographer) {
        super(show, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Ballet(MusicalShow musicalShow, Person choreographer) {
        super(musicalShow.getTitle(),
                musicalShow.getDuration(),
                musicalShow.getDirector(),
                musicalShow.getListOfActors(),
                musicalShow.getMusicAuthor(),
                musicalShow.getLibrettoText());
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(Person choreographer) {
        this.choreographer = choreographer;
    }

    //Не используется
    @Override
    public String toString() {
        return "Ballet{" +
                "choreographer=" + choreographer +
                '}';
    }
}
