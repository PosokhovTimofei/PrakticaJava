package src.Project16;

public class Exception5 {
    public void printMessage(String key) {
        String message = getDetails(key); System.out.println( message );
    }

    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key;
    }

    public void printMessageSafe(String key) {
        String message = getDetailsSafe(key);
        System.out.println( message );
    }

    public String getDetailsSafe(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }catch (NullPointerException e){
            key = "default";
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Exception5 ex = new Exception5();

        ex.printMessageSafe("Key");
        ex.printMessageSafe(null);

        ex.printMessage("Key");
        ex.printMessage(null);
    }
}
