public class DVD extends Item {
    private int duration;

    public DVD(String title, String uniqueID, int duration) {
        super(title, uniqueID);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void borrowItem() {
    }

    @Override
    public void returnItem() {
    }

    public void setBorrowed(boolean borrowed) {
        super.setBorrowed(borrowed);
    }

}
