/**
 * Created by Administrator on 2016/2/23.
 */
var o = {x:1,y:2,z:3};
console.log(o.propertyIsEnumerable("toString"));
console.log(o.propertyIsEnumerable("x"));
for(p in o){
    if(!o.hasOwnProperty(p)) continue;
    console.log(p);
}

function extend(o,p){
    for(prop in p){
        o[prop] = p[prop];
    }
    return o;
}

var serialnum = {
    $n:0,
    get next(){return this.$n++;},
    set next(n){
        if(n>=this.$n) this.$n = n;
        else throw "���кŵ�ֵ���ܱȵ�ǰֵС";
    }
};
serialnum.next = 100;//set
//serialnum.next();
console.log(serialnum.next);//get
console.log(serialnum.next);//get
//console.log(serialnum.next(1));
console.log(serialnum.$n);
//console.log(serialnum.$n);

var log = ['test'];
var obj = {
    get latest () {
        if (log.length == 0) return undefined;
        return log[log.length - 1]
    },
    set latest(str){ log[log.length - 1] = str}
};
obj.latest = "test+test";
console.log (obj.latest); // Will return "test".

console.log(Object.getOwnPropertyDescriptor({x:1},"x"));
console.log(Object.getOwnPropertyDescriptor(serialnum,"next"));

console.log(Object.getOwnPropertyDescriptor({},"x"));
console.log(Object.getOwnPropertyDescriptor(serialnum,"toString"));

var oo ={};
Object.defineProperty(oo,"xx",{value: 1, writable: true, enumerable: false, configurable: true});
console.log(oo.xx);
console.log(Object.keys(oo));

Object.defineProperty(oo,"xx",{ writable: false});
oo.xx = 2;
console.log(oo.xx);
Object.defineProperty(oo,"xx",{value: 3});
console.log(oo.xx);

Object.defineProperty(oo,"xx",{get:function(){return 2000;}});
console.log(oo.xx);

//function classof(o){
//    if(o === null) return "Null";
//    if(o=== undefined) return "Undefined";
//    return Object.prototype.toString.call(o).slice(8,-1);
//}
//console.log(classof(null));
//console.log(classof(1));
//console.log(classof(" "));
//console.log(classof(false));
//console.log(classof({}));
//console.log(classof([]));
//console.log(classof(/./));
//console.log(classof(new Date()));
//console.log(classof(window));
//console.log(classof(classof));

tt = JSON.stringify(o);
tt.toJSON();
console.log(tt);
console.log(JSON.parse(tt));
