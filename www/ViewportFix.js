
var exec = require('cordova/exec');
module.exports = {
	fixme:function(callback) {
		
		exec(function(res){
			callback && callback(null,res);
		}, function(error){
			callback && callback(error);
		}, "ViewportFix", "fixme", []);
	}
};