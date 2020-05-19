import org.apache.commons.math3.util.FastMath;

public class Math {

  public static float sqrt(float x) {
    return (float) FastMath.sqrt(x);
  }
  
  public static float power(float base, float exp) {
    return (float) FastMath.pow(base, exp);
  }
  
  public static float exp(float x) {
    return (float) FastMath.exp(x);
  }
  
  public static float ln(float x) {
    return (float) FastMath.log(x);
  }
  
  public static float log(float x, float base) {
    return (float) ln(x) / ln(base);
  }
  
  public static float round(float x) {
    return (float) FastMath.round(x);
  }
  
  public static float sin(float x) {
    return (float) FastMath.sin(x);
  }
  
  public static float cos(float x) {
    return (float) FastMath.cos(x);
  }
  
  public static float tan(float x) {
    return (float) FastMath.tan(x);
  }
  
  public static float arcsin(float x) {
    return (float) FastMath.asin(x);
  }
  
  public static float arccos(float x) {
    return (float) FastMath.acos(x);
  }
  
  public static float arctan(float x) {
    return (float) FastMath.atan(x);
  }
  
  public static float arctan2(float y, float x) {
    return (float) FastMath.atan2(y, x);
  }
  
  public static float sinh(float x) {
    return (float) FastMath.sinh(x);
  }
  
  public static float cosh(float x) {
    return (float) FastMath.cosh(x);
  }
  
  public static float tanh(float x) {
    return (float) FastMath.tanh(x);
  }
  
  public static float arcsinh(float x) {
    return (float) FastMath.asinh(x);
  }
  
  public static float arccosh(float x) {
    return (float) FastMath.acosh(x);
  }
  
  public static float arctanh(float x) {
    return (float) FastMath.atanh(x);
  }

}