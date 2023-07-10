import java.util.*l
class a{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
        char arr1[]=new char[str1.length()];
        char arr1[]=new char[str2.length()];
        for(int i=0;i<str1.length();i++){
            arr1[i]=str1.charAt(i);
        }
        for(int j=0;j<str2.length();j++){
            arr2[j]=str2.charAt(j);
        }
        for(int x=0;x<arr1.length;x++){
            for(int y=0;y<arr2.length;y++){
               if(arr1[x]!=arr2[y]){
                System.out.print("Not equal");
                break;
               }
               else{
                System.out.print("Equal");
               }
            }
        }
    }
}