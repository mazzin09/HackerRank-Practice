public class SubstringComp2 {
    public static void main(String[] args) {
        String s1 = "Welcome,to,world";
        String[] s1Arr = s1.split("[^a-zA-Z]+",3);
        for ( String w: s1Arr){
            System.out.println(w);
        }
    }
}
