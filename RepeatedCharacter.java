public class RepeatedCharacter {
    
    public static void main(String[] args) {
        String st = "go to the market";
        int num;
        char string[] = st.toCharArray();
        
        for(int i=0; i<string.length;i++)
        {
            num =1;
            for(int j=i+1;j< string.length;j++)
               { 
                if(string[i] == string[j] ){ 
                    num++;
                    string[j] = '0';
                }
               } 

                if (num>1 && string[i]!='0'){
                    System.out.println(st.charAt(i) + "occurs" + num +" times.");
                }
    }
    
    }
}
