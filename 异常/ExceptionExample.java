import java.util.Random;
public class ExceptionExample{
	public static void main(String [] args){
		Worker worker = new Worker();
		Doctors doctor = new Doctors();
		try{
			worker.Work();
		}catch(SickException e){
			System.out.println(e.getMessage());
			doctor.Treatment(worker);
			System.out.println(worker.getStatus());
		}
	}
}

class Worker {
	private String status;
	public void setStatus(String status){
		this.status = status;
	}
	public String getStatus(){
		return status;
	}
	public void Work()throws SickException{
		Random rd = new Random();
		int tmp = rd.nextInt(3)+1;
		if(tmp==1){
			//抛出生病异常
			throw new SickException("你生病了需要治疗");
		}else{
			System.out.println("你很健康不需要治疗");
		}
	}
}

class SickException extends Exception {
	private String message;
	public SickException(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return message;
	}
}



class Doctors{
	public void Treatment(Worker worker){
		Random rd = new Random();
		int tmp = rd.nextInt(2)+1;
		if(tmp == 1){
			worker.setStatus("你治疗好了");
		}else{
			worker.setStatus("你狗带了");
		}
	}
}