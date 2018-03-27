package maths;

public class Delta
{
    private double currentFrameTime;
    private double lastFrameTime;

    private double delta;
    private double time;

    public Delta()
    {
        currentFrameTime = 0.0;
        lastFrameTime = 0.0;
        delta = 0.0;
        time = 0.0;
    }

    public void update()
    {
        currentFrameTime = System.nanoTime() * 1e-9;
        delta = currentFrameTime - lastFrameTime;
        lastFrameTime = currentFrameTime;
        time += delta;
    }

    public double getDelta()
    {
        return delta;
    }

    public double getTime()
    {
        return time;
    }
}