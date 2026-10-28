public class Lab9 {
    public static void main(String[] args) {
        Pet[] pets = new Pet[5];

        pets[0] = new DogPet("Валет", 3, "Артемий", "Овчарка");
        pets[1] = new DogPet("Арчи", 5, "Мария", "Лабрадор");

        pets[2] = new CatPet("Муся", 2, "Ольга", "Белый");
        pets[3] = new CatPet("Маркиз", 4, "Пётр", "Рыжий");
        pets[4] = new CatPet("Пушок", 1, "Анна", "Серый");

        for (Pet p : pets) {
            p.displayInfo();
            p.feed();
            System.out.println("особые потребности: " + p.getSpecialNeeds());
        }
    }
}