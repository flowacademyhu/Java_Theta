package hu.flowacademy;

public class Car { //Osztály definíció
    // public - legtágabb láthatóság: Adott fájlban, adott csomagban, leszármazottban, globálisan
    // protected - Fájlban, adott csomagban, leszármazottban, de globálisan NEM
    // default (nem adjuk meg) - Adott fájlban, adott csomagban, de leszármazottban, és globálisan NEM
    // private - legszűkebb láthatóság: Adott fájlban, rajta kívül sehol

    private String color;    //Adattagok: Egy Car objektumnak ilyen tulajdonságai vannak
    private int doors;
    private String type;
    protected String licensePlate;

    public Car(String color, int doors, String type, String licensePlate) {  //Konstruktor
        this.color = color;
        if(doors > 5) {
            this.doors = 5;
        } else {
            this.doors = doors;
        }
        this.type = type;
        this.licensePlate = licensePlate;
    }

    public void setLicensePlate(String licensePlate) {  //SETTER függvény
        if(licensePlate.length() == 7) {
            this.licensePlate = licensePlate;
        } else {
            System.out.println("BAD FORMAT " + licensePlate);
        }
    }

    public String getLicensePlate() {   //GETTER függvények
        return licensePlate;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public void horn() {    //Objektum függvény
        System.out.println("TUTUUUUUU " + this.type);
    }

    public void paint(String color) {
        System.out.println("Repaint from " + this.color + " to " + color);
        this.color = color;
    }

    public String toString() {      //
        return "Color: " + this.color + " Type: " + this.type +
                " Doors: " + this.doors + " LicensePlate: " + this.licensePlate;
    }


}
