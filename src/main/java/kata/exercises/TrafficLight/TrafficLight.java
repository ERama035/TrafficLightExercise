package kata.exercises.TrafficLight;

public enum TrafficLight
{
    RED( 8 )
        {
            public TrafficLight next() { return GREEN; }
        }
    ,GREEN(6)
        {
            public TrafficLight next() { return YELLOW; }
        }
    ,YELLOW(2)
        {
            public TrafficLight next() { return RED; }
        }
        ;

    private TrafficLight( int onDuration )
    {
        onTime = onDuration;
    }

    public int      getDuration()             { return onTime; }
//    public TrafficLight next()
//    {
//        switch (this)
//        {
//            case RED:    return GREEN;
//            case GREEN:  return YELLOW;
//            case YELLOW: return RED;
//        }
//
//        return RED;
//    }
    public abstract TrafficLight next();

    private int onTime;
}


