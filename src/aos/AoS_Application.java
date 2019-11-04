package aos;

import java.util.Scanner;

/* This application can calculate the sanitary sewage flow 
 * needed for your polish publish health project.
 * This program can sum up all flow units and
 * give us the exact result.
 * Calculations are based on polish standards PN–92/B–01707. 
 * -----------------------------------------------
 * --- AoS Application - Marcin Godlewski 2019 ---
 * ----------------------------------------------- */

public class AoS_Application {

	public static void main(String[] args) {
		int k05wb, k05bi, k05ur, k05wc, k05sh, k05bt, k05si, k05wa, k05bdi, k05ndi, k05f75, k05f110;
		int k07wb, k07bi, k07ur, k07wc, k07sh, k07bt, k07si, k07wa, k07bdi, k07ndi, k07f75, k07f110;
		int k10wb, k10bi, k10ur, k10wc, k10sh, k10bt, k10si, k10wa, k10bdi, k10ndi, k10f75, k10f110;
		int k12wb, k12bi, k12ur, k12wc, k12sh, k12bt, k12si, k12wa, k12bdi, k12ndi, k12f75, k12f110;
		int option;
		float sum05, summ05, sum07, summ07, sum10, summ10, sum12, summ12;
		
		System.out.println("Program calculating the sanitary sewage flow.");
		System.out.println("Please choose characteristic outflow K:");
		System.out.println("Enter '1' for K = 0.5 l/s -> flats, offices");
		System.out.println("Enter '2' for K = 0.7 l/s -> hotels, hospitals, schools");
		System.out.println("Enter '3' for K = 1.0 l/s -> public toilets, showers");
		System.out.println("Enter '4' for K = 1.2 l/s -> laboratories");
		@SuppressWarnings("resource")
		Scanner scanOption = new Scanner(System.in);
        	option = scanOption.nextInt();
		
		switch (option) {
        	case 1:
		    System.out.println("Your choice: K = 0,5 l/s -> flats, offices");
		    System.out.println("Now you have to enter amount of sanitary wares: ");
		    System.out.print("[q = 0.5 l/s] Washbasins: ");
			Scanner scanK05Washbasins = new Scanner(System.in);
		    k05wb = scanK05Washbasins.nextInt();  
		    System.out.print("[q = 0.5 l/s] Bidets: ");
			Scanner scanK05Bidets = new Scanner(System.in);
		    k05bi = scanK05Bidets.nextInt(); 
		    System.out.print("[q = 0.5 l/s] Urinals: ");
			Scanner scanK05Urinals = new Scanner(System.in);
		    k05ur = scanK05Urinals.nextInt(); 
		    System.out.print("[q = 2.5 l/s] WC: ");
			Scanner scanK05WC = new Scanner(System.in);
		    k05wc = scanK05WC.nextInt(); 
		    System.out.print("[q = 1.0 l/s] Showers: ");
			Scanner scanK05Showers = new Scanner(System.in);
		    k05sh = scanK05Showers.nextInt();
		    System.out.print("[q = 1.0 l/s] Bathtubs: ");
			Scanner scanK05Bathtubs = new Scanner(System.in);
		    k05bt = scanK05Bathtubs.nextInt();
		    System.out.print("[q = 1.0 l/s] Sinks: ");
			Scanner scanK05Sinks = new Scanner(System.in);
		    k05si = scanK05Sinks.nextInt();
		    System.out.print("[q = 1.0 l/s] Washmachines: ");
			Scanner scanK05Washmachines = new Scanner(System.in);
		    k05wa = scanK05Washmachines.nextInt();
		    System.out.print("[q = 2.0 l/s] Big/Large Dishmachines: ");
			Scanner scanK05BigDishmachines = new Scanner(System.in);
		    k05bdi = scanK05BigDishmachines.nextInt();
		    System.out.print("[q = 1.0 l/s] Normal Dishmachines: ");
			Scanner scanK05NormalDishmachines = new Scanner(System.in);
		    k05ndi = scanK05NormalDishmachines.nextInt();
		    System.out.print("[q = 1.5 l/s] Floor drains fi75: ");
			Scanner scanK05FloorDrains75 = new Scanner(System.in);
		    k05f75 = scanK05FloorDrains75.nextInt();
		    System.out.print("[q = 2.0 l/s] Floor drains fi110: ");
			Scanner scanK05FloorDrains110 = new Scanner(System.in);
		    k05f110 = scanK05FloorDrains110.nextInt();
		    sum05 = (float) ((k05wb * 0.5) + (k05bi * 0.5) + (k05ur * 0.5) + (k05wc * 2.5) +
				(k05sh * 1.0) + (k05bt * 1.0) + (k05si * 1.0) + (k05wa * 1.0) + 
				(k05bdi * 2.0) + (k05ndi * 1.0) + (k05f75 * 1.5) + (k05f110 * 2.0));
		    System.out.println("The sum of characteristic outflows is = " + sum05 + " l/s.");
		    System.out.println("Characteristic outflow K = 0.5 l/s.");
		    summ05 = (float) (0.5 * Math.sqrt(sum05));
		    System.out.println("Sanitary sewage flow = " + summ05 + " l/s."); 
       		break;
        	case 2:
		    System.out.println("Your choice: K = 0.7 l/s -> hotels, hospitals, schools");
		    System.out.println("Now you have to enter amount of sanitary wares: ");
		    System.out.print("[q = 0.5 l/s] Washbasins: ");
			Scanner scanK07Washbasins = new Scanner(System.in);
		    k07wb = scanK07Washbasins.nextInt();  
		    System.out.print("[q = 0.5 l/s] Bidets: ");
			Scanner scanK07Bidets = new Scanner(System.in);
		    k07bi = scanK07Bidets.nextInt(); 
		    System.out.print("[q = 0.5 l/s] Urinals: ");
			Scanner scanK07Urinals = new Scanner(System.in);
		    k07ur = scanK07Urinals.nextInt(); 
		    System.out.print("[q = 2.5 l/s] WC: ");
			Scanner scanK07WC = new Scanner(System.in);
		    k07wc = scanK07WC.nextInt(); 
		    System.out.print("[q = 1.0 l/s] Showers: ");
			Scanner scanK07Showers = new Scanner(System.in);
		    k07sh = scanK07Showers.nextInt();
		    System.out.print("[q = 1.0 l/s] Bathtubs: ");
			Scanner scanK07Bathtubs = new Scanner(System.in);
		    k07bt = scanK07Bathtubs.nextInt();
		    System.out.print("[q = 1.0 l/s] Sinks: ");
			Scanner scanK07Sinks = new Scanner(System.in);
		    k07si = scanK07Sinks.nextInt();
		    System.out.print("[q = 1.0 l/s] Washmachines: ");
			Scanner scanK07Washmachines = new Scanner(System.in);
		    k07wa = scanK07Washmachines.nextInt();
		    System.out.print("[q = 2.0 l/s] Big/Large Dishmachines: ");
			Scanner scanK07BigDishmachines = new Scanner(System.in);
		    k07bdi = scanK07BigDishmachines.nextInt();
		    System.out.print("[q = 1.0 l/s] Normal Dishmachines: ");
			Scanner scanK07NormalDishmachines = new Scanner(System.in);
		    k07ndi = scanK07NormalDishmachines.nextInt();
		    System.out.print("[q = 1.5 l/s] Floor drains fi75: ");
			Scanner scanK07FloorDrains75 = new Scanner(System.in);
		    k07f75 = scanK07FloorDrains75.nextInt();
		    System.out.print("[q = 2.0 l/s] Floor drains fi110: ");
			Scanner scanK07FloorDrains110 = new Scanner(System.in);
		    k07f110 = scanK07FloorDrains110.nextInt();
		    sum07 = (float) ((k07wb * 0.5) + (k07bi * 0.5) + (k07ur * 0.5) + (k07wc * 2.5) +
				(k07sh * 1.0) + (k07bt * 1.0) + (k07si * 1.0) + (k07wa * 1.0) + 
				(k07bdi * 2.0) + (k07ndi * 1.0) + (k07f75 * 1.5) + (k07f110 * 2.0));
		    System.out.println("The sum of characteristic outflows is = " + sum07 + " l/s.");
		    System.out.println("Characteristic outflow K = 0.7 l/s.");
		    summ07 = (float) (0.5 * Math.sqrt(sum07));
		    System.out.println("Sanitary sewage flow = " + summ07 + " l/s."); 
        	break;
        	case 3:
		    System.out.println("Your choice: K = 1.0 l/s -> public toilets, showers");
		    System.out.println("Now you have to enter amount of sanitary wares: ");
		    System.out.print("[q = 0.5 l/s] Washbasins: ");
			Scanner scanK10Washbasins = new Scanner(System.in);
		    k10wb = scanK10Washbasins.nextInt();  
		    System.out.print("[q = 0.5 l/s] Bidets: ");
			Scanner scanK10Bidets = new Scanner(System.in);
		    k10bi = scanK10Bidets.nextInt(); 
		    System.out.print("[q = 0.5 l/s] Urinals: ");
			Scanner scanK10Urinals = new Scanner(System.in);
		    k10ur = scanK10Urinals.nextInt(); 
		    System.out.print("[q = 2.5 l/s] WC: ");
			Scanner scanK10WC = new Scanner(System.in);
		    k10wc = scanK10WC.nextInt(); 
		    System.out.print("[q = 1.0 l/s] Showers: ");
			Scanner scanK10Showers = new Scanner(System.in);
		    k10sh = scanK10Showers.nextInt();
		    System.out.print("[q = 1.0 l/s] Bathtubs: ");
			Scanner scanK10Bathtubs = new Scanner(System.in);
		    k10bt = scanK10Bathtubs.nextInt();
		    System.out.print("[q = 1.0 l/s] Sinks: ");
			Scanner scanK10Sinks = new Scanner(System.in);
		    k10si = scanK10Sinks.nextInt();
		    System.out.print("[q = 1.0 l/s] Washmachines: ");
			Scanner scanK10Washmachines = new Scanner(System.in);
		    k10wa = scanK10Washmachines.nextInt();
		    System.out.print("[q = 2.0 l/s] Big/Large Dishmachines: ");
			Scanner scanK10BigDishmachines = new Scanner(System.in);
		    k10bdi = scanK10BigDishmachines.nextInt();
		    System.out.print("[q = 1.0 l/s] Normal Dishmachines: ");
			Scanner scanK10NormalDishmachines = new Scanner(System.in);
		    k10ndi = scanK10NormalDishmachines.nextInt();
		    System.out.print("[q = 1.5 l/s] Floor drains fi75: ");
			Scanner scanK10FloorDrains75 = new Scanner(System.in);
		    k10f75 = scanK10FloorDrains75.nextInt();
		    System.out.print("[q = 2.0 l/s] Floor drains fi110: ");
			Scanner scanK10FloorDrains110 = new Scanner(System.in);
		    k10f110 = scanK10FloorDrains110.nextInt();
		    sum10 = (float) ((k10wb * 0.5) + (k10bi * 0.5) + (k10ur * 0.5) + (k10wc * 2.5) +
				(k10sh * 1.0) + (k10bt * 1.0) + (k10si * 1.0) + (k10wa * 1.0) + 
				(k10bdi * 2.0) + (k10ndi * 1.0) + (k10f75 * 1.5) + (k10f110 * 2.0));
		    System.out.println("The sum of characteristic outflows is = " + sum10 + " l/s.");
		    System.out.println("Characteristic outflow K = 1.0 l/s.");
		    summ10 = (float) (0.5 * Math.sqrt(sum10));
		    System.out.println("Sanitary sewage flow = " + summ10 + " l/s."); 
        	break;
        	case 4:
		    System.out.println("Your choice: K = 1.2 l/s -> laboratories");
		    System.out.println("Now you have to enter amount of sanitary wares: ");
		    System.out.print("[q = 0.5 l/s] Washbasins: ");
			Scanner scanK12Washbasins = new Scanner(System.in);
		    k12wb = scanK12Washbasins.nextInt();  
		    System.out.print("[q = 0.5 l/s] Bidets: ");
			Scanner scanK12Bidets = new Scanner(System.in);
		    k12bi = scanK12Bidets.nextInt(); 
		    System.out.print("[q = 0.5 l/s] Urinals: ");
			Scanner scanK12Urinals = new Scanner(System.in);
		    k12ur = scanK12Urinals.nextInt(); 
		    System.out.print("[q = 2.5 l/s] WC: ");
			Scanner scanK12WC = new Scanner(System.in);
		    k12wc = scanK12WC.nextInt(); 
		    System.out.print("[q = 1.0 l/s] Showers: ");
			Scanner scanK12Showers = new Scanner(System.in);
		    k12sh = scanK12Showers.nextInt();
		    System.out.print("[q = 1.0 l/s] Bathtubs: ");
			Scanner scanK12Bathtubs = new Scanner(System.in);
		    k12bt = scanK12Bathtubs.nextInt();
		    System.out.print("[q = 1.0 l/s] Sinks: ");
			Scanner scanK12Sinks = new Scanner(System.in);
		    k12si = scanK12Sinks.nextInt();
		    System.out.print("[q = 1.0 l/s] Washmachines: ");
			Scanner scanK12Washmachines = new Scanner(System.in);
		    k12wa = scanK12Washmachines.nextInt();
		    System.out.print("[q = 2.0 l/s] Big/Large Dishmachines: ");
			Scanner scanK12BigDishmachines = new Scanner(System.in);
		    k12bdi = scanK12BigDishmachines.nextInt();
		    System.out.print("[q = 1.0 l/s] Normal Dishmachines: ");
			Scanner scanK12NormalDishmachines = new Scanner(System.in);
		    k12ndi = scanK12NormalDishmachines.nextInt();
		    System.out.print("[q = 1.5 l/s] Floor drains fi75: ");
			Scanner scanK12FloorDrains75 = new Scanner(System.in);
		    k12f75 = scanK12FloorDrains75.nextInt();
		    System.out.print("[q = 2.0 l/s] Floor drains fi110: ");
			Scanner scanK12FloorDrains110 = new Scanner(System.in);
		    k12f110 = scanK12FloorDrains110.nextInt();
		    sum12 = (float) ((k12wb * 0.5) + (k12bi * 0.5) + (k12ur * 0.5) + (k12wc * 2.5) +
				(k12sh * 1.0) + (k12bt * 1.0) + (k12si * 1.0) + (k12wa * 1.0) + 
				(k12bdi * 2.0) + (k12ndi * 1.0) + (k12f75 * 1.5) + (k12f110 * 2.0));
		    System.out.println("The sum of characteristic outflows is = " + sum12 + " l/s.");
		    System.out.println("Characteristic outflow K = 1.2 l/s.");
		    summ12 = (float) (0.5 * Math.sqrt(sum12));
		    System.out.println("Sanitary sewage flow = " + summ12 + " l/s."); 
         	break;
       }
  }
}
