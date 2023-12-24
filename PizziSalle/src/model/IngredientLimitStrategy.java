package model;

public class IngredientLimitStrategy implements LimitStrategy{

    @Override
    public boolean isLimitReached(int current, int limit) {
        return current >= limit;
    }
}
