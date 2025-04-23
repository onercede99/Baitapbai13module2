import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for(int i = 0; i < string.length(); i++) {
            LinkedList<Character> list =  new LinkedList<>();
            list.add(string.charAt(i));
            for(int j = i + 1; j < string.length(); j++) {
                if(string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if(max.size() < list.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for(Character c : max) {
            System.out.print(c);
        }
        System.out.println();
    }
}