abstract class shape1<t extends Number>
{
	abstract public void calcu_area(t a);
}
class circle2<t extends Number> extends shape1<t>{
	t a;double res;
	public void calcu_area(t a){
		this.a=a;
		int r=a.intValue();
		res=Math.PI*r*r;
		System.out.println(res);
	}
}
class square2<t extends Number> extends shape1<t>{
	t a;double res;
	public void calcu_area(t a){
		this.a=a;
		int r=a.intValue();
		res=r*r;
		System.out.println(res);
	}
}
public class g_prog_1 {
	public static void main(String args[]){
		circle2<Integer> o =new circle2<Integer>();
		o.calcu_area(50);
		square2<Integer> c=new square2<Integer>();
		c.calcu_area(50);
	}
}
