import java.util.Arrays;

class Candidate implements Comparable<Candidate> {
    String name;
    double cgpa;
    int codingScore;

    Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    double getScore() {
        return cgpa * 10 + codingScore * 0.5;
    }

    public int compareTo(Candidate other) {
        return Double.compare(other.getScore(), getScore());
    }

    static String shortlistAndRank(Candidate[] candidates) {
        Candidate[] selected = new Candidate[candidates.length];
        int count = 0;

        for (Candidate c : candidates) {
            if (isEligible(c.cgpa) ||
                isEligible(c.cgpa, c.codingScore)) {
                selected[count++] = c;
            }
        }

        selected = Arrays.copyOf(selected, count);
        Arrays.sort(selected);

        String result = "";

        for (int i = 0; i < selected.length; i++) {
            if (i > 0)
                result += " | ";

            result += (i + 1) + ". " + selected[i].name
                    + " (" + selected[i].getScore() + ")";
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };

        System.out.println(
            Candidate.shortlistAndRank(candidates)
        );
    }
}