import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] userList = new String[0];
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            int userChoice = getUserChoice(scanner);
            switch (userChoice) {
                case -1:
                    System.out.println("Wrong input! Enter 1 or 2!");
                    continue;
                case 1:
                    String fullName = scanner.nextLine();
                    userList = addToUserList(fullName, userList);
                    continue;
                case 2:
                    String searchText = scanner.nextLine();
                    searchForText(searchText, userList);
            }
        }
    }

    public static void showMenu() {
        System.out.println("Enter 1 to add Fullname of user:");
        System.out.println("Enter 2 to search from user list:");
    }

    public static String[] addToUserList(String fullName, String[] userList) {
        String[] newUserList = new String[userList.length + 1];
        for (int i = 0; i < userList.length; i++) {
            newUserList[i] = userList[i];
        }
        newUserList[userList.length] = fullName;
        return newUserList;
    }

    public static int getUserChoice(Scanner scanner) {
        int userChoice = scanner.nextInt();
        scanner.nextLine();
        if (userChoice != 1 && userChoice != 2) {
            return -1;
        }

        return userChoice;
    }

    public static void searchForText(String text, String[] userList) {
        for (String s : userList) {
            if (s.toLowerCase().contains(text.toLowerCase())) {
                System.out.println(s);
            }
        }
    }
}