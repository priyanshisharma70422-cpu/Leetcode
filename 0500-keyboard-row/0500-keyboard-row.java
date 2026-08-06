class Solution {
    public String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            String word = words[i].toLowerCase();
            String row = "";

            if (row1.contains(String.valueOf(word.charAt(0)))) {
                row = row1;
            } else if (row2.contains(String.valueOf(word.charAt(0)))) {
                row = row2;
            } else {
                row = row3;
            }

            boolean flag = true;

            for (int j = 0; j < word.length(); j++) {
                if (!row.contains(String.valueOf(word.charAt(j)))) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                list.add(words[i]); // original word
            }
        }

        return list.toArray(new String[0]);
    }
}