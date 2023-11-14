import java.util.ArrayList;
/*
public class Line {
    //реализуйте получение стартовой точки, конечной, toString() в формате: [x, y], [x1, y1], GetLength() и hasPoint()
    private final Point start;
    private final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double getLength(){
        return start.getDistance(end);
    }

    public boolean hasPoint(Point p){
        var length = getLength();
        var distanceToStart = start.getDistance(p);
        var distanceToEnd = p.getDistance(end);

        return Math.abs(length - (distanceToStart + distanceToEnd)) <= 0.000001;
    }

    public Point getStartPoint() {
        return start;
    }

    public Point getEndPoint() {
        return end;
    }
}

public class Point {
    //реализуйте геттеры, конструктор и метод toString() в формате:[x, y]
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDistance(Point p2) {
        //реализуйте метод getDistance
        var dx = x - p2.x;
        var dy = y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}

public class PolygonalLine {
    private ArrayList<Point> pointsList;

    public double getLength()
    {
        var length = 0;
        for (var i = 0; i < pointsList.size() - 1; i++) {
            length += pointsList.get(i).getDistance(pointsList.get(i + 1));
        }
        return length;
    }

    public void addPoint(Point p){
        pointsList.add(p);
    }

    public void setPoints(ArrayList<Line> lines){
        pointsList = new ArrayList<Point>();
        for (Line line : lines) {
            pointsList.add(line.getStartPoint());
        }
        pointsList.add(lines.get(lines.size() - 1).getEndPoint());
    }
}
 */