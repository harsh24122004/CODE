public class Target {
    public static void main(String[] args) {
        int a[]={3,2,4,6,7};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]+a[j]==10)
                     System.out.println("Pairs are:" +a[i]+","+a[j]);
                else
                    continue;

            }
        }
    }
    
}
