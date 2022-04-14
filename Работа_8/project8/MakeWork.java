package project8;

public class MakeWork {
    private Command makeFootballBall;
    private Command makeSimpleBall;
    public MakeWork(Command makeFootballBall, Command makeSimpleBall) {
        this.makeFootballBall = makeFootballBall;
        this.makeSimpleBall = makeSimpleBall;
    }
    public void MakeFootballBall(){
        makeFootballBall.make_ball();
    }
    public void MakeSimpleBall(){
        makeSimpleBall.make_ball();
    }

}
