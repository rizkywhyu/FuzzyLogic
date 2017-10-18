/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static java.lang.Math.random;

/**
 *
 * @author Rizky
 */
public class Data {

    public double nX1[] = new double[2];
    public double nX2[] = new double[2];
    public double nX3[] = new double[2];
    public double nX4[] = new double[2];
    public double nX5[] = new double[2];
    public double nX6[] = new double[2];
    public double nX7[] = new double[2];
    public double nX8[] = new double[2];
    public double nX9[] = new double[2];
    public double nX10[] = new double[2];

    public double nY = 0;
    public String sY = "";

    public double[] nHasil = new double[4];
    public String[] sHasil = new String[4];

    public String sX1[] = new String[2];
    public String sX2[] = new String[2];
    public String sX3[] = new String[2];
    public String sX4[] = new String[2];
    public String sX5[] = new String[2];
    public String sX6[] = new String[2];
    public String sX7[] = new String[2];
    public String sX8[] = new String[2];
    public String sX9[] = new String[2];
    public String sX10[] = new String[2];

    public void cekX1(double data) {
        if ((data <= -0.5)) {
            sX1[0] = "0";
            nX1[0] = 1;
            sX1[1] = "0";
            nX1[1] = 1;
        } else if ((data > -0.5) && (data <= -0.2)) {
            sX1[0] = "0";
            nX1[0] = (-0.2 - data) / (-0.2 - (-0.5));
            sX1[1] = "1";
            nX1[1] = (data - (-0.5)) / (-0.2 - (-0.5));
        } else if (data > -0.2) {
            sX1[0] = "1";
            nX1[0] = 1;
            sX1[1] = "1";
            nX1[1] = 1;
        }
    }

    public void cekX2(double data) {
        if ((data <= -2)) {
            sX1[0] = "0";
            nX1[0] = 1;
            sX1[1] = "0";
            nX1[1] = 1;
        } else if ((data > -2) && (data <= 4)) {
            sX1[0] = "0";
            nX1[0] = (4 - data) / (4 - (-2));
            sX1[1] = "1";
            nX1[1] = (data - (-2)) / (4 - (-2));
        } else if (data > 4) {
            sX1[0] = "1";
            nX1[0] = 1;
            sX1[1] = "1";
            nX1[1] = 1;
        }
    }

    public void cekX3(double data) {
        if ((data <= -3)) {
            sX1[0] = "0";
            nX1[0] = 1;
            sX1[1] = "0";
            nX1[1] = 1;
        } else if ((data > -3) && (data <= 4)) {
            sX1[0] = "0";
            nX1[0] = (4 - data) / (4 - (-3));
            sX1[1] = "1";
            nX1[1] = (data - (-3)) / (4 - (-3));
        } else if (data > 4) {
            sX1[0] = "1";
            nX1[0] = 1;
            sX1[1] = "1";
            nX1[1] = 1;
        }
    }

    public void cekX4(double data) {
        if ((data <= -1)) {
            sX1[0] = "0";
            nX1[0] = 1;
            sX1[1] = "0";
            nX1[1] = 1;
        } else if ((data > -1) && (data <= -0.2)) {
            sX1[0] = "0";
            nX1[0] = ((-0.2) - data) / ((-0.2) - (-1));
            sX1[1] = "1";
            nX1[1] = (data - (-1)) / ((-0.2) - (-1));
        } else if (data > -0.2) {
            sX1[0] = "1";
            nX1[0] = 1;
            sX1[1] = "1";
            nX1[1] = 1;
        }
    }

    public void cekX5(double data) {
        if ((data <= -0.8)) {
            sX1[0] = "0";
            nX1[0] = 1;
            sX1[1] = "0";
            nX1[1] = 1;
        } else if ((data > -0.8) && (data <= 0.8)) {
            sX1[0] = "0";
            nX1[0] = (0.8 - data) / (0.8 - (-0.8));
            sX1[1] = "1";
            nX1[1] = (data - (-0.8)) / (0.8 - (-0.8));
        } else if (data > 0.8) {
            sX1[0] = "1";
            nX1[0] = 1;
            sX1[1] = "1";
            nX1[1] = 1;
        }
    }

    public void cekX6(double data) {
        if ((data <= 0.4)) {
            sX1[0] = "0";
            nX1[0] = 1;
            sX1[1] = "0";
            nX1[1] = 1;
        } else if ((data > 0.4) && (data <= 0.8)) {
            sX1[0] = "0";
            nX1[0] = (0.8 - data) / (0.8 - 0.4);
            sX1[1] = "1";
            nX1[1] = (data - 0.4) / (0.8 - 0.4);
        } else if (data > 0.8) {
            sX1[0] = "1";
            nX1[0] = 1;
            sX1[1] = "1";
            nX1[1] = 1;
        }
    }

    public void cekX7(double data) {
        if ((data <= 1)) {
            sX1[0] = "0";
            nX1[0] = 1;
            sX1[1] = "0";
            nX1[1] = 1;
        } else if ((data > 1) && (data <= 1)) {
            sX1[0] = "0";
            nX1[0] = (2 - data) / (2 - 1);
            sX1[1] = "1";
            nX1[1] = (data - 1) / (2 - 1);
        } else if (data > 0.8) {
            sX1[0] = "1";
            nX1[0] = 1;
            sX1[1] = "1";
            nX1[1] = 1;
        }
    }

