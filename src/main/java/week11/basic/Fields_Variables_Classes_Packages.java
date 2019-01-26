package week11.basic; // package name is here. a class can have only 1 package definition. package definition has to be top most

public class Fields_Variables_Classes_Packages { // class name is here. a file can contain multiple classes. One of them has to be matched with file name

    int anotherNumber = 6; // anotherNumber is variable(field of class)

    public void method1() { // method name is method1. this method is returnless method, it does not have return type
        int number = 5; // number is a variable(field of method)
    }

    public Integer method2() { // method name is method2. this method's return type is Integer, It will return an Integer value to called place

        return 5; // when this method is finished, 5 will be returned. Retuning a value is mandatory for non-void methods
    }

    public String method3(String name, String surname) { // this method requires 2 parameters. When you want to call this method from inside of other methods, you have to give 2 parameters.
        return name + " " + surname;
    }

    // here is used overloading. same method name as above but different parameter count
    public String method3(String nameAndSurname) { // this method requires 1 parameter.
        return nameAndSurname;
    }

    // here is used overloading. same method name as above but different parameter variable type
    public String method3(Integer nameAndSurname) { // this method requires 1 parameter.
        return nameAndSurname.toString();
    }

    public static void main(String[] args) {
        System.out.println();
    }

}

