package com.rayoy.bookcode.chapter7.sample1;

/**
 * 非主动使用类字段演示
 **/
public class NotInitialization {

    public static void main(String[] args) {
        System.out.println(SubClass.svalue);
        /*
        输出结果:
			SuperClass init!
			123

		原因:对于静态字段,只有"直接定义"这个字段的类才会被初始化,因此通过其子类来引用父类中定义的静态字段,指挥触发父类的初始化而不会触发子类的初始化.
		Sun HosSpot 虚拟机可以通过 -XX:+TraceClassLoading 参数来观察子类的加载
		 */
    }

}