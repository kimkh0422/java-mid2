package collection.list;

public class BatchProcessor {

    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) { //O(n)
            list.add(0,i); //여기서 뭘 쓰냐에 따라 차이가 생김
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: "+size+ ", 계산 시간: "+(endTime-startTime)+"ms");
    }
}
