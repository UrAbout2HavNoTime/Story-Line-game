public class Video {
    public static String video(int runtime) {
        String[] videos = {
                "Is this thing on? Здравей, I am Levski Velikov, I’ve been leaving these messages in my missions in case someone needs any form of guidance. \nThese caves aren’t the safest. In fact my приятел Automatons, or as you call them specters, lurk in them. \nIn their dark black cloaks, they waiting for someone like you to be an easy target for them. Don’t worry my приятелче, I’ll keep you safe.",
                "The video feed seems to break down, pixels on the screen die and re-appear. The screen descended into a mess of pixels.\n Finally, the video got itself together again.Now, as you already know, the silicon tetrafluoride likes to seep into the lower levels of the cave.\nHence, why no one lives at the bottom of these caves, it’s very lonely.\nThe automatons, or specters if you call them that, love to be at the upper levels, not too high as no one lives on --cuts off-- \nYou’re first step should be avoiding them at all costs.",
                "Once again, the audio distorts as the video breaks down. The sharp, pungent odor of hydrofluoric acid mixing with the silicon dioxide served as a warning of going too low.\n Maybe going up a few levels would be a wise decision, even if it was theoretically safe down here.\nThe sound of Levski’s voice broke the silence.Now, if you do find yourself face to face with such a beast, run. \nIt takes a high level of fighting experience to know how to fight one, instead, you should resort to taking advantage of their thirst for blood. \n Out of the --cuts off-- technique works on two of them. Hiding behind a corner, containers, or --audio breaks off--",
                "Most of you are probably students from a campus who came here for research. Such a tragedy it is. None of the authorities believes them to exist. \nStories have been told since before the formation of the lawless land of the Scrapyard. The automatons kn --cuts off-- They cannibalize their fallen for parts and missing --cuts off-- deep poisonous gas or the alkaline or acidic pools deep in the cave.\n No one knows the truth, and if they do it’s too late. --cuts off-- anyone as they won’t believe you. --cuts off-- to be safe. I pity you, скъпи студент, you shouldn’t be witness…",
                "Now if the automaton you're --cuts off-- but instead has two legs and four arms, I’m afraid you’ve found a stalker.\nThey wear the skin of their victims to lure --cuts off-- Any species. \nThey won’t speak, --cuts off-- suspect someone of being a stalker --cuts off-- In finding --cuts off-- a stalker…",
                "...Another advantage you have my приятел is that terrain is --cuts off-- \nAutomatons run head first, leading them into a cliff and having them trip into acid pools. Narrowing tunnels or slippery terrain --cuts off-- \nAs a matter of --cuts off--. I can show--cuts off--",
                "All Specters have two glowing parts on their --cuts off-- \nOne is a processor and the other a nuclear core.\nWith specialized weapons you can kill --cuts off-- either red token. Be careful with blades as --cuts off-- directly or heat or radiation will escape. --cuts off--\nprocessor will release a heat wave and --cuts off-- the core can explode with a --cuts off--",
                "So, I don’t know how much of this information will stay in this drive,--cuts off-- I hope the amount --cuts off-- teach you "
        };


        if (runtime >= 1 && runtime <= videos.length) {
            return videos[runtime - 1];
        }

        return "The drive is corrupted";
    }
}
