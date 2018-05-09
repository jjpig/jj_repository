// 快排：从小到大排序
var sortLowToHigh = function(arr) {
　　if (arr.length <= 1) { 
		return arr; 
	}
　　var pivotIndex = Math.floor(arr.length / 2);
　　var pivot = arr.splice(pivotIndex, 1)[0];
　　var left = [];
　　var right = [];
　　for (var i = 0; i < arr.length; i++){
　　　　if (arr[i] < pivot) {
　　　　　　left.push(arr[i]);
　　　　} else {
　　　　　　right.push(arr[i]);
　　　　}
　　}
　　return sortLowToHigh(left).concat([pivot], sortLowToHigh(right));
};
// 快排：从大到小排序
var sortHighToLow = function(arr) {
　　if (arr.length <= 1) { 
		return arr; 
	}
　　var pivotIndex = Math.floor(arr.length / 2);
　　var pivot = arr.splice(pivotIndex, 1)[0];
　　var left = [];
　　var right = [];
　　for (var i = 0; i < arr.length; i++){
　　　　if (arr[i] > pivot) {
　　　　　　left.push(arr[i]);
　　　　} else {
　　　　　　right.push(arr[i]);
　　　　}
　　}
　　return sortHighToLow(left).concat([pivot], sortHighToLow(right));
};
function count(arr1, arr2) {
	// 输出值：总和
    var total = 0;

    //分别对arr1, arr2按从小到大和从大到小排序，此时得出的结果最小
    var firstArray = sortLowToHigh(arr1);
    var secondArray =sortHighToLow(arr2);

    // 配对相乘相加
    firstArray.forEach(function(item, index){
        total += item * secondArray[index];
    });

    console.log(total);
    return 0
}
count([1, 2, 3],[1, 2, 3]);