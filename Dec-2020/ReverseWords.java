
/**
 * Given a string of words delimited by spaces, reverse the words in string. For example, given "hello world here", return "here world hello"
 * Follow-up: given a mutable string representation, can you perform this operation in-place?
 * 
 * @author Nagendra Devireddy
 * 
 * */

public class ReverseWords {
	public static void reverseWords(char[] sentence,int low,int high) {
		while (low<high) {		
			char temp=sentence[low];
			sentence[low]=sentence[high];
			sentence[high]=temp;
			low++;
			high--;
		}		
	}
	public static void main(String[] args) {
		String str="We love Java";
		char[] words=str.toCharArray();
		reverseWords(words,0,words.length-1);
		int start=0;
		for(int i=0;i<words.length;i++) {
			if(words[i]==' ') {
				reverseWords(words,start,i-1);
				start=i+1;
			}
		}
		reverseWords(words,start,words.length-1);
		System.out.println(words);
	}
}
