

class Day10 {
    public static void main(String[] args){
        int[] nums1 = {4,8,9};
        int m =3;
        int[] nums2 = {1,7,9};
        int n = 3;

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int idx = 0;
        int p1 = 0;
        int p2 = 0;
        while(p1<m && p2 < n){
            if(nums1[p1] < nums2[p2]){
                arr[idx] = nums1[p1];
                p1++;
            }
            else{
                arr[idx] = nums2[p2];
                p2++;
            }
            idx++;
        } 
        while(p1 < m){
            arr[idx] = nums1[p1];
            p1++;
            idx++;
        }
        while(p2 < n){
            arr[idx] = nums1[p2];
            p2++;
            idx++;

        }
        return arr;
        
    }
}