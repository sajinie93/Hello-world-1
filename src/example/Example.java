class Example{
	public static void main(String args[]){
		Box b1=new Box();
		b1.setSize(12,5,3);
		b1.printVolume();
	}
}
class Box{
	int length;
	int width;
	int height;

	void setSize(int l, int w, int h){
		int length=l;
		int width=w;
		int height=h;
		length=l;
		width=w;
		height=h;
	}

	void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume is : "+volume);
	}
}
//------------------------------Demo.java----------------------------
