public class Line {

  private double epsilon = 0.000001;
  public double slope;
  public double yintercept;

  public Line(double s, double y){
    this.slope = s;
    this.yintercept = y;
  }

  public boolean Intersect(Line line2){
    return Math.abs(this.slope - line2.slope) > epsilon || Math.abs(this.yintercept - line2.yintercept) < epsilon;
  }
}
