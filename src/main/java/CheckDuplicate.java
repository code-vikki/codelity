import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckDuplicate {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String stringToCheck = scanner.nextLine();
        String[] split = stringToCheck.split("");
        Arrays.sort(split);

        Map<String, Integer> hashMap = new HashMap<>();

        for(int i =0; i< split.length;i++){
            int count=1;
            if(hashMap.get(split[i])==null){
                hashMap.put(split[i],1);
            } else{
                hashMap.put(split[i],hashMap.get(split[i])+1);
            }

        }

        for(Map.Entry<String,Integer> entry: hashMap.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("The letter " + entry.getKey()+ " is repeated "+ entry.getValue()+ " times");
            }
            System.out.println(entry);
        }
        System.out.println(hashMap);

    }

}
