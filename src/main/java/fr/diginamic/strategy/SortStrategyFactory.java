package fr.diginamic.strategy;

public class SortStrategyFactory {

    public static ISortStrategy create(SortStrategyType type) {
        if (type == null)
            return null;

        switch (type) {
            case BUBBLE:
                return new BubbleSortStrategy();
            case INSERTION:
                return new InsertionSortStrategy();
            case SELECTION:
                return new SelectionSortStrategy();
            default:
                return null;
        }
    }
}
