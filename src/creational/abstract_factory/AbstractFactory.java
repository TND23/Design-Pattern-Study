package creational.abstract_factory;

// interface for other factories
public interface AbstractFactory {

	// all factories must implement the following methods
	public Widget createWidgetOne();
	public Widget createWidgetTwo();
	public Widget createWidgetThree();
	
}
