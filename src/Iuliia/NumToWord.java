package Iuliia;


    public class NumToWord {
        public static void main(String[] args) {


            int n = 1; //0~9

            String word=(n==0)?"Zero":(n==1)?"One":(n==2)?"Two":(n==3)?"Three":(n==4)?
                    "Four":(n==5)?"Five":(n==6)?"Six":(n==7)?"Seven":(n==8)?
                    "Eight":(n==9)?"Nine":"Invalid";
            System.out.println(word);
        }
    }

