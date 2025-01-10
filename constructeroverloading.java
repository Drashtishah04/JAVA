class spr2
{
    spr2()
    {
        System.out.println("THIS IS SPR1 CLASS");
    }
    spr2(String a)
    {
        System.out.println("NAME= "+a);
    }
    public static void main(String s[])
    {
       spr2 a=new spr2();
       a=new spr2(s[0]);
    }
}




/*C:\java>javac constructeroverloading.java

C:\java>java spr2 drashti
THIS IS SPR1 CLASS
NAME= drashti*/
