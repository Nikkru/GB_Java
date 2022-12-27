package seminar_6.pet;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cat {
    LocalDate birthday;
    Breed порода;
    Sex sex;
    PetOwner owner;

    public Cat() {
    }

    int getAge() {
        LocalDate now = LocalDate.now();
        return (int)ChronoUnit.YEARS.between(now, this.birthday);
    }
}
