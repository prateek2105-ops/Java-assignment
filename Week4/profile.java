class Profile {

    private String name;
    private int age;
    private double heightMetres;

    Profile(String name, int age, double heightMetres) {

        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
        else {
            this.name = "Unknown";
        }

        if (age >= 0) {
            this.age = age;
        }
        else {
            this.age = 0;
        }

        if (heightMetres > 0) {
            this.heightMetres = heightMetres;
        }
        else {
            this.heightMetres = 1;
        }
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getHeightMetres() {
        return heightMetres;
    }
    public String toString() {
        return "Profile{name=" + name
                + ", age=" + age
                + ", heightMetres=" + heightMetres + "}";
    }
}
