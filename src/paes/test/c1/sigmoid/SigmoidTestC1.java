package paes.test.c1.sigmoid;

public class SigmoidTestC1 {
    public static void main(String[] args) {
        int n = 3, minValue = 0;
        String result = "";

        double[][] inputValues = {
                {0.500, 0.682, 0.652, 0.600},{0.797, 0.659, 0.812, 0.720},
                {0.759, 0.659, 0.652, 0.600},{0.633, 0.773, 0.232, 0.160},
                {0.684, 0.773, 0.217, 0.160},{0.772, 0.659, 0.681, 0.560},
                {1.000, 0.864, 0.928, 0.800},{0.797, 0.614, 0.710, 0.720},
                {0.557, 0.727, 0.188, 0.080},{0.886, 0.727, 0.681, 0.560},
                {0.797, 0.750, 0.681, 0.640},{0.810, 0.614, 0.768, 0.760},
                {0.696, 0.545, 0.551, 0.440},{0.633, 0.773, 0.217, 0.080},
                {0.848, 0.705, 0.638, 0.560},{0.734, 0.591, 0.580, 0.480},
                {0.759, 0.682, 0.696, 0.720},{0.557, 0.682, 0.188, 0.080},
                {0.620, 0.568, 0.652, 0.680},{0.582, 0.773, 0.203, 0.120},
                {0.848, 0.750, 0.826, 0.840},{0.835, 0.659, 0.667, 0.520},
                {0.722, 1.000, 0.217, 0.160},{0.797, 0.568, 0.710, 0.600},
                {0.646, 0.795, 0.203, 0.080},{0.823, 0.682, 0.754, 0.800},
                {0.646, 0.841, 0.217, 0.160},{0.734, 0.614, 0.739, 0.760},
                {0.810, 0.727, 0.768, 0.920},{0.557, 0.659, 0.203, 0.080}};

        double[] hli = new double[n];
        double[] hlo = new double[n];

        double[] eli = new double[3];
        double[] elo = new double[3];

        double[][] wl1 = {{54.50011358559727, -75.91251362123434, -6.1168375801659405},
                {70.03610931990025, -180.98264995970356, 97.29112082412988},
                {-5.009571790317476, 117.99162186021978, -89.66991469053583},
                {-77.96838102162339, 149.74264596621, -133.98405004620764}};

        double[][] wl2 = {{-109.58926442148486, 160.98817681447875, -139.73774066916098},
                {54.977293624226206, -75.6796575732036, -103.67091489315759},
                {-18.760350725053307, -225.5127739278173, 85.56583171612479}};

        while(minValue <= 29) {
            for (int i = 0; i < hli.length; i++) {
                hli[i] = 0;
                hlo[i] = 0;
            }

            for (int i = 0; i < hli.length; i++) {
                hli[i] = 0;
                hlo[i] = 0;
            }

            for (int i = 0; i < eli.length; i++) {
                eli[i] = 0;
                elo[i] = 0;
            }

            hli = ponderationL1(n, inputValues, minValue, hli, wl1);
            hlo = activationFunctionL1(hlo, hli);

            eli = ponderationL2(eli, wl2, hlo);
            elo = activationFunctionL2(elo, eli);

            for (int i = 0; i < elo.length; i++) {
                result += Math.round(elo[i]) + " ";
            }

            if (result.equals("0 0 1 ")) System.out.println(result + " Iris-Setosa");
            else if (result.equals("0 1 0 ")) System.out.println(result + " Iris-Versicolor");
            else if (result.equals("1 0 0 ")) System.out.println(result + " Iris-Virginica");
            else System.out.println(result + " Unindentified-Species-Detected!");

            minValue++;
            result = "";

        }
    }

    public static double[] ponderationL1(int n, double[][] inputValues, int minValue, double[] hli, double[][] wl1) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < inputValues[i].length; j++) {
                hli[i] += inputValues[minValue][j] * wl1[j][i];
            }
        }
        return hli;
    }

    public static double[] activationFunctionL1(double[] hlo, double[] hli) {
        for (int i = 0; i < hlo.length; i++) {
            hlo[i] = 1/(1 + Math.exp(-hli[i]));
        }
        return hlo;
    }

    public static double[] ponderationL2(double[] eli, double[][] wl2, double[] hlo) {
        for (int i = 0; i < wl2.length; i++) {
            for (int j = 0; j < wl2[i].length; j++) {
                eli[i] += wl2[i][j] * hlo[j];
            }
        }
        return eli;
    }

    public static double[] activationFunctionL2(double[] elo, double[] eli) {
        for (int i = 0; i < elo.length; i++) {
            elo[i] = 1/(1 + Math.exp(-eli[i]));
        }
        return elo;
    }
}
