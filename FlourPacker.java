public class FlourPacker {

    public static boolean canPack(int bigCount , int smallCount , int goal){
        if (goal<0 || bigCount<0 || smallCount<0){
            return false;

        }

        int bigcounttotal=0;
        bigcounttotal=bigCount*5;

        int total = bigcounttotal+smallCount;
        if (total==goal){
            return true;
        }
        else if (bigcounttotal%goal!=0){
            while (bigcounttotal>goal){
                bigcounttotal-=5;
            }
        }
        int smallvalue = goal-bigcounttotal;
        return smallCount >= smallvalue ? true : false ;
    }
}
