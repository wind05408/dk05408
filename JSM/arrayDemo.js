/**
 * Created by Administrator on 2016/3/24.
 */
//alert("array test");
var musc = ["1",4,true,4.5];
for(var i = 0;i<musc.length;i++){
    console.log(musc[i]);
}
for(var index in musc){
    console.log(musc[index]);
}

var a = new Array(5);
console.log(a.length);
a = [];
console.log(a.length);
a[1000] = 1000;
console.log(a.length);
var a1 = [,,,];
console.log(a1.length);

var data = [1,2,3,4,5];
var sumSq = 0;
data.forEach(function(x){
    sumSq+=x*x;
});
console.log(sumSq);//55
console.log(data.join(""));//12345
console.log(data.join("*"));//1*2*3*4*5
console.log(data.reverse().join("*"));//5*4*3*2*1

var sortdata = [1,10,3,8,5];
console.log(sortdata.sort().join("*"));//1*10*3*5*8
sortdata.sort(function(a,b){return a-b});
console.log(sortdata.join("*"));//1*3*5*8*10

var mapData = [1,2,3];
var b = mapData.map(function(x){return x*x});
console.log(b);//[1, 4, 9]

var filterData = [5,4,3,2,1];
var c = filterData.filter(function(x){return x<3});
var d = filterData.filter(function(x,i){return i%2==0});
console.log(c);//[2, 1]
console.log(d);//[5, 3, 1]

var es = [1,2,3,4,5];
console.log(es.every(function(x){return x< 10;}));//true
console.log(es.every(function(x){return x%2===0;}));//false

console.log(es.some(function(x){return x%2===0;}));//true
console.log(es.some(isNaN));//false

var re = [1,2,3,4,5];
console.log(re.reduce(function(x,y){return x+y},0));//15
console.log(re.reduce(function(x,y){return x*y},1));//120
console.log(re.reduce(function(x,y){return x>y?x:y}));//5

Array.isArray()
console.log([] instanceof Array);//true
console.log(({}) instanceof Array);//false

