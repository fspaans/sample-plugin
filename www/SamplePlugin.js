window.sumup = function(num1, num2, successCallback, errorCallback) {
	cordova.exec(successCallback, errorCallback, "SamplePlugin", "sumup", [num1, num2]);
};
