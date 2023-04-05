package struts.demo;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public final class DemoStrutsExample5 extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private List<String> colors,fruits;
	
	private String[] favColor,favFruit;
	
	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public List<String> getFruits() {
		return fruits;
	}

	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}

	public String[] getFavColor() {
		return favColor;
	}

	public void setFavColor(String[] favColor) {
		this.favColor = favColor;
	}

	public String[] getFavFruit() {
		return favFruit;
	}

	public void setFavFruit(String[] favFruit) {
		this.favFruit = favFruit;
	}

	public DemoStrutsExample5(){
		}
	
	public String[] getDefaultColors(){
		return new String[]{"BLUE","BLACK"};
	}
	
	public String[] getDefaultFruits(){
		return new String[]{"MANGO","APPLE"};
	}
	
	public String execute(){
		return SUCCESS;
	}
	
	public String display(){
		colors = new ArrayList<String>();
		colors.add("BLUE");
		colors.add("GREEN");
		colors.add("ORANGE");
		colors.add("BLACK");
		colors.add("RED");
		
		fruits = new ArrayList<String>();
		fruits.add("MANGO");
		fruits.add("APPLE");
		fruits.add("BANANA");
		fruits.add("PINEAPPLE");
		fruits.add("STRAWBERRY");
		fruits.add("GUAVA");
	
		return NONE;
	}
	
}
