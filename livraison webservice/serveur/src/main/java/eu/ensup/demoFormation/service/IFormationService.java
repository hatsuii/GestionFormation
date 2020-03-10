package eu.ensup.demoFormation.service;

import java.util.List;

import javax.jws.WebService;

import eu.ensup.demoFormation.domaine.Formation;

@WebService
public interface IFormationService {

	public boolean creationFormation(Formation pFormation);

	public Formation lireFormation(long idFormation);

	public List<Formation> lireTouteFormation();

	public Formation modifierFormation(Formation pFormation, long idFormation);

	public boolean supprimerFormation(long idFormation);
}
