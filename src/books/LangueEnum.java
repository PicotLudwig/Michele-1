package books;

public enum LangueEnum {
    ENGLISH(1),
    FRENCH(2),
    SPANISH(3);

    int reference;

    LangueEnum(int reference) {
        this.reference = reference;
    }
}
