public class SnippetA {
    public static void main(String[] args) {
        int MAX_RETAKES = 3;
        /*final int MAX_RETAKES = 3; the final variable MAX_RETAKES can not be reassigned after 
        initialisation*/
        System.out.println("Retakes allowed: "+ MAX_RETAKES);
        MAX_RETAKES = 4;
        System.out.println("Retakes allowed: "+ MAX_RETAKES);
    }
}
