package array;
// brute force approach
// public class NumberOfSubArrSumk {
//     public static void main(String[] args){
//         int nums[] = {3,1,2,4};
//         int n = nums.length;
//         int k = 6;
//         int sum=0;
//         int cnt=0;
//         for(int i = 0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 sum=0;
//                 for(int x=i;x<n;x++){
//                     sum += nums[x];
//                 }
//                 if(sum == k){
//                     cnt++;
//                 }
//             }

//         }
//         System.out.print(cnt);
//     }
// }

// t.c = o(n3) near

// better approach
// public class NumberOfSubArrSumk {
//     public static void main(String[] args){
//         int nums[] = {3,1,2,4};
//         int n = nums.length;
//         int k = 6;
//         int sum=0;
//         int cnt=0;
//         for(int i = 0;i<n;i++){
//             sum=0;
//             for(int j=i;j<n;j++){
//                 sum += nums[j];
//                 if(sum == k){
//                     cnt++;
//                 }
//             }

//         }
//         System.out.print(cnt);
//     }
// }

// t.c = o(n2)

// optimal approach  -> it is in Hashmap folder


