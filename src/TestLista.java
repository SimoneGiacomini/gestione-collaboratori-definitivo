import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import java.io.IOException;


class TestLista {

	
	
	@Test

	public void testCostruttoreLista() 

	{

		Lista l=new Lista();

		assertTrue("Costruttore Lista",l.getHead()==null && l.getElementi()==0);
	}
	
	/*test commentato perche' il metodo e' privato

	@Test

	public void testCreaNodo() 

	{

		Lista l=new Lista();

		Collaboratore c1=new Collaboratore();

		Collaboratore c2=new Collaboratore();

		nodo n1=new nodo(c1);

		Nodo n2=s.creaNodo(c2, n1);

		assertTrue("Crea Nodo",n2.getInfo().equals(p2) && n2.getLink()==n1);

	}*/

	@Test

	public void testAggiungiCollaboratore() 

	{

		Lista l=new Lista();

		Collaboratore c1=new Collaboratore();

		l.inserisciCollaboratore(c1);

		assertTrue("Aggiungi Collaboratore alla Lista",l.getHead().getInfo()==c1 && l.getElementi()==1);

	}

	@Test

	public void testElimina() throws ListaException 

	{

		Lista l=new Lista();

		Collaboratore c1=new Collaboratore();

		Collaboratore c2=new Collaboratore();

		l.inserisciCollaboratore(c1);

		l.inserisciCollaboratore(c2);

		assertTrue("Elimina Collaboratore in Coda",l.eliminaInCoda()==l.);

	}







}
