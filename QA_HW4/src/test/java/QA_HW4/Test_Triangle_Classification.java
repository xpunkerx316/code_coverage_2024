package QA_HW4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import QA_HW4.Triangle_classification;
import QA_HW4.Triangle_classification.Triangle_Types;


/**
 * Fadi Marjieh - 312312861
 * Steve Evtushenko - 315914671
 */

public class Test_Triangle_Classification {
	
	Triangle_classification triangle = new Triangle_classification();
	
	 @Test
	    public void test_1() {
	        int a = 3, b = 2, c = 7; // Not a triangle
	        String result = triangle.classifyTriangle(a, b, c);
	        String expected = Triangle_Types.Nottriangle.toString();

	        assertEquals(expected, result);
	    }

	    @Test
	    public void test_2() {
	        int a = 3, b = 3, c = 3; // Equilateral triangle
	        String result = triangle.classifyTriangle(a, b, c);
	        String expected = Triangle_Types.equilateral.toString();

	        assertEquals(expected, result);
	    }

	    @Test
	    public void test_3() {
	        int a = 3, b = 3, c = 5; // Isosceles triangle (a == b)
	        String result = triangle.classifyTriangle(a, b, c);
	        String expected = Triangle_Types.isosceles.toString();

	        assertEquals(expected, result);
	    }

	    @Test
	    public void test_4() {
	        int a = 3, b = 5, c = 5; // Isosceles triangle (b == c)
	        String result = triangle.classifyTriangle(a, b, c);
	        String expected = Triangle_Types.isosceles.toString();

	        assertEquals(expected, result);
	    }

	    @Test
	    public void test_5() {
	        int a = 5, b = 3, c = 5; // Isosceles triangle (a == c)
	        String result = triangle.classifyTriangle(a, b, c);
	        String expected = Triangle_Types.isosceles.toString();

	        assertEquals(expected, result);
	    }

	    @Test
	    public void test_6() {
	        int a = 4, b = 5, c = 6; // Scalene triangle
	        String result = triangle.classifyTriangle(a, b, c);
	        String expected = Triangle_Types.Scalene.toString();

	        assertEquals(expected, result);
	    }
	    
		 @Test
		    public void test_7() {
		        int a = 7, b = 3, c = 2; // Not a triangle
		        String result = triangle.classifyTriangle(a, b, c);
		        String expected = Triangle_Types.Nottriangle.toString();

		        assertEquals(expected, result);
		    }
		 
		 @Test
		    public void test_8() {
		        int a = 3, b = 7, c = 2; // Not a triangle
		        String result = triangle.classifyTriangle(a, b, c);
		        String expected = Triangle_Types.Nottriangle.toString();

		        assertEquals(expected, result);
		    }
	
	}
