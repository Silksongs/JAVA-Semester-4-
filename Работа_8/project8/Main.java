package project8;

public class Main {
    public static void main(String[] args) {
        Make m=new Make();
        Command mfb=new MakeFootballBall(m);
        Command msb=new MakeSimpleBall(m);
        MakeWork mw=new MakeWork(mfb,msb);
        mw.MakeFootballBall();
        mw.MakeSimpleBall();
    }
}