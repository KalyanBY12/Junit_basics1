package org.example.Arrays;

import java.util.Arrays;

public class ArrayMethods
{
    public int findIndex(int[] arr, int num)
    {
        int index = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == num)
            {
                index = i;
                break;
            }
        }
        return index;
    }

    public void printArray(int[] arr, int index)
    {
        System.out.println("The  index is " + arr[index]);
    }

    public boolean searchNumber(int[] arr, int num)
    {
        boolean found = false;

        for(Integer val : arr)
        {
            if(val == num)
            {
                found = true;
                break;
            }
        }
        return found;
    }
}
