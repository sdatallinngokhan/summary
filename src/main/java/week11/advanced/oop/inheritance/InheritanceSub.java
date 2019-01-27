package week11.advanced.oop.inheritance;

public class InheritanceSub extends InheritanceSuper {

    public String getName() {
        super.getSurname();
        this.getSurname();

        super.printHello();
        this.printHello();

        return name;
    }

    @Override
    public String getSurname(){
        return "not Polat";
    }

    public String getSurnameFromSuperClass(){
        return super.getSurname();
    }

    public static void main(String[] args) {
        InheritanceSub inheritanceSub = new InheritanceSub();

        String result = inheritanceSub.getName();

        System.out.println(result);

        System.out.println(inheritanceSub.getSurname());
        System.out.println(inheritanceSub.getSurnameFromSuperClass());
    }
}
