package vikkram;

public class Regex {

    //a* ca* true for cat
    public boolean isMatch(String a, String p){
        if(!p.contains("*")  || !p.contains(".")){
            return (p.equals(a));
        }
        if(p.length() == a.length()){

        }

        char[] pCharArray = p.toCharArray();


        char firstCharInPattern = pCharArray[0];
        char secondCharInPattern = pCharArray[1];

        if(firstCharInPattern==46){

        }


        char[] chars = a.toCharArray();





        return false;
    }

    public static void main(String[] args) {
        Regex regex = new Regex();
        boolean match = regex.isMatch("aa", "a");
        System.out.println(match);
    }
}
