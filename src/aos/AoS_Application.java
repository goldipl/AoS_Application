<<<<<<< HEAD
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
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Program calculating the sanitary sewage flow.");
		System.out.println("Please choose frequency factor K:");
		System.out.println("Enter '1' for K = 0.5 -> flats, guesthouses, offices");
		System.out.println("Enter '2' for K = 0.7 -> hotels, hospitals, schools");
		System.out.println("Enter '3' for K = 1.0 -> public toilets, showers");
		System.out.println("Enter '4' for K = 1.2 -> laboratories");
		Scanner scanOption = new Scanner(System.in);
        	option = scanOption.nextInt();
		
		switch (option) {
        case 1:
            System.out.println("Your choice: K = 0,5 -> flats, guesthouses, offices");
            System.out.println("Now you have to enter amount of sanitary wares: ");
            System.out.print("[q = 0.5 l/s] Washbasins: ");
            k05wb = scn.nextInt();  
            System.out.print("[q = 0.5 l/s] Bidets: ");
            k05bi = scn.nextInt(); 
            System.out.print("[q = 0.5 l/s] Urinals: ");
            k05ur = scn.nextInt(); 
            System.out.print("[q = 2.0 l/s] WC: ");
            k05wc = scn.nextInt(); 
            System.out.print("[q = 0.8 l/s] Showers: ");
            k05sh = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Bathtubs: ");
            k05bt = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Sinks: ");
            k05si = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Dishmachines: ");
            k05di = scn.nextInt();
            System.out.print("[q = 1.5 l/s] Waschmachines up to 12kg: ");
            k05w12 = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Waschmachines up to 5kg: ");
            k05w05 = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Floor drains fi50: ");
            k05f50 = scn.nextInt();
            System.out.print("[q = 1.5 l/s] Floor drains fi70: ");
            k05f70 = scn.nextInt();
            System.out.print("[q = 2.0 l/s] Floor drains fi100: ");
            k05f110 = scn.nextInt();
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
            k07wb = scn.nextInt();  
            System.out.print("[q = 0.5 l/s] Bidets: ");
            k07bi = scn.nextInt(); 
            System.out.print("[q = 0.5 l/s] Urinals: ");
            k07ur = scn.nextInt(); 
            System.out.print("[q = 2.0 l/s] WC: ");
            k07wc = scn.nextInt(); 
            System.out.print("[q = 0.8 l/s] Showers: ");
            k07sh = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Bathtubs: ");
            k07bt = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Sinks: ");
            k07si = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Dishmachines: ");
            k07di = scn.nextInt();
            System.out.print("[q = 1.5 l/s] Waschmachines up to 12kg: ");
            k07w12 = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Waschmachines up to 5kg: ");
            k07w05 = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Floor drains fi50: ");
            k07f50 = scn.nextInt();
            System.out.print("[q = 1.5 l/s] Floor drains fi70: ");
            k07f70 = scn.nextInt();
            System.out.print("[q = 2.0 l/s] Floor drains fi100: ");
            k07f110 = scn.nextInt();
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
            k10wb = scn.nextInt();  
            System.out.print("[q = 0.5 l/s] Bidets: ");
            k10bi = scn.nextInt(); 
            System.out.print("[q = 0.5 l/s] Urinals: ");
            k10ur = scn.nextInt(); 
            System.out.print("[q = 2.0 l/s] WC: ");
            k10wc = scn.nextInt(); 
            System.out.print("[q = 0.8 l/s] Showers: ");
            k10sh = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Bathtubs: ");
            k10bt = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Sinks: ");
            k10si = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Dishmachines: ");
            k10di = scn.nextInt();
            System.out.print("[q = 1.5 l/s] Waschmachines up to 12kg: ");
            k10w12 = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Waschmachines up to 5kg: ");
            k10w05 = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Floor drains fi50: ");
            k10f50 = scn.nextInt();
            System.out.print("[q = 1.5 l/s] Floor drains fi70: ");
            k10f70 = scn.nextInt();
            System.out.print("[q = 2.0 l/s] Floor drains fi100: ");
            k10f110 = scn.nextInt();
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
            k12wb = scn.nextInt();  
            System.out.print("[q = 0.5 l/s] Bidets: ");
            k12bi = scn.nextInt(); 
            System.out.print("[q = 0.5 l/s] Urinals: ");
            k12ur = scn.nextInt(); 
            System.out.print("[q = 2.0 l/s] WC: ");
            k12wc = scn.nextInt(); 
            System.out.print("[q = 0.8 l/s] Showers: ");
            k12sh = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Bathtubs: ");
            k12bt = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Sinks: ");
            k12si = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Dishmachines: ");
            k12di = scn.nextInt();
            System.out.print("[q = 1.5 l/s] Waschmachines up to 12kg: ");
            k12w12 = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Waschmachines up to 5kg: ");
            k12w05 = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Floor drains fi50: ");
            k12f50 = scn.nextInt();
            System.out.print("[q = 1.5 l/s] Floor drains fi70: ");
            k12f70 = scn.nextInt();
            System.out.print("[q = 2.0 l/s] Floor drains fi100: ");
            k12f110 = scn.nextInt();
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
	scn.close();
	scanOption.close();
  }
}
=======
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
		Scanner scn = new Scanner(System.in);
		
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
            k05wb = scn.nextInt();  
            System.out.print("[q = 0.5 l/s] Bidets: ");
            k05bi = scn.nextInt(); 
            System.out.print("[q = 0.5 l/s] Urinals: ");
            k05ur = scn.nextInt(); 
            System.out.print("[q = 2.0 l/s] WC: ");
            k05wc = scn.nextInt(); 
            System.out.print("[q = 0.8 l/s] Showers: ");
            k05sh = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Bathtubs: ");
            k05bt = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Sinks: ");
            k05si = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Dishmachines: ");
            k05di = scn.nextInt();
            System.out.print("[q = 1.5 l/s] Waschmachines up to 12kg: ");
            k05w12 = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Waschmachines up to 5kg: ");
            k05w05 = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Floor drains fi50: ");
            k05f50 = scn.nextInt();
            System.out.print("[q = 1.5 l/s] Floor drains fi70: ");
            k05f70 = scn.nextInt();
            System.out.print("[q = 2.0 l/s] Floor drains fi100: ");
            k05f110 = scn.nextInt();
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
            k07wb = scn.nextInt();  
            System.out.print("[q = 0.5 l/s] Bidets: ");
            k07bi = scn.nextInt(); 
            System.out.print("[q = 0.5 l/s] Urinals: ");
            k07ur = scn.nextInt(); 
            System.out.print("[q = 2.0 l/s] WC: ");
            k07wc = scn.nextInt(); 
            System.out.print("[q = 0.8 l/s] Showers: ");
            k07sh = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Bathtubs: ");
            k07bt = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Sinks: ");
            k07si = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Dishmachines: ");
            k07di = scn.nextInt();
            System.out.print("[q = 1.5 l/s] Waschmachines up to 12kg: ");
            k07w12 = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Waschmachines up to 5kg: ");
            k07w05 = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Floor drains fi50: ");
            k07f50 = scn.nextInt();
            System.out.print("[q = 1.5 l/s] Floor drains fi70: ");
            k07f70 = scn.nextInt();
            System.out.print("[q = 2.0 l/s] Floor drains fi100: ");
            k07f110 = scn.nextInt();
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
            k10wb = scn.nextInt();  
            System.out.print("[q = 0.5 l/s] Bidets: ");
            k10bi = scn.nextInt(); 
            System.out.print("[q = 0.5 l/s] Urinals: ");
            k10ur = scn.nextInt(); 
            System.out.print("[q = 2.0 l/s] WC: ");
            k10wc = scn.nextInt(); 
            System.out.print("[q = 0.8 l/s] Showers: ");
            k10sh = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Bathtubs: ");
            k10bt = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Sinks: ");
            k10si = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Dishmachines: ");
            k10di = scn.nextInt();
            System.out.print("[q = 1.5 l/s] Waschmachines up to 12kg: ");
            k10w12 = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Waschmachines up to 5kg: ");
            k10w05 = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Floor drains fi50: ");
            k10f50 = scn.nextInt();
            System.out.print("[q = 1.5 l/s] Floor drains fi70: ");
            k10f70 = scn.nextInt();
            System.out.print("[q = 2.0 l/s] Floor drains fi100: ");
            k10f110 = scn.nextInt();
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
            k12wb = scn.nextInt();  
            System.out.print("[q = 0.5 l/s] Bidets: ");
            k12bi = scn.nextInt(); 
            System.out.print("[q = 0.5 l/s] Urinals: ");
            k12ur = scn.nextInt(); 
            System.out.print("[q = 2.0 l/s] WC: ");
            k12wc = scn.nextInt(); 
            System.out.print("[q = 0.8 l/s] Showers: ");
            k12sh = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Bathtubs: ");
            k12bt = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Sinks: ");
            k12si = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Dishmachines: ");
            k12di = scn.nextInt();
            System.out.print("[q = 1.5 l/s] Waschmachines up to 12kg: ");
            k12w12 = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Waschmachines up to 5kg: ");
            k12w05 = scn.nextInt();
            System.out.print("[q = 0.8 l/s] Floor drains fi50: ");
            k12f50 = scn.nextInt();
            System.out.print("[q = 1.5 l/s] Floor drains fi70: ");
            k12f70 = scn.nextInt();
            System.out.print("[q = 2.0 l/s] Floor drains fi100: ");
            k12f110 = scn.nextInt();
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
	scn.close();
  }
}
>>>>>>> 82d5894e7a54bc9a2dc8b7de8f0827430736dc79
