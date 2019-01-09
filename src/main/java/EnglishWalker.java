import com.generated.parser.EnglishBaseListener;
import com.generated.parser.EnglishParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Arrays;

public class EnglishWalker extends EnglishBaseListener {

    Sentence sentence;
    int n;

    public EnglishWalker(Sentence sentence, int n) {
        this.sentence = sentence;
        this.n = n;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSentence(EnglishParser.SentenceContext ctx) {
    //    System.out.println("Entering Sentence " + ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSentence(EnglishParser.SentenceContext ctx) {
    //    System.out.println("Exiting Sentence ");
    //    System.out.println("Bot response: ");
        for (Word word : sentence.words) {
            word.weight = 1.0 / sentence.words.size();
        }
    //    System.out.println(sentence.words.size());
    //    System.out.println(sentence.words.toString());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterClause(EnglishParser.ClauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitClause(EnglishParser.ClauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterIndependent_clause(EnglishParser.Independent_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIndependent_clause(EnglishParser.Independent_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterDependent_clause(EnglishParser.Dependent_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitDependent_clause(EnglishParser.Dependent_clauseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterInterjection(EnglishParser.InterjectionContext ctx) {
     //   sentence.words.add(new Word(ctx.getText().split("_")[0], ctx.getText().split("_")[1], 1.0 / n));
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitInterjection(EnglishParser.InterjectionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSubordinating_conjunction(EnglishParser.Subordinating_conjunctionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSubordinating_conjunction(EnglishParser.Subordinating_conjunctionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSubject(EnglishParser.SubjectContext ctx) {
     //   sentence.words.add(new Word(ctx.getText().split("_")[0], ctx.getText().split("_")[1], 1.0 / n));
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSubject(EnglishParser.SubjectContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterPredicate(EnglishParser.PredicateContext ctx) {
     //   sentence.words.add(new Word(ctx.getText().split("_")[0], ctx.getText().split("_")[1], 1.0 / n));
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPredicate(EnglishParser.PredicateContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNoun_phrase(EnglishParser.Noun_phraseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNoun_phrase(EnglishParser.Noun_phraseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAdjective_phrase(EnglishParser.Adjective_phraseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAdjective_phrase(EnglishParser.Adjective_phraseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterAdverbial_phrase(EnglishParser.Adverbial_phraseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitAdverbial_phrase(EnglishParser.Adverbial_phraseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterPrepositional_phrase(EnglishParser.Prepositional_phraseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPrepositional_phrase(EnglishParser.Prepositional_phraseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVerb_phrase(EnglishParser.Verb_phraseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVerb_phrase(EnglishParser.Verb_phraseContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterInfinitive(EnglishParser.InfinitiveContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitInfinitive(EnglishParser.InfinitiveContext ctx) { }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEveryRule(ParserRuleContext ctx) {
    //    System.out.println("EnterRule " + ctx.getRuleContext() + " " + ctx.getRuleIndex() + " " + ctx.getText());
        int number = (int)ctx.getText().codePoints().filter(ch -> ch == '_').count();

        if (number >= 1) {
            String words = ctx.getText().replaceAll("[^a-z_]","").replaceAll("[_]"," ");
            if (words.length() >= 1) words = words.substring(0, words.length() - 1);
            String tags = ctx.getText().replaceAll("[^A-Z_]","");
        //    System.out.println(number);
        //    System.out.println(ctx.getText());
        //    System.out.println(words);
        //    System.out.println(tags);

            int k = 0;

            for (Word w : sentence.words) {
                if (w.word.equals(words)) {
                    k = 1;
                    break;
                }
            }
            if (k == 0) sentence.words.add(new Word(words, tags, 1.0 * number / n));
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitTerminal(TerminalNode node) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitErrorNode(ErrorNode node) { }
}

