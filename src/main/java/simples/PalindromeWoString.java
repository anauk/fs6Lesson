package simples;

public class PalindromeWoString {
    byte[] digits = new byte[10];
    byte count;

    public boolean is(long val) {
        count=0;
        while (val>0) {
            long v10=val/10;
            digits[count++]=(byte)(val-v10*10);
            val=v10;
        }
        for (byte i=0; i<count>>1; i++) {
            if(digits[i] != digits[count-1-i]) {
                return false;
            }
        }
        return true;
    }
}
