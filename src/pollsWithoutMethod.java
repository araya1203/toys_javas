import java.util.Scanner;


public class pollsWithoutMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요");
        System.out.print("조아라");
        String name = scanner.nextLine();
        System.out.println();

        String[][] questions = {
            {"1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?",
            "2. 강의의 내용은 체계적이고 성의있게 구성되었는가?",
            "3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?",
            "4. 강의 진행 속도는 적절하였는가?"},
            { "(1)전혀 아니다.", "(2)아니다.", "(3)그렇다.", "(4)매우그렇다." }
        };

       
        for (int i = 0; i < questions.length; i++) {
            for (int j = 0; j < questions[i].length; j++) {
                System.out.print(questions [i][j]);
            }
            System.out.println();  
        }

    }
}
     