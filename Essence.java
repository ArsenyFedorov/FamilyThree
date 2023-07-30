import java.time.LocalDate;

public interface Essence {
    String parentsEssence();

    String spouseEssence();

    void childrenEssence();

    @Override
    String toString();

    String essenceName();

    LocalDate ageEssence();
}