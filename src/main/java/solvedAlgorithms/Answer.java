package solvedAlgorithms;

import java.util.*;

public class Answer {

    public static void main(String[] args) {
        int [] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        createPhoneNumber(nums);
 spinWords("emocleW");
       String[] mm = new String[]{"A", "B", "C"};
           whoLikesIt(mm);
    }
//
//            []                                -->  "no one likes this"
//            ["Peter"]                         -->  "Peter likes this"
//            ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
//            ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
//            ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"

    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return String.format("%s likes this", names[0]);
            case 2: return String.format("%s and %s like this", names[0], names[1]);
            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }
    public static String whoLikesIt1(String... names) {
        StringBuilder stringBuilder = new StringBuilder();
        if(names.length == 0) return "no one likes this";
        if(names.length == 1) return ""+names[0]+" likes this";
        if (names.length == 2) {
            for (int i = 0; i < names.length; i++) {
                if (i == names.length - 1) stringBuilder.append(names[i]).append(" like this");
                else stringBuilder.append(names[i]).append(" and ");
            }
            return stringBuilder.toString();
        }
        if(names.length == 3){
            for (int i = 0; i < names.length; i++) {
                if (i == 0) stringBuilder.append(names[i]).append(", ");
                if (i == 1) stringBuilder.append(names[i]).append(" and ");
                if(i==2 ) stringBuilder.append(names[i]).append(" like this");
            }
            return stringBuilder.toString();
        }
        if(names.length > 3){
        for (int i = 0; i < names.length; i++) {
            if (i == 0) stringBuilder.append(names[i]).append(", ");
            if (i == 1) stringBuilder.append(names[i]).append(" and "+(names.length-2)+" like this");
        }
        return stringBuilder.toString();
        }
        return null;
    }

    public static String spinWords(String sentence) {
     String[] strings = sentence.split("\s+");
     ArrayList<String> res = new ArrayList<>();
     StringBuilder stringBuilder = new StringBuilder();
     for (int i = 0; i< strings.length; i++){
         if(strings[i].length() >= 5){
             stringBuilder = new StringBuilder(strings[i]);
             stringBuilder.reverse();
             res.add(String.valueOf(stringBuilder));
         } else
         res.add(strings[i]);
     }
        System.out.println(res);
        return sentence;
    }

    public static String createPhoneNumber(int[] numbers) {

          String result = "("+numbers[0]+""+numbers[1]+""+numbers[2]+")"+" "+numbers[3]+""+numbers[4]+""+numbers[5]+"-"+numbers[6]+""+numbers[7]+""+numbers[8]+""+numbers[9];
        System.out.println(result);
        return result;
    }


    static List<String> replan(List<String> plan, String beforeCity, String newCity){
        int beforeCityIndex = plan.indexOf(beforeCity);
        List<String> planB = new ArrayList<>(plan);
        planB.add(beforeCityIndex, newCity);
        return planB;
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

    public static void arrayDiff(int[] a, int[] b) {
        Map<Integer, Integer> visitedElements = new HashMap<>();
        for(int i = 0; i< a.length; i++){
            visitedElements.put(i, a[i]);
        }

        System.out.println(visitedElements);
    }

    public static List<Character> difference(Collection<Character> a, Collection<Character> b) {
        Set<Character> setA = new HashSet<>(a);

        Set<Character> setB = new HashSet<>(b);
        System.out.println(setA);
        System.out.println(setB);

        if(setA.equals(setB)){
            return List.of();
        }
        if(setA.isEmpty() && setB.isEmpty()){
            return List.of();
        }
        if(setA.isEmpty() && setB != null){
            return setB.stream().sorted().toList();
        }
        if(setB.isEmpty() && setA != null){
            return setA.stream().sorted().toList();
        }

        Iterator<Character> iterator = setA.iterator();
        while (iterator.hasNext()){
            Character i = iterator.next();
            if(setB.contains(i)){
                iterator.remove();
                setB.remove(i);
            }
        }
        for (Character character : setB) {
            setA.add(character);
        }
        for (Character character: setA.stream().sorted().toList()){
            System.out.println(character);
        }
       return setA.stream().sorted().toList();
    }



}
