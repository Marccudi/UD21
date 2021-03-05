package junit.Geometria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import junit.Geometria.Geometria;

public class TestApp {

		@Test
		public void testareacuadrado() {
	        int resultado= Geometria.areacuadrado(4);
	        int esperado= 16;
	        assertEquals(resultado,esperado);
	    }
		


		@Test
		public void testAreaCirculo() {
			double res=Geometria.areaCirculo(8);
			double esp=201.06;
			double delta=0.5;
			assertEquals(res,esp,delta);
			
		}

		
		@Test
		public void testAreaRectangulo() {
	        int resultado= Geometria.arearectangulo(2,4);
	        int esperado= 8;
	        assertEquals(resultado,esperado);

		}
		

		@Test
		public void testAreaTriangulo() {
	        int resultado= Geometria.areatriangulo(4,2);
	        int esperado= 4;
	        assertEquals(resultado,esperado);

		}

		@Test
		public void testAreaPentagono() {
	        int resultado= Geometria.areapentagono(4,2);
	        int esperado= 4;
	        assertEquals(resultado,esperado);

		}

		
		@Test
		public void testAreaRombo() {
	        int resultado= Geometria.arearombo(4,4);
	        int esperado= 8;
	        assertEquals(resultado,esperado);

		}
		
		@Test
		public void testAreaRomboide() {
	        int resultado= Geometria.arearomboide(4,4);
	        int esperado= 16;
	        assertEquals(resultado,esperado);

		}
		
		@Test
		public void testAreaTrapecio() {
	        int resultado= Geometria.areatrapecio(4,4,4);
	        int esperado= 16;
	        assertEquals(resultado,esperado);

		}
//		
		@Test
		public void testFigura() {
	        String resultado= Geometria.figura(1);
	        String esperado= "cuadrado";
	        assertEquals(resultado,esperado);
		}
//		@Test
//		public void testFigura2() {
//	        String resultado= Geometria.figura(2);
//	        String esperado= "cuadrado";
//	        assertEquals(resultado,esperado);
//		}
		
		@Test
		public void testGetId() {
			Geometria resultado=new Geometria(1);
			int esperado =1;
			assertEquals(resultado.getId(), esperado);
		}
		@Test
		public void testSetId() {
			Geometria resultado=new Geometria(1);
			resultado.setId(2);
			int esperado =2;
			assertEquals(resultado.getId(), esperado);
		}
		@Test
		public void testGetNom() {
			Geometria resultado=new Geometria(1);
			String esperado ="cuadrado";
			assertEquals(resultado.getNom(), esperado);
		}
		@Test
		public void testSetNom() {
			Geometria resultado=new Geometria(2);
			resultado.setNom("cuadrado");
			String esperado ="cuadrado";
			assertEquals(resultado.getNom(), esperado);
		}
		
		@Test
		public void testGetArea() {
			Geometria resultado=new Geometria(1);
			resultado.setArea(resultado.areacuadrado(2));
			double esperado=4;
			assertEquals(resultado.getArea(), esperado);
		}
		
		@Test
		public void testSetArea() {
			Geometria resultado=new Geometria(1);
			resultado.setArea(resultado.areacuadrado(2));
			double esperado=4;
			assertEquals(resultado.getArea(), esperado);
		}
		
		@Test
		public void testToString() {
			Geometria resultado=new Geometria(1);
			resultado.setArea(resultado.areacuadrado(2));
			String res=resultado.toString();
			String id=""+resultado.getId();
			String nom=""+resultado.getNom();
			String area=""+resultado.getArea();
			String esperado="Geometria [id=" + id + ", nom=" + nom + ", area=" + area + "]";
			assertEquals(resultado.toString(), esperado);
		}
		@Test
		public void testFigura2() {
			Geometria resultado=new Geometria(2);
			String esperado="Circulo";
			assertEquals(resultado.getNom(), esperado);
		}
		@Test
		public void testFigura3() {
			Geometria resultado=new Geometria(3);
			String esperado="Triangulo";
			assertEquals(resultado.getNom(), esperado);
		}
		@Test
		public void testFigura4() {
			Geometria resultado=new Geometria(4);
			String esperado="Rectangulo";
			assertEquals(resultado.getNom(), esperado);
		}
		@Test
		public void testFigura5() {
			Geometria resultado=new Geometria(5);
			String esperado="Pentagono";
			assertEquals(resultado.getNom(), esperado);
		}
		@Test
		public void testFigura6() {
			Geometria resultado=new Geometria(6);
			String esperado="Rombo";
			assertEquals(resultado.getNom(), esperado);
		}
		@Test
		public void testFigura7() {
			Geometria resultado=new Geometria(7);
			String esperado="Romboide";
			assertEquals(resultado.getNom(), esperado);
		}
		@Test
		public void testFigura8() {
			Geometria resultado=new Geometria(8);
			String esperado="Trapecio";
			assertEquals(resultado.getNom(), esperado);
		}
		@Test
		public void testFigura9() {
			Geometria resultado=new Geometria();
			String esperado="Default";
			assertEquals(resultado.getNom(), esperado);
		}
		
		@Test
		public void testFigura10() {
			Geometria a= new Geometria();
			String resultado=a.figura(0);
			String esperado="Default";
			
			
			assertEquals(resultado, esperado);
		}







		
}
