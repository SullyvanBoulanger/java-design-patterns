package fr.diginamic.strategy;

public class Tri {

	private ISortStrategy sortStrategy = SortStrategyFactory.create(SortStrategyType.SELECTION);

	public void exec(Integer[] arr) {
		sortStrategy.sort(arr);
	}

	public void setSortStrategy(ISortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	public void setSortStrategy(SortStrategyType type) {
		this.sortStrategy = SortStrategyFactory.create(type);
	}
}
