package week11.advanced.oop.inheritance;

public class InheritanceAbstractImpl extends InheritanceAbstract {

    public String getSurname() {
        return "Polat";
    }

    public static void main(String[] args) {
        InheritanceAbstractImpl inheritanceAbstractImpl = new InheritanceAbstractImpl();

        System.out.println(inheritanceAbstractImpl.getName());
        System.out.println(inheritanceAbstractImpl.getSurname());
    }
}
