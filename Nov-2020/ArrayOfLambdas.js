/*This problem was asked by Dropbox.

What does the below code snippet print out? How can we fix the anonymous functions to behave as we'd expect?

functions = []
for i in range(10):
    functions.append(lambda : i)

for f in functions:
    print(f())
	
*/
function test(){
  let functions=[];
  for(let i=0;i<10;i++){
    functions[i]=() => i
  }
  functions.map(f=>console.log(f()));
}
test();
