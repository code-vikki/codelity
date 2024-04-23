package hackerrank;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically, ascending. Determine if the columns are also in ascending alphabetical order, top to bottom. Return YES if they are or NO if they are not.
//
//Example
//
//The grid is illustrated below.
public class GridChallenge {
    public static void main(String[] args) {
        String s = gridChallenge(Arrays.asList("ebacd", "fghij", "olmkn", "trpqs", "xywuv"));
        System.out.println(s);
    }
    public static String gridChallenge(List<String> grid) {
        // Write your code here
        //grid.length = length of each string element

        int sizeOfGrid = grid.size();
        int noOfElement = sizeOfGrid;
        int lengthOfString = sizeOfGrid;

        List<String> newGrid = new ArrayList<>();
        for(int i=0;i<sizeOfGrid;i++){
            String element = grid.get(i);
            char[] chars = element.toCharArray();
            Arrays.sort(chars);
            StringBuilder stringBuilder = new StringBuilder();
            for(char character:chars){
                stringBuilder.append(character);
            }
            newGrid.add(i,stringBuilder.toString());
        }
        List<String> columnGrid = new ArrayList<>();
        for(int j=0;j< newGrid.size();j++){
            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0;i<newGrid.size();i++){
                String elementAtIndex = newGrid.get(i);
                stringBuilder.append(elementAtIndex.charAt(j));
            }
            columnGrid.add(j,stringBuilder.toString());
        }

        for(int i=0;i<columnGrid.size();i++){
            String elementAtIndex = columnGrid.get(i);
            for( int j=0; j<elementAtIndex.length()-1;j++){
                if(elementAtIndex.charAt(j)>elementAtIndex.charAt(j+1)){
                    return "NO";
                }
            }
        }

        return "YES";
    }
}
