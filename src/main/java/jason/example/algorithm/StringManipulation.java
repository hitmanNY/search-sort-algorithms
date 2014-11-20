package jason.example.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulation {
    private static int counter = 0;
    private List<Integer> fibList;

    public StringManipulation() {
        fibList = new ArrayList<>();
    }

    public List<Integer> getFibbinacciSequence(int start, int next, int count) {
        if (counter == 0) {
            fibList.clear();
        }

        if (counter < count) {
            counter++;
            fibList.add(start);
            getFibbinacciSequence(next, start + next, count);

        } else {
            counter = 0;
        }
        return fibList;
    }

    public String reverseStringByChar(String source) {
        if (source == null || source.isEmpty()) {
            return source;
        }

        StringBuilder buf = new StringBuilder();
        for (int i = source.length() - 1; i >= 0; i--) {
            buf.append(source.charAt(i));
        }

        return buf.toString();
    }

    public boolean isSubstring(String sub, String source) {

        if (sub == null || source == null || sub.isEmpty() || source.isEmpty()) {
            return false;
        }

        int subMax = sub.length() - 1;
        // outer loop, the source string
        for (int i = 0; i < source.length(); i++) {
            System.out.println("Checking source char: " + source.substring(i));
            int j = 0;
            while (j < subMax && (subMax <= (source.length() - i))) {
                if (sub.charAt(j) != source.charAt((i + j))) {

                    break;
                }

                System.out.println("Found matching char: " + source.charAt(i + j));
                if (j == subMax - 1) {
                    System.out.println("Match found!!");
                    return true;
                }
                j++;
            }
        }

        return false;
    }

    public boolean isSubstringPatternMatch(String sub, String source) {
        boolean isSubstring = false;

        if (sub == null || source == null) {
            return isSubstring;
        }

        Pattern pattern = Pattern.compile(sub);
        Matcher matcher = pattern.matcher(source);

        if (matcher.find()) {
            isSubstring = true;
            System.out.println("match found: " + matcher.group());
        }

        return isSubstring;
    }

}
