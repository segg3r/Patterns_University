package Task1;

public class StrategyContext {

	private CompressionStrategy compressionStrategy;

	public void setCompressionStrategy(CompressionStrategy compressionStrategy) {
		this.compressionStrategy = compressionStrategy;
	}

	public void executeStrategy() {
		compressionStrategy.compress();
	}

}
