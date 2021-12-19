package LooselyCoupled;


public class SortService {
	private SortAlgorithm sort;

	public SortService(SortAlgorithm sort) {
		this.sort = sort;
	}
	
	public void setSort(SortAlgorithm sort) {
		this.sort = sort;
	}
	
	public void Show() {
		sort.sort();
	}
	

}
