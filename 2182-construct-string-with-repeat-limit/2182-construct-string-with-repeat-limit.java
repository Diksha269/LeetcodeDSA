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
 
    public String repeatLimitedString(String s, int repeat) 
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
            
            for(int i=0;i<Math.min(curr.count,repeat);i++)
            sb.append(curr.val);
            
            if(curr.count<=repeat)
            continue;
            
            if(pq.isEmpty())
            return sb.toString();
            
            Pair next_=pq.poll();
            sb.append(next_.val);
            
            next_.count-=1;
            curr.count-=repeat;
            pq.offer(curr);
            
            if(next_.count>0)
            pq.offer(next_);
            
        }
        
        return sb.toString();
    }
}