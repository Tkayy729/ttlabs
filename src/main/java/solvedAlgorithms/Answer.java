package solvedAlgorithms;

import java.util.*;

public class Answer {

    public static void main(String[] args) {
     convertToCamel("hello_me_hi");
    }




    public static int grow(int[] x){
        return Arrays.stream(x).reduce((left, right) -> left*right ).getAsInt();

    }

    public static long[] powersOfTwo(int n){
        long [] res = new long [n + 1];

        for(int i = 0; i < res.length; i++){
            res[i] = (long) Math.pow(2,i);
        }

        return res;
    }
    public static int[] invert(int[] array) {

        for (int i = 0; i < array.length; i++)
        {
            if(array[i] < 0)   array[i] = Math.abs(array[i]);
            else array[i] = - array[i];
        }
        return array;
    }
    private static Optional<String> getKeysJava8Optional(
            Map<Integer, Character> map, Character value) {

        String collect = map
                .entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), value))
                .map(Map.Entry::getKey)
                .toString();

        return Optional.of(collect);
    };

    public static String convertToCamel(String str){

        StringBuilder strin = new StringBuilder(str);

        char[] characters = str.toCharArray();

        for(int i = 0; i< characters.length; i++){
            if((strin.charAt(i)== '_' || strin.charAt(i) == '-') && strin.charAt(i) != strin.charAt(characters.length -1)) {
                characters[i+1] = Character.toUpperCase(characters[i+1]);
            }
        }

        StringBuilder finalString = new StringBuilder();


        for(int i = 0; i < characters.length; i++){
            if(characters[i] != '-' || characters[i] != '_'){
                finalString.append(characters[i]);
            }
        }
        return finalString.toString();
    };

    public static void solution(int n) {

        HashMap<Integer, Character> romanNumerals = new HashMap<>();

        romanNumerals.put(1, 'I');
        romanNumerals.put(5, 'V');
        romanNumerals.put(10, 'X');
        romanNumerals.put(50, 'L');
        romanNumerals.put(100, 'C');
        romanNumerals.put(500, 'D');
        romanNumerals.put(1000, 'M');

        System.out.println(getKeysJava8Optional(romanNumerals, 'X'));

    }

}
