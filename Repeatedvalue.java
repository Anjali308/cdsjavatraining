public class Repeatedvalue {
    public static void main(String[] args) {
        String arr[]=new String[]{"Ram","Mohan","Ram","Sita","Mohan"};
        System.out.println("Duplicate name in array");
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }

    }
    
}
