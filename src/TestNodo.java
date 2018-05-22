import static org.junit.Assert.*;

import org.junit.Test;
import java.time.LocalDate;
class TestNodo {

	@Test

	public void testCostruttoreNodo() 

	{

		Collaboratore c=new Collaboratore();

		nodo n=new nodo(c);

		assertTrue("Costruttore nodo", (n.getInfo().equals(c))==true &&n.getLink()==null);

	}

	

	@Test

	public void testSetInfo() 

	{

		Collaboratore c1=new Collaboratore();

		Collaboratore c2=new Collaboratore();

		nodo n=new nodo(c1);

		n.setInfo(c2);

		assertTrue("setInfo",(n.getInfo().equals(c2))==true && (n.getLink()==null));

	}

	

	@Test

	public void testSetLink() 

	{

		Collaboratore c1=new Collaboratore();

		Collaboratore c2=new Collaboratore();

		nodo n1=new nodo(c1);

		nodo n2=new nodo(c2);

		n1.setLink(n2);

		assertTrue("setLink",(n1.getInfo().equals(c1))==true &&n1.getLink()==n2);

	}

}
