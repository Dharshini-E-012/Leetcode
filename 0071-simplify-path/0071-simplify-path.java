import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            }

            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }

        StringBuilder result = new StringBuilder();

        for (String part : stack) {
            result.append("/").append(part);
        }

        if (result.length() == 0) {
            return "/";
        }

        return result.toString();
    }
}