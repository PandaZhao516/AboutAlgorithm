package innerClassDemo;

public class InheritInnerClass extends WithInner.Inner {
	//InheritInnerClass(); �޷�ͨ�����룬Ҫ�����βλ򷽷���
	InheritInnerClass(WithInner wi) {
		wi.super();
	}
}

class WithInner{
	class Inner{
		
	}
}