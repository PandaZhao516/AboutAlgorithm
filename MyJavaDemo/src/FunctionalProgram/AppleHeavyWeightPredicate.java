package FunctionalProgram;
/**
 * 
 * @author Panda.Zhao
 *����ѡ�����ƻ��
 */
public class AppleHeavyWeightPredicate implements ApplePredicate{

	@Override
	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return apple.getWeight()>150;
	}
}
