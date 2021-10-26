package ic.doc.strategy;

import org.junit.Test;

import static ic.doc.matchers.IterableBeginsWith.beginsWith;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

public class TriangleNumberSequenceTest {

  final ic.doc.strategy.Sequence sequence = new Sequence(new TriangleNumbersSequence());

  @Test
  public void definesFirstTermToBeOne() {
    assertThat(sequence.getSequenceHandler().term(0), is(1));
  }

  @Test
  public void hasEachTermEqualToTheFormula() {

    assertThat(sequence.getSequenceHandler().term(0), is(1));
    assertThat(sequence.getSequenceHandler().term(1), is(3));
    assertThat(sequence.getSequenceHandler().term(2), is(6));
    assertThat(sequence.getSequenceHandler().term(3), is(10));
    assertThat(sequence.getSequenceHandler().term(4), is(15));
    assertThat(sequence.getSequenceHandler().term(5), is(21));
  }

  @Test
  public void isUndefinedForNegativeIndices() {

    try {
      sequence.getSequenceHandler().term(-1);
      fail("should have thrown exception");
    } catch (IllegalArgumentException e) {
      assertThat(e.getMessage(), containsString("Not defined for indices < 0"));
    }
  }

  @Test
  public void canBeIteratedThrough() {
    assertThat(sequence, beginsWith(1, 3, 6, 10, 15, 21));
  }
}
