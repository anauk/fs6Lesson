package algorithms.simples;

public class PalindromeSemiWoString {
    byte[] digits = new byte[10];
    byte count;

    public boolean is(long val) {
        count=0;
        while (val>0) {
            long v10=val/10;
            digits[count++]=(byte)(val-v10*10);
            val=v10;
        }
        return digits[0] == digits[count-1];
    }
}
