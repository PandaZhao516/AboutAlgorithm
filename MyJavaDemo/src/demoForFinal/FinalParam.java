package demoForFinal;

import java.sql.Date;

import restartForJava.Person;

public class FinalParam {
	public void test(final int a){
		/**
		 * ��final���εĲ��������޸�
		 */
		//a = 10;
	}
	
	public void test(final Person p){
		/**
		 * The final local variable p cannot be assigned.
			It must be blank and not using a compound assignment
			���ñ������Ա��޸�
		 */
		//p = new Person(Date.valueOf("1998-05-16"));
		
		//������ָ�Ķ�����Ա��޸�
		p.setPersonBirth(Date.valueOf("1998-05-16"));
	}
}
