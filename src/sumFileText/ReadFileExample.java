package sumFileText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            //đọc file theo đường dẫn
            File file = new File(filePath);
            //kiểm tra nếu file không tồn tại thì ném ra ngoại lệ
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            //đọc từng dòng của file và tến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            //hiển thị màn hình tổng các số nguyên trong file
            System.out.println("Tong = " + sum);
        } catch (Exception e) {
            // trường hợp file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo
            System.out.println("File không tồn tại hoặc nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("nhập đường dẫn file");
        Scanner scanner=new Scanner(System.in);
        String path=scanner.nextLine();

        ReadFileExample readFileExample=new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
