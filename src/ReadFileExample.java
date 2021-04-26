import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public  void readFileExample(String filepath){
        try {
            File file=new File(filepath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line="";
            int sum=0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tong="+sum);

        } catch (Exception e) {
            System.out.println("file khong ton tai");
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileExample(path);
    }


}
