public class Ruin {
     public static void main(String[] args){
        int startAmount = 500;
        double winChance = 0.5;
         int winLimit = 1000;
         int totalSimulations = 7;
         int roundsPlayed = 0;
         for (int days = 1; days <= totalSimulations; days++){
         // Daily
         int currentAmount = startAmount;
          while (currentAmount > 0 && currentAmount < winLimit)
           {roundsPlayed++;
            if(Math.random() < winChance) {
            currentAmount++;
            }
            else{
            currentAmount--;
         }
    } 
     if(currentAmount >0){
            System.out.println("Win");
         }
         else{
            System.out.println("Lost");
         }
         System.out.println(roundsPlayed);
}
}
}
