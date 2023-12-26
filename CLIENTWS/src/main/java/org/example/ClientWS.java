package org.example;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy= new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDH(16));
        Compte cp = proxy.getCompte(6);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        System.out.println(cp.getDateCreation());
        List<Compte> compteList = proxy.listCompte();
        for (Compte c: compteList){
             System.out.println("Code= "+c.getCode());
             System.out.println("Solde= "+c.getSolde());
             System.out.println("Date Création= "+c.getDateCreation());
        }g
    }


}
