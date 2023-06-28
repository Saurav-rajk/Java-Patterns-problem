public class Main{
    public static void main(String[] args){
        int n=11;
        int p=31;
        // Loop for print the stars.
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) {
                if (i % 2 != 0 && j % 2 == 0||i % 2 == 0 && j % 2 != 0) {
                    System.out.print("  ");
                } else {
                    System.out.print("*"+" ");
                }

            }
            // Loop for print the "=" sign.
            for(int j=n+1;j<=p;j++){
                System.out.print("="+" ");
            }
            System.out.println();


        }
        int s=20;
        for(int i=n+1;i<=s;i++){
            for(int j=1;j<=p;j++){
                System.out.print("="+" ");
            }
            System.out.println();
        }

    }
}