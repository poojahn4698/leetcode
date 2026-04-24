public class LeetCode12 {
    private static String IntToRoman(int num){
        String roman = "";
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanValues = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        for(int i=0;i<values.length;i++){
            while (num >= values[i]){
                roman = roman+romanValues[i];
                num = num-values[i];
            }
        }
        return roman;
    }

    public static void main(String[] args) {
        int num = 3749;
        System.out.println(IntToRoman(num));
    }
}
