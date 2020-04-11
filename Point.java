class Point {
	String id
	double x,y;
	String color;
	//TODO add new variable

	//TODO constructor
	public void Point(String id,double x,double y,String color){
		this.id=id;
		this.x=x;
		this.y=y;
		this.color=color;
	}
	//TODO setters and getters
	public void setId(String id){
		this.id=id;
	}
	public void setX(double x){
		this.x=x;
	}
	public void setY(double y){
		this.y=y;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getId(){
		return this.id;
	}
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	public String getColor(){
		return this.color;
	}

	public void move (char xDirection, char yDirection) {
		//TODO
		if (xDirection=='L') {
			this.x-=1;
		}
		 if(xDirection=='R'){
			this.x+=1;
		}
		if (yDirection=='U') {
			this.y+=1;
		}
		if (yDirection=='D') {
			this.y-=1;
		}

	}

	public void draw () {
		//TODO
		System.out.println(x+","+y);
	}



}