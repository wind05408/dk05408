
console.log("dd");
var f=function(x){return x+3;};
console.log(f(182556));
function factorial(x){
    if(x<0) throw new Error("不能输入负数!");
    for(var f= 1;x>1;f*=x,x--);
    return f;
}
//console.log(factorial(2));
//factorial(-1);
//
//try{
//    var n = Number(prompt("please input an number",""))
//    var f =factorial(n);
//    alert(f);
//}
//catch(ex){
//    alert(ex);
//}

function Lakers() {
    this.name = "kobe bryant";
    this.age = "28";
    this.gender = "boy";
}
var people=new Lakers();
with(people)
{
    var str = "姓名: " + name + "<br>";
    str += "年龄：" + age + "<br>";
    str += "性别：" + gender;
    document.write(str);
}

x = Math.cos(3 * Math.PI) + Math.sin(Math.LN10);
y = Math.tan(14 * Math.E);

with (Math) {
    x = cos(3 * PI) + sin(LN10);
    y = tan(14 * E);
}

var obj1= Object.create({x:1,y:2});
console.log(obj1.x+"   y="+obj1.y);

var o3 = Object.create(Object.prototype);

function inherit(p){
    if(p==null) throw  TypeError();
    if(Object.create)
       return Object.create(p);
    var t = typeof p;
    if(t !=="object"&&t !=="function") throw TypeError();
    function f(){};
    f.prototype = p;
    return new f();
}

var o ={x:"don't change this value"};
console.log(inherit(o).prototype);