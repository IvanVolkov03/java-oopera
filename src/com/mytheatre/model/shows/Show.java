import java.util.ArrayList;
import java.util.Objects;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void printListOfActors(){
        for(Actor actor : listOfActors){
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor newActor){
        if(isContainsActor(newActor)){
            System.out.println("Данный актёр уже есть в спектакле!");
            return;
            }
        listOfActors.add(newActor);
    }

    public boolean replaceActor(Actor oldActor, Actor newActor) {
        // 1. Ищем индекс старого актера
        int index = listOfActors.indexOf(oldActor);

        // 2. Если старый актер не найден
        if (index == -1) {
            System.out.println("Ошибка: заменяемый актёр не найден в списке этого спектакля.");
            return false;
        }

        // 3. Проверяем, существует ли новый актер (не null)
        if (newActor == null) {
            System.out.println("Ошибка: новый актёр не указан (объект не существует).");
            return false;
        }

        // 4. Проверяем, не играет ли уже новый актер в этом спектакле
        if (isContainsActor(newActor)) {
            System.out.println("Ошибка: Актёр " + newActor.getSurname() + " уже участвует в этом спектакле.");
            return false;
        }

        // 5. Если все проверки пройдены — заменяем
        listOfActors.set(index, newActor);
        System.out.println("Успешно: актёр " + oldActor.getSurname() + " заменен на " + newActor.getSurname() + ".");
        return true;
    }

    public boolean isContainsActor(Actor actor){
        return listOfActors.contains(actor);
    }

    //Не используется
    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                '}';
    }
}
