package labsheet9.exercise1;

public final class SelfEmployedWorker extends Employee {
        private double estimatedIncome;

    public SelfEmployedWorker(String firstName, String lastName) {
        super(firstName, lastName);
        setEstimatedIncome();
    }
    public void setEstimatedIncome(){
            this.estimatedIncome = Math.random()*(900-400)+400;
    }
    public double earnings(){
            return estimatedIncome;
    }

    @Override
    public String toString() {
        return super.toString() + " estimatedIncome: " + String.format("%.2f",earnings());
    }
}

