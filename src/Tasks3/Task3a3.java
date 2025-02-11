package Tasks3;

public class Task3a3 {
    public static boolean collinearity(int x1, int y1, int x2, int y2) {
    
        int a;
        
    
        if (x1 == 0 && y1 == 0 || x2 == 0 && y2 == 0) {
            return true;
        }else if (y1 == 0 && y2 == 0) {
            return false;
        }
        if (x1 == 0 || x2 == 0) {
            return false;
        }else if (y1 == 0 || y2 == 0) {
            return false;
        }
        
        
        if (x1 * y2 == x2 * y1) {
            return true;
        }
    
        
        
        return false;
      }
}
