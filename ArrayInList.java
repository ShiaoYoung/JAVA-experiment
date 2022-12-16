public class ArrayInList {

    private Object[] arr;
    private int count = 0;


    public ArrayInList(){
        arr = new Object[4];
    }
    public ArrayInList(Object x){
        arr = new Object[4];
        arr[0] = x;
        count++;
    }
    public ArrayInList(Object x,Object y){
        arr = new Object[4];
        arr[0] = x;
        arr[1] = y;
        count = count + 2;
    }
    public ArrayInList(Object x,Object y,Object z){
        arr = new Object[4];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
        count = count + 3;
    }

    public ArrayInList(Object x,Object y,Object z,Object o){
        arr = new Object[4];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;
        arr[3] = o;
        count = count + 4;
    }

    public void Append(Object x){
        if (count == arr.length ) enlarge();
        arr[count] = x;
        count++;
    }

    private void enlarge(){
        Object[] temp = new Object[arr.length * 2];
        for (int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public void Insert(int i,Object x){
        if (count == arr.length - 1) enlarge();
        Object[] temp = new Object[arr.length];
        for (int j = 0; j < i; j++){
            temp[j] = arr[j];
        }
        temp[i] = x;
        for (int k = i + 1; k < arr.length; k++){
            temp[k] = arr[k - 1];
        }
        count++;
        arr = temp;
    }

    public void Delete(int i){
        if (i >= arr.length){
            System.out.println("未找到对象。");
        }else {
            Object[] temp = new Object[arr.length];
            for (int j = 0; j < i; j++){
                temp[j] = arr[j];
            }
            for (int k = i; k < arr.length - 1; k++){
                temp[k] = arr[k + 1];
            }
            count--;
            arr = temp;
        }
    }

    public Object Find(int i){
        Object temp;
        try {
            temp = arr[i];
        }catch (Exception e){
            temp = "找不到对象。";
        }
        return temp;
    }

    public int length(){ return count; }

    public String toString(){
        String temp = "";
        for (int i = 0; i < count; i++){
            temp += arr[i];
            if (i < count - 1){
                temp += "\t";
            }
        }
        return temp;
    }
}
