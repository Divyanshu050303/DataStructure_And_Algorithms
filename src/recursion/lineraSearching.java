package recursion;

public class lineraSearching {
    static int FirstlinearSearch(int []arr, int index, int searchKey){
        if(index==arr.length){
            return -1;
        }
        if(searchKey==arr[index]){
            return index+1;
        }
         return FirstlinearSearch(arr, index+1, searchKey);
    }
    static int LastlinearSearch(int []arr, int index, int searchKey){
        if(index==-1){
            return -1;
        }
        if(searchKey==arr[index]){
            return index+1;
        }
        return LastlinearSearch(arr, index-1, searchKey);
    }

    public static void main(String[] args) {
        lineraSearching l=new lineraSearching();
        int []arr={1, 2, 3, 3, 5,3,9 };
        System.out.println("At "+FirstlinearSearch(arr, 0, 10));
        System.out.println("At "+LastlinearSearch(arr, arr.length-1, 3));
    }
}
