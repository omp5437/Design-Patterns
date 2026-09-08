import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String input1="3324";
        String input2="3324";
        String input3="1234";

        String result=solve(input1,input2,input3);
        System.out.println(result);
    }
    static String solve(String input1, String input2, String input3){
        StringBuilder D=new StringBuilder(input1);
        StringBuilder E=new StringBuilder(input2);
        StringBuilder F=new StringBuilder(input3);
        StringBuilder revD=new StringBuilder(input1).reverse();
        StringBuilder revE=new StringBuilder(input2).reverse();

        char []arr=F.toString().toCharArray();
        Arrays.sort(arr);
        do{
            StringBuilder X=new StringBuilder(new String(arr));
            if(X.equals(F))
                continue;
            if(X.compareTo(D)<=0 || X.compareTo(E)<=0){
                continue;
            }
            StringBuilder revX=new StringBuilder(new String(arr)).reverse();
            if(revX.compareTo(revD)>=0 || revX.compareTo(revE)>=0){
                continue;
            }

            return X.toString();

        }while(nextPermutation(arr));
        return "-1";

    }
    static boolean nextPermutation(char[] arr){
        int n=arr.length;
        int j=n-1;
        while(j>0 && arr[j-1]>=arr[j]){
            j--;
        }
        if(j==0)
            return false;

        int i=j;
        int k=n-1;
        while(i<k){
            char temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
            i++;
            k--;
        }
        i=j;
        while(i<n && arr[i]<=arr[j-1]){
            i++;
        }
        char temp=arr[i];
        arr[i]=arr[j-1];
        arr[j-1]=temp;
        return true;
    }
}