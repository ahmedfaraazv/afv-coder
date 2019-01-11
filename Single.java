public class Single{
 int Sid; 
	 	 String Sname;
		 void insert(int id, String name){
		  Sid = id;
		  Sname = name;
		}
		void Single(int id, String name){
			this.Sid = id;
			this.Sname = name;
		}
		void display(){
			System.out.println(Sid);
			System.out.println(Sname);
		}
	}	
