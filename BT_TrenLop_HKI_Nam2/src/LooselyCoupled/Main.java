package LooselyCoupled;

public class Main {

	public static void main(String[] args) {
		var sort = new SelectionSort();
		var sortReport = new SortService(sort);
		sortReport.Show();
		sortReport.setSort(new QuickSort());
		sortReport.Show();
	}

}
