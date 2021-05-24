package com.company;

import java.io.*;

public class DeleteCom {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C://Users//User//IdeaProjects//Study//programNoCom.txt"));
             BufferedReader br = new BufferedReader(new FileReader("C://Users//User//IdeaProjects//Study//program.txt"))) {
            String s = br.readLine();
            String code = null;
            while (s != null) {
                code += s.replaceAll("//.*", "");
                code += "\n";
                s = br.readLine();
            }
            String cleanCode = code.replaceAll("/\\*(\\n)*(.*(\\n)*)+\\*/", " ");
            bw.write(cleanCode);
            System.out.println("Комментарии удалены");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

