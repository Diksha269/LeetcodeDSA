class Solution
{   
    class Pair implements Comparable<Pair>
    {
        char val;int count;
        
        Pair(char v,int c)
        {
            val=v;
            count=c;
        }
        
        public int compareTo(Pair obj)
        {
            return obj.val-this.val;
        }
    }
 
    public String repeatLimitedString(String s, int r) 
    {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        Set<Character> set=map.keySet();
        for(char ch:set)
        pq.offer(new Pair(ch,map.get(ch)));
        
        StringBuilder sb=new StringBuilder();
        
        while(!pq.isEmpty())
        {
            Pair curr=pq.poll();
            if(curr.count > r){
                for(int i = 0 ; i<r ; i++) sb.append(curr.val);
                curr.count = curr.count - r;
                if(pq.isEmpty()) return sb.toString();
                Pair next = pq.poll();
                sb.append(next.val);
                next.count -=1;
                if(next.count > 0) pq.add(new Pair(next.val,next.count));
                pq.add(new Pair(curr.val,curr.count));
            }
            else if(curr.count <= r){
                for(int i = 0 ; i<curr.count ; i++) sb.append(curr.val);
            }
            
            
        }
        
        return sb.toString();
    }
}