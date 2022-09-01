package com.javatraining;
class Shap {
    private String color;
    private boolean filled;

    public Shap() {       
        color = "black";
        filled = true;
    }

    public Shap(String color, boolean filled) { //create a constructor
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {  //create  a method.
        if(this.filled==true)     //logic
        {
        	return "shap with colour " +this.color+" and filled";
        }
        else
        {
        	return "shap with colour " +this.color+" and not filled";
        	
        }
    }
  // abstract double getarea();  //it is not possible to create abstract class
   
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Shap s = new Shap();
        

	}

}
class Circle extends Shap
{
	double getarea()
	{
		return 0;
	}
}
class Rectagle extends Shap
{
	int length;
	int width;
	public Rectagle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	double getarea()
	{
		return 0;
	}
	
}
class Square extends Rectagle
{
	Square()
	{
		super(10,10);
		System.out.println("length :- "+super.length);
		System.out.println("width :-"+super.width);
	}
	public static void main(String args[])
	{
		Square s = new Square();
		if(s.length==s.width)
		{
			System.out.println("this rec class is square");
		}
	}
}
