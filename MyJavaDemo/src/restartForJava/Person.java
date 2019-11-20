package restartForJava;

import java.sql.Date;

public class Person {
	private Date birthDate;
	private static Date sDate,eDate;
	
	public Person(Date birthDate){
		this.birthDate = birthDate;
	}
	
	public Person(int i) {
		// TODO Auto-generated constructor stub
	}

	public void setPersonBirth(Date date){
		this.birthDate = date;
	}
	
	public Date getPersonBirth(){
		return this.birthDate;
	}
	
	/**�ж�һ���˵������ǲ���90��
	 * ����ÿһ�ε������������ʱ��Ҫ����startDate��endDate�����˷���Դ
	 * @return
	 */
	boolean isBornBoomer(){
		Date startDate = Date.valueOf("1990");
		Date endDate = Date.valueOf("1999");
		return birthDate.compareTo(startDate)>0 && birthDate.compareTo(endDate)<0;
	}
	
	/*
	 * �Ľ�һ������
	 */
	
//	static{
//		sDate = Date.valueOf("1990");
//		eDate = Date.valueOf("1999");
//	}
	
	boolean isBornBoomer2(){
		return birthDate.compareTo(sDate)>0 && birthDate.compareTo(eDate)<0;
	}
}
