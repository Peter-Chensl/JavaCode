package demo2;

public class Output implements Runnable {
	private Resource r;
	public Output(Resource r) {
		this.r = r;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized (r) {
				System.out.println(r.name +".." + r.sex);
			}
		}
	}

}
