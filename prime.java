class prime  {
    public static void main(String[] args) 
    {
        String str = "guru";
        char[] ch=str.toCharArray();
        String l="";
        for(int i=ch.length-1;i>=0;i--)
        {
        l=l+ch[i];
        }
        System.out.println(l);
    }
    
}