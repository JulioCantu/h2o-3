package ai.h2o.cascade.stdlib.math;

import ai.h2o.cascade.core.GhostFrame;
import org.apache.commons.math3.util.FastMath;

/**
 * Hyperbolic sine function
 */
@SuppressWarnings("unused")  // loaded from StandardLibrary
public class FnSinh extends FnUniOp {

  public double apply(double x) {
    return FastMath.sinh(x);
  }

  public GhostFrame apply(GhostFrame frame) {
    return new NumericUniOpFrame(frame, SINH);
  }


  private static SinhSpec SINH = new SinhSpec();
  private static class SinhSpec extends UniOpSpec {
    public SinhSpec() {}
    @Override public String name() { return "sinh"; }
    @Override public double apply(double x) { return FastMath.sinh(x); }
  }
}