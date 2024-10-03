import java.util.Locale;
import java.util.Scanner;
public class Story {
    public static int story(int day) {
        int ending_ammount = 9;
        int secret_endings = 3;
        int kill_count = 0;
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
        in1 = in1.toUpperCase();
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
        in2 = in2.toUpperCase();
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
                return kill_count;
            }

        }
        if (day >= 12){
            p.print("The entrance feels rather empty don't you think?");
        }
        if (day >= 19){
            p.print("On second thought, there is almost no one here... What happened?");
        }
        if (day >= 25){
            p.print("Upon further inspection there is no one outside, you're the only student left in the facility. Maybe the others went on a large expectation");
        }
        p.print("You need to pick a spot to start your measurements.");
        //If the user has a computer they can look for other areasThis is the first fork off.
        if (computer){
            p.print("Looking at the computer you can go to: \n[P]roperly built bridge in the lower safe levels for a nice view of some acidic falls and crystals \n[C]rystized area to study the formation of crystals \n[A]stro acidic falls to measure acidic levels like everyone else did");
            String in3 = A.input();
            in3 = in3.toUpperCase();
            //user goes to the properly built bridge
            if (in3.startsWith("P")){
                p.print("Off you go to the Properly Built Bridge. \nYou feel a rush to get there as soon as possible. The fear of missing out is growing inside of you.");
                p.print("Do you want to double check you selected the right location? [y/n]");
                String in4 = A.input();
                in4 = in4.toUpperCase();
                Boolean poorBridge = false;
                if (in4.startsWith("Y")){
                    p.print("Oh, seems like you had typed poorly built bridge, lets get that fixed. \nsaved yourself such a hassle didn't you");
                    poorBridge = false;

                }
                else{
                    p.print("You're right, why should we waste time, lets get moving");
                    poorBridge = true;
                }
                p.print("Along the way you see different stalagmites on the floor. Above each are stalactites. As the cave opens up they look like ");
                p.print("You hear some clicking sounds echoing behind you, you have just turned a corner in the cave and are out of view if anything were to chase you. Do you start to \n[r]un right after the corner, hoping to out run the thing chasing you \n[c]over behind a quartz stalagmite, hope that it runs right past you \n[h]ide in a hole under the stalagmite formation, hope that even if it checks it won't see you");
                String in5 = A.input();
                in5 = in5.toUpperCase();
                if (in5.startsWith("C")){
                    p.print("You cover behind a formation of stalagmite. Metallic footsteps run past you. You hear a crash sound as the robotic creature turns the corner. \n You go to investigate, whatever was chasing you had just fallen into a river of acid.");
                    if (mask){
                        p.print("Since you have a mask and the poisonous gas won't harm you. You go closer to investigate. The robot matches exactly what a specter would look like. This confirms they're real.");
                    }
                    else{
                        p.print("You can't go that close due to the gasses from the river of acid. However it's a good sign, that means the Astro Acidic falls should be nearby");
                    }
                }
                if (in5.startsWith("H")){
                    p.print("You hide in a hole under the formation of quartz stalagmites. Unfortunate for you, the hole was formed by acid. Even though your suit is acid resistant, the high concentration in the hold burns through part of your suit and causes you to scream. \n Your flesh starts to melt and you feel something stab through your back.");
                    p.print("Ending: \n Need Some Aloe \n There are " + ending_ammount +" endings");
                    return kill_count;
                }
                //Split here, all choices will lead to death but hey at least you tried (maybe a few will let you get out alive)
                if (in5.startsWith("R")){
                    p.print("you run with all your might. The spiked formations of the cave turn into blurs. This section of the cave is coming to an end, what do you do from here? ");
                    p.print("Do you \n[s]low down and to make the corner \n[k]eep your speed and hope you can make the corner \n[q]uicken your pace and hope for the best ");
                    String in6 = A.input();
                    in6 = in6.toUpperCase();
                    if (in6.startsWith("S")){
                        p.print("You slow down and make the corner, behind you can hear a metallic crash against the cave walls. The entire cave system seems to vibrate from this. The crash was enough to make the smaller stalactites fall on you");
                        p.print("Ending: \nDeath From Above \n There are " + ending_ammount +" endings");
                        return kill_count;
                    }
                    if (in6.startsWith("Q")){
                        p.print("You run even faster towards the end of this tunnel, much to fast to make the corner. What were you thinking? You crash into the walls of the cave. You just served the specter an Egg Head Omelette");
                        p.print("Ending: \n Five Star Egg Headed Omelette \n There are " + ending_ammount +" endings");
                    }
                    if (in6.startsWith("K")){
                        if (day >=7){
                            p.print("Due to the past acid rains the floor is a lot more slippery, you slip and crash into the floor infront of you knocking you out. The thing chasing you finishes the job ");
                            p.print("Ending: \n Slip & Slide \n(Secret Ending Ending 2/" + secret_endings+ ")" + "\n there are " + ending_ammount +" endings");
                            return kill_count;
                        }
                        else{
                            p.print("You barley make it through the corner, The mechanical clicks turn into thunderous crashes behind you. Maybe you can get out of this one alive.");
                            //check if the player can defend themselves
                            if(redTintedSword){
                                p.print("You pull out your Red Tinted Switch Blade. The name Lucifer Nix glows as the blade jumps out from the handle. You turn around to see a Specture behind you. \n With the time you have there's only three places you can stab it. Do you \n[j]ab it into one of it's red eyes \n [s]tab the upper glowing circle on it's body \n [i]mpale the lower glowing circle");
                                String in7 = A.input();
                                in7 = in7.toUpperCase();
                                if (in7.startsWith("J")){
                                    p.print("You jab the blade into the Specters red eye. It seems to have disabled it for a bit. You let go of the blade in it's eye and turn around to run. \n A loud mechanical roar, the sound of it's robotic joints griding, The distance between you and the Specter is closed almost instantly. " );
                                    p.print("Ending: \n Slowest Drawer Down South \n There are " + ending_ammount +" endings");
                                    return kill_count;
                                }
                                if(in7.startsWith("S")){
                                    p.print("You put all your force into a single stab motion at the upper crismon token. The red tinted blade make a hiss as it penetrates the many layers of armor, sealing in whatever could come out. Unfortunately you had stabbed the processor of the Specter at a very aggressive angle. \n A large hiss is heard as the seal isn't formed fast enough to hold back the immense heat that is released, cooking you and anything in the cave.");
                                    p.print("Ending: \n What's for Dinner? \n There are " + ending_ammount +" endings");
                                    return kill_count;
                                }
                                if(in7.startsWith("I")){
                                    p.print("The blade hits the fission cell of the Specter. Fortunately, as it was designed for this, the blade seals the core before any of the immense energy could escape. Good thing you had chosen this blade. \n The name Lucifer Nix glows as you pull the blade out again.");
                                    kill_count +=1;
                                }
                            }
                            else if (literOfVodka || bottleOfTequila){
                                p.print("You pull out the alcohol and smash it on the ground, a spark from the specters mechanical body sets it off. It's burning. \n Unfortunelty the metal doesn't burn hot enough to do damage. A flaming bladed leg impales. The red eyes meet you as the flames cirlce behind the specter. You're final moments");
                                p.print("Ending: \n A Toast to Thee \n There are " + ending_ammount +" endings");
                                return kill_count;
                            }
                            else{
                                p.print("You turn to look back, the last thing you see is a metallic blade reach your face. Before it does you trip and hit your head on the ground concussing you. Atleast you didn't feel any pain");
                                p.print("Ending: \n Painless Perishing \n There are " + ending_ammount +" endings");
                                return kill_count;
                            }
                        }
                    }
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

        return kill_count;


    }
}
