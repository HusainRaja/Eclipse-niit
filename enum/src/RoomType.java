
public enum RoomType {
	SINGLEBED("sofa\nsingle bed\n1500\n"),
	   DOUBLEBED("sofa\ndining room\ntwo beds\n2500"),
	   DELUX("sofa\ndining room\ntwo beds\ntv\n3500"),
	   AC("sofa\ndining room\ntwo beds\ntv\nac\n4000"),
	   SUITE("sofa\ndining room\ntwo beds\ntv\nac\nkitchen\n4500");

	   String data;
	   
	   RoomType(String data){
	       this.data=data;
	   }

	   public void showDetails(){
	       System.out.println(data);
	   }
}
