import java.util.Locale;
import java.util.Scanner;
public class Story {
    public static String story(int day) {
        int ending_ammount = 2;
        int secret_endings = 1;
        Scanner userString = new Scanner(System.in);
        //idk why I did that, but honestly it's fine have yes and no definded
        Boolean mask = false;
        Boolean redTintedSword = false;
        Boolean computer = false;
        Boolean bottleOfTequila = false;
        Boolean literOfVodka = false;
        // User chooses the items they take
        p.print("Once you get outside you see you can only carry two things with you along with your instruments");
        p.print("First item you take? \n [G]as Mask: Protects you from the poisonous gas that is in the lower and upper levels \n \n [R]ed Tinted Switch Blade: \n We don't know what this does but it's cool. It has the name Lucifer Nix on one side and retracts into it's handle \n\n [C]omputer: \n Can read drives and it's a computer \n \n [B]ottle of Tequila: It's a bottle Tequila from the welcoming party. \n \n [L]iter of Vodka: \n It's a bottle Vodka from the welcoming party.");
        p.print("\n");
        String in1 = A.input();
        in1 = in1.toUpperCase(Locale.ROOT);
        if (in1.startsWith("G")){
            mask = true;
            p.print("successfully taken Gas Mask");
        }
        if (in1.startsWith("R")){
            redTintedSword = true;
            p.print("Successfully taken Red Tinted Switch Blade");
        }
        if (in1.startsWith("C")){
            computer = true;
            p.print("Successfully taken Computer");
        }
        if (in1.startsWith("B")){
            bottleOfTequila = true;
            p.print("Successfully taken Bottle of Tequila");
        }
        if (in1.startsWith("L")){
            literOfVodka = true;
            p.print("Successfully taken Liter of Vodka");
        }
        int items = 0;
        // second round of choose items
        p.print("Once you get outside you see you can only carry two things with you along with your instruments");
        p.print("What second item you take? (keep lowercase when typing) \n [G]as Mask: Protects you from the poisions gas that is in the lower and upper levels \n \n [R]ed Tinted Switch Blade: \n We don't know what this does but it's cool. It has the name Lucifer Nix on one side and retracts into it's handle \n\n [C]omputer: \n Can read drives and it's a computer \n \n [B]ottle of Tequila: It's a bottle Tequila from the welcoming party. \n \n [L]iter of Vodka: \n It's a bottle Vodka from the welcoming party.");
        p.print("\n");
        String in2 = A.input();
        in2 = in2.toUpperCase(Locale.ROOT);
        if (in2.startsWith("G")){
            if (mask){
                p.print("Already chosen the Gas Mask, so instead you take the computer");
                computer = true;
            }
            else {
                mask = true;
                p.print("Successfully taken Gas Mask");
            }
        }
        if (in2.startsWith("R")){
            if (redTintedSword){
                p.print("Already chosen the Switch Blade, so instead you take the Gas Mask");
                mask = true;
            }
            else{
                redTintedSword = true;
                p.print("Successfully taken Red Tinted Switch Blade");
            }
        }
        if (in2.startsWith("C")){
            if (computer){
                p.print("Already chosen the computer, so instead you take the Liter of Vodka");
                literOfVodka = true;
            }
            else{
                computer = true;
                p.print("Successfully taken Computer");
            }
        }
        if (in2.startsWith("B")){
            if (bottleOfTequila){
                p.print("Already chosen the Bottle of Tequila, so instead you take Red Tinted Switch Blade");
                redTintedSword = true;
            }
            else{
                bottleOfTequila = true;
                p.print("Successfully taken Bottle of Tequila");
            }
        }
        if (in2.startsWith("L")){
            if (literOfVodka){
                p.print("Already chosen the Liter of Vodka, so instead you take The Bottle of Tequila");
                bottleOfTequila = true;
            }
            else
            {
                literOfVodka = true;
                p.print("Successfully taken Liter of Vodka");
            }
        }
        //display taken items
        p.print("Successfully taken:");
        if (literOfVodka){
            p.print("The Liter of Vodka");
        }
        if (bottleOfTequila){
            p.print("The Bottle of Tequila");
        }
        if (computer){
            p.print("The Computer");
        }
        if (redTintedSword){
            p.print("The Red Tinted Switch Blade");
        }
        if(mask){
            p.print("The Gas Mask");
        }
        //little attention to detial
        if (mask){
            p.print("You step out of the facility, fortunately the mask makes sure you can't smell the terrible smell");
        }
        else{
            p.print("Stepping out you see the caves for the first time. They're made of white Quartz. It's very beautiful but it smells terrible. \n Good thing the suits basic air filtering keeps you safe from the low concentration of gasses.");
        }
        // ohno acid rain!
        if (day == 7){
            p.print("Sadly today,the heavy acid rains and the cave systems are flooding with acid and poisonous gases. ");
            if (mask){
                p.print("Fine by you have that mask, you're fine");
            }
            else{
                p.print("Unfortunately you didn't make it back inside in time. You're body was found badly burned and dissolved later after the flooding seeped into the lower levels.");
                p.print("Ending: \n gone to soon \n(Secret Ending Ending 1/" + secret_endings+ ")" + "\n there are " + ending_ammount +" endings");
            }

        }
        if (day == 21){
            p.print("The entrance feels rather emptry don't you think?");
        }
        p.print("You need to pick a spot to start your measurements.");
        //If the user has a computer they can look for other areasThis is the first fork off.
        if (computer){
            p.print("Looking at the computer you can go to: \n[P]roperly built bridge in the lower safe levels for a nice view of some acidic falls and crystals \n[C]rystized area to study the formation of crystals \n[A]stro acidic falls to measure acidic levels like everyone else did");
            String in3 = A.input();
            in3 = in3.toUpperCase();
            //user goes to the properly built bridge
            if (in3.startsWith("P")){
                p.print("Off you go to the Properly Built Bridge");
                p.print("Do you want to double check you selected the right location? [y/n]");
                String in4 = A.input();
                in4 = in4.toUpperCase();
                Boolean poorBridge = false;
                if (in4.startsWith("Y")){
                    p.print("Oh, seems like you had typed poorly built bridge, lets get that fixed. \n saved yourself such a hassel didn't you");
                    poorBridge = false;

                }
                else{
                    p.print("You're right, why should we waste time, lets get moving");
                    poorBridge = true;
                }

            }
            //end of computer
            if (in3.startsWith("C")){
                p.print("To the Crystalized Area we go!");
            }
            //end of Crystalized if statment
            if (in3.startsWith("A")){
                p.print("You head over to the Astro Acidic Falls");
                p.print("While walking the computer detects a short cut, do you take it? [y/n]");
                String in4 = A.input();
                in4 = in4.toUpperCase();
                if (in4.startsWith("Y"));

            }
            // End of Astro Acidic Falls If Statment
        }
        //end of if computer if statment
        p.print("Alright, now that you have your acidic instruments you head over to the Astro Acidic Falls like the other students had");
        p.print("");


        return "yes";


    }
}
