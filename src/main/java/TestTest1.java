public class TestTest1 {
    public static void main(String[] args) {
        //Sum example = new Sum(3, 4);
        System.out.println(/*example.add()*/new Sum(3,4).add());
    }

static class Sum {
    private int a, b;
    private Sum(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public int add() {
            return a + b;
        }


    }
    }