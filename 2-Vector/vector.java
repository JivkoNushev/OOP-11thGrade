public class vector{
    private int size = 0;
    private int[] array;

    public vector(){

        this.array = null;
    }

    public vector(int capacity){

        this.array = new int[capacity];
    }

    public int get_size(){

        return this.size;
    }

    public void resize(int newSize){

        if (newSize < 0) newSize = 1;
        int[] newArray = new int[newSize];

        if (newSize < size)
            size = newSize;

        for (int i = 0; i < size; i++){
            
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }


    public int push_back(int newElement){

        if(this.array == null){

            this.array = new int[1];
        }

        if (this.array.length <= size){

            this.resize(this.size * 2);
        }

        this.array[size++] = newElement;
        return newElement;
    }

    public int pop_back(){

        if (this.size <= 0) return this.size = 0;
        
        return this.array[--this.size];
    }

    public int index(int index){

        if (index < 0) index = 0;
        if (index >= this.size) index = this.size - 1;
        return this.array[index];
    }

    public void clear(){

        this.size = 0;
    }

    public void print(){

        for (int i = 0; i < this.size; i++)
            System.out.println(this.array[i]);
    }
}