
	import java.io.File;
	import java.util.Hashtable;
	import java.util.Scanner;



	public class hash {
		public static void main(String[] args) {
			File file= new File("C:\\Users\\edgu1\\Desktop\\111.txt");										//read the file
			try{
				Scanner scanner= new Scanner(file);
				Hashtable<String,String> hashtable= new Hashtable<String,String>();
				boolean dif=true;																			//Whether the file are different or not;
				while(scanner.hasNext()){
					String i =scanner.next();																									
					if(hashtable.contains(i)){																//If has same node, break;
						dif=false;
						break;
					}
					hashtable.put(i, i);																	//put number into hashtable;
					//System.out.println(hashtable.get(i));
				}
				if(dif){
					System.out.print("The input file are different!");
				}else {
					System.out.print("The input file are not all different!");
				}
			}catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
		}
	}


