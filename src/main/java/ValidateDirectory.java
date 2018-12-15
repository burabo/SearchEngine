import java.io.File;

public class ValidateDirectory {

File file;

    public ValidateDirectory(File novoFile){
        this.file =  novoFile;
    }



    public void validateDirectory(){
        if(this.file.exists()){
            System.out.println("A pasta que pretende encontrar existe !");
        }else{
            System.out.println("A pasta que pretende encontrar não existe !");
        }
    }

    public void numberFileInDirectory(){
        System.out.println("Existem " + this.file.list().length + " dentro do repositorio");
    }

}
