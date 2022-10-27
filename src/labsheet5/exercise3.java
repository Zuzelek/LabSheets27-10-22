package labsheet5;

public class exercise3 {
    private int CurrentTemperature;
    private int MaximumTemperature;
    private int MinimumTemperature;

    public exercise3() {
        CurrentTemperature = 0;
        MaximumTemperature = Integer.MIN_VALUE;
        MinimumTemperature = Integer.MAX_VALUE;
    }
    public exercise3(int CurrentTemperature, int MaximumTemperature, int MinimumTemperature) {
        setCurrentTemperature(CurrentTemperature);
        setMaximumTemperature(MaximumTemperature);
        setMinimumTemperature(MinimumTemperature);
    }
    public int getCurrentTemperature(){

        return CurrentTemperature;
    }
    public int getMaximumTemperature(){

        return MaximumTemperature;
    }
    public int getMinimumTemperature(){

        return MinimumTemperature;
    }
    public void setCurrentTemperature(int CurrentTemperature){

        this.CurrentTemperature = CurrentTemperature;
    }
    public void setMaximumTemperature(int MaximumTemperature){

        this.MaximumTemperature = MaximumTemperature;
    }
    public void setMinimumTemperature(int MinimumTemperature){

        this.MinimumTemperature = MinimumTemperature;
    }

    public String toString(){
        return "\nCurrent Temperature: " + getCurrentTemperature() +
                "\nMaximum Temperature: " + getMaximumTemperature()+
                "\nMinimum Temperature: " + getMinimumTemperature();
    }
    public void setTemperature(int temperature){
        setCurrentTemperature(temperature);

        updateMaxMinTemp(temperature);
    }
    private void updateMaxMinTemp(int temperature){
        if(temperature < MinimumTemperature) {
            MinimumTemperature = temperature;
        }

        if(temperature > MaximumTemperature) {
            MaximumTemperature = temperature;
        }

    }

}

