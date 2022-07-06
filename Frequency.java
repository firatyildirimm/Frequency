public class Frequency {
    static boolean isFind(int[] arr , int value){
        for(int i : arr){
            if(i == value){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int[] array = {1,2,3,3,3,4,5,6,9,8,7,4,5};
        //for finding same numbers in array
        int[] duplicate = new int[array.length];
        int startIndex=0;

        for(int i=0;i< array.length;i++){
            if(isFind(duplicate,array[i])){
            int count = 0;
            for(int j=0;j< array.length;j++){
                if(array[j]==array[i]){
                    count ++;
                }
            }
            System.out.println(array[i] + " is duplicated " + count + "time.");
            duplicate[startIndex++]=array[i];
        }}
    }
}
