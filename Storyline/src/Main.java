import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int ending_ammount = 10;
        int secret_endings = 3;
        System.out.println("Welcome to Storyline, a Java game I'm doing because I've been told to. Yes this is all Cannon.");
        System.out.println("A few solstices ago you decided that you signed  yourself away to go study acidic cave formation on this rouge planet.\nWhile landing you saw the acidic rain for yourself. The middle levels of the caves are safe, however, going too deep will lead you to toxic gases.\nA gas mask would help you for a bit but the deepest parts of the caves too dangerous even with a mask.\nThere are rumors of specters that live in caves.\nScary six legged, four armed, two armed on two of their hands, each of their limbs sharper than most military blades.\nHowever, no evidence has been found, the rumors can be found on any planet. Any death can just be related with to the dangers of the cave system. \nEnough of this, your instruments are ready for testing. ");
        Scanner userString = new Scanner(System.in);
        //define yes and no
        //days in the planet
        int day = 0;
        //start the story
        while (true) {
            System.out.println("day: " + day);
            //user decides to stay or leave
            System.out.println("Are you going to leave today? [y]/[n]");
            String question = userString.nextLine();
            if (question.endsWith("y")) {
                System.out.println("Alrighty then lets go!");
                int ending = Story.story(day);
                p.print("kill count:");
                p.print(ending);
                break;

            }
            //if the user really wants to they can wait another day
            else if (question.endsWith("n")) {
                System.out.println("Tomorrow is another day");
                day += 1;
                p.print("Today was another tomorrow");
            }
            //error handling or something
            else
            {
                System.out.println("Input not recognized");
            }
            //Things that happen from day to day
            if (day == 2){
                p.print("Oh look we have a pizza party today :D");
            }
            if (day == 5){
                p.print("One of your classmates left earlier today and he hasn't come back, maybe he's so into the research");
            }
            if (day == 7){
                p.print("Acid rains today, the upper levels are very flooded and are flooding into the middle, good thing you stayed indoors today");
            }
            if (day == 11){
                //foreshadowing much?
                p.print("You hear some clicking footsteps echo through the cave system, I wounder what made them");
            }
            if (day == 15){
                p.print("Oh look they got Costco Pizza today! Wounder what planet they imported it from");
            }
            if (day == 21){
                p.print("Where did everyone go? You could swear there were more people here.");
            }
            if (day == 23){
                p.print("A transport ship meant to come here crashed on the surface, thankfully a Valkyries team came in and saved them \n well, now we're just going to have eat rations");
            }
            if (day == 25){
                p.print("people keep asking you to go to trips to explore but you keep denying them");
            }
            if (day==29){
                p.print("You're one of the few students still in the facility");
            }
            if (day == 30){
                p.print("The higher ups are questioning why you're actually here");
            }
            if (day >= 32)
            {
                System.out.println("You've wasted enough campus resources and you didn't do anything. They send you back to another planet. \n No one respects you anymore and you end up in deep depression.\n Eventually your grades force you to quit campus:");
                p.print("Ending: \n gone to soon \n(There are" + secret_endings+ ")" + "\n there are " + ending_ammount +" endings");
                break;
            }


        }
    }

}