/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestorelibri;

/**
 *
 * @author user
 */
public class GestoreLibri {

    public static void main(String[] args) {
        System.out.println("Benvenuto nel Gestore Libri");
        System.out.println("Test Prestiti");
        Libro l1;
        l1 = new Libro("Decameron", "Boccaccio",1982,1,2);
        System.out.println("Copie iniziali " +l1.getNcopie());
        Prestito p;
        p = new Prestito(l1,"cpsmhl1289hfole","25/09/2026",10);
        System.out.println("Disponibile?" + p.verificaDisponibilita());
        p.effettuaPrestito();
        System.out.println("In ritardo?" + p.isRitardo());
        System.out.println("Copie rimaste:" + l1.getNcopie());
        
        Prestito p2;
        p2 = new Prestito(l1,"aonibgfi23439h","25/08/2026",40);
        p2.effettuaPrestito();
        System.out.println("In ritardo?" + p2.isRitardo());
        System.out.println("Copie rimaste:" + l1.getNcopie());
        
        Prestito p3;
        p3 = new Prestito(l1,"oash2399h181j","12/08/2026",13);
        p3.effettuaPrestito();
        System.out.println("In ritardo?" + p3.isRitardo());
        System.out.println("Copie rimaste:" + l1.getNcopie());
        //restituisco un lbro
        System.out.println("Restituzione primo prestito");
        p.restituisciLibro();
        System.out.println("Copie disponibili:" + l1.getNcopie());
        System.out.println("Tentativo di doppia restituzione");
        p.restituisciLibro();
        System.out.println("Copie disponibili:" + l1.getNcopie());
        
    }   
    
}
