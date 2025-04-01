public class Count_Digits_that_Divide_Number_Evenly {
    public static int countnumbers(int n){
        int orginal=n;
        int count=0;
        String str=Integer.toString(n);
        for(int i=0;i<str.length();i++){
            int digit=Character.getNumericValue(str.charAt(i));

            if(digit==0){
                continue;
            }
            else if(orginal%digit==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countnumbers(12));
        System.out.println(countnumbers(2446));
        System.out.println(countnumbers(23));
        System.out.println();

    }
}
