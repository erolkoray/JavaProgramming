package day37_Inheritence.phoneTask;

public class Iphone extends Phone{



    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);

    }

    public void faceTime(long phoneNumber){
        System.out.println(brand + " "+model+" is facetiming with phone number: "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand + " "+model+" is facetiming with email: "+email);
    }




}

