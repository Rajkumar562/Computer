import java.util.*;
public class quiz
{
   public static void main()
   {
       Scanner sc=new Scanner(System.in);
       {
           System.out.println("*** WELCOME TO THE WORLD OF QUIZ!LET US SEE HOW FAR YOU CAN GO.***");
           System.out.println("******************************************************************");
           System.out.println();
           System.out.println("========================================================");
           System.out.println("1.***SPORTS***");
           System.out.println("2.***SCIENCE***");
           System.out.println("3.***GENERAL KNOWLEDGE***");
           System.out.println();
           System.out.println("========================================================");
           System.out.println("+++++ ENTER YOUR CHOICE +++++");
          int choice=sc.nextInt();
          if (choice==1)
          {
              int s=0;
              System.out.println("^^^^^^ GET READY FOR THE SPORTS QUIZ ^^^^^^");
              System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
              System.out.println();
              System.out.println("*****Which Indian Cricketer is popularly called 'Mahi'?*****");
              System.out.println("#### 1.Virat Kohli ####");
              System.out.println("#### 2.Sachin Tendulkar ####");
              System.out.println("#### 3.MS Dhoni ####");
              System.out.println("#### 4.Virendar Sehwag ####");
              System.out.println("========== ENTER YOUR CHOICE ==========");
              int v=sc.nextInt();
              if (v==3)
              {
                  System.out.println("~~~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~~~~");
                  s=s+50;
                  System.out.println(" YOUR SCORE IS "+s);
              }
              else
              System.out.println("^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRCT ANSWER IS MS DHONI. ^^^^^^^");
              System.out.println("***** Who is the first Indian woman to win an Asian Games gold in 400m run *****?");
              System.out.println("#### 1.M.L.Valsamma ####");
              System.out.println("#### 2.P.T.Usha ####");
              System.out.println("#### 3.Kamaljit Sandhu ####");
              System.out.println("#### 4.K.Malleshwari ####");
              System.out.println("========== ENTER YOUR CHOICE ==========");
              int a1=sc.nextInt();
              if (a1==3)
              {
                  System.out.println("~~~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~~~~");
                  s=s+50;
                  System.out.println(" YOUR SCORE IS "+s);
              }
              else
              System.out.println("^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRCT ANSWER IS Kamaljit Sandhu. ^^^^^^^");
              System.out.println("***** Which is the only cricketer to score a four hundred(not out) *****?");
              System.out.println("#### 1.Ricky Ponting ####");
              System.out.println("#### 2.Jacques Kallis ####");
              System.out.println("#### 3.Brian Lara ####");
              System.out.println("#### 4.Chris Harris ####");
              System.out.println("========== ENTER YOUR CHOICE ==========");
              int a=sc.nextInt();
              if (a==3)
              {
                  System.out.println("~~~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~~~~");
                  s=s+50;
                  System.out.println("YOUR SCORE IS"+s);
              }
              else
              System.out.println("^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS BRIAN LARA. ^^^^^^^");
              System.out.println("***** Track and field star Carl Lewis won how many gold medals at the 1984 Olympic games*****?");
              System.out.println("#### 1.TWO ####");
              System.out.println("#### 2.Three ####");
              System.out.println("#### 3.Four ####");
              System.out.println("#### 4.Eight ####");
              System.out.println("========== ENTER YOUR CHOICE ==========");
              int k1=sc.nextInt();
              if (k1==3)
              {
                  System.out.println("~~~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~~~~");
                  s=s+50;
                  System.out.println("YOUR SCORE IS"+s);
              }
              else
              System.out.println("^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS FOUR. ^^^^^^^");
              System.out.println("***** Who was the first Indian to win the World Amateur Billiards title? *****");
              System.out.println("#### 1.Geet Sethi ####");
              System.out.println("#### 2.Wilson Jones ####");
              System.out.println("#### 3.Michael Ferreira ####");
              System.out.println("#### 4.Manoj Kothari ####");
              System.out.println("========== ENTER YOUR CHOICE ==========");
              int l=sc.nextInt();
              if (l==2)
              {
                  System.out.println("~~~~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~~~~");
                  s=s+50;
                  System.out.println("YOUR SCORE IS"+s);
              }
              else
              System.out.println("^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRECT ANSWER IS WILSON JONES. ^^^^^^^");
              System.out.println("%%%%%% FINALLY YOU HAVE SCORED="+s+"POINTS %%%%%%%%");
              if(s<100)
              System.out.println("!!!!! SORRY! WE DON'T HAVE A PRIZE FOR YOU !!!!!!");
              else
              if(s>100 && s<200)
              System.out.println(" #### CONGRATULATIONS!YOU WIN A BIG GRAND KINETIC BOSS WITHOUT TYRES.HURRAY! ####");
              else
              if(s>200 && s<251)
              
              System.out.println("%%%%%%%%% CONGRATULATIONS!YOU WIN A LIFE LONG TRIP TO YOUR HOME.LUCKY GUY! %%%%%%%%");
          }
          else
          if(choice==2)
          {
              int s=0;
              System.out.println("^^^^^^ GET READY FOR THE SCIENCE QUIZ ^^^^^^");
               System.out.println("*****Which ray of light travels the fastest in any medium?*****");
              System.out.println("#### 1.Violet ####");
              System.out.println("#### 2.Red ####");
              System.out.println("#### 3.Blue ####");
              System.out.println("#### 4.Yellow ####");
              System.out.println("========== ENTER YOUR CHOICE ==========");
              int v1=sc.nextInt();
              if (v1==2)
              {
                  System.out.println("~~~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~~~~");
                  s=s+50;
                  System.out.println(" YOUR SCORE IS "+s);
              }
              else
              System.out.println("^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRCT ANSWER IS RED. ^^^^^^^");
               System.out.println("*****Which is the most ionic compound'?*****");
              System.out.println("#### 1.NaCl ####");
              System.out.println("#### 2.CaO ####");
              System.out.println("#### 3.KBr ####");
              System.out.println("#### 4.CsF ####");
              System.out.println("========== ENTER YOUR CHOICE ==========");
              int v2=sc.nextInt();
              if (v2==4)
              {
                  System.out.println("~~~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~~~~");
                  s=s+50;
                  System.out.println(" YOUR SCORE IS "+s);
              }
              else
              System.out.println("^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRCT ANSWER IS CsF. ^^^^^^^");
               System.out.println("*****Name an eye disease which is caused due to the uneven curvature of cornea?*****");
              System.out.println("#### 1.Night-blindness ####");
              System.out.println("#### 2.Presbyopia ####");
              System.out.println("#### 3.Astigmatism ####");
              System.out.println("#### 4.Cataract ####");
              System.out.println("========== ENTER YOUR CHOICE ==========");
              int v3=sc.nextInt();
              if (v3==3)
              {
                  System.out.println("~~~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~~~~");
                  s=s+50;
                  System.out.println(" YOUR SCORE IS "+s);
              }
              else
              System.out.println("^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRCT ANSWER IS ASTIGMATISM. ^^^^^^^");
               System.out.println("*****Which lens is used in Galilean Telescope?*****");
              System.out.println("#### 1.Convex Lens ####");
              System.out.println("#### 2.Concave Lens ####");
              System.out.println("#### 3.Bi-Concave Lens ####");
              System.out.println("#### 4.Bi-Convex Lens ####");
              System.out.println("========== ENTER YOUR CHOICE ==========");
              int v4=sc.nextInt();
              if (v4==2)
              {
                  System.out.println("~~~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~~~~");
                  s=s+50;
                  System.out.println(" YOUR SCORE IS "+s);
              }
              else
              System.out.println("^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRCT ANSWER IS CONCAVE LENS. ^^^^^^^");
               System.out.println("*****Which gland releases oxytocin hormone?*****");
              System.out.println("#### 1.Thyroid Gland ####");
              System.out.println("#### 2.Anterior Pituitary Gland ####");
              System.out.println("#### 3.Posterior Pituitary Gland ####");
              System.out.println("#### 4.Thymus ####");
              System.out.println("========== ENTER YOUR CHOICE ==========");
              int v5=sc.nextInt();
              if (v5==3)
              {
                  System.out.println("~~~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~~~~");
                  s=s+50;
                  System.out.println(" YOUR SCORE IS "+s);
              }
              else
              System.out.println("^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRCT ANSWER IS POSTERIOR PITUITARY GLAND. ^^^^^^^");
              System.out.println("%%%%%% FINALLY YOU HAVE SCORED="+s+"POINTS %%%%%%%%");
              if(s<100)
              System.out.println("!!!!! SORRY! WE DON'T HAVE A PRIZE FOR YOU !!!!!!");
              else
              if(s>100 && s<200)
              System.out.println(" #### CONGRATULATIONS!YOU WIN A BIG GRAND KINETIC BOSS WITHOUT TYRES.HURRAY! ####");
              else
              if(s>200 && s<251)
              
              System.out.println("%%%%%%%%% CONGRATULATIONS!YOU WIN A LIFE LONG TRIP TO YOUR HOME.LUCKY GUY! %%%%%%%%");
          }
          else
          if(choice==3)
          {
              int s=0;
              System.out.println("^^^^^^ GET READY FOR THE GENERAL KNOWLEDGE QUESTIONS ^^^^^^");
              System.out.println("*****What colour is Spock's blood?*****");
              System.out.println("#### 1.Red ####");
              System.out.println("#### 2.Violet ####");
              System.out.println("#### 3.Green ####");
              System.out.println("#### 4.Blue ####");
              System.out.println("========== ENTER YOUR CHOICE ==========");
              int v6=sc.nextInt();
              if (v6==3)
              {
                  System.out.println("~~~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~~~~");
                  s=s+50;
                  System.out.println(" YOUR SCORE IS "+s);
              }
              else
              System.out.println("^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRCT ANSWER IS GREEN. ^^^^^^^");
              System.out.println("*****Name the mammal which lay eggs?*****");
              System.out.println("#### 1.Elephant ####");
              System.out.println("#### 2.Tiger ####");
              System.out.println("#### 3.Duck ####");
              System.out.println("#### 4.Duck-Billed Platypus ####");
              System.out.println("========== ENTER YOUR CHOICE ==========");
              int v7=sc.nextInt();
              if (v7==4)
              {
                  System.out.println("~~~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~~~~");
                  s=s+50;
                  System.out.println(" YOUR SCORE IS "+s);
              }
              else
              System.out.println("^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRCT ANSWER IS DUCK-BILLED PLATYPUS. ^^^^^^^");
              System.out.println("*****Who invented television?*****");
              System.out.println("#### 1.Thomas Alva Edison ####");
              System.out.println("#### 2.Graham Bell ####");
              System.out.println("#### 3.John Logie Baird ####");
              System.out.println("#### 4.Issac Newton ####");
              System.out.println("========== ENTER YOUR CHOICE ==========");
              int v8=sc.nextInt();
              if (v8==3)
              {
                  System.out.println("~~~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~~~~");
                  s=s+50;
                  System.out.println(" YOUR SCORE IS "+s);
              }
              else
              System.out.println("^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRCT ANSWER IS JOHN LOGIE BAIRD. ^^^^^^^");
              System.out.println("*****Who invented nuclear reactor?*****");
              System.out.println("#### 1.Enrico Ferni ####");
              System.out.println("#### 2.Aaton Van Leewen Hock ####");
              System.out.println("#### 3.Michael Faraday ####");
              System.out.println("#### 4.Torricelli ####");
              System.out.println("========== ENTER YOUR CHOICE ==========");
              int v9=sc.nextInt();
              if (v9==1)
              {
                  System.out.println("~~~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~~~~");
                  s=s+50;
                  System.out.println(" YOUR SCORE IS "+s);
              }
              else
              System.out.println("^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRCT ANSWER IS ENRICO FERNI. ^^^^^^^");
              System.out.println("*****Name the first Indian to win two Oscar Awards?*****");
              System.out.println("#### 1.Bhanu Athaiya ####");
              System.out.println("#### 2.Jhumpa Lahiri ####");
              System.out.println("#### 3.Devika Rani ####");
              System.out.println("#### 4.A.R.Rahman ####");
              System.out.println("========== ENTER YOUR CHOICE ==========");
              int v10=sc.nextInt();
              if (v10==4)
              {
                  System.out.println("~~~~~~~~~ YOU ARE ON THE RIGHT TRACK! ~~~~~~~~~");
                  s=s+50;
                  System.out.println(" YOUR SCORE IS "+s);
              }
              else
              System.out.println("^^^^^^^ SORRY!BETTER LUCK NEXT TIME!THE CORRCT ANSWER IS A.R.RAHMAN. ^^^^^^^");
              System.out.println("%%%%%% FINALLY YOU HAVE SCORED="+s+"POINTS %%%%%%%%");
              if(s<100)
              System.out.println("!!!!! SORRY! WE DON'T HAVE A PRIZE FOR YOU !!!!!!");
              else
              if(s>100 && s<200)
              System.out.println(" #### CONGRATULATIONS!YOU WIN A BIG GRAND KINETIC BOSS WITHOUT TYRES.HURRAY! ####");
              else
              if(s>200 && s<251)
              
              System.out.println("%%%%%%%%% CONGRATULATIONS!YOU WIN A LIFE LONG TRIP TO YOUR HOME.LUCKY GUY! %%%%%%%%");
          }
          else
          System.out.println("@@@@@@@ SORRY!WRONG CHOICE @@@@@@@");
          System.out.println("Do you wish to continue? (Y/N)");
          String a =sc.next();
          a.trim();
          if (a.equalsIgnoreCase("Y"))
          main();
          if (a.equalsIgnoreCase("N"))
          System.out.println("Thank You for Playing");
       }
    }
}