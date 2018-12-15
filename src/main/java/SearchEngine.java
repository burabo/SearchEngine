import java.io.File;

public class SearchEngine {

    public static void main(String[] args) {

        /**
         * Indicar o caminho para a respetiva pasta
         */
        File pasta = new File("C:\\Users\\Paulo\\Desktop\\ESTG");

        ValidateDirectory directory = new ValidateDirectory(pasta);

        directory.validateDirectory();
        directory.numberFileInDirectory();
    }

}

