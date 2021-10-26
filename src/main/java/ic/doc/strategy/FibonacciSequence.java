package ic.doc.strategy;

public class FibonacciSequence implements SequenceHandler {

  @Override
  public int calculateTerm(int i) {
    if (i < 2) {
      return 1;
    }
    return term(i - 1) + term(i - 2);
  }
}
