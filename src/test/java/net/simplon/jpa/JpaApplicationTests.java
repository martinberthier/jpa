package net.simplon.jpa;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import net.simplon.jpa.domain.model.IPaysRepository;
import net.simplon.jpa.domain.model.IPersonneRepository;
import net.simplon.jpa.domain.model.Pays;
import net.simplon.jpa.domain.model.Personne;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {
	
	@Autowired
	IPaysRepository pays;
	
	@Autowired
	IPersonneRepository personne;
	
	
	@Test
	public void contextLoads() {
		Pays france = new Pays("France");
		pays.save(france);
		Pays espagne = new Pays("Espagne");
		pays.save(espagne);
		
		Personne bob = new Personne("Bob","Bobby",france);
		Personne babette = new Personne("Babette","Bebette",espagne);
		personne.save(bob);
		personne.save(babette);
		
	}

}

