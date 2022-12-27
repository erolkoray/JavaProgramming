package day42_Exceptions;

// THERE CAN ONLY BE ONE THROW EXCEPTION IN ONE CLASS

class FadyException extends RuntimeException{

    public FadyException(String message){
        super(message);
    }
    public FadyException(){
        super("its time for short break");
    }

}

class NoBreakException extends Exception{

}

public class CustomExceptions {
    public static void main(String[] args) throws NoBreakException {

    //   throw new FadyException("its time for break"); // this is running the first method above. because there is a string argument provided in the Throw exception

        throw new NoBreakException();

    }

}
