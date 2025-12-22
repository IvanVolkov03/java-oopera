package com.mytheatre.app;

import com.mytheatre.model.enums.Gender;
import com.mytheatre.model.people.*; // Импортирует Actor, Director, Person.
import com.mytheatre.model.shows.*;  // Импортирует Ballet, Opera, Show, MusicalShow
import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Person Mihalkov = new Person("Никита", "Михалков", Gender.MALE);

        Actor actor1 = new Actor("Сергей", "Безруков", Gender.MALE, 174);
        Actor actor2 = new Actor(Mihalkov, 187);
        Actor actor3 = new Actor("Елизавета", "Боярская", Gender.FEMALE, 170);

        Director director1 = new Director(Mihalkov, 45);
        // Не является режиссёром театра, пример актёра и режиссёра кино одновременно (класс com.mytheatre.model.people.Person)
        Director director2 = new Director("Марк", "Захаров", Gender.MALE, 37);

        Person musicAuthor = new Person("Микаэл", "Таривердиев", Gender.MALE);
        Person choreographer = new Person("Татьяна", "Баганова", Gender.FEMALE);

        String librettoForOpera = "В замкнутом пространстве школьного спортзала решается судьба чеченского юноши...";
        String librettoForBallet = "Мастер Дроссельмейер дарит Мари куклу для колки орехов — Щелкунчика...";

        Show show = new Show("Двенадцать", 124, director1, new ArrayList<Actor>());
        Opera opera = new Opera(show, musicAuthor, librettoForOpera, 23);
        Ballet ballet = new Ballet("Щелкунчик", 116, director1, new ArrayList<Actor>(), musicAuthor, librettoForBallet, choreographer);

        show.addActor(actor1);
        opera.addActor(actor2);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        //Вывод актёров для каждого спесктакля
        System.out.println("\nОбычный спектакль, актёры: ");
        show.printListOfActors();
        System.out.println("\nОпера, актёры: ");
        opera.printListOfActors();
        System.out.println("\nБалет, актёры: ");
        ballet.printListOfActors();

        System.out.println("\nБалет, попытка замены актёров: ");
        ballet.replaceActor(actor2, actor1);
        System.out.println("\nБалет, новвые актёры: ");
        ballet.printListOfActors();

        System.out.println("\nОпера, попытка замены несуществующего актёра: ");
        opera.replaceActor(actor3, actor2);
        System.out.println("\nОпера, новвые актёры: ");
        ballet.printListOfActors();

        System.out.println("\nОпера, вывод либретто: ");
        opera.printLibretto();
        System.out.println("\nБалет, вывод либретто: ");
        ballet.printLibretto();

    }
}
