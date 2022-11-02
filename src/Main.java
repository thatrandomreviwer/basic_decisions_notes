import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
  //condition -- boolean
        // < less than
        // <= less than or equal to
        // > greater than
        // >= greater than or equal to
        // == equal to -- same as
        // =! not equal to

        double fuelLevel = .05;

        if (fuelLevel < .25){
            out.println("stop for gas");

            double wallmartGasPrice = 2.9, chevronGasPrice = 3.15;


            if(wallmartGasPrice < chevronGasPrice){
                out.println("stop at wall-mart");
            }
            else{
                out.println("stop at chevron");
            }

            String craving = "";

            if (craving.equals("mcnuggets")){
                out.println("stop at the mcD");
            }
            else if (craving.equals("real chicken")){
                out.println("stop at popyes");
            }
            else if(craving.equals("whopper")){
                out.println("stop at bugger king");
            }
            else{
                out.println("stop at the in and out");
            }
        }
    }
}