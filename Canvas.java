class Canvas{
	List<Point> points;

	public void Canvas(){
		points=new LinkedList<>();
	}

	public void addPoint(Point point){
		points.add(point);
	}

	public void removePoint(Point point){
		points.remove(point);
	}
}