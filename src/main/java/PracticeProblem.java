public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void insertionSort(char[] arr) {
		for(int i = 1; i < arr.length; i++) {
			char key = arr[i];
			int index = i - 1;

			while(index >= 0 && arr[index] > key) {
				arr[index + 1] = arr[index];
				index--;
			}
			arr[index + 1] = key;
		}
	}

}
