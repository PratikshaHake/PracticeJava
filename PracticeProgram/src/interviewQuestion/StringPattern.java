package interviewQuestion;



public class StringPattern {
	public void solution(String str) {
	    for (int i = 0; i < str.length(); i++) {
	        if (str.charAt(i) == 'S') {
	            for (int j = i + 1; j < str.length(); j++) {
	                if (str.charAt(j) == 'S') {
	                    System.out.println(str.substring(i, j + 1));
	                    break;
	                }
	            }
	        }
	    }
	}
	public static void main(String[] args) {
		String str = "ASDSEDSFSRDSXSVSFSSSFGVGVSGSVJSNSAASWSDSESCSASA";
		new StringPattern().solution(str);
	}

}
