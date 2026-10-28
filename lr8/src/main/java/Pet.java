class Pet {
    private String name;
    private int age;
    private String owner;

    public Pet(String name, int age, String owner)
    {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getOwner() { return owner; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setOwner(String owner) { this.owner = owner; }

    public void play() {
        System.out.println("питомец играет");
    }

    public void displayInfo()
    {
        System.out.println("кличка: " + name);
        System.out.println("возраст: " + age);
        System.out.println("хозяин: " + owner);
    }
}

class DogPet extends Pet
{
    private String breed;

    public DogPet(String name, int age, String owner, String breed) {
        super(name, age, owner);
        this.breed = breed;
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public void play() {
        System.out.println("играет с мячом");
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("порода: " + breed);
    }

    public void bark() {
        System.out.println("гав-гав!");
    }
}

class CatPet extends Pet
{
    private String color;

    public CatPet(String name, int age, String owner, String color) {
        super(name, age, owner);
        this.color = color;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public void play() {
        System.out.println("играет с клубком");
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("цвет: " + color);
    }

    public void meow() {
        System.out.println("мяу-мяу!");
    }
}