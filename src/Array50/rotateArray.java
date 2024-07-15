package Array50;

public class rotateArray {
    static int [] rotatearray(int [] array ,int rotate){
        int length=array.length; //5
        int [] newarray=new int [length]; //5
        for (int i=0;i<=rotate;i++){
            newarray[i]=array[length-i-1]; //[5]
        }
        for (int i=0 ; i<(array.length)-rotate ;i++){ // 3
            newarray[rotate+i]=array[i];
        }
        return newarray;
    }

    public static void main (String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int rotate=3;
        for(int i : rotatearray(array,rotate)){
            System.out.println(i);
        }
    }
}
