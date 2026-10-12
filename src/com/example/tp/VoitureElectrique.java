package com.example.tp;

public class VoitureElectrique extends Motorise {

//  the constructor by using source
	public VoitureElectrique(String modele, Moteur moteur, double niveauCarburant) {
		super(modele, moteur, niveauCarburant);
	}

	@Override
	public void refuel(double kWh) {
		niveauCarburant += kWh;
		System.out.println(modele + " le recharge " + kWh + " kWh (niveau:" + niveauCarburant + ")");
	}

	@Override
	public String toString() {
	    return super.toString().replace("carburant", "batterie") + " {Electrique}";
	}
}
