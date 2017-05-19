package EnumDemo;

/**
 * Created by muthuselvan on 5/16/17.
 */
public class ErrorMessage {

    public static void main(String[] args) {

        for (ErrorCodes errorCodes : ErrorCodes.values()) {
            System.out.println(errorCodes +" - " +errorCodes.getErrorcode());
        }


        System.out.println(ErrorCodes.valueOf("INFORMATIONAL"));

    }
}
