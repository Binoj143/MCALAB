
public class Strings {
	     public static void main(String []args){
	        String text = "Object Oriented Programming";
	        System.out.println("Original Text: "+text);
	        System.out.println("\nThe given text is empty->"+text.isEmpty());
	        System.out.println("\nLength of the given text: "+text.length());
			System.out.println("\nTo Upper Case: "+text.toUpperCase());
			System.out.println("\nTo Lower Case: "+text.toLowerCase());
			System.out.println("\nSubstring: "+ text.substring(7));
			System.out.println("\nSubsequence: "+ text.subSequence(7,15));
			System.out.println("\nIntern: "+ text.intern());
			System.out.println("\nReplace O with $: "+text.replace('O','$'));
			System.out.println("\nReplace all text with 'Java Lab': "+text.replaceAll(text, "Java Lab"));
			System.out.println("\nReplace first word: "+text.replaceFirst("Object","Java"));
			System.out.println("\nCharacter at index 8:  "+ text.charAt(8));
			int ascii = text.charAt(8);
			System.out.println("\nASCII value of character at index 8:  "+ascii);
			System.out.println("\nFirst Index of Character 'O': "+text.indexOf('O'));
			System.out.println("\nLast Index of Character 'O': "+text.lastIndexOf('O'));
			String text1 = "Lab";
			System.out.println("\nConcatenation with 'Lab': "+text.concat(" ").concat(text1));
			System.out.println("\n__Comparison__");
			System.out.println("\nIf the value is 0, both are equal. Otherwise unequal!");
		    System.out.println("\nText for Comparison:object oriented programming->"+ text.compareTo("object oriented programming"));
		    System.out.println("Text for Comparison:Object Oriented Programming->"+ text.compareTo("Object Oriented Programming"));
	     }
	}

