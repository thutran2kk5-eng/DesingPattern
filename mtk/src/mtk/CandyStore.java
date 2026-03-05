package mtk;

public class CandyStore {

    public Candy orderCandy(String type) {

        Candy candy = CandyFactory.createCandy(type);

        candy.prepare();
        candy.produce();
        candy.packageCandy();

        return candy;
    }
}
