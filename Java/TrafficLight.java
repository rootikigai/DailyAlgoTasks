import java.util.Locale;

public class TrafficLight {
    public static void lights(String command){
        switch (command) {
            case "Red" -> System.out.println("Stop!");
            case "Yellow" -> System.out.println("Get Ready!");
            case "Green" -> System.out.println("Go!");
            default -> System.out.println("Invalid Command!");
        }
    }
    public static void main(String[] args) {
        TrafficLight.lights("Yellow");
    }
}
