package ejemplos;
/**
 * @author brian
 */
public class Converciones {
    public static void main(String[] args) {
        double AnguloEnGrados = 45;
        
        double AnguloEnRadianes = Math.toRadians(AnguloEnGrados);
        System.out.println("Deg a Rad" + AnguloEnGrados + "° = " + AnguloEnRadianes + "rad");
        
         AnguloEnGrados = Math.toDegrees(AnguloEnRadianes);
        System.out.println("Rad a Deg" + AnguloEnRadianes + "° = " + AnguloEnGrados + "°");
    }
}
