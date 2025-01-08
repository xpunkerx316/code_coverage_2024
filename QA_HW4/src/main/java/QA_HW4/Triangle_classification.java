package QA_HW4;

public class Triangle_classification {
	
	enum Triangle_Types {
		  equilateral,
		  isosceles,
		  Scalene,
		  Nottriangle,
	    ERROR
	    
		} 

	
	
	public static String classifyTriangle(int a, int b, int c) {
	    Triangle_Types triangle = Triangle_Types.Nottriangle; 

	    if (c < a + b) {
	        if (b < a + c) {
	            if (a < b + c) {
	                if (a == b) {
	                    if (b == c) {
	                       triangle = Triangle_Types.equilateral;
	                        }
	                    else triangle = Triangle_Types.isosceles;
	                }
	                else if (b==c){
	                  triangle = Triangle_Types.isosceles;
	                }
	                else if (a==c) triangle = Triangle_Types.isosceles;
	                else triangle= Triangle_Types.Scalene;
	              
	            } 
	        }
	    }

	    return triangle.toString();
	}


}
