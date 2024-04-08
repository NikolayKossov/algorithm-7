import java.util.*;

class SBank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            if (i > 0) {
                System.out.println();
            }
            int n = scanner.nextInt();
            scanner.nextLine();

            Map<String, Integer> accounts = new HashMap<>();
            for (int j = 0; j < n; j++) {
                String account = scanner.nextLine();
                accounts.put(account, accounts.getOrDefault(account, 0) + 1);
            }

            List<String> sortedAccounts = new ArrayList<>(accounts.keySet());
            Collections.sort(sortedAccounts);

            for (String account : sortedAccounts) {
                System.out.println(account + " " + accounts.get(account));
            }
        }
        scanner.close();
    }
}
