class Avarage
{
	public static void main(String[] args) 
	{
		if(args.length < 2){
			System.out.println("Less than 2 arguments are not allowed");
			System.exit(0);
		}else{
			float sum=0f;
			for(int i=0; i<args.length;i++){
				sum +=Float.parseFloat(args[i]);
			}
			float avg=sum/args.length;
			System.out.println("Avarage: "+avg);
		}
	}
}
