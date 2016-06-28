package creational.abstract_factory;

import java.util.ArrayList;

public class WestCoastWidgetFactory implements AbstractFactory{
	
	private ArrayList<Widget> widgets = new ArrayList<Widget>();
	public WestCoastWidgetFactory(String widget_type) {
		if(widget_type == "a"){
			this.widgets.add(createWidgetOne());
		}
		if(widget_type == "b"){
			this.widgets.add(createWidgetTwo());
		}
		if(widget_type == "c"){
			System.out.println("We don't make c-type widgets on the West coast.");
		}
		if(widget_type == "d"){
			this.widgets.add(createWidgetThree());
		}
	}
	
	public Widget createWidgetOne() {
		return new WidgetA();
	}

	public Widget createWidgetTwo() {
		return new WidgetB();
	}

	public Widget createWidgetThree() {
		return new WidgetD();
	}
	
}
