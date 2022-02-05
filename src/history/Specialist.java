package history;

import humanity.Human;

public abstract class Specialist extends Human {
    PeriodEnum periodEnum;

    public Specialist(String sexe, int age) {
        super(sexe, age);
    }
}
