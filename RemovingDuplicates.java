// Removing Duplicates - Java Array

import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size:");
        int sz = sc.nextInt();

        int[] x = new int[sz];
        
        input(x);
        System.out.println("Original Array:");
        display(x,sz);

        System.out.println("Sorted Array:");
        sort(x);
        display(x,sz);
        
        System.out.println("Removed Duplicates:");
        sz=remdups(x);
        display(x,sz);

    }
    public static void sort(int[] t)
    {
        for(int i=0; i<t.length-1; i++)
        {
             for(int j=i; j<t.length-i-1; j++)
             {
                
                if(t[j] > t[j+1])
                {
                    int k=t[j];
                    t[j] = t[j+1];
                    t[j+1]=k;
                }
                
             }
        }
    }
    public static int remdups(int[] arr)
    {
        int j,i=0;
        for(j=1; j<arr.length; j++)
        {
            if(arr[i] != arr[j])
            {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
    public static void input(int[] t)
    {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i < t.length; i++)
        {
            System.out.print("Enter number:");
            t[i]=sc.nextInt();
        }
    }

    
    public static void display(int[] t,int sz)
    {
        
        for(int i=0; i < sz; i++)
        {
            System.out.print(" "+t[i]);
        }
        System.out.println();
    }

    
}

