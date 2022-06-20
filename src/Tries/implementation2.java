package Tries;
class Node1{
    Node1 []links=new Node1[26];
    int countEndWith=0;
    int countPrefix=0;
    boolean containKey(char ch){
        return (links[ch-'a']!=null);
    }
    Node1 get(char ch){
        return links[ch-'a'];
    }
    void put(char ch, Node1 node){
        links[ch-'a']=node;
    }
    void increaseEnd(){
        countEndWith++;
    }
    void increasePrefix(){
        countPrefix++;
    }
    void reducePrefix(){
        countPrefix--;
    }
    void deleteEnd(){
        countEndWith--;
    }
    int getEnd(){
        return countEndWith;
    }

    int getPrefix(){
        return countPrefix;
    }
}
public class implementation2 {
    private Node1 root;
    implementation2(){

    }
    public void insert(String word) {
        Node1 node = root;
        for(int i = 0;i<word.length();i++) {
            if(!node.containKey(word.charAt(i))) {
                node.put(word.charAt(i), new Node1());
            }
            node = node.get(word.charAt(i));
            node.increasePrefix();
        }
        node.increaseEnd();
    }
    public int countWordEqualTo(String word){
        Node1 node=root;
        for(int i=0;i<word.length();i++){
            if(node.containKey(word.charAt(i))){
                node=node.get(word.charAt(i));
            }
            else{
                return 0;
            }
        }
        return node.getEnd();
    }
    public int countWordStartingWith(String word){
        Node1 node=root;
        for(int i=0;i<word.length();i++){
            if(node.containKey(word.charAt(i))){
                node=node.get(word.charAt(i));
            }
            else{
                return 0;
            }
        }
        return node.getPrefix();
    }
    public void erase(String word){
        Node1 node=root;
        for(int i=0;i<word.length();i++){
            if(node.containKey(word.charAt(i))){
                node=node.get(word.charAt(i));
                node.reducePrefix();
            }
            else{
                return;
            }
        }
        node.deleteEnd();
    }

    public static void main(String[] args) {
        implementation2 im=new implementation2();
        im.insert("apple");
        im.insert("apple");
        im.insert("apps");
        im.insert("apps");
        String word1="apps";
        System.out.println("Count word equal to "+word1+" "+im.countWordEqualTo(word1));
        String word2="abc";
        System.out.println("Count the word equal to "+word2+" "+im.countWordEqualTo(word2));
        String word3="ap";
        System.out.println("Count word Starting with"+word3+" "+im.countWordStartingWith(word3));
        String word4="app1";
        System.out.println("Count words starting with"+word4+" "+im.countWordStartingWith(word4));
        im.erase(word1);
        System.out.println("Count word equal to "+word1+" "+im.countWordEqualTo(word1));
    }
}
