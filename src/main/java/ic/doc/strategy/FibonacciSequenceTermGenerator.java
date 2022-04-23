package ic.doc.strategy;

import java.util.Iterator;

public class FibonacciSequenceTermGenerator implements TermGenerator {

  public int positiveTerm(int i) {
    if (i < 2) {
      return 1;
    }
    return positiveTerm(i - 1) + positiveTerm(i - 2);
  }
}
