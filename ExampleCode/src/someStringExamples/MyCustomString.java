package someStringExamples;

public class MyCustomString {
	private String myString ;

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}

	public MyCustomString(String myString) {
		this.myString = myString;
	}
	 
	public String reverseString()
	{
		StringBuilder sb = new StringBuilder() ;
		for(int i=myString.length() -1; i>=0; i--)
		{
			sb.append(myString.charAt(i)) ;
		}
		return sb.toString() ;
	}
	public String reverseWordsInString()
	{
		String[] stringArray = myString.split("[ ,.]+") ;
		String temp = reverseWords(stringArray);
		return temp ;
	}
	public String reverseWords(String[] strArray)
	{
		StringBuilder sb = new StringBuilder(); 
		for(int i=strArray.length - 1; i>=0; i--)
		{
			sb.append(strArray[i]);
			sb.append(" ");
		}
		return sb.toString();
	}
	
	public String replaceKeyWords(String[] keyWords)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<myString.length(); i++)
		{
			sb.append(myString.charAt(i));
		}
		for(int i=0; i<keyWords.length; i++)
		{
			int pos = myString.indexOf(keyWords[i]) ;
			while(pos != -1)
			{
				StringBuilder stars = new StringBuilder() ;
				for(int j=0; j<keyWords[i].length(); j++)
				{
					stars.append('*');
				}
				sb.replace(pos, keyWords[i].length() + pos, stars.toString());
				pos = myString.indexOf(keyWords[i],pos + 1) ;
			}
		}
		return sb.toString() ;
	}
	
}
