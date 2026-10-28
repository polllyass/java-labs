abstract class Pet {
    private String name;
    private int age;
    private String owner;

    public Pet(String name, int age, String owner) {
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

    public abstract void feed();
    public abstract String getSpecialNeeds();

    public void displayInfo() {
        System.out.println("кличка: " + name);
        System.out.println("возраст: " + age);
        System.out.println("хозяин: " + owner);
    }
}

class DogPet extends Pet {
    private String breed;

    public DogPet(String name, int age, String owner, String breed) {
        super(name, age, owner);
        this.breed = breed;
    }

    public String getBreed() { return breed; }

    @Override
    public void feed() {
        System.out.println("питается 2 раза в день");
    }

    @Override
    public String getSpecialNeeds() {
        return "нуждается в прогулках";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("порода: " + breed);
    }
}

class CatPet extends Pet {
    private String color;

    public CatPet(String name, int age, String owner, String color) {
        super(name, age, owner);
        this.color = color;
    }

    public String getColor() { return color; }

    @Override
    public void feed() {
        System.out.println("питается 3 раза в день");
    }

    @Override
    public String getSpecialNeeds() {
        return "нуждается в лотке";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("цвет: " + color);
    }
}