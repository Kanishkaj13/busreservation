package busreservation;

public class bus {
    private int busNo;
    private boolean ac;
    private int capacity;


    public bus(int busNo, boolean ac, int capacity) {
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = capacity;
    }

    public int getBusNo() {
        return busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void displayBusInfo() {
        System.out.println("busNo:" + busNo + "ac:" + ac + "capacity:" + capacity);

    }
}
