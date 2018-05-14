public class WaterBottle {
    private int volume;


    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getDrink(){
        return this.volume -= 10;
    }

    public int getEmpty(){
        return this.volume = 0;
    }

    public int getFill(){
        return this.volume = 100;
    }
}