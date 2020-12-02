package com.zoey.leetCode;

/**
 * 给定一系列整数，插入一个队列中，找出队列中第一个只存在一次的（唯一）整数。
 * @author ZHOUJIE
 */
public class LeetCode1429 {
    public static void main(String[] args) {
        int[] array={1,2,3,1,4,2};
        FindUnitNumber unitNumber=new FindUnitNumber(array);
        System.out.println(findUnit(array));
    }
    public static int findUnit(int[] array){
        for(int i=0;i<array.length;i++){

        }
        return -1;
    }
}
class FindUnitNumber{
    int[] array;
    public FindUnitNumber(){

    }
    public FindUnitNumber(int[] array){
        this.array=array;
    }
}
