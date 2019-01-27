package week11.advanced;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsExercise {

    // this exception is runtime(unchecked) exception
    public void getArrayIndexOutOfBoundsException() {
        int[] numbersArray = {1, 2, 3};
        int number = numbersArray[3]; // ArrayIndexOutOfBoundsException because there is no 3rd index
    }

    // this exception is compile(checked) time exception
    public void getFileNotFoundException() throws FileNotFoundException {
        File file = new File("invalid path");
        FileReader fileReader = new FileReader(file);
    }

    // this exception is compile(checked) time exception
    public void catchFileNotFoundExceptionWithTryCatch() {
        try {
            File file = new File("invalid path");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        ExceptionsExercise exceptionsExercise = new ExceptionsExercise();

//        exceptionsExercise.getArrayIndexOutOfBoundsException();

        exceptionsExercise.getFileNotFoundException();
    }

}
