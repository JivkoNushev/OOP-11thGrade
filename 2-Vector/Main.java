public class Main {
    public static void main(String[] args) {

        vector Vect = new vector(1);
        Vect.push_back(5);
        Vect.print();
        Vect.push_back(3);
        Vect.push_back(19);
        Vect.resize(10);
        Vect.pop_back();
        Vect.print();
        Vect.clear();
        Vect.print();
    }
}
