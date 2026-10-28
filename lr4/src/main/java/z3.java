public class z3
{
    public static void main(String[] args)
    {
        Book[] books =
                {
                new Book("Война и мир", Language.RUSSIAN),
                new Book("1984", Language.ENGLISH),
                new Book("Гарри Поттер", Language.ENGLISH),
                new Book("Маленький принц", Language.FRENCH),
                new Book("Фауст", Language.GERMAN)
        };
        System.out.println("Книги на английском языке:");
        for (Book b : books)
        {
            if (b.language == Language.ENGLISH) {
                System.out.println("- " + b.title);
            }
        }
    }
}

enum Language
{
    RUSSIAN, ENGLISH, FRENCH, GERMAN
}

class Book
{
    String title;
    Language language;

    public Book(String title, Language language)
    {
        this.title = title;
        this.language = language;
    }
}