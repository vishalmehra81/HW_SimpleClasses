public class WaterBottle{

    private int volume;

    public WaterBottle(){
        this.volume =700;
    }
    public int getVolume(){
        return this.volume;
    }
    public void drinkWater(){
        this.volume -=10;
    }
    public void emptyBottle(){
        this.volume = 0;
    }
    public void fillBottle(){
        while (this.volume <700){
            this.volume += 1;
        }

    }
}
