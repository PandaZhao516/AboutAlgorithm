package demoForFinal;

import java.sql.Date;

import restartForJava.Person;

public class FinalAttributeC {
	private final Person person = new Person(Date.valueOf("1992-05-16"));
	
	public void change(){
		person.setPersonBirth(Date.valueOf("1998-05-16"));
		System.out.println(person.getPersonBirth());
	}

	/**
	 * �ᱨ����������person�ǲ����Ա��޸ĵģ����ñ����ǲ����Ըı�ã���������ָ��Ķ����ǿ��Ըı��
	 * @param args
	 */
//	public void change(Person p){
//		this.person = p;
//	}
	
	public static void main(String[] args) {
        new FinalAttributeC().change();
    }
}
