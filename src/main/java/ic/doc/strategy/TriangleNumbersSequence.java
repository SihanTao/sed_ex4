package ic.doc.strategy;

public class TriangleNumbersSequence implements SequenceHandler {

  @Override
  public int calculateTerm(int i) {
    return (i + 1) * (i + 2) / 2;
  }
}
