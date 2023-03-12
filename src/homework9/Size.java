package homework9;

public enum Size {
    S("S", 16, 24),
    M("M", 18, 26),
    L("L", 20, 28),
    XL("XL", 22, 30),
    XXL("XXL", 24, 32);

    //fields
    private final String abbreviation;
    private final int width;
    private final int length;

    //constructor
    Size(String abbreviation, int width, int length) {
        this.abbreviation = abbreviation;
        this.width = width;
        this.length = length;
    }

    //getters
    public String getAbbreviation() {
        return abbreviation;
    }
    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }
}
