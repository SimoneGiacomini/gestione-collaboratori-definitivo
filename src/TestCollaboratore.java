import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;



public class TestCollaboratore 

{

	@Test

	public void testCostruttoreCollaboratore () 

	{
		LocalDate d = null;
		d.of(1, 1, 1);
		
		Collaboratore  p=new Collaboratore (1,"Simone","Babysitter",d);

		assertTrue("Costruttore principale Collaboratore",p.getCodiceIdentificativo()==1 && p.getNome().compareTo("Simone")==0 && p.getServizio().compareTo("Babysitter")==0 && p.getData()==d);

	}
	
	@Test

	public void testCostruttoreCollaboratoreDefault() 

	{

		Collaboratore p=new Collaboratore();

		assertTrue("Costruttore di default Collaboratore",p.getCodiceIdentificativo()==-1 && p.getNome()==null && p.getServizio()==null && p.getData()==null);

	}
	
	@Test

	public void testSetID() 

	{

		Collaboratore p=new Collaboratore();

		p.setCodiceIdentificativo(1);

		assertTrue("SET ID",p.getCodiceIdentificativo()==1);

	}
	
	@Test

	public void testSetNome() 

	{

		Collaboratore p=new Collaboratore();

		p.setNome("nome");

		assertTrue("setNome",p.getNome().compareTo("nome")==0);

	}

	

	@Test

	public void testSetServizi() 

	{

		Collaboratore p=new Collaboratore();

		p.setServizio("servizio");

		assertTrue("setServizio",p.getServizio().compareTo("servizio")==0);

	}
	
	@Test

	public void testSetData() 

	{

		Collaboratore p=new Collaboratore();
		LocalDate d = null, d1=null;
		
		d.of(1, 1, 1);
		d1=(d);
		p.setData(d);

		assertTrue("setData",p.getData()==d1);

	}
	
	@Test

	public void testToString() 

	{

		LocalDate data1=LocalDate.of(1, 1, 2000);

		Collaboratore p=new Collaboratore (1,"Simone","Colf",data1);

		assertTrue("ToString",p.toString().compareTo(p.getCodiceIdentificativo()+"; "+p.getNome()+"; "+p.getServizio()+"; "+p.getData())==0);

	}
	
	}

	
