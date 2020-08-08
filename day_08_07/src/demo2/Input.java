package demo2;

public class Input implements Runnable {
	private Resource r;
	public Input(Resource r) {
		this.r = r;
	}
	@Override
	public void run() {
		int i = 0;
		// TODO Auto-generated method stub
		while(true) {
				synchronized (r) {
					if(i %2 == 0) {
						r.name = "ÕÅÈý";
						r.sex = "ÄÐ";
					}else {
					
						r.name = "lisi";
						r.sex = "nv";
					}
				}
				i++;
			}
	}

}
