package tmall.util;

/**
 * Created by li on 5/30/17.
 */
public class PrintUtil {
    public static void print(Object...objects){
        System.out.println("---------------------------");
        for(Object obj:objects){
            System.out.println(obj.toString());
        }
        System.out.println("---------------------------");
    }
}
