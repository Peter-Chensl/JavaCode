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
					if(r.flag )
						try {r.wait();}catch(Exception ex) {}
					if(i %2 == 0) {
						r.name = "ÕÅÈý";
						r.sex = "ÄÐ";
					}else {
					
						r.name = "lisi";
						r.sex = "nv";
					}
					r.flag = true;
					r.notify();
				}
				i++;
			}
	}

}
