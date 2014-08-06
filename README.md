cordova-viewport-fix
====================

cordova plugin to fix viewport issue: Viewport meta tag ignored in Android 4.4 WebView


How to use
==============
```js
window.plugin.viewportFix.fixme(function(err,status){
   if(err){
     console.error('failed');
   }else{
     console.log('fixed')
   }
});
```
