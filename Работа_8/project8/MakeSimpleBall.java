package project8;

public class MakeSimpleBall implements Command{
    private Make m;
    public MakeSimpleBall(Make m) {
        this.m = m;
    }
    @Override
    public void make_ball() {
        m.make_simple_ball();
    }
}
