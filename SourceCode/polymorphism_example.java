public class Util {

  public static boolean isEmpty(Object obj){
    if (null == obj){
      return true;
    }
    return false;
  }
  
  public static boolean isEmpty(String s){
    if (null == s || 0 == s.length()){
      return true;
    }
    
    return false;
  }

}
