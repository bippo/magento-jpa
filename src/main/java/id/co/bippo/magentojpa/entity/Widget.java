package id.co.bippo.magentojpa.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the widget database table.
 * 
 */
@Entity
@Table(name="widget")
public class Widget implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="widget_id")
	private int widgetId;

    @Lob()
	private String parameters;

	@Column(name="widget_code")
	private String widgetCode;

	@Column(name="widget_type")
	private String widgetType;

    public Widget() {
    }

	public int getWidgetId() {
		return this.widgetId;
	}

	public void setWidgetId(int widgetId) {
		this.widgetId = widgetId;
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getWidgetCode() {
		return this.widgetCode;
	}

	public void setWidgetCode(String widgetCode) {
		this.widgetCode = widgetCode;
	}

	public String getWidgetType() {
		return this.widgetType;
	}

	public void setWidgetType(String widgetType) {
		this.widgetType = widgetType;
	}

}