
public class bms {
 static String name="df";
 int id;
 String car;
 static  void main1() {
	 name="fs";
 }

 
 bms(int i,String c){
	 id=i;
	 car=c;
 }

void main() {
	System.out.println(name+" "+id+""+car);
}
 public static void main(String[] args) {
	 bms.main1();
	bms b=new bms(1,"vdf");
	b.main();
	
}
}
