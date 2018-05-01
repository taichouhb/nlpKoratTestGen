import korat.finitization.IFinitization;
import korat.finitization.IIntSet;
import korat.finitization.IObjSet;
import korat.finitization.impl.FinitizationFactory;
import korat.finitization.IDoubleSet;


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

  @Override
  public String toString(){
    return "slope: " + slope + ", yintercept: " + yintercept + ", epsilon:" + epsilon;  
  }

  public boolean repOK(){
    return epsilon<0.01;
  }
  public static IFinitization finLine(int size){
  IFinitization f = FinitizationFactory.create(Line.class);
IObjSet lineSet = f.createObjSet(Line.class, true);
lineSet.addClassDomain(f.createClassDomain(Line.class, size));
IDoubleSet doubleSet = f.createDoubleSet(0, size);
f.set("epsilon", doubleSet);
f.set("slope", doubleSet);
f.set("yintercept", doubleSet);


return f;
}

}
