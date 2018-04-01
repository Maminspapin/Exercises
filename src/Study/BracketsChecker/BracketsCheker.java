package Study.BracketsChecker;

import java.util.LinkedList;

public class BracketsCheker {

    private static boolean bracketsChecker(String str) {

        LinkedList<Character> holder = new LinkedList<>();

        try {

            for (int i = 0; i < str.length(); i++) {

                switch (str.charAt(i)) {

                    case ('('):
                        holder.push('(');
                        break;
                    case ('['):
                        holder.push('[');
                        break;
                    case ('{'):
                        holder.push('{');
                        break;
                    case (')'):
                        if (!holder.peek().equals('('))
                            return false;
                        else
                            holder.pop();
                        break;
                    case (']'):
                        if (!holder.peek().equals('['))
                            return false;
                        else
                            holder.pop();
                        break;
                    case ('}'):
                        if (!holder.peek().equals('{'))
                            return false;
                        else
                            holder.pop();
                        break;
                }
            }
        }

        catch (NullPointerException e) {
            return false;
        }

        return (holder.isEmpty());

    }

    public static void main(String[] args) {
        System.out.println(bracketsChecker("{} - bracket"));
    }
}
