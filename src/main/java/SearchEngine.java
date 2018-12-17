import java.io.File;

public class SearchEngine {

    public static void main(String[] args) {
        /**
         * Indicar o caminho para a respetiva pasta
         */
        File directory = new File("../../../Documents/Faculdade/ESII/Trabalho Prático 2/Ficheiros");
        ValidateDirectory validateDirectory = new ValidateDirectory(directory);
        validateDirectory.validateDirectory();
        Remove remove = new Remove();
        //Devolve o caminho do ficheiro inicial e do ficheiro com o conteúdo final
        remove.removeDigits("../../Documents/Faculdade/ESII/Trabalho Prático 2/Ficheiros/hello.txt",
                "../../Documents/Faculdade/ESII/Trabalho Prático 2/Ficheiros/FINALhello.txt");
    }
}
