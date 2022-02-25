package OOP34.EnumClass;

public enum Level {
    STANDARD("level Standart"),
    PREMIUM("level Premium"),
    VIP("level VIP");

    private String descriptions;

    Level(String description){
        this.descriptions = description;
    }

    public String getDescriptions() {
        return descriptions;
    }
}
