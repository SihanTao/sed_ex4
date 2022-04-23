package ic.doc.strategy;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleNumbersSequenceTest {

  final TermGenerator termGenerator = new TriangleNumbersTermGenerator();

  @Test
  public void definesFirstTermToBeOne() {

    assertThat(termGenerator.positiveTerm(0), is(1));

  }

  @Test
  public void definesSubsequentTermsToBeK() {
    // k = ( n + 1 )(n + 2) / 2

    assertThat(termGenerator.positiveTerm(1), is(3));
    assertThat(termGenerator.positiveTerm(2), is(6));
    assertThat(termGenerator.positiveTerm(3), is(10));

  }
}
