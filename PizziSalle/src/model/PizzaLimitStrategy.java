package model;

public class PizzaLimitStrategy implements LimitStrategy{
    @Override
    public boolean isLimitReached(int current, int limit) {
        return current >= limit;
    }
}
