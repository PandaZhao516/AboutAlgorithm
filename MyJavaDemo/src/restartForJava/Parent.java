package restartForJava;

public class Parent {
	static{
		System.out.println("���ྲ̬�����");
	}
	{
		System.out.println("���๹������");
	}
	public Parent(){
		System.out.println("���๹�캯��");
	}
}

class Children extends Parent{
	static {
        System.out.println("���ྲ̬�����");
    }
    {
        System.out.println("���๹������");
    }
    public Children(){
        System.out.println("���๹�캯��");
    }
}
