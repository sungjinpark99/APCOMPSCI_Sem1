import java.util.ArrayList;
import java.util.Arrays;
public class Satellite
{
   public static void main(String[]args)
   {
       ArrayList<Car> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));

        double[] home = {0, 0};

        String printout = "\n\n" +
               "==========================" + "\nStarting locations...";

        for (Car l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLoc(l.getLocation()) + ")";
       }

        printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

        for (Car l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLocation(), home)+ ")";
       }
		for(Car object : locate)
			{
				double x = (Math.random()*100)+1;
				double y = (Math.random()*100)+1;
				object.MOVE(x,y);
				printout += "\n==========================\nAfter " + object.getID() + " Moved(" + x + ", " + y + ")\nNew Location: (" + Arrays.toString(object.getLocation()) + ")";
			}
        System.out.println(printout);

   }
    public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }

    public static String getLocation(double[] location)
   {
       return location[0] + ", " + location[1];
   }
}