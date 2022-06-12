package se.lexicon.dao.sequencer;

public class StudentIdSequencer {

    private static int sequencer = 0;

    public static int nextId() {
      return ++sequencer;
    }

}
