package com.esprit.tests;

import com.esprit.models.Reservation;
import com.esprit.models.Tab;
import com.esprit.models.Zones;
import com.esprit.services.ReservationService;
import com.esprit.services.TableService;
import com.esprit.services.ZonesService;
import com.esprit.utils.DataSource;

public class MainProg {

    public static void main(String[] args) {

        //******ZONES*****//

        ZonesService zs = new ZonesService() ;
        //zs.ajouter(new Zones("cafe", "justeboisson",15));
        //zs.modifier(new Zones(4, "resto", "plats",22));
        //zs.supprimer(new Zones(2, "cafe", "justeboisson",15));
        //System.out.println(zs.afficher());


        //******RESERVATION*****//

        ReservationService rs = new ReservationService();
       rs.ajouter(new Reservation(55, "restaurant",55));
        //rs.modifier(new Reservation(3, 8, "cocktail",14));
        //rs.supprimer(new Reservation(3, 8, "cocktail",14));
       //System.out.println(rs.afficher());


        //******TABLE*****//

        TableService ts = new TableService();
        //ts.ajouter(new Tab(8,4));
        //ts.modifier(new Tab(4,9,4));
        //ts.supprimer(new Tab(4,9,4));
        //System.out.println(ts.afficher());

    }
}
