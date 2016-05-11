class test{
  int i;
}
public class EqualsMethod{
public static void main(String[] args){
  test t1=new test();
  test t2=new test();
  t2.i=20;
  t1.i=t2.i;
System.out.println("t1="+t1.i);
  System.out.println("t1="+t2.i);
  System.out.println(t1==t2); 
System.out.println(t1.equals(t2)); 
System.out.println(t1.i==t2.i);
int 中毒 = 1;
int 失明 = 2;
int 麻痺 = 4;
int 龜速 = 8;
System.out.println(中毒+"中毒"+失明+"失明"+麻痺+"麻痺"+龜速+"龜速");
}

}
