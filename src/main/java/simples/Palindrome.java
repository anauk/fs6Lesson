package simples;

public class Palindrome {


    static public boolean isPalindrome(long value) {
        boolean pal=true;
        String valueS = Long.toString(value);
        for (int i = 0; i < valueS.length() / 2; i++) {
            if(valueS.charAt(i) != valueS.charAt(valueS.length() - 1 - i)){
                pal = false;
                break;
            }
        }
        return pal;
    }

    public static void main1(String[] args) {
        long[] values1 = new long[]{1,2,3,11,123321,1234321,89};
        long[] values2 = new long[]{123,1234567890};

        for (int i = 0; i < values1.length; i++) {
            boolean p = isPalindrome(values1[i]);
            if(p) {
                System.out.printf("isPalindrome(%d)=%s\n",values1[i],p);
            } else {
                System.out.println("error");
            }
        }

        for (int i = 0; i < values2.length; i++) {
            boolean p = isPalindrome(values2[i]);
            System.out.printf("isPalindrome(%d)=%s\n",values2[i],p);
        }
    }
}
