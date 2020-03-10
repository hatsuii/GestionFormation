package eu.ensup.demoFormation.service;

import java.util.List;

import javax.jws.WebService;

import eu.ensup.demoFormation.dao.FormationDao;
import eu.ensup.demoFormation.domaine.Formation;

@WebService(endpointInterface = "eu.ensup.demoFormation.service.IFormationService")
public class FormationService implements IFormationService {

	private FormationDao formationdao;

	public FormationService() {
		formationdao = new FormationDao();
	}

	@Override
	public boolean creationFormation(Formation pFormation) {
		return formationdao.create(pFormation);
	}

	@Override
	public Formation lireFormation(long idFormation) {
		return formationdao.read(idFormation);
	}

	@Override
	public List<Formation> lireTouteFormation() {

		return formationdao.getAll();
	}

	@Override
	public Formation modifierFormation(Formation pFormation, long idFormation) {
		return formationdao.update(pFormation, idFormation);
	}

	@Override
	public boolean supprimerFormation(long idFormation) {
		return formationdao.delete(idFormation);
	}

	public void closeemf() {
		formationdao.closeEM();
	}


}
