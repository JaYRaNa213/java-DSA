public class Reverse_the_sentense {

    public static String reverse_str(String str) {
        int left = 0;
        int right = str.length() - 1;

        String temp = "";
        String ans = "";

        while (left <= right) {
            char ch = str.charAt(left);

            if (ch != ' ') {
                temp = temp + ch;
            } else {
                if (!temp.equals("")) {
                    if (!ans.equals("")) {
                        ans = temp + " " + ans;
                    } else {
                        ans = temp;
                    }
                    temp = "";
                }
            }
            left++; 
        }

        // handle the last word
        if (!temp.equals("")) {
            if (!ans.equals("")) {
                ans = temp + " " + ans;
            } else {
                ans = temp;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "My name is jay rana";
        System.out.println(reverse_str(str));
    }
}
