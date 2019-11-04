package aos;

import java.util.Scanner;

/* This application can calculate the sanitary sewage flow 
 * needed for your polish publish health project.
 * This program can sum up all flow units and
 * give us the exact result.
 * Calculations are based on polish standards PN-EN 12056-2. 
 * -----------------------------------------------
 * --- AoS Application © Marcin Godlewski 2019 ---
 * ----------------------------------------------- */

public class AoS_Application {

	public static void main(String[] args) {
		int k05wb, k05bi, k05ur, k05wc, k05sh, k05bt, k05si, k05di, k05w12, k05w05, k05f50, k05f70, k05f110;
		int k07wb, k07bi, k07ur, k07wc, k07sh, k07bt, k07si, k07di, k07w12, k07w05, k07f50, k07f70, k07f110;
		int k10wb, k10bi, k10ur, k10wc, k10sh, k10bt, k10si, k10di, k10w12, k10w05, k10f50, k10f70, k10f110;
		int k12wb, k12bi, k12ur, k12wc, k12sh, k12bt, k12si, k12di, k12w12, k12w05, k12f50, k12f70, k12f110;
		int option;
		float sum05, summ05, sum07, summ07, sum10, summ10, sum12, summ12;
		
		System.out.println("Program calculating the sanitary sewage flow.");
		System.out.println("Please choose frequency factor K:");
		System.out.println("Enter '1' for K = 0.5 -> flats, guesthouses, offices");
		System.out.println("Enter '2' for K = 0.7 -> hotels, hospitals, schools");
		System.out.println("Enter '3' for K = 1.0 -> public toilets, showers");
		System.out.println("Enter '4' for K = 1.2 -> laboratories");
		@SuppressWarnings("resource")
		Scanner scanOption = new Scanner(System.in);
        option = scanOption.nextInt();
		
		switch (option) {
        case 1:
            System.out.println("Your choice: K = 0,5 -> flats, guesthouses, offices");
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
            System.out.print("[q = 2.0 l/s] WC: ");
    		Scanner scanK05WC = new Scanner(System.in);
            k05wc = scanK05WC.nextInt(); 
            System.out.print("[q = 0.8 l/s] Showers: ");
    		Scanner scanK05Showers = new Scanner(System.in);
            k05sh = scanK05Showers.nextInt();
            System.out.print("[q = 0.8 l/s] Bathtubs: ");
    		Scanner scanK05Bathtubs = new Scanner(System.in);
            k05bt = scanK05Bathtubs.nextInt();
            System.out.print("[q = 0.8 l/s] Sinks: ");
    		Scanner scanK05Sinks = new Scanner(System.in);
            k05si = scanK05Sinks.nextInt();
            System.out.print("[q = 0.8 l/s] Dishmachines: ");
    		Scanner scanK05Dishmachines = new Scanner(System.in);
            k05di = scanK05Dishmachines.nextInt();
            System.out.print("[q = 1.5 l/s] Waschmachines up to 12kg: ");
    		Scanner scanK05Waschmachines12kg = new Scanner(System.in);
            k05w12 = scanK05Waschmachines12kg.nextInt();
            System.out.print("[q = 0.8 l/s] Waschmachines up to 5kg: ");
    		Scanner scanK05Waschmachines5kg = new Scanner(System.in);
            k05w05 = scanK05Waschmachines5kg.nextInt();
            System.out.print("[q = 0.8 l/s] Floor drains fi50: ");
    		Scanner scanK05FloorDrains50 = new Scanner(System.in);
            k05f50 = scanK05FloorDrains50.nextInt();
            System.out.print("[q = 1.5 l/s] Floor drains fi70: ");
    		Scanner scanK05FloorDrains70 = new Scanner(System.in);
            k05f70 = scanK05FloorDrains70.nextInt();
            System.out.print("[q = 2.0 l/s] Floor drains fi100: ");
    		Scanner scanK05FloorDrains110 = new Scanner(System.in);
            k05f110 = scanK05FloorDrains110.nextInt();
            sum05 = (float) ((k05wb * 0.5) + (k05bi * 0.5) + (k05ur * 0.5) + (k05wc * 2.0) +
            		(k05sh * 0.8) + (k05bt * 0.8) + (k05si * 0.8) + (k05di * 0.8) + 
            		(k05w12 * 1.5) + (k05w05 * 0.8) + (k05f50 * 0.8) + (k05f70 * 1.5) + 
            		(k05f110 * 2.0));
            System.out.println("The sum of unit outflows is = " + sum05 + " l/s.");
            System.out.println("Frequency factor K = 0.5");
            summ05 = (float) (0.5 * Math.sqrt(sum05));
            System.out.println("Sanitary sewage flow = " + summ05 + " l/s."); 
        break;
        case 2:
            System.out.println("Your choice: K = 0.7 -> hotels, hospitals, schools");
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
            System.out.print("[q = 2.0 l/s] WC: ");
    		Scanner scanK07WC = new Scanner(System.in);
            k07wc = scanK07WC.nextInt(); 
            System.out.print("[q = 0.8 l/s] Showers: ");
    		Scanner scanK07Showers = new Scanner(System.in);
            k07sh = scanK07Showers.nextInt();
            System.out.print("[q = 0.8 l/s] Bathtubs: ");
    		Scanner scanK07Bathtubs = new Scanner(System.in);
            k07bt = scanK07Bathtubs.nextInt();
            System.out.print("[q = 0.8 l/s] Sinks: ");
    		Scanner scanK07Sinks = new Scanner(System.in);
            k07si = scanK07Sinks.nextInt();
            System.out.print("[q = 0.8 l/s] Dishmachines: ");
    		Scanner scanK07Dishmachines = new Scanner(System.in);
            k07di = scanK07Dishmachines.nextInt();
            System.out.print("[q = 1.5 l/s] Waschmachines up to 12kg: ");
    		Scanner scanK07Waschmachines12kg = new Scanner(System.in);
            k07w12 = scanK07Waschmachines12kg.nextInt();
            System.out.print("[q = 0.8 l/s] Waschmachines up to 5kg: ");
    		Scanner scanK07Waschmachines5kg = new Scanner(System.in);
            k07w05 = scanK07Waschmachines5kg.nextInt();
            System.out.print("[q = 0.8 l/s] Floor drains fi50: ");
    		Scanner scanK07FloorDrains50 = new Scanner(System.in);
            k07f50 = scanK07FloorDrains50.nextInt();
            System.out.print("[q = 1.5 l/s] Floor drains fi70: ");
    		Scanner scanK07FloorDrains70 = new Scanner(System.in);
            k07f70 = scanK07FloorDrains70.nextInt();
            System.out.print("[q = 2.0 l/s] Floor drains fi100: ");
    		Scanner scanK07FloorDrains110 = new Scanner(System.in);
            k07f110 = scanK07FloorDrains110.nextInt();
            sum07 = (float) ((k07wb * 0.5) + (k07bi * 0.5) + (k07ur * 0.5) + (k07wc * 2.0) +
            		(k07sh * 0.8) + (k07bt * 0.8) + (k07si * 0.8) + (k07di * 0.8) + 
            		(k07w12 * 1.5) + (k07w05 * 0.8) + (k07f50 * 0.8) + (k07f70 * 1.5) + 
            		(k07f110 * 2.0));
            System.out.println("The sum of unit outflows is = " + sum07 + " l/s.");
            System.out.println("Frequency factor K = 0.7");
            summ07 = (float) (0.7 * Math.sqrt(sum07));
            System.out.println("Sanitary sewage flow = " + summ07 + " l/s."); 
        break;
        case 3:
            System.out.println("Your choice: K = 1.0 -> public toilets, showers");
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
            System.out.print("[q = 2.0 l/s] WC: ");
    		Scanner scanK10WC = new Scanner(System.in);
            k10wc = scanK10WC.nextInt(); 
            System.out.print("[q = 0.8 l/s] Showers: ");
    		Scanner scanK10Showers = new Scanner(System.in);
            k10sh = scanK10Showers.nextInt();
            System.out.print("[q = 0.8 l/s] Bathtubs: ");
    		Scanner scanK10Bathtubs = new Scanner(System.in);
            k10bt = scanK10Bathtubs.nextInt();
            System.out.print("[q = 0.8 l/s] Sinks: ");
    		Scanner scanK10Sinks = new Scanner(System.in);
            k10si = scanK10Sinks.nextInt();
            System.out.print("[q = 0.8 l/s] Dishmachines: ");
    		Scanner scanK10Dishmachines = new Scanner(System.in);
            k10di = scanK10Dishmachines.nextInt();
            System.out.print("[q = 1.5 l/s] Waschmachines up to 12kg: ");
    		Scanner scanK10Waschmachines12kg = new Scanner(System.in);
            k10w12 = scanK10Waschmachines12kg.nextInt();
            System.out.print("[q = 0.8 l/s] Waschmachines up to 5kg: ");
    		Scanner scanK10Waschmachines5kg = new Scanner(System.in);
            k10w05 = scanK10Waschmachines5kg.nextInt();
            System.out.print("[q = 0.8 l/s] Floor drains fi50: ");
    		Scanner scanK10FloorDrains50 = new Scanner(System.in);
            k10f50 = scanK10FloorDrains50.nextInt();
            System.out.print("[q = 1.5 l/s] Floor drains fi70: ");
    		Scanner scanK10FloorDrains70 = new Scanner(System.in);
            k10f70 = scanK10FloorDrains70.nextInt();
            System.out.print("[q = 2.0 l/s] Floor drains fi100: ");
    		Scanner scanK10FloorDrains110 = new Scanner(System.in);
            k10f110 = scanK10FloorDrains110.nextInt();
            sum10 = (float) ((k10wb * 0.5) + (k10bi * 0.5) + (k10ur * 0.5) + (k10wc * 2.0) +
            		(k10sh * 0.8) + (k10bt * 0.8) + (k10si * 0.8) + (k10di * 0.8) + 
            		(k10w12 * 1.5) + (k10w05 * 0.8) + (k10f50 * 0.8) + (k10f70 * 1.5) + 
            		(k10f110 * 2.0));
            System.out.println("The sum of unit outflows is = " + sum10 + " l/s.");
            System.out.println("Frequency factor K = 1.0");
            summ10 = (float) (1.0 * Math.sqrt(sum10));
            System.out.println("Sanitary sewage flow = " + summ10 + " l/s.");
        break;
        case 4:
            System.out.println("Your choice: K = 1.2 -> laboratories");
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
            System.out.print("[q = 2.0 l/s] WC: ");
    		Scanner scanK12WC = new Scanner(System.in);
            k12wc = scanK12WC.nextInt(); 
            System.out.print("[q = 0.8 l/s] Showers: ");
    		Scanner scanK12Showers = new Scanner(System.in);
            k12sh = scanK12Showers.nextInt();
            System.out.print("[q = 0.8 l/s] Bathtubs: ");
    		Scanner scanK12Bathtubs = new Scanner(System.in);
            k12bt = scanK12Bathtubs.nextInt();
            System.out.print("[q = 0.8 l/s] Sinks: ");
    		Scanner scanK12Sinks = new Scanner(System.in);
            k12si = scanK12Sinks.nextInt();
            System.out.print("[q = 0.8 l/s] Dishmachines: ");
    		Scanner scanK12Dishmachines = new Scanner(System.in);
            k12di = scanK12Dishmachines.nextInt();
            System.out.print("[q = 1.5 l/s] Waschmachines up to 12kg: ");
    		Scanner scanK12Waschmachines12kg = new Scanner(System.in);
            k12w12 = scanK12Waschmachines12kg.nextInt();
            System.out.print("[q = 0.8 l/s] Waschmachines up to 5kg: ");
    		Scanner scanK12Waschmachines5kg = new Scanner(System.in);
            k12w05 = scanK12Waschmachines5kg.nextInt();
            System.out.print("[q = 0.8 l/s] Floor drains fi50: ");
    		Scanner scanK12FloorDrains50 = new Scanner(System.in);
            k12f50 = scanK12FloorDrains50.nextInt();
            System.out.print("[q = 1.5 l/s] Floor drains fi70: ");
    		Scanner scanK12FloorDrains70 = new Scanner(System.in);
            k12f70 = scanK12FloorDrains70.nextInt();
            System.out.print("[q = 2.0 l/s] Floor drains fi100: ");
    		Scanner scanK12FloorDrains110 = new Scanner(System.in);
            k12f110 = scanK12FloorDrains110.nextInt();
            sum12 = (float) ((k12wb * 0.5) + (k12bi * 0.5) + (k12ur * 0.5) + (k12wc * 2.0) +
            		(k12sh * 0.8) + (k12bt * 0.8) + (k12si * 0.8) + (k12di * 0.8) + 
            		(k12w12 * 1.5) + (k12w05 * 0.8) + (k12f50 * 0.8) + (k12f70 * 1.5) + 
            		(k12f110 * 2.0));
            System.out.println("The sum of unit outflows is = " + sum12 + " l/s.");
            System.out.println("Frequency factor K = 1.2");
            summ12 = (float) (1.2 * Math.sqrt(sum12));
            System.out.println("Sanitary sewage flow = " + summ12 + " l/s.");
         break;
       }
	}
}
