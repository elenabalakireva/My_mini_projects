package com.company;

public class Main {

    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("оно", 2010, 16),
                new Movie("Аватар", 2009, 12),
                new Movie("Операция Ы", 1965, 6)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Сон в летнеюю ночь", 2013, 16),
                new Theatre("Примадонны", 2011, 12),
        };

    }

    public static void validEvent(Event event) throws RuntimeException {
        if (event.title == null || event.releaseYear == 0 || event.age == 0) {
            throw new RuntimeException("Валидация не прошла");
        }


    }
}
