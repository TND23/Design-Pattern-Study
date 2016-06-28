package creational.abstract_factory;

import java.util.ArrayList;

// represents a factory that produces widgets that is based in the East Coast
public class EastCoastWidgetFactory implements AbstractFactory{

	private ArrayList<Widget> widgets = new ArrayList<Widget>();
	public EastCoastWidgetFactory(String widget_type) {
		widget_type = widget_type.toLowerCase();
		if(widget_type == "a"){
			this.widgets.add(createWidgetOne());
		}
		if(widget_type == "b"){
			this.widgets.add(createWidgetTwo());
		}
		if(widget_type == "c"){
			this.widgets.add(createWidgetThree());
		}
		if(widget_type == "d"){
			System.out.println("We don't make d-type widgets on the East coast.");
		}
	}
	
	public Widget createWidgetOne() {
		return new WidgetA();
	}

	public Widget createWidgetTwo() {
		return new WidgetB();		
	}
	
	public Widget createWidgetThree() {
		return new WidgetC();		
	}
	
	

}
