package project8;

public class MakeFootballBall implements Command{
    private Make m;
    public MakeFootballBall(Make m) {
        this.m = m;
    }
    @Override
    public void make_ball() {
        m.make_football_ball();
    }
}