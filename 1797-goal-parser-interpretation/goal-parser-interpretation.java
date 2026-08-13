class Solution {
    public String interpret(String command) {
        String n=command.replace("()","o").replace("(al)","al");
        return n;
    }
}