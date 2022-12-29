package seminar_6.pet;

public enum FullEnergy {
    one ("1"),
    two("2"),
    three("3"),
    fore("4"),
    five("5"),
    six("6"),
    seven("7"),
    eight("8"),
    nine("9"),
    ten("10");
    private String title;
    FullEnergy(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
