package KrishnaSandeepJavaPrograms;



class ReverseWordsInString{
	  
	  public static void main(String[] args){
	    
	    String test="I Love ChargeeBee";
	    
	    String [] words =test.split(" ");
	    
	    
	    for(int i=words.length-1;i>=0;i--){
	      
	      System.out.print(words[i]+" ");
	    }
	    
	  }
	}
