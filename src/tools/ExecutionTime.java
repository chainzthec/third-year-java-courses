package tools;

import java.time.Duration;
import java.time.Instant;

public class ExecutionTime {

    private static Instant start;

    public static void start(){
        start = Instant.now() ;
    }
    public static void end(){
        Duration duration = Duration.between(start, Instant.now());
        System.out.println("Process finished with execution time of: " + duration.toString().split("PT")[1].split("S")[0] + " seconds.");
    }
}
