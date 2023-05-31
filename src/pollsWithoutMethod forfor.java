import java.util.Scanner; 

public class pollsWithoutMethod {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("이름을 입력하세요");
        System.out.print(" 이름)  ");
        String name = myObj.nextLine();
        System.out.println();


        String[] answers = {"","","",""};
        String[][] polls = 
            {{"1.교수는 수업 전 강의 목표를 명확히 제시하였습니까? "}, 
             {"(1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다."};
             {"2.강의의 내용은 체계적이고 성의있게 구성되었는가? "}, 
             {"(1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다."};
             {"3.강의의 내용은 체계적이고 성의있게 구성되었는가? "}, 
             {"(1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다."};
             {"4. 강의 진행 속도는 적절하였는가?"},
             {"(1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우그렇다."};
            };

            
            for (int second=0; second < polls.length; second = second+2){
                 System.out.println(polls[second][0]);
                for (int third=0; third < polls.length; third = third+2 )
                 System.out.print(polls[second+1][third]);

                // 답항 출력 본인이 해 보기
    
                
                System.out.println();
                System.out.print("답하기 : ");
                answers[second] = myObj.nextLine();
                
                System.out.println();
            }
    
            System.out.println("---------------설문 종료---------------");
            System.out.println();
            System.out.println("---------------설문 결과---------------");


            for (int first=0; first < answers.length; first=first+1) {
                System.out.print(answers[first]+", ");
            }
            System.out.println();
            // return 0;
        }
    }