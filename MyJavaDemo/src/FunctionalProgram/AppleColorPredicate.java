package FunctionalProgram;
/**
 * 
 * @author Panda.Zhao
 *����ѡ����ƻ��
 */
public class AppleColorPredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return "green".equals(apple.getColor());
	}
	
}
