class Solution {
    public int reverse(int x) {
     //   int t=x,c=0;
     //   while(t!=0){
     //       t/=10;
     //       c++;
     //   }

        int t1=x;long r=0;
        do{
            r=(r*10)+(t1%10);
            t1/=10;
          //  System.out.println(r);
        }while(t1!=0);
        System.out.println(r);
        
        if((r>=(-(Math.pow(2,31)))) && (r<=(Math.pow(2,31)-1)))
            return (int)r;
        else
            return 0;    
    }
    
    public static void main (String args[]){
        Solution obj = new Solution();
        obj.reverse(-123);
    }
}
