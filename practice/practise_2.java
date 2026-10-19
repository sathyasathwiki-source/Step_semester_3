public class Main {
    static String findDuplicatePick(String[] names) {
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    return "Duplicate Found: " + names[i];
                }
            }
        }
        return "No Duplicates Found";
    }

    public static void main(String[] args) {
        String[] names = {"Kohli", "Bumrah", "Kohli", "Rohit"};

        System.out.println(findDuplicatePick(names));
    }
}