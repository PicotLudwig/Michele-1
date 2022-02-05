package humanity;

public class Men extends Human {

    public Men (int age) {
        super ("male", age);
    }

    public void setTaille(int taille) {
        System.out.println("La fonction de Men");
        this.levelOfSmartness = Smartness.MEDIUM_SMART;
        this.taille = taille;
    }

//    @Override
//    public void setTailleCallingTheSetTailleOfTheParentClass (int taille) {
//       super.setTaille(taille + 20);
//    }


//    public void setTaille (int taille) {
//        taille += 20;
//    }

    public int getTaille () {
        return taille;
    }

    @Override
    public void meurt() {

    }
}
