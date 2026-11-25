package lesson15;

public enum Language {

    HY("Հայաստան"),
    RU("Ռուսաստանի Դաշնություն"),
    EN,
    FR("Ֆրանսիա");

    private String country;

    Language(String country) {
        this.country = country;
    }

    Language() {
        country = "Երկիրը նշած չէ";
    }

    public String getCountry() {
        return country;
    }
}
