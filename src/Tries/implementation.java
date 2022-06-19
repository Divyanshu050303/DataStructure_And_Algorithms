package Tries;



class Node{
    Node []links=new Node[26];
    boolean flag=false;
    Node (){

    }
    boolean containKryChar(char ch){
        return (links[ch-'a']!=null);
    }
    Node get(char ch){
        return links[ch-'a'];
    }
    void put(char ch, Node node){
        links[ch-'a']=node;
    }
    void setEnd(){
        flag=true;
    }
    boolean isEnd(){
        return false;
    }
}
public class implementation {
    private static  Node root;
    implementation(){
        root=new Node();
    }
    public static void insert(String word){
        Node node=root;
        for(int i=0;i<word.length();i++){
            if(!node.containKryChar(word.charAt(i))){
                node.put(word.charAt(i), new Node());
            }
            node=node.get(word.charAt(i));
        }
        node.setEnd();
    }
    public static boolean search(String word){
        Node node=root;
        for(int i=0;i<word.length();i++){
            if(!node.containKryChar(word.charAt(i))){
                return false;
            }
            node=node.get(word.charAt(i));
        }
        return node.isEnd();
    }
    public static boolean startsWith(String prefix){
        Node node=root;
        for(int i=0;i<prefix.length();i++){
            if(!node.containKryChar(prefix.charAt(i))){
                return false;
            }
            node =node.get(prefix.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        int n=5;
        int []type={1,1,2,3,2};
        String []arr={"hello", "help","help", "hel", "hel"};
        implementation im=new implementation();
        for(int i=0;i<n;i++){
            if(type[i]==1){
                insert(arr[i]);
            }
            else if(type[i]==2){
                if(search(arr[i])){
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }
            }
            else{
                if(startsWith(arr[i])){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            }
        }
    }
}
