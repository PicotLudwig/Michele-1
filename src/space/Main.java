package space;

public class Main {
    public static void main(String[] args) {
        Planets planetOne = new Planets("Jupiter");
        Planets planetTwo = new Planets("Venus");
        Planets planetThree = new Planets("Mars");
        Stars starOne = new Stars("Bright Star");

        SolarSystem solarSystem1 = new SolarSystem("Systeme solaire 1");
        solarSystem1.listeAstre.add(planetOne);
        solarSystem1.listeAstre.add(planetTwo);
        solarSystem1.listeAstre.add(planetThree);
        solarSystem1.listeAstre.add(starOne);

        //Habitants habitants = new Habitants();
        for (int i = 1; i < 6; i++) {
            String test = i == 4 ? "on est a 4": "on n est pas a 4";
            System.out.println(test);
            for (Astre astre : solarSystem1.listeAstre) {
                if (astre instanceof Planets) {
                    ((Planets) astre).habList.add(new Habitants("habitants" + " " + i));
                }
            }
        }

        for (Astre astre : solarSystem1.listeAstre) {

                for (Habitants habs : ((Planets) astre).habList) {
                    System.out.println(astre.name + " " + habs.name);
                }

        }


    }
}