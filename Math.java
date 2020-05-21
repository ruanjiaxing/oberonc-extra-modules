public class Math {

  public static float sqrt(float x) {
    return (float) java.lang.Math.sqrt(x);
  }
  
  public static float power(float base, float exp) {
    return (float) java.lang.Math.pow(base, exp);
  }
  
  public static float exp(float x) {
    return (float) java.lang.Math.exp(x);
  }
  
  public static float ln(float x) {
    return (float) java.lang.Math.log(x);
  }
  
  public static float log(float x, float base) {
    return (float) ln(x) / ln(base);
  }
  
  public static float round(float x) {
    return (float) java.lang.Math.round(x);
  }
  
  public static float sin(float x) {
    return (float) java.lang.Math.sin(x);
  }
  
  public static float cos(float x) {
    return (float) java.lang.Math.cos(x);
  }
  
  public static float tan(float x) {
    return (float) java.lang.Math.tan(x);
  }
  
  public static float arcsin(float x) {
    return (float) java.lang.Math.asin(x);
  }
  
  public static float arccos(float x) {
    return (float) java.lang.Math.acos(x);
  }
  
  public static float arctan(float x) {
    return (float) java.lang.Math.atan(x);
  }
  
  public static float arctan2(float y, float x) {
    return (float) java.lang.Math.atan2(y, x);
  }
  
  public static float sinh(float x) {
    return (float) java.lang.Math.sinh(x);
  }
  
  public static float cosh(float x) {
    return (float) java.lang.Math.cosh(x);
  }
  
  public static float tanh(float x) {
    return (float) java.lang.Math.tanh(x);
  }
  
  public static float arcsinh(float x) {
    return (float) ln(x + sqrt(x*x + 1));
  }
  
  public static float arccosh(float x) {
    return (float) ln(x + sqrt(x*x + 1));
  }
  
  public static float arctanh(float x) {
  	double absAtanh = 0.5*ln((1 + x)/(1 - x));
    if(x < 0) return (float) -absAtanh;
    else return (float) absAtanh;
  }

}