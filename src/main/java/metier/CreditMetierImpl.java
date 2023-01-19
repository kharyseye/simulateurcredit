package metier;

public class CreditMetierImpl implements ICreditMetier {

	@Override
	public double calculMensualite(double c, double taux, int duree) {
		double t = taux/100;
		double numerateur = (c*t/12);
		double denominateur = 1 - Math.pow((1+t/12), -duree);
		return numerateur/denominateur;
	}

}
