package com.mytheatre.model.shows;

import com.mytheatre.model.people.Actor;
import com.mytheatre.model.people.Director;
import com.mytheatre.model.people.Person;

import java.util.ArrayList;

public class MusicalShow extends Show {
    private Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
    public MusicalShow(Show show, Person musicAuthor, String librettoText) {
        super(show.getTitle(), show.getDuration(), show.getDirector(), show.getListOfActors());
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setMusicAuthor(Person musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public void printLibretto(){
        System.out.println("Текст либретто: " + librettoText);
    }

    //Не используется
    @Override
    public String toString() {
        return "com.mytheatre.model.shows.MusicalShow{" +
                "musicAuthor=" + musicAuthor +
                ", librettoText='" + librettoText + '\'' +
                '}';
    }
}
