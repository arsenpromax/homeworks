public class copy {
    public static void main(String[] args) {
        int[] oldArray = {43543,3,5,6,2,0,8,24,42,235,213};
        int[] newArray = new int[oldArray.length];

        for(int i = 0; i < oldArray.length; i++){
            newArray[i] = oldArray[i];
        }

        for(int element:newArray)
            System.out.print(element + " ");
    }
}
