
public class CarUnit {
	
	public static void main(String[] args) {
		int m =1600;
		String n ="Auto";
		Engine i = new Engine(m);
		Aircond j = new Aircond(n);
		Sound k = new Sound();
		
        System.out.println("引擎"+m+"cc:"+i.getcost()+"元");     
        System.out.println("冷氣"+n+"款:"+j.getcost()+"元");
        System.out.println("音響:"+k.getcost()+"元");
        System.out.println("----------------------------");
        System.out.println(i.cost);     
        System.out.println(j.cost);
        System.out.println(k.cost);
        System.out.println("----------------------------");

	
	}
}
class Unit {
	public int cost=0;
	public int getcost(){
	return cost;};
}

class Engine extends Unit {
	//int cost;
	public Engine(int a){
        
		if (a==1600) cost=20000; 
		else if (a==2000) cost=25000;	
	} 
} 

class Aircond extends Unit {
	//int cost;
	public Aircond(String a){
		
		if (a.equals("Auto")) cost=12000; 
		else if (a.equals("Manual")) cost=10000;	
	} 
}

class Sound extends Unit {
	//int cost;
	public Sound(){
		this.cost=2000; 	
	} 
}