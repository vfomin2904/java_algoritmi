import tools.MyStack;

public class StringReverse {
    private MyStack<Character> stack;

    public StringReverse(String string) {
        stack = new MyStack<>(string.length());

        for(int i = 0; i < string.length(); i++){
            stack.push(string.charAt(i));
        }
    }

    public String reverse(){
        int size = stack.size();
        char[] chars = new char[size];
        for (int i = 0; i < size; i++) {
            chars[i] = stack.pop();
        }
        return new String(chars, 0, size);
    }


}
