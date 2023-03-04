package homework1.task3;

public class Bear  extends Animal{


    @Override
    public String makeNoise() {
        return "bear growls";
    }

    @Override
    public String eat() {
        return "- eats everything, but loves honey very much";
    }

    @Override
    public String getDescription() {
        return
                "- He loves raspberries, honey, lives almost all over the planet. loves salmon";
    }

    @Override
    public String getName() {
        return "Bear";
    }
}
