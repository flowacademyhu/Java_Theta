package hu.flowacademy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car trabant = new Car("white", 8, "Trabant", "ABC-111");    //Példányosítás
        System.out.println(trabant.licensePlate);
        System.out.println(trabant.getDoors());
        trabant.horn();
        trabant.paint("green");
        Car lada = new Car("blue", 5, "Lada 1200", "CCC-111");
        lada.paint("yellow");
        lada.setLicensePlate("CICA");

        String s = "cica";
        s.charAt(0);

        int[] arr = new int[10];

        System.out.println(trabant.toString()); //Objektum szöveges formában
        System.out.println(lada);   //Implicit meghívja a toString függvény
    }

}
