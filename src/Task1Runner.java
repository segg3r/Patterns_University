import Task1.StrategyContext;
import Task1.compressionstrategies.BarrowsWillerCompressionStrategy;
import Task1.compressionstrategies.HaffmanCompressionStrategy;
import Task1.compressionstrategies.MantissExponentCompressionStrategy;
import Task1.compressionstrategies.ZivLempelCompressionStrategy;


public class Task1Runner {

	public static void main(String[] args) {
		StrategyContext sc = new StrategyContext();

		sc.setCompressionStrategy(new BarrowsWillerCompressionStrategy());
		sc.executeStrategy();

		sc.setCompressionStrategy(new HaffmanCompressionStrategy());
		sc.executeStrategy();

		sc.setCompressionStrategy(new MantissExponentCompressionStrategy());
		sc.executeStrategy();

		sc.setCompressionStrategy(new ZivLempelCompressionStrategy());
		sc.executeStrategy();
	}

}
