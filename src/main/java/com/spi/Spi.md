**SPI(Service Provider Interface)**
<br>1.JDK 标准的 SPI 会一次性实例化扩展点所有实现，如果有扩展实现初始化很耗时，但如果没用上也加载，会很浪费资源。
<br>2.如果扩展点加载失败，连扩展点的名称都拿不到了。比如：JDK 标准的 ScriptEngine，通过 getName() 获取脚本类型的名称，但如果 RubyScriptEngine 因为所依赖的 jruby.jar 不存在，导致 RubyScriptEngine 类加载失败，这个失败原因被吃掉了，和 ruby 对应不起来，当用户执行 ruby 脚本时，会报不支持 ruby，而不是真正失败的原因。
<br>3.增加了对扩展点 IoC 和 AOP 的支持，一个扩展点可以直接 setter 注入其它扩展点。


**###### `dubbo的spi和jdk的spi有区别吗?`**
<br>Dubbo的扩展SPI： 
1. 单例，对于某个扩展，只会有一个ExtensionLoader； 
2. 延迟加载，可以一次只获取想要的扩展点，一次获取想要的扩展点实现； 
3. 对于扩展点的Ioc和Aop，就是一个扩展可以注入到另一个扩展中，也可以对一个扩展做wrap包装实现aop的功能； 
4. 对于扩展点的调用，真正调用的时候才能确认具体使用的是那个实现。


SPI组件在dubbo称为ExtensionLoader–扩展容器 
1.Extension 扩展点 
2.Wrapper 包装类 
3.Activate 激活点 
4.Adaptive 代理 
Adaptive的决策过程，最终还是会通过容器获得当次调用的扩展点来完成调用: 

JDK的spi要用for循环,然后if判断才能获取到指定的spi对象,dubbo用指定的key就可以获取。
```java_holder_method_tree
//返回指定名字的扩展
public T getExtension(String name){}
```
JDK的spi不支持默认值,dubbo增加了默认值的设计
```java_holder_method_tree
//@SPI("javassist")代表默认的spi对象,比如Compiler默认使用的是javassist,可通过
ExtensionLoader<Compiler> loader = ExtensionLoader.getExtensionLoader(Compiler.class);
compiler = loader.getDefaultExtension();
//方式获取实现类,根据配置,即为
//com.alibaba.dubbo.common.compiler.support.JavassistCompiler
```


<br>java spi :是上游产商给服务供应商提供的接口，供应商遵循接口契约提供自己的实现.。
提供了服务接口的一种实现之后，在jar包的META-INF/services/目录里同时创建一个以服务接口命名的文件。
该文件里就是实现该服务接口的具体实现类。而当外部程序装配这个模块的时候，就能通过该jar包META-INF/services/里的配置文件找到具体的实现类名，并装载实例化，完成模块的注入。 基于这样一个约定就能很好的找到服务接口的实现类，而不需要再代码里制定。简单来讲就是为某个接口寻找服务实现的机制。


<br>1.dubbo spi 可以通过getExtension（String key）的方法方便的获取某一个想要的扩展实现，java的SPI机制需要加载全部的实现类。
<br>2.对于扩展实现IOC依赖注入功能，如现在实现者A1含有setB()方法，会自动注入一个接口B的实现者，此时会注入一个动态生成的接口B的实现者B$Adpative