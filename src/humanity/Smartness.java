package humanity;

public enum Smartness {

    VERY_SMART(10),
    MEDIUM_SMART(5),
    NOT_VERY_SMART(0);

    private int niveau;

    Smartness(int niveau) {
        this.niveau = niveau;
    }
}
