package practice.interview.extend;
/**
 * 子类A继承父类B ，A a = new A() ;则父类 B 构造函数、父类B静态代码块、父类B非静态代码块、子类A
	构造函数、子类A静态代码块、子类A非静态代码块，执行的先后顺序是?
 * 结果：
 * 这是父类的静态代码块！
      这是子类的静态代码块！
      这是父类的非静态代码块！
      这是父类 的构造方法！
     这是子类的非静态代码块！
     这是子类的构造方法！
 * 父类的静态代码块->子类的静态代码块->父类的非静态代码块->父类 的构造方法 ->子类的非静态代码块 ->子类的构造方法
 * 静态代码最先，在类字节码加载时已有。
 *
 *   总结：静态代码块总是最先执行。
          非静态代码块跟非静态方法一样，跟对象有关。只不过非静态代码块在构造函数之前执行。
          父类非静态代码块、构造函数执行完毕后（相当于父类对象初始化完成）， 才开始执行子类的非静态代码块和构造函数。
 */
public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child child = new Child();
		Parrent par = new Child();
		
	}

}