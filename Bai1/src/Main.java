import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = input.nextLine();

        LinkedList<Character> max = findLongestIncreasingSubstring(string);

        System.out.print("Longest increasing substring: ");
        for(Character c : max) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static LinkedList<Character> findLongestIncreasingSubstring(String string) {
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> current = new LinkedList<>();
        current.add(string.charAt(0));
        for(int i = 1; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            if(currentChar > current.getLast()) {
                current.add(currentChar);
            } else {
                if (current.size() > max.size()) {
                    max = new LinkedList<>(current);
                }
                current.clear();
                current.add(currentChar);
            }

        }
        if(current.size() > max.size()) {
            max = new LinkedList<>(current);
        }
        return max;

    }
}