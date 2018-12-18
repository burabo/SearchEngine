import java.io.File;

public class ValidateDirectory {

File file;

    public ValidateDirectory(File novoFile){
        this.file =  novoFile;
    }

    public void validateDirectory(){
        if(this.file.exists()){
            System.out.println("O directório que pretende encontrar existe.");
            numberFileInDirectory();
        }else{
            System.out.println("O directório que pretende encontrar não existe. Certifique-se que introduziu o caminho correcto.");
        }
    }
    private void numberFileInDirectory(){
        System.out.println("Existem " + this.file.list().length + " ficheiros dentro do directório");
    }
}
