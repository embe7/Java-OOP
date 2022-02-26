package OOP34.EnumClass.Latihan1;

public enum HotelKelas {
    BISNIS("Kelas bisnis"),
    EKONOMI("Kelas Ekonomi");

    private String descriptions;

    HotelKelas(String description){
        this.descriptions = description;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }
}
