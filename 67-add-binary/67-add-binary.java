class Solution {
    //11 1
    // 1
    // 100
    //0+0 = 0
    //1+0 = 0
    //1+1 = 0 , carry = 1
    public String addBinary(String a, String b) {
        String res = "";
        int i = a.length()-1;
        int j = b.length()-1;
        char carry = '0';
        while(i>=0 && j>=0){
            char x = a.charAt(i);
            char y = b.charAt(j);
            if(x=='1' && y=='1'){
                if(carry == '1'){
                    res+= '1';
                    carry = '1';
                }
                else{
                    res+='0';
                    carry = '1';
                }
            }
             else if(x=='1' && y=='0' || x=='0' && y=='1'){
                if(carry == '1'){
                    res+='0';
                    carry = '1';
                }
                else{
                      res+='1';
                    carry = '0';
                }
            }
            else if(x=='0' && y=='0' ){
                if(carry == '1'){
                      res+='1';
                    carry = '0';
                }
                else{
                      res+='0';
                    carry = '0';
                }
            }
            i--;j--;
            
        }
         System.out.println(res);
        while(i>=0){
            if(a.charAt(i) == '1' && carry == '1'){ res+='0'; carry = '1';}
                
            else if(a.charAt(i) == '1' && carry == '0'){ res+='1'; carry = '0';}
            else if(a.charAt(i) == '0' && carry == '0'){ res+='0'; carry = '0';}
                
            else if(a.charAt(i) == '0' && carry == '1'){ res+='1'; carry = '0';}
            i--;
            
            
                
        }
         while(j>=0){
            if(b.charAt(j) == '1' && carry == '1'){ res+='0'; carry = '1';}
                
            else if(b.charAt(j) == '1' && carry == '0'){ res+='1'; carry = '0';}
            else if(b.charAt(j) == '0' && carry == '0'){ res+='0'; carry = '0';}
                
            else if(b.charAt(j) == '0' && carry == '1'){ res+='1'; carry = '0';}
            j--;
            
            
                
        }
        
        if(carry == '1') res+='1';
        StringBuilder str = new StringBuilder(res);
        str.reverse();
        res = str.toString();
        System.out.println(res);
        return res;
    }
}