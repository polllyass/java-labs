public class Lab8 {
    public static void main(String[] args)
    {
        Pet[] pets = new Pet[5];

        pets[0] = new DogPet("Валет", 3, "Артемий", "Овчарка");
        pets[1] = new DogPet("Арчи", 5, "Мария", "Лабрадор");
        pets[2] = new DogPet("Оскар", 2, "Пётр", "Доберман");

        pets[3] = new CatPet("Муся", 2, "Ольга", "Белый");
        pets[4] = new CatPet("Маркиз", 4, "Анна", "Рыжий");

        for (Pet p : pets)
        {
            p.displayInfo();
            p.play();
        }

        DogPet d = (DogPet) pets[0];
        d.bark();

        CatPet c = (CatPet) pets[3];
        c.meow();
    }
}