public class DisplayAgeOverEighteen{

    public static void main(String[] gg){

        int[] arr = {11,23,3,45,72,68};

        List<Integer> ageOverEighteen = new ArrayList<>();

        for(int age : arr){
            if(age >= 18){
                ageOverEighteen.add(age);
            }
        }

        System.out.println(ageOverEighteen);
    }
}