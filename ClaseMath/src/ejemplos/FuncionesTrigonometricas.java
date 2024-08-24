package ejemplos;
/**
 * @author brian
 */
public class FuncionesTrigonometricas {
    public static void main(String[] args) {
        double resultado = 0;
        double AnguloEnGrados = 45;
        double AnguloEnRadianes = Math.toRadians(AnguloEnGrados);
        
        resultado = Math.sin(AnguloEnRadianes);
        System.out.println("Seno de " + AnguloEnGrados + "° = " + resultado);
        
        resultado = Math.cos(AnguloEnRadianes);
        System.out.println("Coseno de " + AnguloEnGrados + "° = " + resultado);
        
        resultado = Math.tan(AnguloEnRadianes);
        System.out.println("Tangente de " + AnguloEnGrados + "° = " + resultado);
        
        resultado = Math.acos(AnguloEnRadianes);
        System.out.println("Arco Coseno de " + AnguloEnGrados + "° = " + resultado);
        
        resultado = Math.atan(AnguloEnRadianes);
        System.out.println("Arco Tangente de " + AnguloEnGrados + "° = " + resultado);
        
        resultado = Math.asin(AnguloEnRadianes);
        System.out.println("Arco Seno de " + AnguloEnGrados + "° = " + resultado);
    }
}
