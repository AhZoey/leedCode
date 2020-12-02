package com.zoey.ahaAlgorithm.sort;

/**
 * 桶排序
 */
public class Class1BucketSorting {
    /**
     * 小哼的班上只有5个同学，这5个同学分别考了5分、3分、5分、2分和8分，哎考得真是惨不忍睹（满分是10分）。
     * 接下来将分数进行从大到小排序，排序后是8 5 5 3 2
     * @param args
     */
    public static void main(String[] args) {
        int[] scores=new int[]{5,3,5,2,8};
        for(int i=0;i<scores.length;i++){
            if(i+1>=scores.length){
                break;
            }
            if(scores[i]<scores[i+1]){
                int temp=scores[i];
                scores[i]=scores[i+1];
                scores[i+1]=temp;
            }
        }
        for(int i=0;i<scores.length;i++){
            System.out.print(scores[i]+"\t");
        }
    }
}
