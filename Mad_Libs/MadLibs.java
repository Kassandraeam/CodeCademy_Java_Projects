package Mad_Libs;

public class MadLibs {
    /*
    Your description here
    */
        public static void main(String[] args){
        
        // Create variables for the story.

        String name1 = "Kas";
        String name2 = "Gab";

        String adjective1 = "stinky";
        String adjective2 = "stinky";
        String adjective3 = "stinky";

        String noun1 = "kid";
        String noun2 = "bikes";
        String noun3 = "people";
        String noun4 = "humans";
        String noun5 = "footballs";
        String noun6 = "dog";

        String verb1 = "yell";

        String place1 = "Minneapolis";

        int number = 2022;

        
        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
      }       
  }
  
