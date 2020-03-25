package hu.flowacademy;

public class Cat {

    private String name;
    private int age;
    private String color;
    private boolean isMale;
    private boolean isNeutered;

    public Cat() {  //Default konstruktor (Gyárilag van a java osztályban, amíg nem definiálunk paraméteres konstruktort
        this.name = "";
        this.age = 0;
        this.color = "";
        this.isMale = false;
        this.isNeutered = false;
    }

   public Cat(String name, int age, String color, boolean isMale, boolean isNeutered) {    //Paraméteres konstruktor
        this.name = name;
        this.color = color;
        this.isMale = isMale;
        this.isNeutered = isNeutered;
        if(age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public boolean isNeutered() {
        return isNeutered;
    }

    public void setNeutered(boolean neutered) {
        isNeutered = neutered;
    }

    public void meow() {
        System.out.println("MIÁÚ 1x");
    }

    public void meow(int num) {         //Paraméter (metódus) overloading
        for (int i = 0; i < num; i++) {
            System.out.println("MIÁÚ");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isMale=" + isMale +
                ", isNeutered=" + isNeutered +
                '}';
    }
}
