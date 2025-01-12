public class Main {
    public static void main(String[] args) {
        ExceptionGenerator generator = new ExceptionGenerator();
        try {
            generator.generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Warning! NullPointerException: " + e.getMessage());
            System.out.println("toString(): " + e.toString());
            e.printStackTrace();
        }
    }
}

class ExceptionGenerator {
    public void generateNullPointerException() {
        String nullObject = null;
        nullObject.length();
    }
}