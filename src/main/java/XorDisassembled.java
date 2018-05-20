public class XorDisassembled {
    public static boolean xor(boolean a, boolean b) {
        return (a|b) & !(a&b);
    }

    public static void main(String[] args) {
        final boolean T = true;
        final boolean F = false;
        boolean[] src1 = {T, T, F, F};
        boolean[] src2 = {T, F, T, F};

        for (int i = 0; i < src1.length; i++) {
            boolean a=src1[i];
            boolean b=src2[i];
            boolean e=a^b;
            boolean x=xor(a,b);
            String s = x==e?"OK":"ERR";
            System.out.printf("Value 1:%5s, value 2:%5s, calculated:%5s, expected:%5s, %s\n",a,b,x,e,s);
        }
    }
}
