package designPatternsFor23.decoratorPattern;
/**
 * 实现接口的实体类
 */
public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Shape: Circle...");
	}

}