    public void cekX8(double data) {
        if ((data <= 1)) {
            sX1[0] = "0";
            nX1[0] = 1;
            sX1[1] = "0";
            nX1[1] = 1;
        } else if ((data > 1) && (data <= 4)) {
            sX1[0] = "0";
            nX1[0] = (4 - data) / (4 - 1);
            sX1[1] = "1";
            nX1[1] = (data - 1) / (4 - 1);
        } else if (data > 0.8) {
            sX1[0] = "1";
            nX1[0] = 1;
            sX1[1] = "1";
            nX1[1] = 1;
        }
    }

    public void cekX9(double data) {
        if ((data <= -7)) {
            sX1[0] = "0";
            nX1[0] = 1;
            sX1[1] = "0";
            nX1[1] = 1;
        } else if ((data > -7) && (data <= 9)) {
            sX1[0] = "0";
            nX1[0] = (9 - data) / (9 - (-7));
            sX1[1] = "1";
            nX1[1] = (data - (-7)) / (9 - (-7));
        } else if (data > 9) {
            sX1[0] = "1";
            nX1[0] = 1;
            sX1[1] = "1";
            nX1[1] = 1;
        }
    }

    public void cekX10(double data) {
        if ((data <= -1)) {
            sX1[0] = "0";
            nX1[0] = 1;
            sX1[1] = "0";
            nX1[1] = 1;
        } else if ((data > -1) && (data <= 0.8)) {
            sX1[0] = "0";
            nX1[0] = (0.8 - data) / (0.8 - (-1));
            sX1[1] = "1";
            nX1[1] = (data - (-1)) / (0.8 - (-1));
        } else if (data > 0.8) {
            sX1[0] = "1";
            nX1[0] = 1;
            sX1[1] = "1";
            nX1[1] = 1;
        }
    }

    public void inference() {
        int cek = 0;

        for (int x1 = 0; x1 < 2; x1++) {
            for (int x2 = 0; x2 < 2; x2++) {
                for (int x3 = 0; x3 < 2; x3++) {
                    for (int x4 = 0; x4 < 2; x4++) {
                        for (int x5 = 0; x5 < 2; x5++) {
                            for (int x6 = 0; x6 < 2; x6++) {
                                for (int x7 = 0; x7 < 2; x7++) {
                                    for (int x8 = 0; x8 < 2; x8++) {
                                        for (int x9 = 0; x9 < 2; x9++) {
                                            for (int x10 = 0; x10 < 2; x10++) {
                                                if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("0".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("0".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("0".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("0".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("0".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("0".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("0".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("0".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("0".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("0".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                } else if (("1".equals(sX1[x1])) && ("1".equals(sX2[x2])) && ("1".equals(sX3[x3])) && ("1".equals(sX4[x4])) && ("1".equals(sX5[x5])) && ("1".equals(sX6[x6])) && ("1".equals(sX7[x7])) && ("1".equals(sX8[x8])) && ("1".equals(sX9[x9])) && ("1".equals(sX10[x10]))) {
                                                    sY = "0";
                                                    nY = Math.min(1, Math.min(2, Math.min(3, Math.min(4, Math.min(5, Math.min(6, Math.min(7, Math.min(8, Math.min(nX9[x9], nX10[10])))))))));
                                                }
                                                if (cek < 4) {
                                                    sHasil[cek] = sY;
                                                    nHasil[cek] = nY;
                                                } else {
                                                    cek = 0;
                                                    sHasil[cek] = sY;
                                                    nHasil[cek] = nY;
                                                    cek++;
                                                }
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public double cekHasil(String data) {
        double nilai = 0;
        if ("0".equals(data)) {
            nilai = 0.25;
        } else if ("1".equals(data)) {
            nilai = 0.75;
        }
        return nilai;
    }

    public String deffuzification() {
        String hasilY = "";

        double cek1 = 0;
        double cek2 = 0;

        double NHasilXSHasil = 0;
        double JumlahNHasil = 0;
        double CenterOfGravity = 0;

        for (int dt = 0; dt < nHasil.length; dt++) {
            NHasilXSHasil = NHasilXSHasil + (nHasil[dt] * cekHasil(sHasil[dt]));
            JumlahNHasil = JumlahNHasil + nHasil[dt];
        }

        if (JumlahNHasil == 0 && NHasilXSHasil != 0) {
            CenterOfGravity = 1;
        } else if (JumlahNHasil == 0 && NHasilXSHasil == 0) {
            CenterOfGravity = 0;
        } else if (JumlahNHasil != 0 && NHasilXSHasil == 0) {
            CenterOfGravity = 0;
        } else {
            CenterOfGravity = NHasilXSHasil / JumlahNHasil;
        }

        if (CenterOfGravity <= 0.3) {
            hasilY = "0";
        } else if ((CenterOfGravity > 0.3) && (CenterOfGravity <= 0.6)) {
            cek1 = (0.6 - CenterOfGravity) / (0.6 - 0.3);
            cek2 = (CenterOfGravity - 0.3) / (0.6 - 0.3);
            if (cek1 > cek2) {
                hasilY = "0";
            } else {
                hasilY = "1";
            }
        } else {
            hasilY = "1";
        }

        return hasilY;
    }
}
