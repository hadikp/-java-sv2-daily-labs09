package day03;

public class Caesar extends Encryption {

    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) { //Az angol ABC 26 betűs
        StringBuilder st = new StringBuilder("A rejtjelezett szó: ");
        int word;
        for (int i = 0; i < input.length(); i++) {
            word = input.charAt(i) + offset;
            if (word > 122) {
                word = word - 122 + 96;
            }
            st.append(Character.toChars(word));
        }
        return st.toString();
    }
}
