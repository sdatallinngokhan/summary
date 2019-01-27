package week11.advanced;

public class EncapsulationExercise {

    // public => accessible generally
    // protected => accessible from same package
    // private => accessible from same class

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
