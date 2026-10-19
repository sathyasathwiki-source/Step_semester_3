public class Main {
    static double rowAverage(int[] row) {
        int sum = 0;

        for (int i = 0; i < row.length; i++) {
            sum += row[i];
        }

        return (double) sum / row.length;
    }

    static String classifyRows(int[][] scores, int threshold) {
        String result = "";

        for (int i = 0; i < scores.length; i++) {
            if (i > 0)
                result += " | ";

            if (rowAverage(scores[i]) < threshold)
                result += "Row " + i + ": Quiet Zone";
            else
                result += "Row " + i + ": Buzzing Zone";
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] scores = {
            {40, 50, 45},
            {85, 90, 95},
            {30, 20, 25}
        };

        System.out.println(classifyRows(scores, 60));
    }
}