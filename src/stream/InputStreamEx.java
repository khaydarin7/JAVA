package stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputStreamEx {
    public static void main(String[] args) {
        try{
        //파일 객체 생성
        File file = new File("C:/Users/bound/eclipse-workspace/JAVA_PRACTICE/src/dfs.txt");
         //입력 스트림 생성
         FileReader file_reader = new FileReader(file);
         int cur = 0;
         char arr[] = new char[3];
         while((cur = file_reader.read()) != -1){
            if((char)cur=='t') {
            	
            	if((char)cur=='h') {
            		if((char)cur=='e')
            			
            	}
            	else
            		continue;
            }
            else
            	continue;
         }
         System.out.printf("%d", cnt);
         file_reader.close();
        }catch (FileNotFoundException e) {
            e.getStackTrace();
        }catch(IOException e){
            e.getStackTrace();
        }
    }
}