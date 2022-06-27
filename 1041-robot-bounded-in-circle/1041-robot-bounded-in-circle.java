class Solution {
    public boolean isRobotBounded(String inst) {
        
        char dir = 'N';
        int x=0 , y=0;
        for(int i = 0 ; i<inst.length() ;i++ ){
            char ins = inst.charAt(i);
            if(ins=='G' && dir == 'N') y = y+1;
            else if(ins=='G' && dir == 'W') x = x-1;
            else if(ins=='G' && dir == 'E') x = x+1;
            else if(ins=='G' && dir == 'S') y = y-1;
            else{
                if(ins=='L' && dir == 'N') dir = 'W';
                else if(ins=='L' && dir == 'W') dir = 'S';
                else if(ins=='L' && dir == 'E') dir = 'N';
                else if(ins=='L' && dir == 'S') dir = 'E';
                else if(ins=='R' && dir == 'N') dir = 'E';
                else if(ins=='R' && dir == 'W') dir = 'N';
                else if(ins=='R' && dir == 'E') dir = 'S';
                else if(ins=='R' && dir == 'S') dir = 'W';
                       
            }
        }
        if( x ==0 && y==0 ) return true;
        if(dir != 'N') return true;
        else return false;
    }
}