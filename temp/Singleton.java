//单列模式：懒汉式
public class singleton{
	private static singleton instance = new singleton();
	private  singleton(){}
	public static singleton getInstance(){
		return instance;
	}
}

//饿汉式 线程不安全
public class Singleton{
	private static Singleton instance;
	private Singleton() {}
	public static Singleton getInstance(){
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
//饿汉式 线程安全
public class Singleton{
	private static Singleton instance;
	private Singleton() {}
	public static synchronized Singleton getInstance(){
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

public class Singleton{
	private volatile static Singleton instance;
	private Singleton() {}
	public static Singleton getInstance(){
		if(instance == null) {
			synchronized(Singleton.class){
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}