import java.util.*;

public class Hey {
    public static void main(String[] args) {
powersOfTwo(4);

        System.out.println(grow(new int[]{1,2,4,0}));

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
    }

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
//
//        List<Character> roman = new ArrayList<>();
//
//
//
//
//
//
//        List<Integer> list = new ArrayList<>();
//
//        for (Integer key : romanNumerals.keySet()) {
//            list.add(key);
//        }
//        Collections.sort(list);
//        Collections.reverse(list);
//        StringBuilder str = new StringBuilder();
//        for (int i : list){
//            while( n >= i){
//                n = n -i;
//                str.append(romanNumerals.get(i));
//            }
//        }
//        System.out.println(str.toString());
   }

}
