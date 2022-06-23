class RecentCounter {
 
    ArrayList<Integer> request;
    public RecentCounter() {
        //initialise stuff
        request = new ArrayList<>();
    }
    
    public int ping(int t) {
        
        request.add(t);
        int startRange = t-3000;
        int count = 0;
        for(int i : request){
            if(i>=startRange && i<=t) count++;
        }
        return count;
    }
}
// RecentCounter recentCounter = new RecentCounter();
// recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
// recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
// recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
// recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */