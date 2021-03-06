package designPattern.chapter06.prototype;

public interface Product extends Cloneable {

	public abstract void use(String s);

	public abstract Product createClone();
}
