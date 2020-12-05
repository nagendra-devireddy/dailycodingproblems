/**Given a function f, and N return a debounced f of N milliseconds.That is, as long as the debounced f continues to be invoked, f itself will not be called for N milliseconds.**/



let timer;
function debouncedFunction(delay){
 
 // clear existing time out
  cleartimeout(timer);

//set a new time out
 timer= setTimeOut(httpCall,delay);

}


function httpCall(){

}


element.addListener('input',function(){
 
 debouncedFunction(delay);

});
