package utils;

import java.io.*;
import java.util.*;

public class SearchUtils {

    public static List<String> getWordList(File file) throws IOException {
        FileReader input = new FileReader(file);
        BufferedReader bufRead = new BufferedReader(input);
        String myLine;
        ArrayList<String> list = new ArrayList<>();
        while ( (myLine = bufRead.readLine()) != null){
            for(String s : myLine.split(" ")){
                list.add(s);
            }
        }
        return list;
    }

    public static List<Pair> countWords(List<String> words){

        List<Pair> listOfCountedWords = new ArrayList<>();
        for (String s: //Para cada String em "words"
             words) {
            boolean found = false; //A word foi encontrada?
            for (Pair p: //Para cada palavra já encontrada
                 listOfCountedWords) {
                if(s.equals(p.word)){//Se for igual a uma palavra já encontrada
                    p.increment(); //A contagem é incrementada
                    found=true; // A word foi encontrada!
                    break; // Nao e preciso procurar mais nas palavras ja encontradas
                }
            }
            if(!found){ //Se for uma palavra nova
                listOfCountedWords.add(new Pair(s));
            }
        }
        return listOfCountedWords;

    }

    public static void removeDigits(String first_path, String second_path) {

        File file = new File(first_path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(second_path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String newLine = "";

            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) < 48 || line.charAt(i) > 57) {
                    newLine += line.charAt(i);
                }
            }
            writer.write(newLine);
        }
        writer.close();
    }
}
