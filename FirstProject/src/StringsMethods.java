public class StringsMethods {
    public static void main (String[] args){
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int len = abc.length();
        System.out.println("The length of the String is: " + len);
        System.out.println(abc.toLowerCase());
        System.out.println(abc.indexOf('Z'));
}

}
