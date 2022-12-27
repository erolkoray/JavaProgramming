package day42_Exceptions;

import java.util.NoSuchElementException;

public class Throw_Keyword2 { // THROW KEYWORD IS ONLY USED WHEN CREATING EXCEPTIONS MANUALLY. WHEN WE WANT TO THROW A CUSTOM EXCEPTION - NOT THE COMPILER.

    public static void main(String[] args) {

        throw new NoSuchElementException("Element does not exist"); // exception message is not compulsory however it's beneficial to the reader to understand why.


    }
}
