package envelope;

public class Envelope2 {
    static int DIMENSION = 11;

    private static boolean shouldPaint(int row, int col) {
        return row==1 || col==1 || row==DIMENSION || col==DIMENSION || col==row || row+col==1+DIMENSION;
    }

    private static boolean[][] buildEnvelope(int dim) {
        boolean[][] env = new boolean[dim][dim];
        for (int row=1; row <= dim ; row++) {
            for (int col=1; col <= dim; col++) {
                env[row-1][col-1] = shouldPaint(row, col);
            }
        }
        return env;
    }

    private static String convertEnvelope(boolean[][] env) {
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                sb.append(env[i][j] ? "**" : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main1(String[] args) {
        boolean[][] env = buildEnvelope(DIMENSION);
        String envelope = convertEnvelope(env);
        System.out.println(envelope);
    }

    public static void main(String[] args) {
        System.out.println(convertEnvelope(buildEnvelope(DIMENSION)));
    }

}
