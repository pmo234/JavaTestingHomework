public class WaterBottle {

    private int volume;
    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int takeADrink(){
        return this.volume -10;
    }

    public int emptyBottle(){
        return this.volume*0;
    }
    public int setToOneHundred(){
        return this.volume = 100;
    }
}
