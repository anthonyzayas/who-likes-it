class Solution {

    /**
      Returns a string containing the names of individuals
        who liked an item.
    
      @param names A list of names
      @return      String representing the names who Liked an item
      */
    public static String whoLikesIt(String... names) {
    
        //The number of likes is bassed off the amount of names.
        int numberOfLikes = names.length;
        
        //Determines which string to return based off the number of likes.
        switch(numberOfLikes) {     
          case(0) :
            return "no one likes this";
            
          case(1) :
            return names[0] + " likes this";
            
          case(2) :
            return names[0] + " and " + names[1] + " like this";
            
          case(3) :
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
          
          //Default case used when 4 or more likes occur
          default :
            return names[0] + ", " + names[1] + " and " + (numberOfLikes - 2) + " others like this";
       } 
    }
}
