import java.util.ArrayList;
import java.util.Arrays;
public class Satellite
{
   public static void main(String[]args)
   {
       ArrayList<Location> Locate = new ArrayList<>();
       double[] HonLoc = {5, 6};
       locate.add(new Honda(HonLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));

        double[] Home = {0, 0};

        String printout = "\n\n" +
               "==========================" + "\nStarting locations...";

        for (Location l : Locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }

        printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

        for (Location l : Locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), Home)+ ")";
       }
	   
        System.out.println(printout);

   }
    public static double getDistance(double[] car, double[] Home)
   {
       return Math.sqrt((Math.pow(car[0] - Home[0], 2)+ Math.pow(car[1] - Home[1], 2)));
   }

    public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}