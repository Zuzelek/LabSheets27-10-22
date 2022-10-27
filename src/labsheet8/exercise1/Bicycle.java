package labsheet8.exercise1;

public class Bicycle extends Vehicle{
    private int gearCount;
    private boolean hasBell;

    public Bicycle(){
        setGearCount(0);
        setHasBell(false);
    }
    public Bicycle(double price, double length, double height, double weight, String manufacturer, String model, int gearCount, boolean hasBell){
        super(price, length, height, weight, manufacturer, model);
        setGearCount(gearCount);
        setHasBell(hasBell);
    }

    public int getGearCount() {
        return gearCount;
    }

    public boolean getHasBell() {
        return hasBell;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }

    @Override
    public String toString() {
        String str = "";

        str += super.toString() + "\nHas bell: ";

        if(getHasBell())
            str += "yes";
        else
            str += "no";

        str += "\nGear Count: "+getGearCount();

        return str;
    }
}
