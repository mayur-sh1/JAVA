package Loops;

import java.util.Scanner;

public class patterns {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n for rows:");
        int n=sc.nextInt();

        /*Q1 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) System.out.print("* ");
            System.out.println();
        }
        
        Q2
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        
        Q3
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        
        Q4
        int nst=1;
        int nsp=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++) System.out.print(" ");
            for(int k=1;k<=nst;k++) System.out.print("*");
            nst+=1;
            nsp-=1;
            System.out.println();
        }
        
        Q6
        int nst=n;
        int nsp=0;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=nsp;k++) System.out.print(" ");
            for(int j=1;j<=nst;j++) System.out.print("*");
            nst-=1;
            nsp+=2;
            System.out.println();
        }
        
        Q7
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        
        Q8
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        
        Q9
        int nsp=n-1;
        int nst=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<nsp;j++) System.out.print("  ");
            for(int k=0;k<nst;k++) System.out.print("* ");
            nsp-=1;
            nst+=2;
            System.out.println();
        }
        
        Q12
        int nsp=n-1;
        int nst=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<nsp;j++) System.out.print("  ");
            for(int k=0;k<nst;k++) {
                if(k%2!=0) System.out.print("! ");
                else System.out.print("* ");;
            }
            nsp-=1;
            nst+=2;
            System.out.println();
        }
        
        Q14
        int nst=1;
        int nsp=n-1;
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<nsp;j++) System.out.print("  ");
            for(int k=0;k<nst;k++) System.out.print("* ");
            if(i>=n-1){
                nst--;
                nsp++;
            }
            else{
                nst++;
                nsp--;
            }
            System.out.println();
        }
        
        Q16
        int nsp=n-1;
        int nst=n;
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<nsp;j++) System.out.print("  ");
            for(int k=0;k<nst;k++) System.out.print("* ");
            if(i>=n-1){
                nst++;nsp++;
            }
            else{
                nst--;nsp--;
            }
            System.out.println();
        }
        
        Q17
        int l=n/2;
        int r=n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<l || j>r) System.out.print("* ");
                else System.out.print("  ");
            }
            if(i<n/2){
                l--;r++;
            }
            else{
                l++;r--;
            }
            System.out.println();
        }
        
        Q19
        int  mid=n/2;
        int count=0;
        for(int i=0;i<n;i++) System.out.print("* ");
        System.out.println();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n;j++){
                if(j<mid-count || j>mid+count) System.out.print("* ");
                else System.out.print("  ");
            }
            if(i<mid-1) count++;
            else count--;
            System.out.println();
        }
        
        
        Q20
        int mid=n/2;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==(mid-count) || j==(mid+count)) System.out.print("* ");
                else System.out.print("  ");
            }
            if(i<mid) count++;
            else count--;
            System.out.println();
        }
        
        Q27
        */
        sc.close();

        


        



    }
}
