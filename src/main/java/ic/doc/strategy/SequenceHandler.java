package ic.doc.strategy;

import java.util.Iterator;

public interface SequenceHandler {
  default int term(int i) {
    if (i < 0) {
      throw new IllegalArgumentException("Not defined for indices < 0");
    }
    return calculateTerm(i);
  }

  int calculateTerm(int i);
}
