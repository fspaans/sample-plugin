window.sumup = function(num1, num2, successCallback, errorCallback) {
	cordova.exec(successCallback, errorCallback, "Sample", "sumup", [num1, num2]);
};
