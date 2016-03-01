package com.firsttest.mostafijurrahaman.firsttest;

import java.util.Random;

/**
 * Created by mostafijurrahaman on 12/24/14.
 */
public class CrystaBall {
    String getAnswer(){
        String[] answers = {"It is certain",
                "It is decidedly so",
                "All sign say YES",
                "The stars are not aligned",
                "My Replay is NO",
                "It is doubtful",
                "Better not to tell you now",
                "Concentrate and ask again",
                "Unable to answer now"};
        String answer = "";
        Random randomGenerator = new Random();
        int number = randomGenerator.nextInt(answers.length);
        answer = answers[number];
                /*for(int i=0;i<answers.length;i++){
                    if(number==i){
                        answer = answers[i];
                    }
                }*/
                /*if(number == 1){
                    answer = "Yes";
                }else if(number == 0){
                    answer ="No";
                }else {
                    answer = "Maybe";
                }*/
                /*switch(number){
                    case 0:
                        answer = answers[0];
                        break;
                    case 1:
                        answer = answers[1];
                        break;
                    case 2:
                        answer = answers[2];
                        break;
                    case 3:
                        answer = answers[3];
                        break;
                    case 4:
                        answer = answers[4];
                        break;
                    case 5:
                        answer = answers[5];
                        break;
                    case 6:
                        answer = answers[6];
                        break;
                    case 7:
                        answer = answers[7];
                        break;
                    case 8:
                        answer = answers[8];
                        break;
                }*/
        return answers[number];
    }
}
