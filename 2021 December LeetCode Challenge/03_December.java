class Solution {
	public int maxProduct(int[] arr) {
		int ans = 0;
		int maxv = arr[0];
		int minv = arr[0];
		int gmax = arr[0];
		for (int i = 1; i < arr.length; i++) {
			int prevm = maxv;
			if (arr[i] == 0) {
				maxv = 0;
				minv = 0;
			} else {
				maxv = Math.max(arr[i], Math.max(arr[i] * maxv, arr[i] * minv));
				minv = Math.min(arr[i], Math.min(arr[i] * prevm, arr[i] * minv));
			}
			gmax = Math.max(gmax, maxv);
		}
		return gmax;
	}
}