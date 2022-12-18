package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {


        String[] words = {"Layan", "Layan","Oleksandr","Olga","Adam","Adam","Cihad","Koray","Cihad","Cydeo"};



        for (String element : words) { // element: "Layan", "Layan","Oleksandr","Olga","Adam","Adam","Cihad","Koray","Cihad","Cydeo"
            int count = 0;

            for (String each : words) { // each: "Layan", "Layan","Oleksandr","Olga","Adam","Adam","Cihad","Koray","Cihad","Cydeo"
                if(each.equals(element)){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(element);
            }
        }






    }
}
