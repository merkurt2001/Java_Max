package assignment.assignment14_oop;

public class Question12 {

	public static void main(String[] args) {
		
		CameraPhone cameraPhone= new CameraPhone(40,4);
		System.out.println(cameraPhone.numPictures());

	}

}

class Phone{
	
}

class CameraPhone extends Phone{
	
	  int imageSize;
	  int memorySize;
	  
	  public CameraPhone(int imageSize, int memorySize){
	    this.imageSize=imageSize;
	    this.memorySize=memorySize;
	  }
	  
	  public int numPictures(){
	    return memorySize*1000/imageSize;
	  }
}
