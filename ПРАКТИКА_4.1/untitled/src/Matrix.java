import java.util.*;
class MatrixWork {
    private int sizeN;
    private int sizeM;
    private int[][] matrixOne;
    private int[][] matrixTwo;

    public void setSizeN(int sizeN) {
        this.sizeN = sizeN;
    }

    public void setSizeM(int sizeM) {
        this.sizeM = sizeM;
    }

    public void setMatrixOne(int[][] matrixOne) {
        this.matrixOne = matrixOne;
    }

    public void setMatrixTwo(int[][] matrixTwo) {
        this.matrixTwo = matrixTwo;
    }

    MatrixWork(int n, int m) {
        setSizeN(n);
        setSizeM(m);
    }

    MatrixWork(int[][] one, int[][] two) {
        setMatrixOne(one);
        setMatrixTwo(two);
    }

    public int[][] createMatrix() {
        int[][] array = new int[sizeN][sizeM];
        for (int[] temp : array) {
            for (int i = 0; i < temp.length; i++) {
                temp[i] = new Scanner(System.in).nextInt();
            }
        }
        return array;
    }

    public int[][] getAction(int index, int num) {
        int[][] result = new int[matrixOne.length][matrixOne[0].length];
        if (matrixOne.length == matrixTwo.length && matrixOne[0].length == matrixTwo[0].length) {
            for (int i = 0; i < matrixOne.length; i++) {
                for (int j = 0; j < matrixOne[0].length; j++) {
                    if (index == 0)
                        result[i][j] = matrixOne[i][j] + matrixTwo[i][j];
                    if (index == 1)
                        result[i][j] = matrixOne[i][j] * num;
                }
            }
        } else {
            System.out.println("Действие над матрицами невозможно!");
            return result;
        }
        return result;
    }

    public void show(int[][] array) {
        for (int[] temp : array) {
            for (int tmp : temp) {
                System.out.printf("%4d", tmp);
            }
            System.out.println();
        }
    }
}

class Realization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Размеры матрицы:");
        int n = sc.nextInt(), m = sc.nextInt();
        MatrixWork mw = new MatrixWork(n, m);
        System.out.println("====Первая=матрица=======");
        int[][] one = mw.createMatrix();
        mw.show(one);
        System.out.println("====Вторая=матрица=======");
        int[][] two = mw.createMatrix();
        mw.show(two);
        System.out.println("Введите число на которое нужно умножить первую матрицу: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("=======Сложение==========");
        MatrixWork action = new MatrixWork(one, two);
        mw.show(action.getAction(0, num));
        System.out.println("=======Умножение на число=========");
        mw.show(action.getAction(1, num));
    }
}
