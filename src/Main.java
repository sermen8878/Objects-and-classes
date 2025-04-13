// Класс Author.java
class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

// Класс Book.java
class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}

// Класс Main.java для запуска приложения
public class Main {
    public static void main(String[] args) {
        // Создаем авторов
        Author tolkien = new Author("John", "Tolkien");
        Author rowling = new Author("Joanne", "Rowling");

        // Создаем книги
        Book lotr = new Book("The Lord of the Rings", tolkien, 1954);
        Book hp = new Book("Harry Potter and the Philosopher's Stone", rowling, 1997);

        // Выводим информацию о книгах
        System.out.println("Книга 1: " + lotr.getTitle() +
                ", автор: " + lotr.getAuthor().getFirstName() + " " + lotr.getAuthor().getLastName() +
                ", год: " + lotr.getPublicationYear());

        System.out.println("Книга 2: " + hp.getTitle() +
                ", автор: " + hp.getAuthor().getFirstName() + " " + hp.getAuthor().getLastName() +
                ", год: " + hp.getPublicationYear());

        // Изменяем год публикации одной из книг
        hp.setPublicationYear(1998);
        System.out.println("Обновленный год публикации для Harry Potter: " + hp.getPublicationYear());
    }
}