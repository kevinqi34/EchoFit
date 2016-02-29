
public class Woman
{

   public static void main (String [] args) {

       double[] arr = {600, 1200, 600, 180, 5.9, 27, 1.3};

       int[] arr2 = wlw(arr);

       System.out.println(arr2[0] + "\t" + arr2[1] + "\t" + arr2[2] + "\t" + arr2[3]);






    }



   public static int[] wgm(double[] dataw) {

       int[] returnArr = new int[4];
       double calorieintake,calorieconsumed, calrat, pintake, cintake, fintake;
       double proteinconsumed = dataw[0];
       double carbsconsumed = dataw[1];
       double fatconsumed = dataw[2];
       double weight = dataw[3];
       double height = dataw[4];
       double age = dataw[5];
       double em = dataw[6];

       calorieconsumed = proteinconsumed + carbsconsumed + fatconsumed;

       calorieintake = (665.09 + (9.56 * weight) + (1.84 + height) - (4.67 * age)) * em + 250;

       calrat = calorieconsumed/calorieintake * 100;
       pintake = (proteinconsumed/(calorieintake * .3)) * 100;
       cintake = (carbsconsumed/(calorieintake * .4)) * 100;
       fintake = (fatconsumed/(calorieintake * .3)) * 100;


       returnArr[0] = (int)calrat;
       returnArr[1] = (int)pintake;
       returnArr[2] = (int)cintake;
       returnArr[3] = (int)fintake;

       return returnArr;





    }





     public static int[] wlw(double[] dataw) {

       int[] returnArr = new int[4];
       double calorieintake,calorieconsumed, calrat, pintake, cintake, fintake;
       double proteinconsumed = dataw[0];
       double carbsconsumed = dataw[1];
       double fatconsumed = dataw[2];
       double weight = dataw[3];
       double height = dataw[4];
       double age = dataw[5];
       double em = dataw[6];

       calorieconsumed = proteinconsumed + carbsconsumed + fatconsumed;

       calorieintake = (665.09 + (9.56 * weight) + (1.84 + height) - (4.67 * age)) * em - 500;

       calrat = calorieconsumed/calorieintake * 100;
       pintake = (proteinconsumed/(calorieintake * .3)) * 100;
       cintake = (carbsconsumed/(calorieintake * .4)) * 100;
       fintake = (fatconsumed/(calorieintake * .3)) * 100;


       returnArr[0] = (int)calrat;
       returnArr[1] = (int)pintake;
       returnArr[2] = (int)cintake;
       returnArr[3] = (int)fintake;

       return returnArr;





    }




}
