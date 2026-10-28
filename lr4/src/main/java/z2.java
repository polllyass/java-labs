public class z2
{
    public static void main(String[] args)
    {
        Mountain[] mountains = {
                new Mountain("Эверест", 8848, "Непал"),
                new Mountain("Эльбрус", 5642, "Россия"),
                new Mountain("Килиманджаро", 5895, "Танзания"),
                new Mountain("Монблан", 4808, "Франция"),
                new Mountain("Аконкагуа", 6961, "Аргентина"),
                new Mountain("Денали", 6190, "США")
        };
        Mountain highest = mountains[0];
        for (Mountain m : mountains)
        {
            if (m.height > highest.height)
            {
                highest = m;
            }
        }
        System.out.println("Самая высокая гора: " + highest.name + " (" + highest.height + " м)");
        double sum = 0;
        for (Mountain m : mountains)
        {
            sum += m.height;
        }
        double avg = sum / mountains.length;
        System.out.println("Средняя высота: " + avg + " м");
    }
}

class Mountain
{
    String name;
    double height;
    String country;

    public Mountain(String name, double height, String country)
    {
        this.name = name;
        this.height = height;
        this.country = country;
    }
}