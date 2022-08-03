import java.util.TreeMap;

class MyCalendar {
    private final TreeMap<Integer, Integer> booked;

    public MyCalendar() {
        booked = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer lb = booked.floorKey(start);
        if (lb != null && booked.get(lb) > start) return false;
        Integer ub = booked.ceilingKey(start);
        if (ub != null && ub < end) return false;

        booked.put(start, end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */