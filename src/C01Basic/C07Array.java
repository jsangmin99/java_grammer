package C01Basic;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class C07Array {
    public static void main(String[] args) {
////        배열 표현식1 : 리터럴 방식
//        int[] intArr = {1, 2, 3, 4, 5};
//
////        배열 표현식 2 : 배열선언후 할당 방식
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 2;
//        intArr2[2] = 3;
//        intArr2[3] = 4;
//        System.out.println(intArr2[4]); // 0 으로 초기화되어있음
//
//        for(int i = 0; i < intArr2.length; i++){
//            System.out.println(intArr2[i]);
//        }
//
//        //    표현식 3 :
//        int[] int_arr3 = new int[]{1, 2, 3, 4, 5};
//
////    표현식 4 :
//        String[] strArr1 = new String[5];
//        strArr1[0] = "Hello";
//        strArr1[1] = "World";
////        NullPointerException 발생
//        System.out.println(strArr1[2].length());
//
//        String [] strArr2 = new String[5];
////        배열값 한꺼번에 세팅
//        Arrays.fill(strArr2, "");
//        System.out.println(strArr2[3]);
//
//
////        85,65,90인 int 배열을 선언하고 , 총합, 평균 구하기
//        int[] score = {85, 65, 90};
//        int sum = 0;
//        for(int i = 0; i < score.length; i++){
//            sum += score[i];
//        }
//        System.out.println("총합 : " + sum);
//        System.out.println("평균 : " + sum/score.length);

////        최대값, 최솟값
//        int[] arr = {85, 65, 90};
//        int max = arr[0]; //int max = Integer.MIN_VALUE;
//        int min = arr[0]; //int min = Integer.MAX_VALUE;
//        for (int j : arr) {
//            if (max < j) {
//                max = j;
//            }
//            if (min > j) {
//                min = j;
//            }
//        }
//        System.out.println("최대값 : " + max);
//        System.out.println("최솟값 : " + min);

////        배열의 순서 바꾸기
//        int[] arr = {10, 20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

//        int[] arr2 = {10, 20, 30, 40, 50};
//        for(int i = 0 ; i < arr2.length-1; i++){
//            int tmp = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = tmp;
//            System.out.println(Arrays.toString(arr2));
//        }


////        배열 뒤집기
//        int[] arr1 = {1, 2, 3, 4, 5};
////        새로운 배열에 위 arr을 뒤집은 값 {5, 4, 3, 2, 1}
//        for(int i = 0; i < arr1.length/2; i++){
//            int tmp = arr1[i];
//            arr1[i] = arr1[arr1.length - i - 1];
//            arr1[arr1.length - i - 1] = tmp;
//        }
//        System.out.println(Arrays.toString(arr1));

////        숫자 뒤집기
//        int num =1234;
////        문자열과 관련된 풀이로 풀기
//        String str1 = String.valueOf(num);
//        String str2 = new StringBuilder(str1).reverse().toString();
//        int result = Integer.parseInt(str2);
//        System.out.println(str2);
//
//        String str3 = String.valueOf(num);
//        String result2 = "";
//        for(int i = str3.length()-1; i >=0; i--){
//            result2 += str3.charAt(i);
//        }
//        System.out.println(result2);


////        정렬
//        int arr[] = {5, 1, 2, 7, 3, 1, 2};
//        Arrays.sort(arr); //오름차순 정렬이 기본
//        System.out.println(Arrays.toString(arr));
//
//
////        문자 정렬
//        String[] fruits = {"banana", "apple", "cherry", "Apple"};
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//
////        문자열의 인덱스 순서로 비교
//        String[] fruits2 = {"apple1", "apple11", "apple2"};
//        Arrays.sort(fruits2);
//        System.out.println(Arrays.toString(fruits2));
//
////        내림차순
//        String[] st_arr = {"hello", "world", "java"};
//        Arrays.sort(st_arr, Comparator.reverseOrder());
//
////        기본형 타입은 Comparator.reverseOrder()를 사용할 수 없다.
//        int[] intArr = {5, 1, 2, 7, 3, 1, 2};
//        Arrays.sort(intArr);
////       방법1 : 오름차순 정렬후 배열 뒤집기
//        for(int i = 0; i < intArr.length/2; i++){
//            int tmp = intArr[i];
//            intArr[i] = intArr[intArr.length - i - 1];
//            intArr[intArr.length - i - 1] = tmp;
//        }
//        System.out.println(Arrays.toString(intArr));
//
////        방법2. stremaapi, lambda를 활용한 내림차순 정렬
//        int [] intArr2 = Arrays.stream(intArr) //intArr를 대상으로 Stream객체로 복사본으로 임시저장
//                .boxed() //int요소를 Intefer로 형변환 시키는 메서드
//                .sorted(Comparator.reverseOrder()) //내림차순 정렬
//                .mapToInt(a -> a) //Intefer를 int로 형변환
//                .toArray(); //int[]로 변환
//        System.out.println(Arrays.toString(intArr2));



//        int[] arr = {1, 5, 2, 6, 3, 7, 4};
//        int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        System.out.println(Arrays.toString(solution2(arr, commands)));


////        선택정렬 알고리즘
//        int[] arr = {30, 20, 22, 25, 12};
//
//        for(int i = 0; i < arr.length-1; i++){
//            int min_idx = i;
//            for(int j = i+1; j < arr.length; j++){
//                if(arr[min_idx] > arr[j]){
//                    min_idx = j;
//                }
//            }
//            int tmp = arr[min_idx];
//            arr[min_idx] = arr[i];
//            arr[i] = tmp;
//        }
//        System.out.println(Arrays.toString(arr));


////        숫자 조합의 합 : 모두 각기 다른 숫자의 배열이 있을때
////        만들어질수 이쓴 2개의 조합의 합을 출력
//        int[] intArr = {10, 20, 30, 40, 50, 60};
//        int sum = 0;
//        for(int i = 0 ; i < intArr.length-1; i++){
//            for(int j = i+1; j < intArr.length; j++){
//                System.out.println(intArr[i] + intArr[j]);
//                int tmp = intArr[i] + intArr[j];
//                sum+= tmp;
//            }
//        }
//        System.out.println(sum);

////        배열의 복사
////        copyOf(배열, endIndex), copyOfRange(배열, startIndex, endIndex)
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr2 = Arrays.copyOf(arr, arr.length);
//        System.out.println(Arrays.toString(arr2));
//        int [] arr3 = Arrays.copyOfRange(arr, 1, 4);
//        System.out.println(Arrays.toString(arr3));

//        배열의 중복제거




//        int[] tmp = {10, 10, 5, 7, 40, 40, 10, 10};
////        중복제거1
//        int[] newtmp = new int[tmp.length];
//        int num = 0;
//        for(int i = 0; i < tmp.length; i++){
//            if(i == 0 || tmp[i] != tmp[i-1]){
//                newtmp[num] = tmp[i];
//                num++;
//            }
//        }



////        중복제거2
//        int[] tmp_copy = Arrays.copyOf(tmp, tmp.length);
//        for (int i = 0 ; i < tmp_copy.length; i++){
//            for(int j = i+1; j < tmp_copy.length; j++){
//                if(tmp_copy[i] == tmp_copy[j]){
//                    tmp_copy[j] = 0;
//                }
//            }
//        }
//
//        sort(tmp_copy);
//
//        int start_idx = 0;
//        for(int i = 0 ; i < tmp_copy.length-1; i++){
//            if(tmp_copy[i] == 0){
//                start_idx++;
//            }
//        }
//        int [] result = Arrays.copyOfRange(tmp_copy, start_idx, tmp_copy.length);
//        System.out.println(Arrays.toString(result));


////        배열의 검색
////        8 의 인덱스 찾기
//        int[] arr = {5,4,1,8,7};
//        int idx = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == 8){
//                idx = i;
//                break;
//            }
//        }

////        이진 검색 (Binary Search)
//        int [] arr = {1,3,5,7,9, 11, 13, 15, 17, 19};
////        복잡도 O(logN)
////        사전에 오름차순 정렬이 되어 있어야 이진검색 가능
//        System.out.println(Arrays.binarySearch(arr, 7));
//
////        배열간 비교
//        int[] arr1 = {1, 2, 3};
//        int[] arr2 = {1, 2, 3};
//        System.out.println(Arrays.equals(arr1, arr2));
//        System.out.println(arr1 == arr2);

//        2차원 배열 선언과 할당
        int[][] arr = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

//        {{1,2,3},{4,5,6}}
//        리터럴 방식으로 2차원 배열 선언
        int[][] arr2 = {{1,2,3}, {4,5,6}};

        System.out.println(Arrays.deepToString(arr2));

//        2차원 가별배열 선언후 배열 할당
        int[][] arr3 = new int[2][];
        arr3[0] = new int[3];
        arr3[1] = new int[4];
        arr3[0][0] = 1;
        arr3[0][1] = 2;
        arr3[0][2] = 3;
        arr3[1][0] = 4;
        arr3[1][1] = 5;
        arr3[1][2] = 6;
        arr3[1][3] = 7;
        System.out.println(Arrays.deepToString(arr3));

//        [3][4] 사이즈 배열을 선언한뒤
//        1~12 까지 숫자 값 각 배열에 할당후 출력
        int arr4[][] = new int[3][4];
        for(int i = 0; i < arr4.length; i++){
            for(int j = 0; j < arr4[i].length; j++){
                arr4[i][j] = i*arr4[i].length + j + 1;
            }
        }
        System.out.println(Arrays.deepToString(arr4));

//        배열 실습 : 행의 길이(전체배열의 길이 5 => {{10}, {20,20}, {30,30,30}, {40,40,40,40}, {50,50,50,50,50}})
        int[][] arr5 = new int[5][];
        for(int i = 0; i < arr5.length; i++){
            arr5[i] = new int[i+1];
            for(int j = 0; j < arr5[i].length; j++){
                arr5[i][j] = (i+1)*10;
            }
        }
        System.out.println(Arrays.deepToString(arr5));


    }








//    프로그래머스 두개 뽑아서 더하기
//    public static int[] solution(int[] numbers) {
//        int[] answer = {};
//        int[] tmp = new int[numbers.length * numbers.length];
//
//        int count = 0;
//
//        for(int i = 0; i < numbers.length; i++){
//            for (int j = i+1; j < numbers.length; j++){
//                tmp[count] = numbers[i] + numbers[j];
//                count++;
//            }
//        }
//        tmp = Arrays.copyOf(tmp, count);
//        int[] newtmp = new int[tmp.length];
//        sort(tmp);
//        int num = 0;
//        for(int i = 0; i < tmp.length; i++){
//            if(i == 0 || tmp[i] != tmp[i-1]){
//                newtmp[num] = tmp[i];
//                num++;
//            }
//        }
//        answer = Arrays.copyOfRange(newtmp, 0, num);
//        System.out.println(Arrays.toString(answer));
//
//
//        return answer;
//    }


//        public static int[] solution(int[] array, int[][] commands) {
//            int[] answer = new int[commands.length]; // commands 길이만큼 answer 배열 초기화
//            int [] temp_arr = {};
//            for(int i = 0 ; i < commands.length; i++){
//                int start = commands[i][0];
//                int end = commands[i][1];
//                int k = commands[i][2];
//                temp_arr = Arrays.copyOfRange(array, start-1, end);
//                Arrays.sort(temp_arr);
//                answer[i] = temp_arr[k-1];
//            }
//
//            return answer;
//
//        }
//    public static int[] solution2(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//        for(int i = 0 ; i < commands.length; i++){
//            int start = commands[i][0]-1;
//            int end = commands[i][1]-1;
//            int k = commands[i][2]-1;
//            int [] temp = new int[end-start+1];
//            int count = 0;
//            for(int j = start; j < end; j++){
//                temp[count] =array[j];
//                count++;
//            }
//            Arrays.sort(temp);
//            answer[i] = temp[k];
//
//        }
//
//        return answer;
//    }



}
