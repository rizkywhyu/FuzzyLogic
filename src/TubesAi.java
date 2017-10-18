/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.IOException;
import jxl.Workbook;
import jxl.Sheet;
import jxl.Cell;
import jxl.read.biff.BiffException;

/**
 *
 * @author Rizky
 */
public class TubesAi {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws jxl.read.biff.BiffException
     */
    public static void main(String[] args) throws IOException, BiffException {

        Workbook w = Workbook.getWorkbook(new File("Train.xls"));
        Sheet s = w.getSheet(0);

        Data hasil = new Data();

        int hitungData = 0;
        int jumlahbener = 0;

        for (int cekData = 1; cekData < s.getRows(); cekData++) {
            Cell x1 = s.getCell(1, cekData);
            Cell x2 = s.getCell(2, cekData);
            Cell x3 = s.getCell(3, cekData);
            Cell x4 = s.getCell(4, cekData);
            Cell x5 = s.getCell(5, cekData);
            Cell x6 = s.getCell(6, cekData);
            Cell x7 = s.getCell(7, cekData);
            Cell x8 = s.getCell(8, cekData);
            Cell x9 = s.getCell(9, cekData);
            Cell x10 = s.getCell(10, cekData);
            Cell y = s.getCell(11, cekData);

            double X1 = Double.parseDouble(x1.getContents());
            double X2 = Double.parseDouble(x2.getContents());
            double X3 = Double.parseDouble(x3.getContents());
            double X4 = Double.parseDouble(x4.getContents());
            double X5 = Double.parseDouble(x5.getContents());
            double X6 = Double.parseDouble(x6.getContents());
            double X7 = Double.parseDouble(x7.getContents());
            double X8 = Double.parseDouble(x8.getContents());
            double X9 = Double.parseDouble(x9.getContents());
            double X10 = Double.parseDouble(x10.getContents());
            String Y = y.getContents();

            hasil.cekX1(X1);
            hasil.cekX2(X2);
            hasil.cekX3(X3);
            hasil.cekX4(X4);
            hasil.cekX5(X5);
            hasil.cekX6(X6);
            hasil.cekX7(X7);
            hasil.cekX8(X8);
            hasil.cekX9(X9);
            hasil.cekX10(X10);

            hasil.inference();

            System.out.print("Data Ke-" + cekData + "\t");
            System.out.print("X1 = " + X1 + "\t");
            System.out.print("X2 = " + X2 + "\t");
            System.out.print("X3 = " + X3 + "\t");
            System.out.print("X4 = " + X4 + "\t");
            System.out.print("X5 = " + X5 + "\t");
            System.out.print("X6 = " + X6 + "\t");
            System.out.print("X7 = " + X7 + "\t");
            System.out.print("X8 = " + X8 + "\t");
            System.out.print("X9 = " + X9 + "\t");
            System.out.print("X10 = " + X10 + "\t");
            System.out.print("Y = " + Y + "\t");
            System.out.print("\t => \t Hasil = " + hasil.deffuzification());
            System.out.println("");
            if (Y.equals(hasil.deffuzification())) {
                jumlahbener += 1;
            }
            hitungData++;
        }

        System.out.println("");
        System.out.println("Banyaknya Data \t \t = \t" + hitungData);
        System.out.println("Jumlah Data Benar \t \t = \t" + jumlahbener);
        System.out.println("Jumlah Data Salah \t \t = \t" + (hitungData - jumlahbener));
        System.out.println("Akurasi \t \t = \t" + ((float) (100 * jumlahbener) / hitungData) + "%");
    }

}
