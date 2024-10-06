import java.util.Locale;
import java.util.Scanner;
public class Story {
    public static int story(int day) {
        int ending_ammount = 41;
        int secret_endings = 3;
        int kill_count = 0;
        Scanner userString = new Scanner(System.in);
        //idk why I did that, but honestly it's fine have yes and no defined
        Boolean mask = false;
        Boolean redTintedSword = false;
        Boolean computer = false;
        Boolean bottleOfTequila = false;
        Boolean literOfVodka = false;
        // User chooses the items they take
        p.print("Once you get outside you see you can only carry two things with you along with your instruments");
        p.print("First item you take? \n [G]as Mask: Protects you from the poisonous gas that is in the lower and upper levels  \n [R]ed Tinted Switch Blade: \n We don't know what this does but it's cool. It has the name Lucifer Nix on one side and retracts into it's handle \n\n [C]omputer: \n Can read drives and it's a computer \n \n [B]ottle of Tequila: It's a bottle Tequila from the welcoming party. \n \n [L]iter of Vodka: \n It's a bottle Vodka from the welcoming party.");
        p.print("\n");
        String in1 = A.input();
        in1 = in1.toUpperCase();
        if (in1.startsWith("G")){
            mask = true;
            p.print("successfully taken Gas Mask");
        }
        else if (in1.startsWith("R")){
            redTintedSword = true;
            p.print("Successfully taken Red Tinted Switch Blade");
        }
        else if (in1.startsWith("C")){
            computer = true;
            p.print("Successfully taken Computer");
        }
        else if (in1.startsWith("B")){
            bottleOfTequila = true;
            p.print("Successfully taken Bottle of Tequila");
        }
        else if (in1.startsWith("L")){
            literOfVodka = true;
            p.print("Successfully taken Liter of Vodka");
        }
        else{
            p.print("Input not recognized you get nothing");
        }
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
        else if (in2.startsWith("R")){
            if (redTintedSword){
                p.print("Already chosen the Switch Blade, so instead you take the Gas Mask");
                mask = true;
            }
            else{
                redTintedSword = true;
                p.print("Successfully taken Red Tinted Switch Blade");
            }
        }
        else if (in2.startsWith("C")){
            if (computer){
                p.print("Already chosen the computer, so instead you take the Liter of Vodka");
                literOfVodka = true;
            }
            else{
                computer = true;
                p.print("Successfully taken Computer");
            }
        }
        else if (in2.startsWith("B")){
            if (bottleOfTequila){
                p.print("Already chosen the Bottle of Tequila, so instead you take Red Tinted Switch Blade");
                redTintedSword = true;
            }
            else{
                bottleOfTequila = true;
                p.print("Successfully taken Bottle of Tequila");
            }
        }
        else if (in2.startsWith("L")){
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
        else{
            p.print("Input not recognized you get nothing");
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
        p.print("\n-------------------------------------------------------------\n");
        //little attention to detail
        if (mask){
            p.print("You step out of the facility, fortunately the mask makes sure you can't smell the terrible smell");
        }
        else{
            p.print("Stepping out you see the caves for the first time. They're made of white Quartz. It's very beautiful but it smells terrible. \n Good thing the suits basic air filtering keeps you safe from the low concentration of gasses.");
        }
        // ohno acid rain!
        if (day >= 7 && day<=12){
            p.print("Sadly today,the heavy acid rains and the cave systems are flooding with acid and poisonous gases. ");
            if (mask){
                p.print("Fine by you as you have mask. You're fine");
            }
            else{
                p.print("Unfortunately you didn't make it back inside in time. You're body was found badly burned and partially dissolved later after the flooding seeped into the lower levels.");
                p.print("Ending: \n gone to soon \n(There are" + secret_endings+ ")" + "\n there are " + ending_ammount +" endings");
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
            p.print("Looking at the computer you can go to: \n[P]roperly built bridge in the lower safe levels for a nice view of some acidic falls and crystals \n[A]stro acidic falls to measure acidic levels like everyone else did");
            String in3 = A.input();
            in3 = in3.toUpperCase();
            //Add other options here
            //user goes to the properly built bridge
            if (in3.startsWith("P")){
                p.print("Off you go to the Properly Built Bridge. \nYou feel a rush to get there as soon as possible. The fear of missing out is growing inside of you.");
                p.print("Do you want to double check you selected the right location? [y/n]");
                String in4 = A.input();
                in4 = in4.toUpperCase();
                Boolean poorBridge = true;
                if (in4.startsWith("Y")){
                    p.print("Oh, seems like you had typed poorly built bridge, lets get that fixed. \nsaved yourself such a hassle didn't you");
                    poorBridge = false;

                }
                else{
                    p.print("You're right, why should we waste time, lets get moving");
                    poorBridge = true;
                }
                p.print("Along the way you see different stalagmites on the floor. Above each are stalactites. As the cave opens up they look like... oh no");
                p.print("You hear some clicking sounds echoing behind you, you have just turned a corner in the cave and are out of view if anything were to chase you. \nDo you start to \n[r]un right after the corner, hoping to out run the thing chasing you \n[c]over behind a quartz stalagmite, hope that it runs right past you \n[h]ide in a hole under the stalagmite formation, hope that even if it checks it won't see you");
                String in5 = A.input();
                in5 = in5.toUpperCase();
                if (in5.startsWith("C")){
                    p.print("You cover behind a formation of stalagmite. Metallic footsteps run past you. You hear a crash sound as the robotic creature turns the corner. \n You go to investigate, whatever was chasing you had just fallen into a river of acid.");
                    if (mask){
                        p.print("Since you have a mask and the poisonous gas won't harm you. You go closer to investigate. \nThe robot matches exactly what a specter would look like. This confirms they're real.");
                    }
                    else{
                        p.print("You can't go that close due to the gasses from the river of acid. However it's a good sign, that means the Astro Acidic falls should be nearby");
                    }
                }
                if (in5.startsWith("H")){
                    p.print("You hide in a hole under the formation of quartz stalagmites. Unfortunate for you, the hole was formed by acid. \nEven though your suit is acid resistant, the high concentration in the hold burns through part of your suit and causes you to scream. \n Your flesh starts to melt, a loud scream leaves your mouth. To end it all, you feel something stab through your back.");
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
                        p.print("You slow down and make the corner, behind you can hear a metallic crash against the cave walls. The entire cave system seems to vibrate from this. \nThe crash was enough to make the smaller stalactites fall on you");
                        p.print("Ending: \nDeath From Above \n There are " + ending_ammount +" endings");
                        return kill_count;
                    }
                    if (in6.startsWith("Q")){
                        p.print("You run even faster towards the end of this tunnel, much to fast to make the corner. What were you thinking? You crash into the walls of the cave. \nYou just served the specter an Egg Head Omelette");
                        p.print("Ending: \n Five Star Egg Headed Omelette \n There are " + ending_ammount +" endings");
                        return kill_count;
                    }
                    if (in6.startsWith("K")){
                        if (day >=7){
                            p.print("Due to the past acid rains the floor is a lot more slippery, you slip and crash into the floor in-front of you knocking you out. \nThe thing chasing you finishes the job ");
                            p.print("Ending: \n Slip & Slide \n(There are" + secret_endings+ ")" + "\n there are " + ending_ammount +" endings");
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
                                    p.print("You jab the blade into the Specters red eye. It seems to have disabled it for a bit. \nYou let go of the blade in it's eye and turn around to run. \n A loud mechanical roar, the sound of it's robotic joints griding, The distance between you and the Specter is closed almost instantly. " );
                                    p.print("Ending: \n Slowest Drawer Down South \n There are " + ending_ammount +" endings");
                                    return kill_count;
                                }
                                else if(in7.startsWith("S")){
                                    p.print("You put all your force into a single stab motion at the upper crimson token. \nThe red tinted blade make a hiss as it penetrates the many layers of armor, sealing in whatever could come out. Unfortunately you had stabbed the processor of the Specter at a very aggressive angle. \n A large hiss is heard as the seal isn't formed fast enough to hold back the immense heat that is released, cooking you and anything in the cave.");
                                    p.print("Ending: \n What's for Dinner? \n There are " + ending_ammount +" endings");
                                    return kill_count;
                                }
                                else if(in7.startsWith("I")){
                                    p.print("The blade hits the fission cell of the Specter. Fortunately, as it was designed for this, the blade seals the core before any of the immense energy could escape.\nGood thing you had chosen this blade. \n The name Lucifer Nix glows as you pull the blade out again.");
                                    kill_count +=1;
                                }
                                else{
                                    p.print("You stood there in fear the metallic limbs shred your flesh into pieces.");
                                    p.print("Ending: \n Abject Failure \n There are " + ending_ammount +" endings");
                                }

                            }
                            else if (literOfVodka || bottleOfTequila){
                                p.print("You pull out the alcohol and smash it on the ground, a spark from the specters mechanical body sets it off. It's burning. \n Unfortunelty the metal doesn't burn hot enough to do damage. A flaming bladed leg impales. The red eyes meet you as the flames cirlce behind the specter. You're final moments");
                                p.print("Ending: \n A Toast to Thee \n There are " + ending_ammount +" endings");
                                return kill_count;
                            }
                            else{
                                p.print("You turn to look back, the last thing you see is a metallic blade reach your face. Before it does you trip and hit your head on the ground concussing you. \nAtleast you didn't feel any pain");
                                p.print("Ending: \n Painless Perishing \n There are " + ending_ammount +" endings");
                                return kill_count;
                            }
                        }
                    }
                }
                p.print("The rush of adrenalin as your own mortality has just presented before you. Perhaps it's best to forget what just happened. \n With quivering feet you continue in the lybrith of tunnels towards Astro Falls");
                p.print("Before you there are pretty crystals, do you go \n [a]dmire them and calm yourself down? \n [i]gnore them and keep walking \n [k]eep your pace and just look at them while walking?");
                String in6 = A.input();
                in6 = in6.toUpperCase();
                if (in6.startsWith("A")){
                    p.print("You stop and admire the crystals. Maybe you're wasting some time but it doesn't matter to you");
                }
                if (in6.startsWith("I")){
                    p.print("You ignore the crystals and just keep walking. You don't need a distraction, you need to process what just happened");
                }
                if(in6.startsWith("K")){
                    p.print("You keep your pace, thinking about what just happened but also letting yourself be distracted by the beauty of the crystals.");
                }
                p.print("You made it  out of the crystallized portion of the caves.");
                //now everything is determined based off if they choose to double-checked or not
                //if the player didn't double-check they're going to the poor bridge (this doesn't mean death however)
                if (poorBridge)
                {
                    p.print("There is a fork in the tunnels. One side seems to be walked upon a lot, the other side seems to be abandoned. \n Looking at your computer you see that you need to head to the poorly built area.");
                    p.print("As you walk you see a drive on a stalagmite. \nThis might be your only chance to play it as if it were to continue to stay here then it would probably end up unreadable from the acid.");
                    p.print("Do you plug in the drive into your computer? [y/n]");
                    String in7 = A.input();
                    in7 = in7.toUpperCase();
                    if (in7.startsWith("Y")) {
                        for (int i = 0; i < 8; i++) {
                            p.print(Video.video(i + 1));
                            p.print("Continue?  [y/n]");
                            in7 = A.input();
                            in7 = in7.toUpperCase();
                            if (in7.startsWith("N"))
                            {
                                break;
                            }
                            else
                            {
                                p.print("Computer tries it's best to continue");
                            }
                        p.print("Your perspective is very much changed. Every step you take must be taken with caution now. Fear courses through you. Nothing but pure, raw, fear.");
                        }
                    }
                    else if(in7.startsWith("N")){
                        p.print(("You left the drive on the quarts. A drop of acid drops from the roof on the drive, rendering it useless now"));
                    }
                    else{
                        p.print("You hesitated to make a decisions, A drop of acid drops from the roof on the drive, rendering it useless now");
                    }
                    p.print("Continuing your path, while you can't see the acidic river to your left, you can certainly hear it. You're getting close to the bridge");
                    p.print("Eventually you can see the bridge, it's very high above a rushing river of acidic. \n Looking at it closer it doesn't seem to be new. Confused you look at your computer. \n This entire time you've had your directions to the Poorly built bridge. Not the Properly built bridge. \n Not time to regret, behind you a mechanical growl sounds. It sounds like metal grinding against metal. Fear grows inside you again");
                    p.print("\n[r]un across the bridge and hope for the best \n [h]ide behind a rock formation");
                    if (bottleOfTequila||literOfVodka){
                        p.print("[b]urn the bridge as you run across it with your alcohol");
                    }
                    if(redTintedSword){
                        p.print("[s]tay and fight back");
                    }
                    String in8 = A.input();
                    in8 = in8.toUpperCase();
                    if (in8.startsWith("R")){
                        p.print("You run across the bridge. Loud thunderous crashes get louder. As you get to the other side you look back. \n There is a large hole in the middle of the bridge, what ever was chasing you has fallen into the acid river deep below you.");
                    }
                    if (in8.startsWith("H")){
                        p.print("You hide behind a rock formation");
                        p.print("You hid behind a rock formation in view of the Specter. You fool...");
                        p.print("Ending: \n Hide and Go Seek Galactic Champion \n There are " + ending_ammount +" endings");
                        return kill_count;
                    }
                    if (in8.startsWith("B")){
                        p.print("As you run across the bride, you throw down the bottle, it shatters and sprays alcohol everywhere. The spark from the mechanical body of the specter causes the liquid to catch fire. \n Unfortunately the bridge is extremely flammable, and you're still on it.");
                        p.print("Ending: \n Fire Safety \n There are " + ending_ammount +" endings");
                        return kill_count;
                    }
                    if(redTintedSword){
                        if(in8.startsWith("S")) {
                            p.print("You pull out your Red Tinted Switch Blade. The name Lucifer Nix glows as the blade jumps out from the handle. You turn around to see a Specture behind you. \n With the time you have there's only three places you can stab it. Do you \n[s]tab it in the red glowing eyes \n [j]ab the upper glowing circle on it's body \n [i]mpale the lower glowing circle, [d]etach it's leg");
                            String in9 = A.input();
                            in9 = in9.toUpperCase();
                            if (in9.startsWith("J")) {
                                p.print("You jab the upper level token of the Specter. A loud hiss is heard as the blade seals the processor again, not allowing for any heat to escape. \nThe blade was designed for this, the name Lucifer Nix glows as you pull the blade out. \nThe specter's body falls to the rushing river below.");
                            }
                            else if (in9.startsWith("S"))
                            {
                                p.print("You don't even get to reach the glowing red eyes before one of it's four arms slices your hand. \nThe pain makes you drop the blade. The other limbs enter your body. It's over for you");
                                p.print("Ending: \n Sliced and Diced? \n There are " + ending_ammount + " endings");
                                return kill_count;
                            }
                            else if (in9.startsWith("I"))
                            {
                                p.print("The blade hits the fission cell of the Specter. However, The blade entered at such a terrible angle that it couldn't seal. \nYour brain couldn't even register what happened as the force of a fission explosion blows you up");
                                kill_count += 1;
                                p.print("Ending: \n Kim Jon Boom! \n There are " + ending_ammount + " endings");
                                return kill_count;
                            }
                            else if (in9.startsWith("D"))
                            {
                                p.print("The blade hits the fission cell of the Specter. Fortunately, as it was designed for this, the blade seals the core before any of the immense energy could escape. \nGood thing you had chosen this blade. \n The name Lucifer Nix glows as you pull the blade out again.");
                                kill_count += 1;
                            }
                            else
                            {
                                p.print("You stood there on the bridge as a long shard of metal speared through you into.");
                                p.print("Ending: \n No Reaction \n There are " + ending_ammount + " endings");
                            }
                        }

                    }
                    p.print("As you get to the other side, the bridge collapses behind you. It's fine, the computers says you can take another path to go back");
                    p.print("You realize that you're on a little ledge, with walls all around you, there is no way to go back. You're stuck here.");
                    if(bottleOfTequila||literOfVodka){
                        p.print("You take one shot and accept your fate, you've failed. It's fine, you were probably going to be taken by those things anyway.");
                    }
                    p.print("Ending: \n Stranded Skeleton \n There are " + ending_ammount + " endings");
                    return kill_count;
                }

                //end of poor bridge
                //if the player did double-check then they are going to the properly built bridge (this doesn't guarantee they live however)
                else{
                    p.print("There is a fork in the tunnels. One side seems to be walked upon a lot, the other side seems to be abandoned. \n Looking at your computer you see that you need to head to the side that has been used a lot.");
                    p.print("As a matter of fact there are a lot of footsteps here. Almost too much.");
                    if(day >=7){
                        p.print("Maybe this is where everyone went off too");
                    }
                    p.print("As you walk you see a group of students huddled around a humidity detector. An instrument that detects the amount of dangerous particles in the air. \nAs you walk closer to them you see many things that are wrong. The device isn't even on, the students aren't speaking, they're blankly staring at the screen. \nThey all turn to look at you, lifeless eyes stare you down. \n[w]alk away calmly \n[m]ake your presence known, ask whats sup, show them you're not afraid");
                    if(literOfVodka||bottleOfTequila){
                        p.print("[o]ffer them some to get along better");
                    }
                    if(redTintedSword){
                        p.print("[c]hannel into your inner Metal Gear Solid and start slicing and dicing!");
                    }
                    String in7 = A.input();
                    in7 = in7.toUpperCase();
                    if (in7.startsWith("W"))
                    {
                        p.print("As you slowly walk away, the group of students all get up and slowly walk towards you. As you increase your speed, they do as well. \nYou break into a sprint but it's too late. \nBehind you a metallic screech breaks the silence as a Stalker splits out of the body. Now you're body is it's new disguise");
                        p.print("Ending: \n New Fit \n There are " + ending_ammount + " endings");
                        return kill_count;
                    }
                    else if (in7.startsWith("M")){
                        p.print("As you start to ask the students what they're doing. Letting them know that they've used the machine wrong. \nTheir expression change from blank to anger. \nMetallic Screeches break the silence as the Stalkers beneath them reveal themselves. How things have changed");
                        p.print("Fortunately for you, all the stalkers decided to do their transformations at once. \nYou had taken a few steps back as they transformed. The metallic shrieks from them was enough to cause the stalactites above to crash down on them.");
                        p.print("With a new sense of confusion and slight fear you move on");
                    }
                    else if(in7.startsWith("O")){
                        p.print("You take out your bottle and offer to the group. They all look back at you with a blank stare. \nOne of the students walk up to you and knock the drink out of your hands. \nThe stalker underneath splits out and reveals itself. Letting loose a metallic screech as it does so. \nA stray spark strikes the alcohol and burns the two of you.");
                        p.print("Ending: \n Fire Party \n There are " + ending_ammount + " endings");
                        return kill_count;
                    }
                    else if(in7.startsWith("C"))
                    {
                        p.print("You walk up to them, looking almost as blank as them. Without realizing you've just used a Stalker's weakness against them.\n They can't tell a stalker from person and they're most weakest when in a body. One of the students walks up to you.\nThe name Lucifer Nix is glows redder, the first Stalker doesn't stand a chance. A loud thud alerts the other stalkers. Their uploaded conciseness haven't even processed everything correctly. \nAnother one bites the dust, another one bites the dust. The stalkers are dead. All five of them. ");
                        kill_count += 5;
                    }
                    else{
                        p.print("You don't do anything, you just stare at the students before you, they stare back. \nA dangerous staring contest. Eventually one walks up to you slowly. A metallic smell fills the air. \nYou don't react, trying to stay blank. Eventually they Stalkers find you out. With a loud shriek the Stalker now uses you as it's disguise.");
                        p.print("Ending: \n Blank Stare \n There are " + ending_ammount + " endings");
                        return kill_count;
                    }
                    p.print("There's a chill in the air as you realize they weren't students, they were Stalkers.\n Scary things in the caves. Maybe it's time to call it quits and head back to campus. [y/n]");
                    String in8 = A.input();
                    in8 = in8.toUpperCase();
                    if(in8.startsWith("Y")){
                        p.print("You head back to the facility, claiming to be sick from the position gas they send you imminently to a medical infirmary in the Trinity. You are free at last");
                        p.print("Ending: \n Home Sick \n There are " + ending_ammount + " endings");
                        return kill_count;
                    }
                    else{
                        p.print("You continue through the cave, knowing what you're putting yourself through");
                    }
                    p.print("as you walk you see that there is a blue colored drive sitting on some rocks");
                    p.print("Do you plug in the drive into your computer? [y/n]");
                    String in9 = A.input();
                    in9 = in9.toUpperCase();
                    if (in9.startsWith("Y")) {
                        for (int i = 0; i < 8; i++) {
                            p.print(Video.video(i + 1));
                            p.print("Continue?  [y/n]");
                            in9 = A.input();
                            in9 = in9.toUpperCase();
                            if (in9.startsWith("N"))
                            {
                                break;
                            }
                            else
                            {
                                p.print("Computer tries it's best to continue");
                            }
                            p.print("Your perspective is very much changed. Every step you take must be taken with caution now.\n Fear courses through you. Nothing but pure, raw, fear.");
                        }
                    }
                    else if(in9.startsWith("N")){
                        p.print(("You left the drive on the quarts. A drop of acid drops from the roof on the drive, rendering it useless now"));
                    }
                    else{
                        p.print("You hesitated to make a decisions, A drop of acid drops from the roof on the drive, rendering it useless now");
                    }
                    p.print("As you make your way to the Properly Built Bridge you notice the lack of boot-prints leading back to the facility. \nThey all lead towards the facility");
                    p.print("Perhaps it's just a trick on your eyes, but each step towards the bridge seems to make to move further past your horizon");
                    if(mask)
                    {
                        p.print("You realize it's because the bridge is even lower in the cave system, you re-adjust your mask and you continue on");

                    }
                    else{
                        p.print("The Properly Built Bridge is deep in the caves. You don't have a mask you so you must take a different path there");
                        p.print("You turn around and run back before the gas gets to you. There is still a way to reach the bridge. You just need to find a work around. \nThe gasses fall from this tunnel into the river, another path to the bridge more higher up wouldn't have that problem");
                        if(redTintedSword){
                            p.print("You pull the Red Switch Blade out, the name Lucifer Nix glints in the little light in this part of the cave.");
                        }
                        p.print("The tunnel you are in is dark, you can barley see in front of you. \nThere is light at the end, you're almost there. Two red glowing eyes are behind you");
                        if (redTintedSword){
                            p.print("Do you \n[s]tay and fight or [r]un faster to get out?");
                            String in10 = A.input();
                            in10 = in10.toUpperCase();
                            if(in10.startsWith("R")){
                                p.print("You run out of the cave as fast as you can. Hiding right behind a wall, you watch as the Specter runs right past you and falls over the ledge. \nA distant splash signifies it's gone.");
                            }
                            else{
                                p.print("Either you stayed to fight or didn't react fast enough because here it comes. Do you [t]ake a jab at the upper red token, making sure to keep your blade at a low angle \n[i]mpale the lower red token, keeping your blade at a low angle \n[s]tab it's eye");
                                String in11 = A.input();
                                p.print("It didn't matter what you decided to do, the Stalker before you was an Chief Automaton. \nWith the crossbow on it's arm it shoots a bolt right through you. The pain forces you to the ground. \nA pair of red eyes looks down at you before ending your suffering");
                                p.print("Ending: \n Firing Squad \n There are " + ending_ammount + " endings");
                                return kill_count;
                            }
                        }
                    }
                    p.print("You make it bridge and look at the view. Below you is the rushing acidic river, most acidic rains funnels into here and goes deeper into the planet. \nHigh above you is the remnants of the Poorly Built Bridge. Good thing you didn't end up taking that one");
                    p.print("You take the measurements you need and head back. You're never coming back to this planet again.");
                    p.print("Ending: \n What a Good Student \n There are " + ending_ammount + " endings");
                    return kill_count;

                }
            }   //end of going to the Proper Bridge
            //end of Bridge
            if (in3.startsWith("A")){
                p.print("You head over to the Astro Acidic Falls");
                p.print("While walking the computer detects a short cut, do you take it? [y/n]");
                String in4 = A.input();
                in4 = in4.toUpperCase();
                if (in4.startsWith("Y"))
                {
                    p.print("You look at the 'shortcut' it's a narrow tunnel that cuts straight to the falls.");
                    if(redTintedSword){
                        p.print("Noticing that there's some flora growing through the narrow tunnel. You pull out your blade");
                    }
                    p.print("As you go through the narrow path, your suit is punctured by a thorn. \nYour suit will regenerate but a drop of blood lands on the plant. They're all active now");
                    p.print("Do you \n[r]un through the tunnel as fast as possible \n[s]tand absolutely still and hope they won't find you");
                    if(redTintedSword){
                        p.print("[m]asacure this plant for even THINKING of attacking you");
                    }
                    if(literOfVodka){
                        p.print("[g]ive this plant some Potato Juice");
                    }
                    if(bottleOfTequila){
                        p.print("[g]ive this plant a Latino welcoming party");
                    }
                    String in5 = A.input();
                    in5 = in5.toUpperCase();
                    if(in5.startsWith("R")){
                        p.print("The movement of you running through the tunnel alerts more parts of the plant. \nEventually it catches you by your legs. You fall face first on hard quarts. You're skeleton won't even be found.");
                        p.print("Ending: \n Run Forrest. Run! \n There are " + ending_ammount + " endings");
                        return kill_count;
                    }
                    else if(in5.startsWith("S")){
                        p.print("By standing still the plant can't sense where you are. Your suit masks your breathing and heartbeat. \nYou walk slowly through this part of the tunnel.");
                    }
                    else if(in5.startsWith("G")){
                        p.print("You pour some of your drink on the plant. It reacts by violently recoiling back. It feels fear. \nYou walk through, the plant avoiding touching you. In fact, it recoils away the moment it feels you walk. ");
                    }
                    else if(in5.startsWith("M")){
                        p.print("The feeling of massacring this plant courses through your veins. You cut the first thorned vine. It drains of green and turns brown as it falls to the ground. \nThe plant reacts by wanting to attack you more, ever slice you do the more violently the plant reacts. \nEventually there is no plant, there is nothing but dead brown vegetation matter by your feet. \nIn fact one could say there never was a plant. Only thing in this part of the tunnel is you and the glowing name of Lucifer Nix");
                        kill_count +=1;
                    }
                    else{
                        p.print("You just stood there, but you didn't stand still. You're scared. Your little shivering is sensed by the plant. It slowly crawls towards you. \neventually wrapping you in a thorn filled cocoon. You'll feed it for a anther Solstice.");
                        p.print("Ending: \n Compost \n There are " + ending_ammount + " endings");
                        return kill_count;
                    }
                    p.print("As you walk through the tunnel see that it opens up a bit more. \nNot just a bit more, it opens up a lot. It branches off into other tunnels. \nLooking at your computer you stick to the tunnel you started on. Clicking footsteps are all around you. \nFear, Pure Raw Fear.");
                    p.print("[e]cape \n[h]ide");
                    String in6 = A.input();
                    in6 = in6.toUpperCase();
                    if(in6.startsWith("E")){
                        p.print("You run as fast as you can through the tunnels, following the computers lead. Sounds of clicking is always nearby. \nYou make it out of the tunnel system. You're still on track for the falls. \nAs you made it out you accidentally kick a piece of metal at the end of the tunnel. \nA wall brace falls over behind you. Sealing the Automatons away.");
                    }
                    if(in6.startsWith("H")){
                        p.print("You hide behind a quartz structure of sorts. Sadly for you the Specter after you is a Chief Automaton. \nThey can think for themselves and know that you're hiding. \nSmashing the structures near you as it gets closer it finally hits the structure you were behind.");
                        if(redTintedSword){
                            p.print("As you stumble back, the blade cuts against your suit. As blood drips down it the name Lucifer Nix glows a deep crimson. \nJust the name alone is enough to make the automaton stop.");
                            p.print("[l]et it run away");
                            p.print("[r]ip and tear until it is done");
                            String in7 = A.input();
                            in7 = in7.toUpperCase();
                            if(in7.startsWith("L")){
                                p.print("You look into the crimson eyes of the Chief Automaton. It's thinking, everytime it tries to make a move it stops itself. \nThis goes on for a while but eventually it's thirst for blood gets the better of it.");
                                p.print("Ending: \n Out as a pacifist \n There are " + ending_ammount + " endings");
                                return kill_count;
                            }
                            if(in7.startsWith("R")){
                                p.print("You've made your decision.");
                                in6 = "R";
                            }
                            else{
                                p.print("You look into the crimson eyes of the Chief Automaton. It's thinking, everytime it tries to make a move it stops itself. \nThis goes on for a while but eventually it's thirst for blood gets the better of it.");
                                p.print("Ending: \n Out as a pacifist \n There are " + ending_ammount + " endings");
                            }
                        }
                        if(in6.startsWith("R")){
                            p.print("It feels like the blade is speaking to you. The Chief Automaton hesitates. \nA fatal mistake, it's freewill being a fatal flaw. \nYou decapitate it, the blade cutting through the armor around the neck, you stab both upper and lower glowing tokens on it's body. \nThe sound attracts more Automatons, The blade speaks to you, it tells you what to do. \nFirst it was the Chief, now you're torn through another Automaton. Then anther. A fourth tries to get you from behind, only to be rendered useless.");
                            kill_count +=4;
                            p.print("This part of the tunnel is starting to collapse. The only exit has an Automaton before it.");
                            p.print("[A]void the Automaton, there is an exit behind you. even it's farther away \n[R]ip and Tear");
                            String in8 = A.input();
                            in8 = in8.toUpperCase();
                            if (in8.startsWith("A")){
                                p.print("You turn around and try to get to the exit behind you, you were not fast enough. The ceiling above you crashes down on you. \nBuried under an unmovable amount of quartz the blade of Lucifer Nix lays with it's user. Another blade lost to time.");
                                p.print("Ending: \n Out with a Bang \n There are " + ending_ammount + " endings");

                            }
                            else if(in8.startsWith("R")){
                                p.print("You Lunge at the automaton. You and the blade are now one. \nDespite the automaton balancing on three legs, you dodge all seven of it's free limbs. \nIn a desperate moment it reaches back with it's crusher arms to grab a spear. \nIt's far to late for it. You've stabbed through it's processor. The heat is sealed away and the metallic body goes limp.");
                                kill_count += 1;
                            }
                        }
                        else{
                            p.print("Ending: \n Lack of Construction Equipment \n There are " + ending_ammount + " endings");
                            return kill_count;
                        }
                    }
                    p.print("You make your way to Astro falls. ");
                    if(day >=7){
                        p.print("The recent rains have made it more beautiful");
                    }
                    p.print("You pull out your equipment and start taking measurements. A drive nearby gets your attention.");
                    p.print("Do you plug in the drive into your computer? [y/n]");
                    String in9 = A.input();
                    in9 = in9.toUpperCase();
                    if (in9.startsWith("Y")) {
                        for (int i = 0; i < 8; i++) {
                            p.print(Video.video(i + 1));
                            p.print("Continue?  [y/n]");
                            in9 = A.input();
                            in9 = in9.toUpperCase();
                            if (in9.startsWith("N"))
                            {
                                break;
                            }
                            else
                            {
                                p.print("Computer tries it's best to continue");
                            }
                            p.print("Your perspective is very much changed. Every step you take must be taken with caution now.\n Fear courses through you. Nothing but pure, raw, fear.");
                        }
                    }
                    p.print("You head back to the facility, taking the normal path. You're never coming back here again.");
                    if(in6.startsWith("R")){
                        p.print("Ending: \n Rip and Tear, Until it is Done \n There are " + ending_ammount + " endings");
                        return kill_count;
                    }
                    else{
                        p.print("Ending: \n Falling Water \n There are " + ending_ammount + " endings");
                        return kill_count;
                    }
                }
                //Not taking the shortcut just leads you to the normal storyline
                else if (in4.startsWith("N")){
                    p.print("Guess you'll go the same way as everyone else");
                }
            }

            // End of Astro Acidic Falls If Statement

        }
        //end of if computer if statement
        //everything else is based off them not having the computer
        p.print("Alright, now that you have your acidic instruments you head over to the Astro Acidic Falls like the other students had. \nYou catch up to a group of students.They're all chatting about how nice the waterfall will look. ");
        p.print("Along the way you see the crystallized part of the caves. \n[c]heck out the crystals and break away from \n[k]eep walking with the students");
        String in3 = A.input();
        in3 = in3.toUpperCase();
        if(in3.startsWith("K")){
            p.print("You keep walking with the students");
        }
        //walking with students
        else if (in3.startsWith("C")){
            p.print("You walk to the crystals. They look beautiful.");
            p.print("While looking at crystals you see a purple hard drive sitting on one.");
            if(computer){
                p.print("Do you plug in the drive into your computer? [y/n]");
                String in9 = A.input();
                in9 = in9.toUpperCase();
                if (in9.startsWith("Y")) {
                    for (int i = 0; i < 8; i++) {
                        p.print(Video.video(i + 1));
                        p.print("Continue?  [y/n]");
                        in9 = A.input();
                        in9 = in9.toUpperCase();
                        if (in9.startsWith("N"))
                        {
                            break;
                        }
                        else
                        {
                            p.print("Computer tries it's best to continue");
                        }
                        p.print("Your perspective is very much changed. Every step you take must be taken with caution now.\n Fear courses through you. Nothing but pure, raw, fear.");
                    }
                }
            }
            else{
                p.print("too bad you don't have a computer or you could see what was in it.");
            }
            p.print("As you think, you feel the ground shake behind you. It causes the drive to fall into a puddle of acid. \nBehind you a machine is drilling for samples of crystals.");
            p.print("You look at the machine for a bit, it has a red light on its top. Slowly the red flashing light turns into a solid red. The red turns more Crimson. \nOut from behind the light appears an Specter. It was waiting for you to peer off alone.");
            p.print("[r]un \n[h]ide ");
            if(redTintedSword){
                p.print("[f]ight back");
            }
            if(bottleOfTequila||literOfVodka){
                p.print("[b]urn");
            }
            String in4 = A.input();
            in4 = in4.toUpperCase();
            if (in4.startsWith("R") || in4.startsWith("B")) {
                if (in4.startsWith("R")) {
                    p.print("You run out there as fast as you can. \n You can hear the clicking of the Automaton get louder and louder. Then a loud metal clang. \n[r]ight through a tunnel \n[l]eft straight ahead");
                    String in5 = A.input();
                    in5 = in5.toUpperCase();
                    if (in5.startsWith("R")){
                        if(mask){
                            p.print("You go through the tunnel and watch as automaton gets stuck as the tunnel narrows. You get out on the other side.");
                        }
                        else{
                            p.print("You go through the tunnel and watch as automaton gets stuck as the tunnel narrows. \nWhat was this tunnel labeled again? Excess waste gas or something?");
                            p.print("Ending: \n  Literally Illiterate \n There are " + ending_ammount + " endings");
                            return kill_count;
                        }
                    }
                }
                if(in4.startsWith("B")){
                    p.print("You run out of there as fast as possible. You turn back and throw your bottle at where that where the automaton had stood. \nThe artificially high levels of oxygen in the crystal section create a spectacular fireball. \nWhile it doesn't disable the automaton it does let you escape. ");
                }
            }
            else if (in4.startsWith("F")){
                p.print("You pull the blade out. Still scared, the blade seems to want something from you. It feels like it's speaking to you. \nToo late for that... \n[s]tab \n[d]odge");
                String in5 = A.input();
                in5 = in5.toUpperCase();
                if (in5.startsWith("S")){
                    p.print("You try to stab the Automaton, you're too slow. You have one blade, each of the automatons are a blade. You're pierced and turned inside out.");
                    p.print("Ending: \n  You're Not That Guy Pal \n There are " + ending_ammount + " endings");
                    return kill_count;
                }
                else if(in5.startsWith("D"))
                {
                    p.print("You duck, narrowly avoiding the Specter's sharp armed aimed at your neck. As you do the blade cuts the skin on your fingers. \nFew drips of blood edge onto the blade. The name Lucifer Nix glows red. \nIt's bonding with you. You can feel it speak to you");
                    p.print("Soon there isn't even an Automaton, just a heap of scrap metal. \nEach of it's limbs are cut out, the formly crimson eyes are flickering, and both the processor and nuclear core have been disabled.");
                    kill_count +=1;
                }

            }
            //end of running
            else if(in4.startsWith("H")){
                p.print("You hide behind another machine, this one a stationary ground inspector. Wait, didn't the automaton see you hide here? \nA jab to your stomach confirms that indeed it did");
                p.print("Ending: \n  Hide and Seek 101 \n There are " + ending_ammount + " endings");
                return kill_count;
            }
            p.print("Well now you have no idea where you are, where you're support to go. Or how to get anywhere.");
            if (computer){
                p.print("Oh right you have the computer to tell you where to go.");
                p.print("\n[g]ive up? \n[k]eep going! ");
                String in6 = A.input();
                in6 = in6.toUpperCase();
                if(in6.startsWith("G")){
                    p.print("You decide to call it quits and just go back the facility. This trip was worthless anyway");
                    p.print("Ending: \n  The Quiet Quitter \n There are " + ending_ammount + " endings");
                    return kill_count;
                }
            }
            //if they don't have the computer then they're lost if they do then they go to walking
            else{
                p.print("You're lost and I guess it doesn't matter if you get to the research place or not.  \n[l]eft down deeper \n[r]ight stay on the same level");
                String in6 = A.input();
                in6 = in6.toUpperCase();
                if (in6.startsWith("L")){
                    if(mask){
                        p.print("You head deeper and lower into the cave system");
                        p.print("As you head deeper it gets more and more quite. \nThere are no more clicking sounds. You feel at peace... You could stay here for ever.");
                        p.print("[g]o back, [s]tay");
                        String in7 = A.input();
                        in7 = in7.toUpperCase();
                        if(in7.startsWith("G")){
                            p.print("This feels wrong. You shouldn't be done here. It's too peaceful. \nYou rush out of the lower part of the cave. You don't know where you're running to. \nThere, who... Where? Nothing... \nThere is no more cave. There is nothing anymore.... Where are you?");
                            p.print("Everything is a bright blinding white. There is no exit or entrance. You're in some place in between. \nA panel appears before you, as you press the buttons on it you are viewing different parts of the cave as if you were there.\nYou're in a viewing room of sorts. But this wasn't made by the facility. This is too advanced. \nYou watch students walk by, Spectres run through the cave. Here you are everywhere and no where all at once.....");
                            p.print("[l]eave \n[s]tay");
                            String in8 = A.input();
                            in8 = in8.toUpperCase();
                            if (in8.startsWith("L")){
                                p.print("This is wrong, you want to leave. You must leave. You know this isn't right. But how do you get out? There's no exit... \nYou take steps back from the panel until you hit a wall. You push it with all your might. You can't get out. \nYou break down, screaming, kicking. Then it happens. A man in a uniform appears with a rail-rifle of sorts. \nAfter some calming words you wake up back in the facility... \nWhat happened?");
                                if (redTintedSword){
                                    p.print("Last thing you remember hearing was him saying 'Приятел, where did you find this?'");
                                    p.print("You still have the blade....");
                                }
                                p.print("Ending: \n  Power of Levski \n There are " + ending_ammount + " endings");
                                return kill_count;
                            }
                            else{
                                p.print("You're too fantasized about the idea of being ubiquitous, omnipresent, and yet so absent. It's intoxicating... \nɎꝋᵾ ꞩⱳīłł ꞩⱦⱥɏ ħēɍē ӻꝋɍēꝟēɍ");
                                p.print("Ending: \n  The Viewing Room \n There are " + ending_ammount + " endings");
                                return kill_count;
                            }
                        }
                        else{
                            p.print("You feel at home here. No busy assignments. Nothing to bother you, no one to distrust you. 𝔶o҉𝔲 𝔰w҉𝔦l҉𝔩 𝔰t҉𝔞y҉ h҉𝔢r҉𝔢 𝔣o҉𝔯e҉𝔳e҉𝔯");
                            p.print("Ending: \n  Inner Peace \n There are " + ending_ammount + " endings");
                            return kill_count;
                        }
                    }
                    //End of going deeper in the cave
                    else{
                        p.print("You head deeper, but you don't have a mask. Slowly you succumb to the poisonous gas");
                        p.print("Ending: \n  Eating Air \n There are " + ending_ammount + " endings");
                        return kill_count;
                    }
                }
                if (in6.startsWith("R")){
                    p.print("You take a right, staying at roughly the same level as you always have been. \nStaying level with about where you started. You're very very lost... \nYou should just stay in one spot but that doesn't matter anymore. \nAs you walk you see arrows. A very human thing, no other species in Center Fold uses arrows. \n[f]ollow them as you have no other option \n[g]o the opposite direction");
                    String in7 = A.input();
                    in7 = in7.toUpperCase();
                    if(in7.startsWith("F")) {
                        p.print("With no other option you follow them");
                        p.print("As reach an extractor of sorts. What is a machine like this doing here? ");
                        p.print("You see people, speaking, real people. They're messing with the machine. \n[t]alk to them. maybe they'll help \n[s]tay hidden and see what they do");
                        String in8 = A.input();
                        in8 = in8.toUpperCase();
                        if (in8.startsWith("T")){
                            p.print("As you walk up them, one of them raises a rifle to shoot you. A pellet goes through your arm");
                            if(redTintedSword){
                                p.print("It splatters on the blade... It's awakened. It speaks to you. It knows what to do and you follow it. \nYou know where the bullets are going, deflecting them with the blade. No one stands a chance against you. \nThe red coating turns cinnamon, you're unbeatable now. \nSoon the three of them are on the ground, they can't harm you now");
                                kill_count +=3;
                            }
                            else{
                                p.print("As you're on the ground, one of them makes you kneel, he walks behind you... It's over now");
                                p.print("Ending: \n  Execution Style \n There are " + ending_ammount + " endings");
                                return kill_count;
                            }
                            p.print("The back of the extractor has a map. You take it and walk back to the facility... \nIt's over now");
                            p.print("Ending: \n  Terminator \n There are " + ending_ammount + " endings");
                            return kill_count;
                        }

                    }
                    else{
                        p.print("You go in the opposite direction of the arrows. You don't need them anyway. \nAfter what feels like forever of walking you're nowhere. It feels like you've been walking in circles. \nAfter more forever of walking you realize you HAVE been walking in circles. You haven't seen an Specter, person, or anyone for who knows how long... \nNo food, no water. You're suit only has so much power left. Soon it's acidic protection will wear out.");
                        p.print("Ending: \n  Invest in Rechargeable Batteries \n There are " + ending_ammount + " endings");
                        return kill_count;
                    }

                }

            }
        }
        //end of crystals
        else{
            p.print("You don't know WHAT to do. You're left behind on your own. Being scared. The fear of being alone breaks you. You died :c \nType correctly next time");
            p.print("Ending: \n Can't Type \n There are " + ending_ammount + " endings");
            return kill_count;
        }
        p.print("You and the group of students reach the falls. It's just as beautiful as in the video. \n[t]ake the platform to get closer \n[s]tay where you are right now");
        String in5 = A.input();
        in5 = in5.toUpperCase();
        if (in5.startsWith("T")){
            if(mask){
                p.print("You take the platform to get closer, you can feel the rushing of the acid flowing down deep into the planet.");
                p.print("You dot down observations on the arm-pad on your suit.");
                p.print("The platform moves away from the falls, back to where you were before");
            }
            else{
                p.print("You don't have a mask to protect yourself, slowly the poisonous gas gets to you... \nReality fades away to darkness.");
                p.print("Ending: \n  Feeling Gassy \n There are " + ending_ammount + " endings");
                return kill_count;
            }
        }
        else{
            p.print("You stay where you are. Writing down observations on the arm-pad on your suit.");
        }
        p.print("It was beautiful, maybe. Nothing went wrong either.");
        if(in3.startsWith("K")){
            p.print("Ending: \n  Perfect Ending \n There are " + ending_ammount + " endings");
            return kill_count;
        }
        else{
            p.print("What happened...");
        }


        return kill_count;


    }
}
