package tools;

import java.time.Duration;
import java.time.Instant;

public class ExecutionTime {

    private static Instant start;
    private static Duration duration;

    public static void start(){
        start = Instant.now() ;
    }
    public static void end(){
        duration = Duration.between(start, Instant.now()) ;
        System.out.println("Process finished with execution time of: " + duration.toString().split("PT")[1].split("S")[0] + " seconds.");
    }
}
