package creational.abstract_factory;

public abstract class Widget {

	private String widget_type;
	private String widget_name;
	private double widget_production_cost;
	
	public String getWidget_name() {
		return widget_name;
	}

	public void setWidget_name(String widget_name) {
		this.widget_name = widget_name;
	}

	public double getWidget_production_cost() {
		return widget_production_cost;
	}

	public void setWidget_production_cost(double widget_production_cost) {
		this.widget_production_cost = widget_production_cost;
	}

	public String getWidget_type() {
		return widget_type;
	}

	public void setWidget_type(String widget_type) {
		this.widget_type = widget_type;
	}
}
