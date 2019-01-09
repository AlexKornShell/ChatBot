import com.generated.parser.EnglishLexer;
import com.generated.parser.EnglishParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ChatBot {



    private static String BOT_NAME = "";
    private static String BOT_TOKEN = "";

    public static void main( String[] args) throws Exception {

        ArrayList<Integer> best;
        double score;
        double temp;
        int index;
        int ind;

        MaxentTagger tagger = new MaxentTagger("stanford-postagger-2018-10-16/models/english-left3words-distsim.tagger");
        Scanner scanner = new Scanner(System.in);
        Scanner fileScanner = null;
        Scanner replyScanner = null;
        String fileLine;
        String[] lineWords;
        while (true) {
            System.out.print("You: ");
            if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("/quit")) break;
                else {

                    lineWords = line.replaceAll("[^a-zA-Z\\s]","").toLowerCase().split("\\s+");

                    String input = tagger.tagString(line.replaceAll("[^a-zA-Z\\s]","").toLowerCase());
                    EnglishLexer lexer = new EnglishLexer(CharStreams.fromString(input));
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    EnglishParser parser = new EnglishParser(tokens);
                    ParseTree tree = parser.sentence();
                    //    System.out.println(tree.toStringTree());
                    ParseTreeWalker walker = new ParseTreeWalker();
                    Sentence sentence = new Sentence();
                    walker.walk(new EnglishWalker(sentence, lineWords.length), tree);


                    best = new ArrayList<>();
                    score = 0;

                    try {
                        //    fileScanner = new Scanner(new File(ChatBot.class.getResource("/traina.txt").toURI()));
                        fileScanner = new Scanner(new File(ChatBot.class.getResource("/movie_lines.txt").toURI()));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                    while (fileScanner.hasNextLine()) {
                        temp = 0;
                        //    fileLine = fileScanner.nextLine().replaceAll("[^a-zA-Z\\s]","").toLowerCase();
                        fileLine = fileScanner.nextLine();

                        try {
                            fileLine = fileLine.substring(1,fileLine.indexOf("+") - 1).concat(fileLine.substring(fileLine.lastIndexOf("+++$+++") + 7,fileLine.length()).replaceAll("[^a-zA-Z\\s]","").toLowerCase());
                        } catch (java.lang.StringIndexOutOfBoundsException e) {
                            System.out.println(fileLine);
                        }

                        int k = 0;
                        for (Word word : sentence.words) {
                            if (fileLine.contains(word.word)) {
                                temp = temp + word.weight;
                            }
                        }
                        if (temp > score) {
                            best = new ArrayList<>();
                            score = temp;
                            best.add(Integer.valueOf(fileLine.replaceAll("[^0-9]","")));
                        } else if (temp == score) {
                            best.add(Integer.valueOf(fileLine.replaceAll("[^0-9]","")));
                        }
                    }

                //    System.out.println(score);
                    if (score <= 0.2) {
                        System.out.println("Bot: ".concat("Sorry, but I don't know what to say..."));
                    } else {

                        try {
                            fileScanner = new Scanner(new File(ChatBot.class.getResource("/movie_lines.txt").toURI()));
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }

                        Random rand = new Random();
                        ind = rand.nextInt(best.size());

                        boolean done = false;
                        while (fileScanner.hasNextLine()) {
                            line = fileScanner.nextLine();
                            if (Integer.valueOf(line.substring(1, line.indexOf("+") - 1)) == best.get(ind) + 1) {
                                System.out.println("Bot: " + line.substring(line.lastIndexOf("+++$+++") + 7,line.length()));
                                line = fileScanner.nextLine();
                            //    System.out.println("Yours: " + line.substring(line.lastIndexOf("+++$+++") + 7,line.length()));
                                break;
                            } else if (Integer.valueOf(line.substring(1, line.indexOf("+") - 1)) == best.get(ind)) {
                            //    System.out.println("Yours: " + line.substring(line.lastIndexOf("+++$+++") + 7,line.length()));
                                line = fileScanner.nextLine();
                                System.out.println("Bot: " + line.substring(line.lastIndexOf("+++$+++") + 7,line.length()));
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    //    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }

    //    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }
}
